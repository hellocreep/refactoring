 namespace ExampleOrigin {
   export class Amount {
        private _id: string;

        constructor(id: string) {
            this.setId(id);
        }

        protected setId(arg: string) {
            this._id = arg;
        }
    }
}