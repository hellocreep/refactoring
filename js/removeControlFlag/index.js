const notifier = {
  notifyAdmin() {},
  sendAlert() {}
}

function foundMiscreant(people) {
  for (let i = 0; i < people.length; i++) {
    if (people[i] === 'Don') {
      notifier.sendAlert()
      return 'Don'
    }
    if (people[i] === 'John') {
      notifier.sendAlert()
      return 'John'
    }
  }

  return ''
}

function checkSecurity(people) {
  const found = foundMiscreant(people)

  if (found) {
    notifier.notifyAdmin(found)
  }
}

module.exports = {
  checkSecurity,
  notifier
}
