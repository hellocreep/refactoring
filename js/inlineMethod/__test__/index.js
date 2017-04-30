const test = require('ava')
const PizzaDelivery = require('../index')

test('should return rating 1 when the number of late delivery is not more than 5', (t) => {
    const pizzaDelivery = new PizzaDelivery();
    pizzaDelivery.setNumberOfLateDeliveries(3);

    t.is(pizzaDelivery.getRating(), 1);
});

test('should return rating 1 when the number of late delivery is  equal 5', (t) => {
    const pizzaDelivery = new PizzaDelivery();
    pizzaDelivery.setNumberOfLateDeliveries(5);

    t.is(pizzaDelivery.getRating(), 1);
});

test('should return rating 2 when the number of late delivery is  more than 5', (t) => {
    const pizzaDelivery = new PizzaDelivery();
    pizzaDelivery.setNumberOfLateDeliveries(8);

    t.is(pizzaDelivery.getRating(), 2);
});