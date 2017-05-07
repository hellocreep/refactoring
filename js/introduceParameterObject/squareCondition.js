class SquareCondition {
  constructor(miniArea, maxArea, colorList) {
    this._miniArea = miniArea;
    this._maxArea = maxArea;
    this._colorList = colorList;
  }

  getMiniArea() {
    return this._miniArea;
  }

  getMaxArea() {
    return this._maxArea;
  }

  getColorList() {
    return this._colorList;
  }

  isIncludes(square) {
    return square.getArea() >= this._miniArea
      && square.getArea() <= this._maxArea
      && this._colorList.includes(square.getColor())
  }
}

module.exports = SquareCondition;