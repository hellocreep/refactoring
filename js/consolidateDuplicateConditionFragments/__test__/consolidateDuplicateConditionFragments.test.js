const test = require('ava')
const MenuList = require('../index')

test('calculateTotalPrice when isSpecial is true', (t) => {
    const totalPrice = new MenuList().calculateTotalPrice(true)

    t.is(totalPrice, 3.3)
});

test('calculateTotalPrice when isSpecial is false', (t) => {
    const totalPrice = new MenuList().calculateTotalPrice(false)

    t.is(totalPrice, 2.7)
})

