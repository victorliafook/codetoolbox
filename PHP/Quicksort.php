<?php

function partition( &$ar, $i_from, $i_to) {
        
    $p = $ar[$i_from];
    $i_p = $i_from;
    for($i = $i_from + 1; $i <=  $i_to; $i++){
        if($ar[$i] < $p){
            $j = $i;
            while($j > $i_p){
                $aux = $ar[$j - 1];
                $ar[$j - 1] = $ar[$j];
                $ar[$j] = $aux;    
                $j--;
            }
            $i_p++;
        }
    }
    
    return $i_p;
}   
function quickSort(&$ar, $from = 0, $to = null) {
    if($to == null)
        $to = count($ar) - 1;
    
    if($to == $from)
        return;
    
    $p = partition($ar, $from, $to);
    
    
    if($p-1 > $from){   
        quickSort($ar, $from, $p - 1);
    }
    if($p+1 < $to){
        quickSort($ar, $p + 1, $to);
        
    }
    for($i = $from ; $i <=  $to; $i++){
        print($ar[$i] . " ");
    }
    print("\n");
}

$fp = fopen("php://stdin", "r");

$ar = array();

fscanf($fp, "%d", $m);
$ar = explode(' ', trim(fgets($fp)));

quickSort($ar);