class Customer {
  static create(name) {
    return new Customer(name)
  }

  constructor(name) {
    this._name = name
  }

  getName() {
    return this._name
  }
}

module.exports = Customer
