import * as moment from 'moment';
import { Moment } from 'moment';
import { SUMMER_END, SUMMER_START } from './Constant';

export default class PriceCharger {
    private _summerRate: number;
    private _winterRate: number;
    private _winterServiceCharge: number;

    constructor() {
        this._summerRate = 1.0;
        this._winterRate = 0.9;
        this._winterServiceCharge = 1000;
    }

    public getCharge(quanitity: number, date: Moment): number {
        if (this.notSummer(date)) {
            return this.winterCharge(quanitity);
        } else {
            return this.winterCharge(quanitity);
        }
    }

    private notSummer(date: Moment): boolean {
        return date.isBefore(SUMMER_START) || date.isAfter(SUMMER_END);
    }

    private winterCharge(quanitity: number): number {
        return quanitity * this._winterRate + this._winterServiceCharge;
    }

    private summerCharge(quanitity: number): number {
        return quanitity * this._summerRate;
    }
}
