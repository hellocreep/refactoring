function greet(firstPersonName, secondPersonName) {
  return greetFn(firstPersonName, secondPersonName)
}

function greetFn(firstPersonName, secondPersonName) {
  return `Hello, ${firstPersonName} and ${secondPersonName}!`
}

module.exports = greet
