function checkLogin(){
	if($("#readerid").val()==""){
		window.alert("�û�������Ϊ��");
		return false;
	}else if($("#userpwd").val()==""){
		window.alert("���벻��Ϊ��");
		return false;
	}else{
		return true;
	}
}