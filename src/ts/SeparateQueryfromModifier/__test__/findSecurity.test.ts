import test from 'ava';
import {checkSecurity} from '../findSecurity'

test('should return driver when driver is in person list', (t) => {
    const result = checkSecurity(['don','driver']);
    t.is(result,'driver');
});

test('should return pm when pm is in person list', (t) => {
    const result = checkSecurity(['don','pm','driver']);
    t.is(result,'pm');
});

test('should return empty string when none security person in person list', (t) => {
    const result = checkSecurity(['don','bear','boss']);
    t.is(result,'');
});