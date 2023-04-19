function countBy(x, n) {
    let z = [];
    z[0] =x 
    for(let i=1; i<n; i++){
      z[i] = x*(i+1);
    }
  
    return z;
  }