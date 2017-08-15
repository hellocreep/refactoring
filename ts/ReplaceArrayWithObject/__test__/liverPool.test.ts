import test from 'ava';
import {name,wins} from '../liverPool'

test('should have the right team name',(t)=>{
  t.is(name,'Liverpool');
});

test('should have the right wins number', t => {
  t.is(wins,15);
})