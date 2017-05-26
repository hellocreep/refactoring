import Person, {Department} from './../Person';

describe('Hide Delegate', () => {
    let john;
    beforeEach(() => {
        const mick: Person = new Person​​('mick');
        const itDepartment: Department = new Department(mick);

        john = new Person('john');
        john.setDepartment(itDepartment);
    });

    it('getManager', () => {
        const manager = john.getManager();
        expect(manager.getName()).toBe('mick');
    });
});
