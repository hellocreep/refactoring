import Dollars from "./Dollars";

class Charge {
    protected baseCharge(): Dollars {
        let result: number = Math.min(this.lastUsage(), 100) * 0.03;

        if (this.lastUsage() > 100) {
            result += (Math.min(this.lastUsage(), 200) - 100) * 0.05;
        }

        if (this.lastUsage() > 200) {
            result += (this.lastUsage() - 200) * 0.07;
        }

        return new Dollars(result);
    }

    protected lastUsage(): number {
        return 0;
    }
}
