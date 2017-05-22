import Employee, { Salesman, Englneer } from './../Employee';

describe('Pull Down Method', () => {
    it('Employee.getQuota', () => {
        const employee = new Employee();
        expect(employee.getQuota()).toBe('some data');
    });

    it('Salesman.getQuota', () => {
        const salesman = new Salesman();
        expect(salesman.getQuota()).toBe('some data');
    });

    it('Englneer.getQuota', () => {
        const englneer = new Englneer();
        expect(englneer.getQuota()).toBe('some data');
    });
});
