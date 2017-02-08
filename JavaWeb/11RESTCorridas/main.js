var Cliente = require('node-rest-client').Client;
var cliente = new Cliente();

cliente.get("http://localhost:8084/09RESTCorridas/rest/Consulta/7",(data,response)=>{
    console.log(data);
    console.log(response);
});

cliente.post("http://localhost:8084/09RESTCorridas/rest/Insertar",{
    parameters:{
        origen : "ON",
        destino : "SLP",
        fechaSalida: "2017-09-24",
        fechaLlegada: "2017-09-24",
        horaSalida: "10:00:20",
        horaLlegada:"13:00:21",
        escalas: 30000
    }
},(data,response)=>{
   console.log(data);
});