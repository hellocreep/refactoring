const test = require('ava')
const sinon = require('sinon')
const security = require('../index')

test('checkSecurity', (t) => {
  sinon.stub(security.notifier , 'sendAlert')
  sinon.stub(security.notifier , 'notifyAdmin')
  const people = ['Pete', 'Don']
  security.checkSecurity(people)

  t.true(security.notifier.sendAlert.called)
  t.true(security.notifier.notifyAdmin.calledWith('Don'))
})
