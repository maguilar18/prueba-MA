var fs= require('fs');
var contenido;
    fs.readFile('./archivo.txt',function(err,data){
        contenido = data.toString();
        console.log(contenido);
        escribir();
    });

function escribir() {
fs.writeFile('./nuevoarchivo.txt',contenido,err=>{
     console.log("Escitura Realizada");  
    });
}


