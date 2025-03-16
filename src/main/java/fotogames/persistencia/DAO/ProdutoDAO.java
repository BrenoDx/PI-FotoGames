/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.DAO;

import fotogames.persistencia.JPAUtil;
import fotogames.persistencia.entidades.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
/**
 * Método responsável por manipular o estoque no BD.
 */
public class ProdutoDAO {

    private static EntityManager em; // Instância EntityManager.

    /**
     * Método para cadastrar produto
     */
    public void cadastrar(Produto produto) {
        try {
            em = JPAUtil.getEntityManager();

            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar");
        } finally {
            JPAUtil.closeEntity();
        }
    }

    /**
     * Método retornar uma lista de produtos cadastrado.
     */
    public List<Produto> listar() {
        try {
            em = JPAUtil.getEntityManager();

            Query consulta = em.createQuery("SELECT p FROM Produto p");
            List<Produto> lista = consulta.getResultList();
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!");
        } finally {
            JPAUtil.closeEntity();
        }
        return null;
    }

    /**
     * Método para retornar apenas um produto.
     */
    public List<Produto> getProduto(Produto produto) {
        try {
            em = JPAUtil.getEntityManager();

            Query consulta = em.createQuery("SELECT p FROM Produto p WHERE nomeProduto = :produto");
            consulta.setParameter("produto", produto);

            List<Produto> produtoEncontrado = consulta.getResultList();
            return produtoEncontrado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
        return null;
    }

    /**
     * Método para retornar um produto pela ID. 
     */
    public Produto getProdutoID(int id) {
        try {
            em = JPAUtil.getEntityManager();
            
           // em.getTransaction().begin();
            Produto produto = em.find(Produto.class, id);
           // em.getTransaction().commit();
            
            return produto;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        } finally {
            JPAUtil.closeEntity();
        }
        return null;
    }

    /**
     * Método para alterar dados do produto. 
     */
    public void editarProduto(int id, String nomeProduto, String fabricante, String categoria, String plataforma, String cor, int garantia, double valor) {
        try {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();
            
            Query query = em.createQuery("UPDATE Produto p SET p.nomeProduto = :nomeProduto, p.fabricante = :fabricante, p.categoria = :categoria, p.plataforma = :plataforma, p.cor = :cor, p.garantia = :garantia, p.valor = :valor WHERE p.id = :id");
            query.setParameter("nomeProduto", nomeProduto);
            query.setParameter("fabricante", fabricante);
            query.setParameter("categoria", categoria);
            query.setParameter("plataforma", plataforma);
            query.setParameter("cor", cor);
            query.setParameter("garantia", garantia);
            query.setParameter("valor", valor);
            query.setParameter("id", id);

            query.executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            JPAUtil.closeEntity();
        }
    }
}
