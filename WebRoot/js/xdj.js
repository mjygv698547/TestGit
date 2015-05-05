function checkLogin(){
	if($("#readerid").val()==""){
		window.alert("用户名不能为空");
		return false;
	}else if($("#userpwd").val()==""){
		window.alert("密码不能为空");
		return false;
	}else{
		return true;
	}
}