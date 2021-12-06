package controller;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.HistoricoDAO;
import model.Historico;

@WebServlet("/historico")
public class HistoricoController extends HttpServlet{
    
    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try{

			String nome = "";
			HttpSession session = req.getSession(false);  
            if((session!=null) && ((String)session.getAttribute("username") != null)){   
				
				nome = (String)session.getAttribute("username");
			} 
			else {}

			HistoricoDAO historicoDao = new HistoricoDAO();
			List<Historico> registros = historicoDao.listHistory(nome);

			req.setAttribute("registros", registros);
            req.getRequestDispatcher("/view/historico.jsp").forward(req, res);

		} catch (Exception e){
			System.out.println(e);
		}
	}
}
