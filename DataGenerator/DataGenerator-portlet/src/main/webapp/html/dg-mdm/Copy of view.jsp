<%@ include file="/html/init.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<portlet:defineObjects />

This is the <b>Myartifact2</b> portlet in View mode.(${mytitle})

<portlet:resourceURL id="getMeResource" var="ttt" />  

<h1>Liferay Spring Portlet MVC</h1>
<portlet:defineObjects />
<p>The time on the server is ${serverTime}.</p>
<portlet:renderURL var="edit">
    <portlet:param name="action" value="edit" />
</portlet:renderURL>
<portlet:actionURL var="fengshuzi" />

<portlet:renderURL var="fengshu">
    <portlet:param name="action" value="fengshu" />
</portlet:renderURL>
<div>
    跳转到编辑页面<a href="${edit}">编辑</a>
</div>

<form action="<%=fengshu %>" method="POST">
    <input type="text" name="<portlet:namespace />username" /> <input type="submit" value="go" />
</form>