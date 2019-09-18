var http = require('http');

var count = 1;

var handleRequest = function (req,resp){
    count +=1;
    resp.writeHead(200, {'Content-Type':'text/html' });
    resp.end("<h2>Hello There!</h2><p>You have just made"
        + count +" request</p>");
};

http=110;

var server = http.createServer(handleRequest);

server.listen(3000,(err)=>{
    console.log("Error !"+err);
});