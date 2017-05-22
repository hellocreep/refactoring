
namespace Inherit {
    class Amount {
        private readonly _id: string;

        constructor(id: string) {
            this._id = id;
        }

        //another way
        // protected initializeId(arg: string) {
        //     this._id = "zz" + arg;
        // }
    }

    class InterestAccount extends Amount {
        constructor(id: string) {
            super(id);
            //another way
            //this.initializeId(id)
        }
    }
}
