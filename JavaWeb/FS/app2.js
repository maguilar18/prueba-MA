var fs = require('fs');

var contenido = fs.readFileSync('./archivo.txt');
console.log("Lectura Completada");
console.log(contenido.toString());