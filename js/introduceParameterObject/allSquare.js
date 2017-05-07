class AllSquare {
  constructor(allSquare) {
    this._allSquare = allSquare;
  };

  getSpecialSquareArea(squareCondition) {
    var specialArea = 0;
    this._allSquare.map(function (square) {
      if (squareCondition.isIncludes(square)) {
        specialArea += square.getArea();
      }
    });

    return specialArea;
  };
}

module.exports = AllSquare;