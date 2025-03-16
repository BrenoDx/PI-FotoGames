/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.DAO;

import fotogames.persistencia.entidades.Estoque;
import fotogames.persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
/**
 * Método responsável por manipular situação do estoque.
 */
public class EstoqueDAO {

    private static EntityManager em; //Instância do EntityManager

    /**
     * Método para cadastrar o estoque
     */
    public void cadastrar(Estoque estoque) {
        try {
            em = JPAUtil.getEntityManager();

            em.getTransaction().begin();
            em.persist(estoque);
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível!");
        } finally {
            JPAUtil.closeEntity();
        }
    }

    /**
     * Método retornar a situação do estoque.
     */
    public List<Estoque> listar() {
        try {
            em = JPAUtil.getEntityManager();

            Query consulta = em.createQuery("SELECT e FROM Estoque e");
            List<Estoque> lista = consulta.getResultList();

            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Situação do estoque não cadastrada");
        } finally {
            JPAUtil.closeEntity();
        }
        return null;
    }

    /**
     * Método para alterar quantidade no estoque depois de uma venda. 
     */
    public void vendaEfetuada(int id, int qntd) {
        try {
            em = JPAUtil.getEntityManager();

            Query consulta = em.createQuery("SELECT e FROM Estoque e JOIN e.produto p WHERE p.id = :id");
            consulta.setParameter("id", id);

            Estoque estoque = (Estoque) consulta.getSingleResult();
            if (estoque.getQuantidade() >= qntd) {
                em.getTransaction().begin();
                estoque.setQuantidade(estoque.getQuantidade() - qntd);
                em.merge(estoque);
                em.getTransaction().commit();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem estoque!");
        } finally {
            JPAUtil.closeEntity();
        }
    }
    
    /**
     * Método de situação do estoque
     */
    public boolean statusEstoque(int id){
        try {
            em = JPAUtil.getEntityManager();
            
            
            Query consulta = em.createQuery("SELECT e FROM Estoque e JOIN e.produto p WHERE p.id = :id");
            consulta.setParameter("id", id);

            Estoque estoque = (Estoque) consulta.getSingleResult();
            if (estoque.getQuantidade() > 0) {
                return true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem estoque!");
        } finally {
            JPAUtil.closeEntity();
        }
        return false;
    }

    /**
     * Método para retornar um produto do estoque.
     */
    public Estoque getEstoque(int id) {
        try {
            em = JPAUtil.getEntityManager();

            
            Query consulta = em.createQuery("SELECT e FROM Estoque e JOIN e.produto p WHERE p.id = :id");
            consulta.setParameter("id", id);

            Estoque estoque = (Estoque) consulta.getSingleResult();
            return estoque;
        } catch (Exception e) {
            
        } finally {
            JPAUtil.closeEntity();
        }
        return null;
    }

    /**
     * Método para alterar o estoque 
     */
    public void alterarEstoque(int id, int quantidade) {
        try {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();
            
            Query query = em.createQuery("UPDATE Estoque e SET e.quantidade = :quantidade WHERE e.produto.id = :id");
            query.setParameter("quantidade", quantidade);
            query.setParameter("id", id);

            query.executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {

        } finally {
            JPAUtil.closeEntity();
        }
    }

}
