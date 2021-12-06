package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.UsuarioDAO;
import model.Usuario;

@WebServlet("/login")
public class LoginController extends HttpServlet{
 
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try {
			req.getRequestDispatcher("/view/login.jsp").forward(req, res);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String email = req.getParameter("email");
			String senha = req.getParameter("senha");

			UsuarioDAO usuarioDao = new UsuarioDAO();
			Usuario user = usuarioDao.findUserByEmail(email,senha);

			if (user != null) {
				HttpSession session = req.getSession();  
				session.setAttribute("username", user.getNome());
				resp.setStatus(200);
				resp.setContentType("text/html;charset=UTF-8");		

			} else {
				req.setAttribute("message", "Erro. Verifique email ou senha");
				resp.setStatus(500);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}