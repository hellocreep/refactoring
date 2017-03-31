const test = require('ava')
const greet = require('../impl')

test('greet', (t) => {
  const message = greet('Horace', 'Peter')
  t.is(message, 'Hello, Horace and Peter!')
})
