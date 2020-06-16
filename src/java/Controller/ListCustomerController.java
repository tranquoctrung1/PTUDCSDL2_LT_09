/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NhanVienModel;
import TranferObject.NhanVien;
import Utils.DB;
import static Utils.DB.conn;
import Utils.MyUltilities;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tqtr
 */
@WebServlet(name = "ListCustomerController", urlPatterns = {"/ListCustomerController"})
public class ListCustomerController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String view = "/view/danhsachnhanvien.html";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        NhanVienModel nvm = new NhanVienModel();
        StringWriter content = new StringWriter();

        ArrayList<NhanVien> lnv = new ArrayList<NhanVien>();
        lnv = nvm.Select();

        try (PrintWriter out = response.getWriter()) {

            for (NhanVien nv : lnv) {
                content.append(String.format("<div class=%s>", nv.getMaNV()));
                content.append(String.format("Mã nhân viên: %s       họ và tên: %s %s %s", nv.getMaNV(), nv.getHoNV(), nv.getTenLot(), nv.getTenNV()));
                content.append("</div>");
                content.append("<hr>");

            }

            Hashtable<String, String> data = new Hashtable<String, String>();
            data.put("title", "Danh sách nhân viên");
            data.put("content", content.toString());
            String absolutepath = getServletContext().getRealPath(view);
            String webcontent = MyUltilities.readFile(absolutepath, UTF_8);
            webcontent = MyUltilities.replace(data, webcontent);
            out.println(webcontent);
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
