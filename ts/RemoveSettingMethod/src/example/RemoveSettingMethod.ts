 namespace Example {
   export class Amount {
        private _id: string;

        constructor(id: string) {
            this._id = id;
        }

        public setId(arg: string) {
            this._id = arg;
        }
    }
}