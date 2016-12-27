<?php 

class LinkedList{
	
	public $firstNode;
	private $lastNode;
	public $count;
	
	function __construct()
    {
        $this->firstNode = null;
		$this->lastNode = null;
        $this->count = 0;
    }
	
	public function getFirstNode(){
		return $this->firstNode;
	}
	
	public function insertFirst(&$node){
		if($this->firstNode != null)
			$node->next = $this->firstNode;
			
		$this->firstNode = $node;
		$this->count++;
		
		
	}
	
	public function removeFirst(){
		if($this->isEmpty())
			return;
		$removed = $this->firstNode;
		$this->firstNode = $removed->next;
		$removed = null;
		$this->count--;
		
	}
	
	public function isEmpty()
    {
        return ($this->firstNode == null);
    }
	
	
}
