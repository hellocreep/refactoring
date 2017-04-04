const test = require('ava')
const Customer = require('../customer')
const Order = require('../order')
const numberOfOrdersFor = require('../index')

test('numberOfOrdersFor', (t) => {
  const orderList = [
    new Order('Horace'),
    new Order('Pete'),
    new Order('Pete')
  ]
  const number = numberOfOrdersFor(orderList, 'Pete')

  t.is(number, 2)
})
