let _instances = new Map

class Customer {
  static getNamed(name) {
    return _instances.get(name)
  }

  static loadCustomers() {
    new Customer('Horace').store()
    new Customer('Pete').store()
    new Customer('Syvia').store()
  }

  store() {
    _instances.set(this.getName(), this)
  }

  constructor(name) {
    this._name = name
  }

  getName() {
    return this._name
  }
}

module.exports = Customer
