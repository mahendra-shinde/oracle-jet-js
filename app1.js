var person = function(firstName, lastName){
    this.firstName = firstName;
    this.lastName = lastName;
}

var p1 = new person("Donald","Trump");
var p2 = new person("Vladmir","Putin");

console.log(p1.lastName+ " hates "+p2.lastName);

// export "p1" as "p1"
module.exports.p1 = p1;
// export "p2" as "obj2"
module.exports.obj2 = p2;