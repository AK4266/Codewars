function DNAtoRNA(dna) {
    let str = dna.split('');
    for(let i=0; i<str.length; i++){
      if(str[i] === 'T')
        str[i] = 'U'
    }
    return(str.join(''))
  }