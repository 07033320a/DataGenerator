<%@ include file="../init.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
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
			var comboUlTarget = A.one(".chzn-results");
			
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
							debugger;
								comboTarget.get("options").each( function() {
									this.remove();
								});
								comboUlTarget.get("li").each( function() {
									this.remove();
								});
								
								var newOpt1 = comboTarget.append('<option><%= LanguageUtil.get(pageContext, "combo-select") %></option>');
								for (var i=0; i< message.length; i++)
								{
									comboTarget.append("<option value='" +  message[i].portlet_id +"'>" + message[i].portlet_label_name + "("+message[i].portlet_name+")</option>");
									comboUlTarget.append('<li id="_DGMDM_WAR_DataGeneratorportlet_portlet_chzn_o_3" class="group-option result-selected" style="">'+message[i].portlet_label_name + "("+message[i].portlet_name+'</li>');
									
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


		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<link href="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/css/bootstrap/bootstrap.min.css" rel="stylesheet" />
		<link href="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/wizard/bootstrap-wizard.css" rel="stylesheet" />
		<link href="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/chosen/chosen.css" rel="stylesheet" />
		<style type="text/css">
			.wizard-modal p {
				margin: 0 0 10px;
				padding: 0;
			}

			#wizard-ns-detail-servers, .wizard-additional-servers {
				font-size: 12px;
				margin-top: 10px;
				margin-left: 15px;
			}
			#wizard-ns-detail-servers > li, .wizard-additional-servers li {
				line-height: 20px;
				list-style-type: none;
			}
			#wizard-ns-detail-servers > li > img {
				padding-right: 5px;
			}

			.wizard-modal .chzn-container .chzn-results {
				max-height: 150px;
			}
			.wizard-addl-subsection {
				margin-bottom: 40px;
			}
			.create-server-agent-key {
				margin-left: 15px; 
				width: 90%;
			}
			.field-padding-bottom {
				padding-bottom: 5px;
			}
			.aui .modal {
			    position: fixed;
			    top: 10%;
			    background-color: transparent;
				overflow-y: auto !important; 
			    left: 0% !important;
			    margin-left: 0px !important; 
			    z-index: 1050;
			    width: auto; 
			    margin-left: 0px !important;
			    background-color: auto;
			    border: none;
			    
			    border-radius: 6px;
			    -webkit-box-shadow: 0 3px 7px rgba(0, 0, 0, 0.3);
			    -moz-box-shadow: 0 3px 7px rgba(0, 0, 0, 0.3);
			    box-shadow: 0 3px 7px rgba(0, 0, 0, 0.3);
			    -webkit-background-clip: padding-box;
			    -moz-background-clip: padding-box;
			    background-clip: padding-box;
			    outline: none;
			}
			
			.aui select, .aui textarea, .aui input[type="text"], 
			.aui input[type="password"], .aui input[type="datetime"],
			 .aui input[type="datetime-local"], .aui input[type="date"], 
			 .aui input[type="month"], .aui input[type="time"], 
			 .aui input[type="week"], .aui input[type="number"], 
			 .aui input[type="email"], .aui input[type="url"], 
			 .aui input[type="search"], .aui input[type="tel"], 
			 .aui input[type="color"], .aui .uneditable-input {
			    height: auto !important;
			    padding: 5px 15px !important;
			}
			.aui select{
			    padding: 8px 4px !important;
			}
		</style>
		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		<script src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/js/html5shiv-3.7.0.js"></script>
		<script src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/js/respond-1.3.0.min.js"></script>
		<![endif]-->

		<a class="btn" href="https://github.com/amoffat/bootstrap-application-wizard">Back to docs</a>
		<button id="open-wizard" class="btn btn-primary">
			Open wizard
		</button>

		<div class="wizard" id="satellite-wizard" data-title="Data Generator">
			<!-- Step 1 Name & FQDN -->
			<div class="wizard-card" data-cardname="name">
				<h3>基本信息</h3>

				<div class="wizard-input-section">
					<p>
						ETL Job Name
					</p>
					<div class="form-group">
						<div class="col-sm-6">
							<input type="text" class="form-control" id="etl_job_name" name="etl_job_name" placeholder="ETL Job Name" data-validate="validateServerLabel">
						</div>
					</div>
				</div>

				<div class="wizard-input-section">
					<p>
						ETL Job Context
					</p>

					<div class="form-group">
						<div class="col-sm-8">
							<input type="text" class="form-control" id="etl_context" name="etl_context" placeholder="ETL Job Context" data-serialize="1" />
						</div>
					</div>
				</div>
				
				<div class="wizard-input-section">
					<p>
						ETL Job File Entry Id
					</p>

					<div class="form-group">
						<div class="col-sm-8">
							<input type="text" class="form-control" id="etl_file_entry_id" name="etl_file_entry_id" placeholder="ETL Job File Entry Id" data-serialize="1" />
						</div>
					</div>
				</div>
				
				<input type="hidden" class="form-control" id="etl_class_name" name="etl_class_name" placeholder="ETL Job Class Name" data-serialize="1" value="${etlJobClassName}" />
				
			</div>

			<div class="wizard-card wizard-card-overlay" data-cardname="services">
				<h3>数据准备</h3>

				<div class="alert hide">
					It's recommended that you select at least one
					service, like ping.
				</div>

				<div class="wizard-input-section">
					<p>
						Please choose the services you'd like Panopta to
						monitor.  Any service you select will be given a default
						check frequency of 1 minute.
					</p>
					<div class="form-group">
						<div class="col-sm-8">
							<div class="input-group">
								<select name="project" id='<portlet:namespace />project' onChange='projectChange(this.value);' data-placeholder="project" data-validate="validateServerSelect" style="width:350px;" class="chzn-select create-server-service-list form-control" >
									<option value=""></option>
									<!-- <optgroup label="Basic">
										<option value="icmp.ping">Ping</option>
										<option value="tcp.ssh">SSH</option>
										<option value="tcp.ftp">FTP</option>
									</optgroup> -->
									<c:forEach var="bean" items="${QbProjectList }">
									<option value="${bean.project_id }">${bean.project_name }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="col-sm-8">
							<div class="input-group">
								<select name="portlet" id='<portlet:namespace />portlet' data-placeholder="portlet" data-validate="validateServerSelect" style="width:350px;" class="chzn-select create-server-service-list form-control" multiple>
									<option value=""></option>
									<optgroup label="Basic">
										<option value="icmp.ping">Ping</option>
										<option value="tcp.ssh">SSH</option>
										<option value="tcp.ftp">FTP</option>
									</optgroup>
								</select>
							</div>
						</div>
						
					</div>
					
				</div>
			</div>

			<div class="wizard-card wizard-card-overlay" data-cardname="location">
				<h3>字段生成匹配</h3>

				<div class="wizard-input-section">
					<p>
						We determined <strong>Chicago</strong> to be
						the closest location to monitor
						<strong class="create-server-name"></strong>
						If you would like to change this, or you think this is
						incorrect, please select a different
						monitoring location.
					</p>
					<div class="form-group">
					<fieldset class="field-padding-bottom">
						<label for="starttime" class="col-sm-3 control-label">开始时间</label> 
						<div class="col-md-4"> 
							<input class="form-control" type="text" id="starttime"  />
						</div> 
						
						<div class="col-md-4"> 
							<select class="form-control" type="text" id="endtime" >
								<option>1</option>
								<option>2</option>
							</select>
						</div>
						</fieldset>
						<fieldset class="field-padding-bottom">
						<label for="starttime" class="col-sm-3 control-label">开始时间</label> 
						<div class="col-md-4"> 
							<input class="form-control" type="text" id="starttime"  />
						</div> 
						
						<div class="col-md-4"> 
							<select class="form-control" type="text" id="endtime" >
								<option>1</option>
								<option>2</option>
							</select>
						</div>
						</fieldset>
					</div>

				</div>
			</div>
			
			<div class="wizard-card">
				<h3>信息预览</h3>

				<div class="wizard-input-section">
					<p>The <a target="_blank" href="http://www.panopta.com/support/knowledgebase/support-questions/how-do-i-install-the-panopta-monitoring-agent/">Panopta Agent</a> allows
						you to monitor local resources (disk usage, cpu usage, etc).
						If you would like to set that up now, please download
						and follow the <a target="_blank" href="http://www.panopta.com/support/knowledgebase/support-questions/how-do-i-install-the-panopta-monitoring-agent/">install instructions.</a>
					</p>

					<div class="btn-group">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Download<span class="caret"></span></button>
						<ul class="dropdown-menu">
							<li><a href="#">.rpm</a></li>
							<li><a href="#">.deb</a></li>
							<li><a href="#">.tar.gz</a></li>
						</ul>
					</div>
				</div>

				<div class="wizard-input-section">
					<p>You will be given a server key after you install the Agent
						on <strong class="create-server-name"></strong>.
						If you know your server key now, please enter it
						below.</p>

					<div class="form-group">
						<input type="text" class="create-server-agent-key form-control" placeholder="Server key (optional)" data-validate="">
					</div>
				</div>

				<div class="wizard-error">
					<div class="alert alert-error">
						<strong>There was a problem</strong> with your submission.
						Please correct the errors and re-submit.
					</div>
				</div>
	
				<div class="wizard-failure">
					<div class="alert alert-error">
						<strong>There was a problem</strong> submitting the form.
						Please try again in a minute.
					</div>
				</div>
	
				<div class="wizard-success">
					<div class="alert alert-success">
						<span class="create-server-name"></span>Server Created <strong>Successfully.</strong>
					</div>
	
					<a class="btn btn-default create-another-server">Create another server</a>
					<span style="padding:0 10px">or</span>
					<a class="btn btn-success im-done">Done</a>
				</div>
			</div>
		</div>

		<script type="text/javascript" src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/js/jquery-3.1.1.min.js"></script>
		<script type="text/javascript" src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/chosen/chosen.jquery.js"></script>
		<script type="text/javascript" src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/js/bootstrap.min.js"></script>
		
		<script type="text/javascript" src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/js/prettify.js"></script>
		<script type="text/javascript" src="<%=themeDisplay.getPathContext() %>/DataGenerator-portlet/wizard/bootstrap-wizard.js"></script>
		
		<script type="text/javascript">
			$(document).ready(function() {
				$.fn.wizard.logging = true;
				var wizard = $('#satellite-wizard').wizard({
					keyboard : true,
					contentHeight : 400,
					contentWidth : 1000,
					backdrop: true,
					buttons: {
		                cancelText: "取消",
		                nextText: "下一步",
		                backText: "返回",
		                submitText: "提交",
		                submittingText: "提交中...",
		            },
				});
				
				$(".chzn-select").chosen();

				wizard.on('closed', function() {
					wizard.reset();
				});

				wizard.on("reset", function() {
					wizard.modal.find(':input').val('').removeAttr('disabled');
					wizard.modal.find('.form-group').removeClass('has-error').removeClass('has-succes');
					
				});

				wizard.on("submit", function(wizard) {
					var submit = {
						//"hostname": $("#new-server-fqdn").val()
					};
					
					this.log('seralize()');
					this.log(this.serialize());
					this.log('serializeArray()');
					this.log(this.serializeArray());
			
					setTimeout(function() {
						wizard.trigger("success");
						wizard.hideButtons();
						wizard._submitting = false;
						wizard.showSubmitCard("success");
						wizard.updateProgressBar(0);
					}, 2000);
				});
				
				wizard.el.find(".wizard-success .im-done").click(function() {
					wizard.hide();
					setTimeout(function() {
						wizard.reset();	
					}, 250);
					
				});
			
				wizard.el.find(".wizard-success .create-another-server").click(function() {
					wizard.reset();
				});
			
				$('#open-wizard').click(function(e) {
					e.preventDefault();
					wizard.show();
				});
			});

			function validateServerLabel(el) {
			
				var name = el.val();
				var retValue = {};

				if (name == "") {
					retValue.status = false;
					retValue.msg = "Please enter a label";
				} else {
					retValue.status = true;
				}

				return retValue;
			};
			
			function validateServerSelect(el) {
				var name = el.val();
				var retValue = {};

				if (name == "") {
					retValue.status = false;
					retValue.msg = "";
					alert(1)
				} else {
					retValue.status = true;
				}
				
				return retValue;
			};


		</script>
