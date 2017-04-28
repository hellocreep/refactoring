// original code
class Apple {
  constructor() {
    this._description = 'unknow description'
  }

  get description () {
    return this._description
  }

  set description (val) {
    this._description = val
  }
}

const apple = new Apple()
console.log(apple.description)

// lazy code
class LazyApple {
  constructor() {

  }
  get description () {
    return this._description || 'unknow description'
  }

  set description (val) {
    this._description = val
  }
}

const lazyApple = new LazyApple()
console.log(lazyApple.description)


let start, end, time;
let testerForApple = test(Apple)
let testerForLazyApple = test(LazyApple)


start = new Date().getTime();
for (let i = 0; i < 999999; i++)
    testerForLazyApple();
end = new Date().getTime();
time = end - start;


// start = new Date().getTime();
// for (let i = 0; i < 999999; i++)
//     testerForApple();
// end = new Date().getTime();
// time = end - start;

console.log('Cost : ', time, 'ms');

function test (Cls) {
  return () => {
    const apple = new Cls()
    const originalDescription = apple.description
    apple.description = 'new apple'
    return apple.description
  }
}

// function calcTime (fn) {
//   let startTime = + new Date
//   for (var index = 0; index < 999999; index++) {
//     fn()
//   }
//   let endTime = + new Date
//   console.log('cost: ', endTime - startTime, 'ms')
// }

// console.log('start testing LazyApple:')
// calcTime(test(LazyApple))
// console.log('start testing Apple:')
// calcTime(test(Apple))

