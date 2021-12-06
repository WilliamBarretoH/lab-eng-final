package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.UsuarioDAO;
import model.Usuario;

@WebServlet("/logout")
public class LogoutController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
        
        try{
            HttpSession session = req.getSession();  
            session.invalidate();                
            res.sendRedirect(req.getContextPath() + "/");            
        }
        catch(Exception e){
            System.out.println(e);            
        }       
    }
}