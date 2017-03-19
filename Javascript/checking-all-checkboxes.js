function chkAll(node){
	if(node.type == 'checkbox'){
		node.checked = true;
	}
	if(node.children.length == 0)
		return;
	var children = node.children;
	for(var i = 0; i < children.length; i++){
		chkAll(children[i]);
    }
}

chkAll(document);