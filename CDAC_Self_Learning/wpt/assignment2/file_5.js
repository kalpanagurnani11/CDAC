const fs = require("fs");


fs.writeFileSync("data.txt", "Hello user!");


fs.readFile("data.txt", "utf8", (err, data) => {
    if (err) throw err;
    console.log(data);
});