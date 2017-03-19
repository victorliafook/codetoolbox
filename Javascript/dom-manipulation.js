//Methods for Navigating the DOM Tree:
node.parentNode  // find the parent of node
node.firstChild  // find the first child node of node
node.nextSibling // find the next sibling of node
node.previousSibling //find the previous sibling of node
node.children //A live HTMLCollection object, representing a collection of element nodes. The elements in the returned collection are sorted as they appear in the source code
node.type //if the node is a input, return a str representing the type. checkbox, radio, button, etc.

//Methods for Removal from the DOM Tree:
node.replaceChild(x, y) //replace child x of node with node y
node.removeChild(x) // remove child x of node

//Methods to Copy Nodes:
node.cloneNode(false); // clone just the node (shallow copy)
node.cloneNode(true); // clone the node and its children (deep copy)
node.importNode(node); // import a node into node

//Methods for General Information:
node.nodeName; // returns the name attribute or DOM name
node.nodeType; // returns a number a.e. 3 is Text, 8 is comment https://www.w3schools.com/jsref/prop_node_nodetype.asp
node.hasChildNodes(); // returns boolean if has children
node.childNodes; // returns live node list of children
node.textContent; // gets text of node if exists
node.nodeValue;  // tends to work the same as textContent
node.contains(x); // returns true or false if node contains x