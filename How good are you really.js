function betterThanAverage(classPoints, yourPoints) {
    let sum = classPoints.reduce((prev, curr) => prev + curr, 0);
    let avg = sum / classPoints.length;
    if(yourPoints >= avg){
      return true;
    }
    return false;
  }