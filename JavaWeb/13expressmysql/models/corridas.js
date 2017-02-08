var mysql = require('mysql');
var conexion = mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"gfajava",
    port:3306
});

var corridasModel = {};

corridasModel.getCorrida = function (id, callback){
    if (conexion){
        conexion.query('SELECT * FROM corridas WHERE id =' + id,(err,row)=>{
        if (err){
              throw err
          }else{
              callback(err,row[0]);
          }  
        });
    } 
};

corridasModel.getCorridas = function (callback){
    if (conexion){
       conexion.query('SELECT * FROM corridas',(err,rows)=>{
          if (err){
              throw err
          }else{
              callback(err,rows);
          }              
       });    
    }        
};

corridasModel.insertaCorrida = function (corrida, callback){    
    if (conexion){
       conexion.query('insert into corridas set ?',corrida,(err,response)=> {           
          if (err){
              throw err
          }else{
              callback(err,response);
          }              
       });    
    }        
};

module.exports = corridasModel;