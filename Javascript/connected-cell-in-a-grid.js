var max = 0;
var n_rows = 0;
var n_cols = 0;
var visited = [];
var rules = [{add_r: -1, add_c: 0},{add_r: -1, add_c: 1},{add_r: 0, add_c: 1},
              {add_r: 1, add_c: 1},{add_r: 1, add_c: 0},{add_r: 1, add_c: -1},
              {add_r: 0, add_c: -1},{add_r: -1, add_c: -1}];
			  
function processData(input) {
    n_rows = parseInt(input[0]);
    n_cols = parseInt(input[1]);
    var matrix = [];
    initialise(visited, n_rows, n_cols);
    for(var i = 2; i < n_rows + 2; i++){
        matrix[i-2] = input[i].split(' ').map(Number);
    }
    
    for(var r = 0; r < n_rows; r++){
        let lmax = 0;
        for(var c = 0; c < n_cols; c++){
            lmax = explore(matrix, r, c, rules);
            if(lmax > max) max = lmax;
        }        
    }
    console.log(max);
}

function initialise(arr, m, n){
    for(var r = 0; r < n_rows; r++){
        arr[r] = [];
        for(var c = 0; c < n_cols; c++){
            arr[r][c] = false;    
        }
    }
}

function explore(mat, i_r, i_c, rules){
    
    if(i_r < 0 || i_r >= n_rows || i_c < 0 || i_c >= n_cols || visited[i_r][i_c] === true)
        return 0;
    visited[i_r][i_c] = true;
    let size = (mat[i_r][i_c] == 1) ? 1 : 0;    
    for(var x = 0; x < rules.length; x++){
        if(typeof mat[rules[x].add_r + i_r] !== "undefined"){            
            if(mat[rules[x].add_r + i_r][rules[x].add_c + i_c] == 1)       
                size += explore(mat, rules[x].add_r + i_r, rules[x].add_c + i_c, rules);
        }
    }
    
    return size;
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input.split('\n'));
});
