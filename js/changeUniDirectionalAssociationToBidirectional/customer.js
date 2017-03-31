class Customer {
  constructor(name) {
    this.name = name
    this._orders = new Set()
  }

  addOrder(order) {
    this._orders.add(order)
  }

  getOrders() {
    return this._orders
  }
}

module.exports = Customer
