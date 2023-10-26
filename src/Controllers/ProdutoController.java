// Classe de controller para gerencia o banco de dados apartir das entitys
package Controllers;

import Models.Produtos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Andre.infra
 */
public class ProdutoController {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("shopLinePU");
    private final EntityManager em = emf.createEntityManager();

    // Procura por um produto com um ID especifico
  
    public Produtos findOne(int id) {
        em.getTransaction().begin();
        Produtos entity = em.find(Produtos.class, 1);
        em.getTransaction().commit();

        Integer codigo = entity.getCodigo();
        String nome = entity.getNome();
        Integer unidade = entity.getUnidade();
        Double preco = entity.getPreco();
        Integer quantidadeDisponivel = entity.getQuantidadeDisponivel();
        String dataUltimaVenda = entity.getDataUltimaVenda();

        if (entity != null) {

            Produtos produto = new Produtos();
            produto.setCodigo(codigo);
            produto.setNome(nome);
            produto.setUnidade(unidade);
            produto.setPreco(preco);
            produto.setQuantidadeDisponivel(quantidadeDisponivel);
            produto.setDataUltimaVenda(dataUltimaVenda);

            em.close();
            return produto;

        } else {
            System.out.println("Produto não encontrado.");
        }
        em.close();
        return null;

    }

    // Lista todos os produtos da base
  
    public List<Produtos> findMany() {

        em.getTransaction().begin();

        String jpql = "SELECT p FROM Produtos p"; // Consulta JPQL para selecionar todos os registros
        TypedQuery<Produtos> query = em.createQuery(jpql, Produtos.class);

        List<Produtos> produtos = query.getResultList(); // Obtém todos os registros da tabela

        em.getTransaction().commit();
        em.close();
        emf.close();
        return produtos;
    }

    // Cria uma nova entry de produto.

    public void createOne(int codigo, String nome, int unidade, double preco, int quantidadeDisponivel, String dataUltimaVenda) {

        Produtos novoProduto = new Produtos();
        novoProduto.setCodigo(codigo);
        novoProduto.setNome(nome);
        novoProduto.setUnidade(unidade);
        novoProduto.setPreco(preco);
        novoProduto.setQuantidadeDisponivel(quantidadeDisponivel);
        novoProduto.setDataUltimaVenda(dataUltimaVenda);
        em.getTransaction().begin();
        em.persist(novoProduto);
        em.getTransaction().commit();
        em.close();
    }
    // exclui um produto pelo ID.

    public void deleteOne(int id) {
        em.getTransaction().begin();

        Produtos produtoDeleted = em.find(Produtos.class, id);
       if(produtoDeleted != null){
        em.remove(produtoDeleted);
        em.getTransaction().commit();
        em.close();
       }

    }
    
    public void changeOne(int id){
    
    }
}
