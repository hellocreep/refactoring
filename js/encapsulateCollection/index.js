class Person {
  constructor() {
    this._courses = [];
  }
  get courses() {
    return this._courses;
  }

  set courses(courses) {
    this._courses = courses;
  }
}
