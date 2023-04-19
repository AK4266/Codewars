const reverseSeq = n => {
    let m = [], j = 0;
    for(let i=n; i>0; i--){
      m[j] = i; 
      j++;
    }
    return m;
  };