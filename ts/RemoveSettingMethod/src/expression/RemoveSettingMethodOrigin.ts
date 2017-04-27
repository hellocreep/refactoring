
namespace ExpressionOrigin {
    class Amount {
        private _id: string;

        constructor(id: string) {
            this.setId(id);
        }

        public setId(arg: string) {
            this._id = "zz" + arg;
        }
    }
}