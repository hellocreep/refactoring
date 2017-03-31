const test = require('ava')
const Customer = require('../customer')
const Order = require('../order')

test('Order', (t) => {
  const order = new Order
  const mockCustomer = {
    name: 'Horace'
  }
  order.setCustomer(mockCustomer)

  t.deepEqual(order.getCustomer(), {name: 'Horace'})
})

test('Customer', (t) => {
  const customer = new Customer('Horace')

  t.is(customer.name, 'Horace')
})
