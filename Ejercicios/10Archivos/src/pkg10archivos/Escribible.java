/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

/**
 *
 * @author mp.aguilar
 */
public interface Escribible {

    /**
     *
     * @param url
     */
    public void escribir(String url);   
    public Escribible leer(String url, long timeStamp);
}
