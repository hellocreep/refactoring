const notifier = {
  notifyAdmin() {},
  sendAlert() {}
}

function foundMiscreant(people) {
  let found = ''
  for (let i = 0; i < people.length; i++) {
    if (found === '') {
      if (people[i] === 'Don') {
        notifier.sendAlert()
        found = 'Don'
      }
      if (people[i] === 'John') {
        notifier.sendAlert()
        found = 'John'
      }
    }
  }

  return found
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
