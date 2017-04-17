import Dollars from "./Dollars";

const IntegerMax = 999999999;

class Charge {
    protected baseCharge(): Dollars {
        let result: number = this.usageInRange(0, 100) * 0.03;
        result += this.usageInRange(100, 200) * 0.05;
        result += this.usageInRange(200, IntegerMax) * 0.07;

        return new Dollars(result);
    }

    protected usageInRange(start: number, end: number): number {
        if (!(this.lastUsage() > start)) {
            return 0;
        }

        return Math.min(this.lastUsage(), end) - start;
    }

    protected lastUsage(): number {
        return 0;
    }
}
