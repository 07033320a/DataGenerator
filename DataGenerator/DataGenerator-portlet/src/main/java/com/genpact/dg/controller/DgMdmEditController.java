package com.genpact.dg.controller;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Controller(value = "dgMdmEditController")
@RequestMapping(value = "EDIT")
public class DgMdmEditController {
	@ResourceMapping("getMeResource")
    public void whateverIsThisCalled(@RequestParam("whatever") String whatever,  
            ResourceRequest request, ResourceResponse response) {
        ModelAndView ret = new ModelAndView("view");
	}
	
}
