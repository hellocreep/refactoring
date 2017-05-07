class AllSquare {
  constructor(allSquare) {
    this._allSquare = allSquare;
  };

  getSpecialSquareArea(mini, max, colorList, undefined) {
    var specialArea = 0;
    this._allSquare.map(function (square) {
      if (square.getArea() >= mini && square.getArea() <= max && colorList.includes(square.getColor())) {
        specialArea += square.getArea();
      }
    });

    return specialArea;
  };
}

module.exports = AllSquare;