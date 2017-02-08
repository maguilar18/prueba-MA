var soap= require('soap');
var xml2js = require('xml2js');

var url = "http://www.webservicex.com/globalweather.asmx?WSDL";
var parser = xml2js.parseString;

var options = {
    ignoredNamespaces: {
        namespaces : ['ws'],
        override : true
    }    
}

soap.createClient(url, (err1, cliente)=>{
    cliente.GetCitiesByCountry({CountryName:'Mexico'},(err2,response)=>{
        //console.log(response);
        console.log(response.GetCitiesByCountryResult);
        parser(response.GetCitiesByCountryResult, (err,result) =>{
            console.log(result.NewDataSet.Table);
        });
    });
})