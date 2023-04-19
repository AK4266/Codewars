function squareDigits(num){
    let array = num.toString().split('');
    let square = array.map((e) => e*e);
    return(Number(square.join('')));
  }