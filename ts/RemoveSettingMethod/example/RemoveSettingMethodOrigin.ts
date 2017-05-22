 namespace ExampleOrigin {
   export class Amount {
        // tslint:disable-next-line:variable-name
        private _id: string;

        constructor(id: string) {
            this.setId(id);
        }

        protected setId(arg: string) {
            this._id = arg;
        }
    }
}
