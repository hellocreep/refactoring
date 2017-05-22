
namespace ExpressionOrigin {
    class Amount {
        // tslint:disable-next-line:variable-name
        private _id: string;

        constructor(id: string) {
            this.setId(id);
        }

        public setId(arg: string) {
            this._id = 'zz' + arg;
        }
    }
}
