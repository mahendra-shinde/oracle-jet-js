var express = require("express");
 
var app = express();
 
app.use(express.static('navigation'));
var server = app.listen(5000,function(){
    console.log("server started on port 5000");
}); 