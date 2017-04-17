import Dollars from "./Dollars";

const IntegerMax = 999999999;

class Charge {
    protected baseCharge(): Dollars {
        let result: number = this.chargeLessThan100();

        if (this.lastUsage() > 100) {
            result += this.chargeGreaterThan100LessThan200();
        }

        if (this.lastUsage() > 200) {
            result += this.chargeGreaterThan200();
        }

        return new Dollars(result);
    }

    protected usageInRange(start: number, end: number): number {
         if (!(this.lastUsage() > start)) {
            return 0;
        }

         return Math.min(this.lastUsage(), end) - start;
    }

    protected chargeLessThan100(): number {
        if (!(this.lastUsage() > 0)) {
            return 0;
        }
        //(Math.min(this.lastUsage(), 100) - 0) * 0.03
        return Math.min(this.lastUsage(), 100) * 0.03;
    }

    protected chargeGreaterThan100LessThan200(): number {
        if (!(this.lastUsage() > 100)) {
            return 0;
        }
         //(Math.min(this.lastUsage(), 200) - 100) * 0.05
        return (Math.min(this.lastUsage(), 200) - 100) * 0.05;
    }

    protected chargeGreaterThan200(): number {
        if (!(this.lastUsage() > 200)) {
            return 0;
        }
        //(Math.min(this.lastUsage(), IntegerMax) - 200) * 0.07
        return (this.lastUsage() - 200) * 0.07;
    }

    protected lastUsage(): number {
        return 0;
    }
}
