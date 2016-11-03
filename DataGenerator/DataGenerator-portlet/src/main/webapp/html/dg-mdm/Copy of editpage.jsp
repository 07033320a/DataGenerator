<%@ include file="../init.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<style>
<!--
.height_300{
	height: 300px !important;
}
-->
</style>
<script type="text/javascript" src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/js/jquery-3.1.1.min.js"></script>
<liferay-portlet:renderURL var="saveFormFn">
	<portlet:param name="action" value="saveForm" />
</liferay-portlet:renderURL>
<aui:form action="<%=saveFormFn %>">
	<aui:field-wrapper>
		<aui:input name="etl_job_name" helpMessage="ETL Job Name" />
		<aui:input name="etl_context" helpMessage="ETL Job Context" />
		<aui:input name="etl_file_entry_id" helpMessage="ETL Job File Entry Id" />
		<aui:input name="etl_class_name" helpMessage="ETL Job Class Name" />
	</aui:field-wrapper>
	<aui:select name="project" onChange='projectChange(this.value);'>
	<c:forEach var="bean" items="${QbProjectList }">
	<aui:option value="${bean.project_id }">${bean.project_name }</aui:option>
	</c:forEach>
	</aui:select>
	
	<aui:select name="portlet" onChange="" multiple="true" cssClass="height_300" helpMessage="可多选">
	</aui:select>
	<aui:button type="submit"></aui:button>
</aui:form>


<aui:script use="aui-io">
Liferay.provide(window,
		'projectChange',
		function(value) 
		{
			var url = '<portlet:resourceURL id="getPortlets" ></portlet:resourceURL>'+"&_DGMDM_WAR_DataGeneratorportlet_data="+value;
			var A = AUI();
			var comboTarget = A.one("#<portlet:namespace />portlet"); 
			A.io.request(url,
				{
					data: 
					{
					},
					dataType: 'json',
					on: 
					{
						failure: function() 
						{},
						success: function(event, id, obj) 
						{
							var instance = this;
												
							//JSON Data coming back from Server
							var message = instance.get('responseData');
							if (message) 
							{
								comboTarget.get("options").each( function() {
									this.remove();
								});		
								
								var newOpt1 = comboTarget.append('<option><%= LanguageUtil.get(pageContext, "combo-select") %></option>');
								for (var i=0; i< message.length; i++)
								{
									comboTarget.append("<option value='" +  message[i].portlet_id +"'>" + message[i].portlet_label_name + "("+message[i].portlet_name+")</option>");
								}
							}
							else 
							{
								alert('no data back from server');
							}
						}
					}
				}); //END of io Request
			}
		); //End of Provide
</aui:script>