/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 *
 * @author mp.aguilar
 */
public class Error implements Escribible{
    private long timeStamp;
    private int codigoError;
    private String descripcion;

    public Error(int codigoError, String descripcion)
    {
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }

    Error() {
    }
    
    @Override
    public String toString(){
        return timeStamp + " | " + codigoError + " | " + descripcion + "\n";
    }
            
    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     @Override
    public void escribir(String url) {
        try {
            FileOutputStream f0 = new FileOutputStream(url, true);
            OutputStreamWriter oS = new OutputStreamWriter(f0,"UTF-8");
            BufferedWriter bW = new BufferedWriter(oS);
            
            String linea = timeStamp +" | "+codigoError+" | "+ descripcion +"\n";
            bW.write(linea);
            bW.close();
        }catch(FileNotFoundException ex)
        {
              System.err.println("Archivo no encontrado");
        }catch(UnsupportedEncodingException ex) //para cuando existe un error de codificacion y queremos atrapar el error
        {
              System.out.println("Tipo de codificacion no soportada");
        }catch(IOException ex) //para atrapar un error de escritura en un archivo
        {
              System.out.println("Tipo de codificacion no soportada");
        }catch(Exception ex) //para atrapar un error desconocido
        {
              System.out.println("Cualquier otro error");
        }
    }
   /* @Override
    public void escribir(String url) {
        try {
            FileWriter fw=new FileWriter(url,true);
            String linea = timeStamp + " | " + codigoError + " | " + descripcion + "\n";
            fw.append(linea);
            fw.close();
        }catch (IOException ex){
            System.out.println("Escribir...");
        }
    }
*/
    @Override
    public Escribible leer(String url,long timeStamp) {
       try
       {
         FileReader fR = new FileReader(url);
         BufferedReader bR = new BufferedReader(fR);
         String linea;
         while ((linea = bR.readLine()) != null)
         {
            String[] sl = linea.split("-");
            //System.out.println(sl[0].equals(timeStamp));
            if (Long.parseLong(sl[0].trim())==timeStamp)
            {
                this.timeStamp = timeStamp;
                this.codigoError = Integer.parseInt(sl[1].trim());
                this.descripcion = sl[2].trim();
                return this;
            }
         }
       }catch(FileNotFoundException ex)           
       {
           System.out.println("Archivo no encontrado");
       }catch(IOException ex)           
       {
           System.out.println("Error IO");
       }
       return null;
    }    
}
