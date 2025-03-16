/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.DAO;

import fotogames.persistencia.JPAUtil;
import fotogames.persistencia.entidades.Venda_Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */

/**
 * Classe responsável por manipular Venda_Produto no bd.
 */
public class Venda_ProdutoDAO {
    private static EntityManager em; //Instância EntityManager
    
    /**
     * Método para cadastrar.
     */
    public void cadastrar(Venda_Produto vendaproduto){
        try{
            em = JPAUtil.getEntityManager();
            
            em.getTransaction().begin();
            em.persist(vendaproduto);
            em.getTransaction().commit();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar" + e.getMessage());
        }finally{
            JPAUtil.closeEntity();
        }
    }
    
    /**
     * Método para listar. 
     */
    public List<Venda_Produto> listar(){
        try{
            em = JPAUtil.getEntityManager();
            
            Query consulta = em.createQuery("SELECT vp FROM Venda_Produto vp");
            List<Venda_Produto> lista = consulta.getResultList();
            return lista;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não encontrado no sistema.");
        }finally{
            JPAUtil.closeEntity();
        }
        return null;
    }
}
