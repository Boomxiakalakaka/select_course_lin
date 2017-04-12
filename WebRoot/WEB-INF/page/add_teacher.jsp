<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<HTML><HEAD><TITLE>添加教师信息</TITLE> 
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
    var teacherNumber = document.getElementById("teacher_QQ287307421.teacherNumber").value;
    if(teacherNumber=="") {
        alert('请输入教师编号!');
        return false;
    }
    var teacherName = document.getElementById("teacher_QQ287307421.teacherName").value;
    if(teacherName=="") {
        alert('请输入教师姓名!');
        return false;
    }
    var teacherSex = document.getElementById("teacher_QQ287307421.teacherSex").value;
    if(teacherSex=="") {
        alert('请输入性别!');
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
    <s:form action="saveMember_addTeacher" method="post" id="teacher_QQ287307421AddForm" onsubmit="return checkForm();"  enctype="multipart/form-data" name="form1">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">

  <tr>
    <td width=30%>教师姓名:</td>
    <td width=70%><input id="teacher_name" name="teacher.teacher_name" type="text" size="12" /></td>
  </tr>

  <tr>
    <td width=30%>登录密码:</td>
    <td width=70%><input id="teacher_password" name="teacher.teacher_password" type="text" size="30" /></td>
  </tr>

  <tr>
    <td width=30%>性别:</td>
    <td width=70%><input id="teacher_gender" name="teacher.teacher_gender" type="text" size="2" /></td>
  </tr>

 <tr>
    <td width=30%>教师职位:</td>
    <td width=70%><input id="teacher_post" name="teacher.teacher_post" type="text" size="20" /></td>
  </tr>
  
  <tr>
    <td width=30%>入职日期:</td>
    <td width=70%><input type="text" readonly id="entry_time"  name="teacher.entry_time" onclick="setDay(this);"/></td>
  </tr>

  <tr>
    <td width=30%>身份证号:</td>
    <td width=70%><input id="teacher_idcard" name="teacher.teacher_idcard" type="text" size="20" /></td>
  </tr>

  <tr>
    <td width=30%>联系电话:</td>
    <td width=70%><input id="phone_number" name="teacher.phone_number" type="text" size="20" /></td>
  </tr>

  <tr>
    <td width=30%>教师照片:</td>
    <td width=70%><input id="photoaddress" name="teacher.teacherPhotoFile" type="file" size="50" /></td>
  </tr>

  <tr>
    <td width=30%>家庭地址:</td>
    <td width=70%><input id="familyaddress" name="teacher.familyaddress" type="text" size="100" /></td>
  </tr>

  <tr>
    <td width=30%>附加信息:</td>
    <td width=70%><input id="introduce" name="teacher.introduce" type="text" size="100" /></td>
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
