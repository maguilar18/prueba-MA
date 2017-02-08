var boletos = require('./procesos.js');

var b1 = {
    folio : 49203,
    origen: "GTO",    
    destino: "GDL",
    costo : 93000
};

var b2 = {
    folio : 43203,
    origen: "ON",    
    destino: "GDL",
    costo : 90
};

var b3 = {
    folio : 44333,
    origen: "GTO",    
    destino: "SILA",
    costo : 930
};

boletos.insertar(b1);
boletos.insertar(b2);
boletos.insertar(b3);
boletos.imprimir();

