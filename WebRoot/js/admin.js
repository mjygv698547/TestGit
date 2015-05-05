
function manageopretor(self) {
	var manageopretor = document.getElementById("manageopretor");
	manageopretor.style.display = manageopretor.style.display == "none" ? "block" : "none";
	if (manageopretor.style.display == "none") {
		self.src = "images/opretordown.jpg";
	} else {
		self.src = "images/opretorUp.jpg";
	}
}
function manageReader(self) {
	var manageReader = document.getElementById("manageReader");
	manageReader.style.display = manageReader.style.display == "none" ? "block" : "none";
	if (manageReader.style.display == "none") {
		self.src = "images/readerDown.jpg";
	} else {
		self.src = "images/readerUp.jpg";
	}
}
function manageProduct(self) {
	var manageProduct = document.getElementById("manageProduct");
	manageProduct.style.display = manageProduct.style.display == "none" ? "block" : "none";
	if (manageProduct.style.display == "none") {
		self.src = "images/ragulationDown.jpg";
	} else {
		self.src = "images/regulationUp.jpg";
	}
}
function manageInform(self) {
	var manageInform = document.getElementById("manageInform");
	manageInform.style.display = manageInform.style.display == "none" ? "block" : "none";
	if (manageInform.style.display == "none") {
		self.src = "images/BookDown.jpg";
	} else {
		self.src = "images/BookUp.jpg";
	}
}
function manageLiuyan(self) {
	var manageLiuyan = document.getElementById("manageLiuyan");
	manageLiuyan.style.display = manageLiuyan.style.display == "none" ? "block" : "none";
	if (manageLiuyan.style.display == "none") {
		self.src = "images/manageInformDown.jpg";
	} else {
		self.src = "images/manageInformUp.jpg";
	}
}
function managebookborrowDown(self) {
		var manageLiuyan = document.getElementById("managebookborrowDown");
		manageLiuyan.style.display = manageLiuyan.style.display == "none" ? "block" : "none";
		if (manageLiuyan.style.display == "none") {
			self.src = "images/bookborrowDown.jpg";
		} else {
			self.src = "images/manageborrowUp.jpg";
		}
}

