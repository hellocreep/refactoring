import Employee from './../Employee';

describe('Pull Down Method', () => {
    it('Employee.getQuota', () => {
        const employee = new Employee();
        expect(employee.getQuota()).toBe('some data');
    });
});
