class PizzaDelivery {

    constructor() {
        this.numberOfLateDeliveries = 0;
    }

    setNumberOfLateDeliveries(lateDeliveries) {
        this.numberOfLateDeliveries = lateDeliveries;
    }

    getRating() {
        return this._moreThanFiveLateDeliveries() ? 2 : 1;
    }

    _moreThanFiveLateDeliveries() {
        return this.numberOfLateDeliveries > 5;
    }
}