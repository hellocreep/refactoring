const test = require('ava')
const greet = require('../impl')

test('greet', (t) => {
  const message = greet('Horace')
  t.is(message, 'Hello, Horace!')
})
