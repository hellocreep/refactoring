namespace Expression {
    class Amount {
        // tslint:disable-next-line:variable-name
        private _id: string;

        constructor(id: string);
        constructor(other: string, id?: string) {
            this.initializeId(id);
        }

        private initializeId(arg: string) {
            this._id = 'zz' + arg;
        }
    }
}
