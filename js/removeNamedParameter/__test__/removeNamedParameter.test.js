const test = require('ava')
const IsbnSearch = require('../impl')

test('IsbnSearch', t => {
  const isbnSearch = new IsbnSearch({isbn: '0201485672'})

  t.is(isbnSearch.isbn, '0201485672')
})
