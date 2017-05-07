const Square = require('./square');
const AllSquare = require('./allSquare');

const squareFirst = new Square(3, 'red');
const squareSecond = new Square(5, 'red');
const squareThird= new Square(5, 'yellow');
const squareFourth = new Square(4, 'blue');
const squareFifth = new Square(2, 'blue');
const squareSixth = new Square(3, 'blue');

const allSquare = new AllSquare([squareFirst, squareSecond, squareThird, squareFourth, squareFifth, squareSixth]);

allSquare.getSpecialSquareArea(5, 20, ['red', 'blue']);