function checkRegulation() {
	if (document.getElementById("regulationname").value == "") {
		window.alert("�������Ʋ���Ϊ��");
		return false;
	}
	if (document.getElementById("restborrowday").value == "") {
		window.alert("�ɽ�����������Ϊ��");
		return false;
	}
	if (document.getElementById("reborrowday").value == "") {
		window.alert("������������Ϊ��");
		return false;
	}
	if (document.getElementById("maxreborrowtime").value == "") {
		window.alert("���������������Ϊ��");
		return false;
	}
	if (document.getElementById("orderrestday").value == "") {
		window.alert("ԤԼ������������Ϊ��");
		return false;
	} else {
		var reg = /^\d+$/;
		if (!document.getElementById("restborrowday").value.match(reg)) {
			window.alert("�ɽ�������:��Ч���ַ�������������");
			return false;
		}
		if (!document.getElementById("reborrowday").value.match(reg)) {
			window.alert("��������:��Ч���ַ�������������");
			return false;
		}
		if (!document.getElementById("maxreborrowtime").value.match(reg)) {
			window.alert("�ɽ�������:��Ч���ַ�������������");
			return false;
		}
		if (!document.getElementById("orderrestday").value.match(reg)) {
			window.alert("�����������:��Ч���ַ�������������");
			return false;
		}
		window.alert("�ύ�ɹ�");
	}
}

function checkNotices(){
	if (document.getElementById("noticetitle").value == "") {
		window.alert("������ⲻ��Ϊ��");
		return false;
	}
	if (document.getElementById("noticecontent").value == "") {
		window.alert("�������ݲ���Ϊ��");
		return false;
	}
	if (document.getElementById("noticeperson").value == "") {
		window.alert("�����˲���Ϊ��");
		return false;
	}else{
	window.alert("�ύ�ɹ�");
	}
}

function checkDel(msg){
	event.returnValue = window.confirm(msg);
	window.alert("ɾ���ɹ�");
}

//jquery
