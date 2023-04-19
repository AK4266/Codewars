const zeroFuel = (distanceToPump, mpg, fuelLeft) => {
    if( fuelLeft * mpg >= distanceToPump ){
      return true;
    }
    return false;
  };