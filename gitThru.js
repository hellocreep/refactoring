const util = require('util');
const exec = require('child_process').exec;

const stdin = process.stdin

stdin.setRawMode(true);
stdin.setEncoding('utf8');

stdin.on('data', function (text) {
  // up
  if (text === '\u001b[A') {
    exec('git log --reverse --pretty=%H master | awk \"/$(git rev-parse HEAD)/{getline;print}\" | xargs git checkout', (error, stdout, stderr) => {
      if (error) {
        console.error(`exec error: ${error}`);
        return;
      }
      console.log(stderr);
    })
  }

  // down
  if (text === '\u001b[B') {
    exec('git checkout HEAD^1', (error, stdout, stderr) => {
      if (error) {
        console.error(`exec error: ${error}`);
        return;
      }
      console.log(stderr);
    })
  }

  if (text === '\u0003') {
    exec('git checkout master', () => {
      process.exit();
    })
  }
});
