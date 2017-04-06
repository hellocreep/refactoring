'use strict';
class MenuList{

    constructor() {
        this._price = 4;
        this._basePrice = 0.5;
        this._discountPrice = 1;
    }

    sendOne() {
        //send to somewhere
    }

    sendTwo() {
        //send to somewhere
    }

    calculateTotalPrice(isSpecailDeal) {
        let total = 0;

        if (isSpecailDeal) {
            total = this.calculateCommonPrice(total);

            total += this._price * 0.95;

            this.sendOne();
        } else {
            total = this.calculateCommonPrice(total);

            total += this._price * 0.8;

            this.sendTwo();
        }

        return total;
    }

    calculateCommonPrice(total) {
        total += this._basePrice;
        total -= this._discountPrice;
        return total;
    }
}
module.exports = MenuList;
