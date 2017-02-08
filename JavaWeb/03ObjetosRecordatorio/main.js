/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var boletos = [
    {
      folio: 4,
      origen : "MEX",
      destino : "GTO",
      precio : 450     
    },
    {
      folio: 3,
      origen : "GUAD",
      destino : "ON",
      precio : 389      
    },
    {
      folio: 2,
      origen : "SLP",
      destino : "CYA",
      precio : 230      
    }, 
    {
      folio: 1,
      origen : "GUAD",
      destino : "SILA",
      precio : 350      
    } 
]

//ordenar los boletos en el mismo arreglo por precio

/*var valor = 0;
for (i=0; i<boletos.length; i++){     
    if (valor > boletos[i])    {
        valor = boletos[i];
    }
}*/
//result = boletos.sort(boletos);
boletos.sort(function (a, b) {
    // return a.precio-b.precio;
    if (a.precio > b.precio) {return 1 }
    if (a.precio < b.precio) {return -1}
    return 0;
});

console.log(boletos);