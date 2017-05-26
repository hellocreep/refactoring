import test from 'ava';
import Employee from '../employee'

test('should get dead payment when employ is dead', function (t) {
  const deadEmployee = new Employee('DEAD');

  t.is(deadEmployee.getPaymentAmount(), 'deadAmount');
});

test('should get separated payment when employ is separated', function (t) {
  const separatedEmployee = new Employee('SEPARATED');

  t.is(separatedEmployee.getPaymentAmount(), 'separatedAmount');
});

test('should get retired payment when employ is retired', function (t) {
  const retiredEmployee = new Employee('RETIRED');

  t.is(retiredEmployee.getPaymentAmount(), 'retiredAmount');
});

test('should get normal payment when employ is normal', function (t) {
  const normalEmployee = new Employee('NORMAL');

  t.is(normalEmployee.getPaymentAmount(), 'normalPayAmount');
});