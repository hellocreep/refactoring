import _ from 'lodash'

class Person {
  constructor() {
    this._courses = [];
  }
  get courses() {
    return this._courses;
  }

  set courses(courses) {
    this.removeAllCourses();
    _.each(courses, (course) => {
      this.addCourse(course);
    });
  }

  addCourse(course) {
    this._courses.push(course);
  }

  removeCourse(course) {
    return _.remove(this._courses, (val) => val === course);
  }

  removeAllCourses() {
    this._courses = [];
  }
}
