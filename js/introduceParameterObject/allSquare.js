class AllSquare {
  constructor(allSquare) {
    this._allSquare = allSquare;
  };

  getSpecialSquareArea(colorList, squareCondition) {
    var specialArea = 0;
    this._allSquare.map(function (square) {
      if (square.getArea() >= squareCondition.getMiniArea() && square.getArea() <= squareCondition.getMaxArea() && colorList.includes(square.getColor())) {
        specialArea += square.getArea();
      }
    });

    return specialArea;
  };
}

module.exports = AllSquare;