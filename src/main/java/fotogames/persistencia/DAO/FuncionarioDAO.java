/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fotogames.persistencia.DAO;

import fotogames.persistencia.entidades.Funcionario;
import fotogames.persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */

/**
 * Classe resposável para validar os acessos dos funcionarios
 */
public class FuncionarioDAO {

    private EntityManager em; // Instância do EntityManager

    /**
     * Método do tipo Funcionario para efetuar o acesso
     */
    public Funcionario validarAcesso(String login, String passworld) {
        Funcionario fun = new Funcionario();
        try {
            em = JPAUtil.getEntityManager();
            Query consulta = em.createQuery("SELECT f FROM Funcionario f WHERE f.email = :email AND f.senha = :passworld");
            consulta.setParameter("email", login);
            consulta.setParameter("passworld", passworld);

            fun = (Funcionario) consulta.getSingleResult();
            return fun;
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(null, "Email/Senha inválido");
        } finally {
            JPAUtil.closeEntity();
       }
        return fun;
    }

    /**
     * Método pra definir a senha MD5.
     */
    public String getMD5(String passworld) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] by = md.digest(passworld.getBytes());
            BigInteger bi = new BigInteger(1, by);
            String hashText = bi.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

}
