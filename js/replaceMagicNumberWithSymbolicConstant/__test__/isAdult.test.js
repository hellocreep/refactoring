const test = require('ava');
const isAdult = require('../isAdult');

test('should return true when user age is older than 18', function (t) {
  const age = 19;
  t.is(isAdult(age), true);
});


test('should return true when user age is younger than 16', function (t) {
  const age = 16;
  t.is(isAdult(age), false);
});
