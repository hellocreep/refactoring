export default class Person {
    private _department: Department;
    private _name: string;

    constructor(name: string) {
        this._name = name;
    }

    public getName() {
        return this._name;
    }

    public setDepartment(arg: Department): void {
        this._department = arg;
    }

    public getManager(): Person {
        return this._department.getManager();
    }
}

export class Department {
    private _chargeCode: string;
    private _manager: Person;

    constructor(manager: Person​​) {
        this._manager = manager;
    }
    public getManager(): Person {
        return this._manager;
    }
}
