<?php

function  insertionSort($ar) {
    $len = count($ar);
    for($i = 1; $i < $len; $i++){
        exchange($ar, $i);
        print(implode(" ",$ar));
        print("\n");
    }
    
    
}
function exchange(&$arr, $key){
    
    if(!isset($arr[$key]))
        return;
    if($arr[$key] < $arr[$key - 1] ){
        
        $aux = $arr[$key - 1];
        $arr[$key - 1] = $arr[$key];
        $arr[$key] = $aux;
        exchange($arr, $key - 1);
    }
    return;
}

$fp = fopen("php://stdin", "r");


fscanf($fp, "%d", $m);
$temp = fgets($fp);
$arr = explode(' ',$temp);

for($i = 0; $i < $m; $i++)
{
    $arr[$i] = (int) $arr[$i];
}
insertionSort($arr);

?>