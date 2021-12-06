package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import model.Usuario;

public class UsuarioDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
    EntityManager em = emf.createEntityManager();
    
    public void createUser(Usuario usuario) {
        System.out.println("Cadastrado");
        
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public Usuario findUserByEmail(String email, String password){
        Query query = em.createQuery("FROM usuario u where u.email=:email"); 
        query.setParameter("email", email);
        List<Usuario> usuarios = query.getResultList();
        
        if (usuarios.isEmpty()){
            System.out.println("Empty list");
        }
        else{
            for (Usuario usuario: usuarios){
                if (usuario.getSenha().equals(password) && usuario.getEmail().equals(email)){
                    
                     return usuario;
                }
            }
        }

        return null;
    }
}