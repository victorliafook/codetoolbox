<?php

function partition( &$ar, $i_from, $i_to) {
        
    $p = $ar[$i_to];
    $i_p = $i_to;
    $min_swaped = $i_from;
    for($i = $i_from; $i <  $i_to; $i++){
        if($ar[$i] < $p){
            
            $aux = $ar[$i];
            $ar[$i] = $ar[$min_swaped];
            $ar[$min_swaped] = $aux;
            $min_swaped = $min_swaped+1;
            
        }
        
    }
    $aux = $ar[$i_p];
    $ar[$i_p] = $ar[$min_swaped];
    $ar[$min_swaped] = $aux;
    return $min_swaped;
}   
function quickSort(&$ar, $from = 0, $to = null) {
    if($to == null)
        $to = count($ar) - 1;
    
    if($to == $from)
        return;
    
    $p = partition($ar, $from, $to);
    foreach($ar as $a){
        print($a . " ");
    }
    print("\n");
    
    if($p-1 > $from){   
        quickSort($ar, $from, $p - 1);
    }
    if($p+1 < $to){
        quickSort($ar, $p + 1, $to);
        
    }
   
    
}

$fp = fopen("php://stdin", "r");

$ar = array();

fscanf($fp, "%d", $m);
$ar = explode(' ', trim(fgets($fp)));

quickSort($ar);

?>
