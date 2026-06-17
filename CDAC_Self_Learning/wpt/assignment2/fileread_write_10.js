const fs = require('fs');


fs.writeFileSync('hello.txt', 'Hello ');


fs.readFile('hello.txt', 'utf8', (err, data) => {
    if(err) throw err;
    console.log(data);
});