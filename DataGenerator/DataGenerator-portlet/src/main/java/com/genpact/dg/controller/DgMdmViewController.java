package com.genpact.dg.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.genpact.model.QbPortlet;
import com.genpact.model.QbProject;
import com.genpact.model.TalendProcess;
import com.genpact.service.DataGeneratorLocalServiceUtil;
import com.genpact.service.QbPortletLocalServiceUtil;
import com.genpact.service.QbProjectLocalServiceUtil;
import com.genpact.service.TalendProcessLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.cache.MultiVMPoolUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.PropsUtil;

@Controller(value = "dgMdmController")
@RequestMapping(value = "VIEW")
public class DgMdmViewController {

	@RenderMapping()
    public ModelAndView homePage(RenderRequest request, RenderResponse response) throws SystemException {
        ModelAndView ret = new ModelAndView("view");
        int a = DataGeneratorLocalServiceUtil.getDataGeneratorsCount();
        ret.addObject("abc", a);
        ret.addObject("mytitle", "MyArtifact Spring!!!!!!!!!!!!!!!@@@@@");
        return ret;
	}
	@RenderMapping(params = "action=edit")
    public String hopeSuccess(Model model, String username) {
        
        model.addAttribute("serverTime", "no time");
        System.out.println("222");
        System.out.println(username+":name");
        return "editpage";
    }
	@RenderMapping(params = "action=fengshu")
    public ModelAndView fengshu(Model model,
            @RequestParam("username") String username) {
		System.out.println("333");
        ModelAndView modelAndView = new ModelAndView("editpage");
        System.out.println(username+":name");
        getProjects(modelAndView);
		modelAndView.addObject("serverTime", "time to  sleep");
        return modelAndView;
    }
	@RenderMapping(params = "action=saveForm")
	public ModelAndView saveForm(Model model,
			RenderRequest request,RenderResponse response) throws SystemException {
		System.out.println("5555555555555555555555");
		
		TalendProcess bean = TalendProcessLocalServiceUtil.createTalendProcess(CounterLocalServiceUtil.increment(TalendProcess.class.getName()));
		String etl_class_name = request.getParameter("etl_class_name");
		bean.setClassName(etl_class_name);
		String etl_file_entry_id = request.getParameter("etl_file_entry_id");
		bean.setFileEntryId(Long.parseLong(etl_file_entry_id));
		String etl_context = request.getParameter("etl_context");
		bean.setContext(etl_context);
		String etl_job_name = request.getParameter("etl_job_name");
		bean.setName(etl_job_name);
		TalendProcessLocalServiceUtil.updateTalendProcess(bean);
		MultiVMPoolUtil.clear();
        ModelAndView modelAndView = new ModelAndView("view");
        getProjects(modelAndView);
		modelAndView.addObject("serverTime", "time to  sleep");
		
        return modelAndView;
    }

	@ResourceMapping("getPortlets")
	  public void getPortlets(ResourceRequest request,
	      ResourceResponse response, Model model) throws IOException, PortletException {
		System.out.println(request.getParameter("data"));
		Long project_id = Long.parseLong(request.getParameter("data"));
        PrintWriter writer = null;
        try {
        	DynamicQuery dq = DynamicQueryFactoryUtil.forClass(QbPortlet.class);
        	dq.add(RestrictionsFactoryUtil.eq("project_id", project_id));
        	
        	List<QbPortlet> list = QbPortletLocalServiceUtil.dynamicQuery(dq);
        	JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
        	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				QbPortlet qbPortlet = (QbPortlet) iterator.next();
				JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
				jsonObject.put("portlet_id", qbPortlet.getPortlet_id());
				jsonObject.put("portlet_name", qbPortlet.getPortlet_name());
				jsonObject.put("portlet_label_name", qbPortlet.getPortlet_label_name());
				jsonArray.put(jsonObject);
				
			}
			writer = response.getWriter();
			writer.write(jsonArray.toString());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} finally{
			writer.close();
		}
    }
	
	private void getProjects(ModelAndView modelAndView) {
		List<QbProject> QbProjectList;
		try {
			QbProjectList = QbProjectLocalServiceUtil.getQbProjects(-1, -1);
			modelAndView.addObject("QbProjectList",QbProjectList);
			modelAndView.addObject("etlJobClassName",PropsUtil.get("etlJobClassName"));
			
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	

}
