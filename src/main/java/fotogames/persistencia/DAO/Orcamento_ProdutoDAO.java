/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.DAO;

import fotogames.persistencia.JPAUtil;
import fotogames.persistencia.entidades.Orcamento_Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
/**
 * Classe responsável por manipular Orcamentos_Produtos no bd.
 */
public class Orcamento_ProdutoDAO {

    private static EntityManager em; //Instância EntityManager

    /**
     * Método para cadastrar
     */
    public void cadastrar(Orcamento_Produto op) {
        em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(op);
            em.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar!");
        } finally {
            JPAUtil.closeEntity();
        }
    }

    /**
     * Método para listar.
     */
    public List<Orcamento_Produto> listar() {
        em = JPAUtil.getEntityManager();
        List<Orcamento_Produto> lista;
        try {
            Query consulta = em.createQuery("SELECT op FROM Orcamento_Produto op WHERE op.orcamento.id IN ("
                    + "SELECT DISTINCT op2.orcamento.id FROM Orcamento_Produto op2"
                    + ")",
                    Orcamento_Produto.class
            );
            lista = consulta.getResultList();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum orcamento encontrado!");
        } finally {
            JPAUtil.closeEntity();
        }
        return null;
    }

    /**
     * Método para retornar um Orcamento_Produto.
     */
    public Orcamento_Produto getOP(int id) {
        try {
            em = JPAUtil.getEntityManager();

            Query consulta = em.createQuery("SELECT op FROM Orcamento_Produto op JOIN op.orcamento o WHERE o.id = :id ");
            consulta.setParameter("id", id);

            List<Orcamento_Produto> lista = consulta.getResultList();
            if (!lista.isEmpty()) {
                return lista.get(0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        } finally {
            JPAUtil.closeEntity();
        }
        return null;
    }

}
