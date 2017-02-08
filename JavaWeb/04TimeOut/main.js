/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
setTimeout(()=>{
    console.log("hola");
    },2000);
 
setTimeout(()=>{
    console.log("Tercer Mensaje");
    },3000);
    
var funcionX = () =>{
    console.log("Mensaje Repetitivo")
}
funcionX();
setInterval(funcionX,1000);

    console.log("Segundo Mensaje");

