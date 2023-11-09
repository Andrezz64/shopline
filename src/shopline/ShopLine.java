/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopline;
import Controllers.ProdutoController;
import Controllers.VendasController;
import Models.Produtos;
import Models.Vendas;
import Modules.Time;
import java.util.List;

public class ShopLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProdutoController db = new ProdutoController();
        
       
      //db.createProduto(25, "Calcinha Usada", 1, 25.00, 10, "25/10/2023");
      //db.createOne(25, "Michael", 1, 300.00, 1, "25/10/2023");
      //Time teste = new Time();
      //teste.GetData();
     
      VendasController vendas = new VendasController();
      Vendas venda = new Vendas();
      venda.setValorTotal(16.3);
      vendas.changeOne(1, venda);
     
     
    }
    
}
