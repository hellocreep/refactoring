import Employee, { Salesman, Englneer } from './../Employee';

describe('Pull Down Method', () => {
    it('Salesman.getQuota', () => {
        const salesman = new Salesman();
        expect(salesman.getQuota()).toBe('some data');
    });
});
