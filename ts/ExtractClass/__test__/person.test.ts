import test from 'ava';
import Person from '../person';

let person;

test.beforeEach(t => {
  person = new Person('bob', '13800138000', '028');
});

test('get office number', (t) => {
  t.is(person.getOfficeNumber(), '13800138000');
});

test('set office number', (t) => {
  person.setOfficeNumber('10086');
  t.is(person.getOfficeNumber(), '10086');
});

test('get office area code', (t) => {
  t.is(person.getOfficeAreaCode(), '028');
});

test('office area code', (t) => {
  person.setOfficeAreaCode('010');
  t.is(person.getOfficeAreaCode(), '010');
});