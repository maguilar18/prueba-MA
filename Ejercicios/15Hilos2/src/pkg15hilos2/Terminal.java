/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15hilos2;

/**
 *
 * @author mp.aguilar
 */
public class Terminal implements Runnable{
    private Autobus autobus;
    private long tiempoInicial;
    private static String[] mensajes = {"Ascenso","Espera","Descenso"};

    public Terminal(Autobus autobus, long tiempoInicial) {
        this.autobus = autobus;
        this.tiempoInicial = tiempoInicial;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    @Override
    public void run() {
        System.out.println("El autobus con el número: "+autobus.getNumero()+
        "se comenzo en el tiempo: "+((System.currentTimeMillis() - tiempoInicial)/1000));
        
        for(int i = 0; i<autobus.getTiempos().length; i++){
            esperarSegundos(autobus.getTiempos()[i]);
            System.out.println(mensajes[i] + " : " + autobus.getNumero() + " | tiempo: " +
                    ((System.currentTimeMillis() - tiempoInicial)/1000));
        } 
        System.out.println("El autobús con el numero " + autobus.getNumero() +
                      " partió a su destino " + autobus.getDestino());       
    }
    
    private void esperarSegundos(int seg)
    {
        try{
            Thread.sleep(seg*1000);
        }catch(InterruptedException e)
        {
          e.printStackTrace();
        }
    }
}
