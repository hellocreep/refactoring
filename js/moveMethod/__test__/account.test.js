import {test} from 'ava';
import Account from '../account';

test('normal overdraw account overdraw 3 days will be charged 9.75', (t) => {
  const overdrawAccount = new Account(false, 3);
  t.is(overdrawAccount.bankCharge(),9.75);
});

test('premium overdraw account overdraw 8 days will be charged 9.75', (t) => {
  const overdrawAccount = new Account(true, 8);
  t.is(overdrawAccount.bankCharge(),15.35);
});

test('premium overdraw account overdraw 3 days will be charged 9.75', (t) => {
  const overdrawAccount = new Account(true, 3);
  t.is(overdrawAccount.bankCharge(),14.5);
});
