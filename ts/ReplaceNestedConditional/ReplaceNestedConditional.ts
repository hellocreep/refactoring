
class Amount {
    // tslint:disable-next-line:variable-name
    private _isDead: boolean = false;
    // tslint:disable-next-line:variable-name
    private _isSeparated: boolean = false;
    // tslint:disable-next-line:variable-name
    private _isRetired: boolean = false;

    public getPayAmount(): number {
        if (this._isDead) {
            return this.deadAmount();
        }

        if (this._isSeparated) {
            return this.separatedAmount();
        }

        if (this._isRetired) {
            return this.retiredAmount();
        }

        return this.normalPayAmount();
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
