<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<HTML><HEAD><TITLE>添加学院信息</TITLE> 
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
    var collegeNumber = document.getElementById("collegeInfo.collegeNumber").value;
    if(collegeNumber=="") {
        alert('请输入学院编号!');
        return false;
    }
    var collegeName = document.getElementById("collegeInfo.collegeName").value;
    if(collegeName=="") {
        alert('请输入学院名称!');
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
    <s:form action="saveMember_addDepartment" method="post" id="collegeInfoAddForm" onsubmit="return checkForm();"  enctype="multipart/form-data" name="form1">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">


  <tr>
    <td width=30%>学院名称:</td>
    <td width=70%><input id="department_name" name="department.department_name" type="text" size="20" /></td>
  </tr>

  <tr>
    <td width=30%>院长姓名:</td>
    <td width=70%><input id="department_director" name="department.department_director" type="text" size="10" /></td>
  </tr>

  <tr>
    <td width=30%>联系电话:</td>
    <td width=70%><input id="department_photonumber" name="department.department_photonumber" type="text" size="20" /></td>
  </tr>

  <tr>
    <td width=30%>学院介绍:</td>
    <td width=70%><input id="department_introduce" name="department.department_introduce" type="text" size="100" /></td>
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
