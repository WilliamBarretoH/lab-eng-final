package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import config.JPAFactory;
import model.Historico;

public class HistoricoDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
    EntityManager em = emf.createEntityManager();
    
    public void saveHistory(Historico historico) {
//        EntityManager em = JPAFactory.getEntityManager();

        System.out.println("Cadastrado");
        
        em.getTransaction().begin();
        em.persist(historico);
        em.getTransaction().commit();
        em.close();


        System.out.println(" historico foi cadastrado");
    }

    public List<Historico> listHistory(String nome){
        Query query = em.createQuery("FROM historico h where h.nome=:nome"); 
        query.setParameter("nome", nome);
        List<Historico> registros = query.getResultList();
        
        if (registros.isEmpty()){
            System.out.println("Empty list");
            return registros;
        }
        else{
            return registros;
        }
    }
}
