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
}

module.exports = SquareCondition;