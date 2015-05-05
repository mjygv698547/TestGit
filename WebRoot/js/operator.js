function checkLogin(){
	if($("#ousername").val()==""){
		window.alert("用户名不能为空");
		return false;
	}else if($("#ouserpwd").val()==""){
		window.alert("密码不能为空");
		return false;
	}else{
		return true;
	}
}
/*
function checkAddoperator(){
	if($("#ousername").val()==""){
		window.alert("用户名不能为空");
		return false;
	}else if($("#orealname").val()==""){
		window.alert("操作员姓名不能为空");
		return false;
	}else if($("#ouserpwd").val()==""){
		window.alert("密码不能为空");
		return false;
	}else{
		return true;
	}
}
*/














