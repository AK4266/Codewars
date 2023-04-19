function highAndLow(numbers){
    let num = numbers.split(' ');
    let max = Math.max(...num).toString();
    let min = Math.min(...num).toString();
    let result = max +' '+ min;
    return result;
    
  }