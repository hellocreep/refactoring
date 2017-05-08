const test = require('ava')
const SearchCriteria = require('../impl')

test('SearchCriteria', t => {
  const criteria = new SearchCriteria({
    authorId: 5,
    publisherId: 8,
    isbn: '0201485672'
  })
  t.is(criteria.authorId, 5)
  t.is(criteria.publisherId, 8)
  t.is(criteria.isbn, '0201485672')
})
