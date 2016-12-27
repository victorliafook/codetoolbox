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
     public function removeVal($val){
        if($this->isEmpty()){
           return;
        }
        if($this->firstNode->value == $val){
            $this->removeFirst();
            return;
        }
        $ant = $this->firstNode;
        $aux = $this->firstNode->next;
        
        while($val != $aux->value){
            $ant = $aux;
            $aux = $aux->next;
        }
        $removed = $aux;
        $ant->next = $aux->next;
        $removed = null;
        return;
     }
    
    public function insertDesc(&$node){
        if($this->isEmpty()){
            $this->firstNode = $node;
		    $this->count++;
            return;
        }
        if($this->firstNode->value < $node->value){
            $this->insertFirst($node);
            return;
        }
        $ant = $this->firstNode;
        $aux = $this->firstNode->next;
        
        while($node->value < $aux->value){
            $ant = $aux;
            $aux = $aux->next;
        }
        $node->next = $aux;
        $ant->next = $node;
        
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