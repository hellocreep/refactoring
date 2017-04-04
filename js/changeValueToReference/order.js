const Customer = require('./customer')

class Order {
  constructor(customerName) {
    this._customer = new Customer(customerName)
  }

  getCustomerName() {
    return this._customer.getName()
  }
}

module.exports = Order
