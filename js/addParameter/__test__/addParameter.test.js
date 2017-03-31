const test = require('ava')
const addParameter = require('../impl')

test('addParameter', (t) => {
  const message = addParameter('Foo')
  t.is(message, 'Foo')
})
