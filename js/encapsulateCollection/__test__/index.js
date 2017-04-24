const test = require('ava')
const Person = require('../index')

test('get and set courses ', (t) => {
    const courses = ['Math'];
    const person = new Person();
    person.courses = courses;

    t.is(person.courses, courses);
});
