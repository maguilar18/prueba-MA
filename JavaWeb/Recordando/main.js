/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var arregloa = [0,1,7,4,43,2,9,10,5,33,73];
var arregloimpares = [];
var arreglopares = [];

//desglozar en 2 arreglos, pares e impares

for (i=0; i<arregloa.length; i++){    
    if ((arregloa[i]%2)==0)    {
       arreglopares.push(arregloa[i]); 
    }
    else    {
       arregloimpares.push(arregloa[i]); 
    }        
}

console.log(arreglopares);
console.log(arregloimpares);