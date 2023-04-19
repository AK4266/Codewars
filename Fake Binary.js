function fakeBin(x){
    let str = x.split("");
    for(let i=0; i<str.length; i++){
      if(str[i]<5){
        str[i] = 0;
      }else if(str[i] >= 5){
        str[i] = 1;
      }
    }
    return (str.join(""))
  }