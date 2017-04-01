class Order {
  getCustomer() {
    return this.customer
  }

  setCustomer(customer) {
    this.customer = customer
    customer.addOrder(this)
  }
}

module.exports = Order
