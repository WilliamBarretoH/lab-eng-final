package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;

@WebServlet("/cadastrar")
public class CadastroController extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try{
			req.getRequestDispatcher("/view/cadastrar.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println(e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String nome = req.getParameter("nome");
			String email = req.getParameter("email");
			String senha = req.getParameter("senha");
			
			Usuario usuario = new Usuario();
			usuario.setNome(nome);
			usuario.setEmail(email);
			usuario.setSenha(senha);
			
			UsuarioDAO usuarioDao = new UsuarioDAO();
			usuarioDao.createUser(usuario);

			resp.setContentType("text/html;charset=UTF-8");
        

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}