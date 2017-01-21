/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import db.VehiculoDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Vehiculo;

/**
 *
 * @author mp.aguilar
 */
@WebServlet(name = "ServletVehiculo", urlPatterns = {"/ServletVehiculo"})
public class ServletVehiculo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setContentType("text/html;charset=UTF-8");
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
         try (PrintWriter out = response.getWriter()) {
        
         VehiculoDB aDB = new  VehiculoDB();
            try{
                List<Autobus> lista = aDB.getAutobuses();
                PrintWriter pw = response.getWriter();
                
                lista.forEach(autobus-> pw.print(autobus));
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }catch (SQLException e){
                e.printStackTrace();
            }
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try {
           request.setCharacterEncoding("UTF-8"); //para aceptar el acento en el servlet
           
           Autobus autobus = new Autobus();
           autobus.setNum_autobus(Integer.parseInt(request.getParameter("num_autobus")));
           autobus.setSiglas(request.getParameter("siglas"));
           autobus.setModelo(Integer.parseInt(request.getParameter("modelo")));
           autobus.setCapacidad(Integer.parseInt(request.getParameter("capacidad")));
           autobus.setBase(request.getParameter("base"));
            System.out.println(autobus);
           
           VehiculoDB aDB = new VehiculoDB();
           try{
              if(aDB.registrarAutobus(autobus)== 1)
                  response.sendRedirect("success.html");
           }catch (ClassNotFoundException e)
           {
               e.printStackTrace();
           }                       
        } catch (Exception e) {
        }        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
