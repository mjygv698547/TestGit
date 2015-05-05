function checkRegulation() {
	if (document.getElementById("regulationname").value == "") {
		window.alert("规则名称不能为空");
		return false;
	}
	if (document.getElementById("restborrowday").value == "") {
		window.alert("可借阅天数不能为空");
		return false;
	}
	if (document.getElementById("reborrowday").value == "") {
		window.alert("绪借天数不能为空");
		return false;
	}
	if (document.getElementById("maxreborrowtime").value == "") {
		window.alert("最大绪借天数不能为空");
		return false;
	}
	if (document.getElementById("orderrestday").value == "") {
		window.alert("预约保留天数不能为空");
		return false;
	} else {
		var reg = /^\d+$/;
		if (!document.getElementById("restborrowday").value.match(reg)) {
			window.alert("可借阅天数:无效的字符：请输入数字");
			return false;
		}
		if (!document.getElementById("reborrowday").value.match(reg)) {
			window.alert("绪借天数:无效的字符：请输入数字");
			return false;
		}
		if (!document.getElementById("maxreborrowtime").value.match(reg)) {
			window.alert("可借阅天数:无效的字符：请输入数字");
			return false;
		}
		if (!document.getElementById("orderrestday").value.match(reg)) {
			window.alert("最大绪借天数:无效的字符：请输入数字");
			return false;
		}
		window.alert("提交成功");
	}
}

function checkNotices(){
	if (document.getElementById("noticetitle").value == "") {
		window.alert("公告标题不能为空");
		return false;
	}
	if (document.getElementById("noticecontent").value == "") {
		window.alert("公告内容不能为空");
		return false;
	}
	if (document.getElementById("noticeperson").value == "") {
		window.alert("公告人不能为空");
		return false;
	}else{
	window.alert("提交成功");
	}
}

function checkDel(msg){
	event.returnValue = window.confirm(msg);
	window.alert("删除成功");
}

//jquery
