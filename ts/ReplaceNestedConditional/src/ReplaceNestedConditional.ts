
class Amount {
    private _isDead: boolean = false;
    private _isSeparated: boolean = false;
    private _isRetired: boolean = false;

    public getPayAmount(): number {
        let result: number;
        if (this._isDead) {
            return this.deadAmount();
        }

        if (this._isSeparated) {
            return this.separatedAmount();
        }

        if (this._isRetired) {
            return this.retiredAmount();
        }
        result = this.normalPayAmount();

        return result;
    }

    private deadAmount(): number {
        return 0;
    }

    private separatedAmount(): number {
        return 0;
    }

    private retiredAmount(): number {
        return 0;
    }

    private normalPayAmount(): number {
        return 0;
    }
}
