class AllSquare {
  constructor(allSquare) {
    this._allSquare = allSquare;
  };

  getSpecialSquareArea(max, colorList, squareCondition) {
    var specialArea = 0;
    this._allSquare.map(function (square) {
      if (square.getArea() >= squareCondition.getMiniArea() && square.getArea() <= max && colorList.includes(square.getColor())) {
        specialArea += square.getArea();
      }
    });

    return specialArea;
  };
}

module.exports = AllSquare;