class PizzaDelivery {

    constructor() {
        this.numberOfLateDeliveries = 0;
    }

    setNumberOfLateDeliveries(lateDeliveries) {
        this.numberOfLateDeliveries = lateDeliveries;
    }

    getRating() {
        return this.numberOfLateDeliveries > 5 ? 2 : 1;
    }
}