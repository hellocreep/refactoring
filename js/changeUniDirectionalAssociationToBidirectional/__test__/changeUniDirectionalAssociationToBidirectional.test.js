const test = require('ava')
const sinon = require('sinon')
const Customer = require('../customer')
const Order = require('../order')

test('Order', (t) => {
  const order = new Order
  const mockCustomer = {
    name: 'Horace',
    addOrder: sinon.stub()
  }
  order.setCustomer(mockCustomer)

  t.is(order.getCustomer().name, 'Horace')
  t.is(mockCustomer.addOrder.calledWith(order), true)
})

test('Customer constructor', (t) => {
  const customer = new Customer('Horace')

  t.is(customer.name, 'Horace')
})

test('Customer orders', (t) => {
  const customer = new Customer('Horace')
  const mockOrder = {id: 'orderId'}
  customer.addOrder(mockOrder)
  const orders = new Set()
  orders.add(mockOrder)

  t.deepEqual(customer.getOrders(), orders)
})
