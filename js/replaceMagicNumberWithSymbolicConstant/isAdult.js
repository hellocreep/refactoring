function isAdult(age) {
  const theBoundaryOfAdultsAndYouth = 18;
  if (age >= theBoundaryOfAdultsAndYouth) {
    return true
  }
  return false
}

module.exports = isAdult;