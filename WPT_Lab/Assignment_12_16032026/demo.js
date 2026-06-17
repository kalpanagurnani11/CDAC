// const http=require('http');
// const server=http.createServer((req,res)=>
// {
//     res.write("hello")
//     res.end("bye")

// })
// server.listen(5050);

const http=require('http');
const server=http.createServer((req,res)=>
{
    res.writeHead(200 ,{'Content-Type':'text/plain'});
    if(req.method=='GET')
    {
        if(req.url==='/')
        {
            res.end("browser this is");
        }
         else if(req.url==='/index')
        {
            res.end("index page");
        }
         else if(req.url==='/home')
        {
            res.end("home page");
        }
        
        else
        {
            res.end("404 not found")
        }

    }
    else if(req.method==='POST')
    {
        if(req.url==='/aboutus')
        {
            res.end("about us page")
        }
         else
        {
            res.end("404 not found")
        }

    }
    else{
        res.end("method not supported")
    }
});
server.listen(5050, ()=>{
    
    console.log("Server Started ")

});




