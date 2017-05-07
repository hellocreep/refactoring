class Square {
  constructor(length, color) {
    this._length = length;
    this._color = color;
    this._area = length * length;
  }

  getColor() {
    return this._color;
  }

  getArea() {
    return this._area;
  }
}

module.exports = Square;
