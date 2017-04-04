const Customer = require('./customer')

class Order {
  constructor(customerName) {
    this._customer = Customer.create(customerName)
  }

  getCustomerName() {
    return this._customer.getName()
  }
}

module.exports = Order
