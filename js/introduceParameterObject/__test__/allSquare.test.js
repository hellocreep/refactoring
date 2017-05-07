const test = require('ava');
const sinon = require('sinon');
const AllSquare = require('../allSquare');
const Square = require('../square');
const SquareCondition = require('../squareCondition');

const squareFirst = new Square(3, 'red');
const squareSecond = new Square(2, 'red');
const squareThird= new Square(5, 'yellow');

const allSquare = new AllSquare([squareFirst, squareSecond, squareThird]);

test('AllSquare special square area is 0 when no such color', function (t) {
  t.is(allSquare.getSpecialSquareArea(['grey'], new SquareCondition(3, 20, [])), 0);
});

test('AllSquare special square area', function (t) {
  t.is(allSquare.getSpecialSquareArea(['red'], new SquareCondition(5, 10, [])), 9);
});