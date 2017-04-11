<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8"%>
<%@ page import="lin.domain.Teacher" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    //获取所有的courseTeacher信息
    List<Teacher> teacherList = (List<Teacher>)request.getAttribute("teacherList");
%>
<HTML><HEAD><TITLE>添加课程信息</TITLE> 
<STYLE type=text/css>
BODY {
    	MARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff
}
.STYLE1 {color: #ECE9D8}
.label {font-style.:italic; }
.errorLabel {font-style.:italic;  color:red; }
.errorMessage {font-weight:bold; color:red; }
</STYLE>
 <script src="<%=basePath %>calendar.js"></script>
<script language="javascript">
/*验证表单*/
function checkForm() {
    var courseNumber = document.getElementById("courseInfo_QQ254540457.courseNumber").value;
    if(courseNumber=="") {
        alert('请输入课程编号!');
        return false;
    }
    var courseName = document.getElementById("courseInfo_QQ254540457.courseName").value;
    if(courseName=="") {
        alert('请输入课程名称!');
        return false;
    }
    return true; 
}
 </script>
</HEAD>

<BODY background="<%=basePath %>images/adminBg.jpg">
<s:fielderror cssStyle="color:red" />
<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top >
    <s:form action="saveMember_addCourse" method="post" id="courseInfo_QQ254540457AddForm" onsubmit="return checkForm();"  enctype="multipart/form-data" name="form1">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">



  <tr>
    <td width=30%>课程名称:</td>
    <td width=70%><input id="course_name" name="course_name" type="text" size="20" /></td>
  </tr>

  <tr>
    <td width=30%>上课老师:</td>
    <td width=70%>
      <select name="teacher_name">
      <%
        for(Teacher teacher:teacherList) {
      %>
          <option value='<%=teacher.getTeacher_name() %>'><%=teacher.getTeacher_name() %></option>
      <%
        }
      %>
    </td>
  </tr>

  <tr>
    <td width=30%>上课时间:</td>
    <td width=70%><input id="course_time" name="course_time" type="text" size="40" /></td>
  </tr>
	<tr>
    <td width=30%>课时:</td>
    <td width=70%><input id="course_period" name="course_period" type="text" size="40" /></td>
  </tr>
  <tr>
    <td width=30%>上课地点:</td>
    <td width=70%><input id="course_site" name="course_site" type="text" size="40" /></td>
  </tr>

  <tr>
    <td width=30%>课程学分:</td>
    <td width=70%><input id="course_credit" name="course_credit" type="text" size="8" /></td>
  </tr>

  <tr>
    <td width=30%>附加信息:</td>
    <td width=70%><input id="course_introduce" name="course_introduce" type="text" size="100" /></td>
  </tr>

  <tr bgcolor='#FFFFFF'>
      <td colspan="4" align="center">
        <input type='submit' name='button' value='保存' >
        &nbsp;&nbsp;
        <input type="reset" value='重写' />
      </td>
    </tr>

</table>
</s:form>
   </TD></TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
