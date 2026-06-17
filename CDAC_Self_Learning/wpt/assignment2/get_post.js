const http = require('http');

const server = http.createServer((req, res) => {

    if(req.method === 'GET') {
        res.write("GET req ");
        res.end();
    }

    if(req.method === 'POST') {
        let body = "";

        req.on('data', chunk => {
            body += chunk;
        });

        req.on('end', () => {
            res.write("POST data: " + body);
            res.end();
        });
    }

});

server.listen(3000);