function numberOfOrdersFor(orderList, customerName) {
  return orderList.reduce((count, order) => {
    if (order.getCustomerName() === customerName) count++
    return count
  }, 0)
}

module.exports = numberOfOrdersFor
