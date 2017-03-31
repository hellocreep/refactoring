const Customer = require('./customer')
const Order = require('./order')


const customer = new Customer('Horace')
const order = new Order
const order2 = new Order

order.setCustomer(customer)
order2.setCustomer(customer)
