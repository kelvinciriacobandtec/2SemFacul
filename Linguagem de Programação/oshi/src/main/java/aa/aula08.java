/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kelvi_000
 */
public class aula08 {
    public static void main(String[] args) {
        List listaloka = new ArrayList<>();
        
        listaloka.add(50000);
        listaloka.add("Eita Gota Serena");
        listaloka.add(79.99);
        listaloka.add(false);
        
        System.out.println("Lista loukinha: " + listaloka);
        
        System.out.println("Tamanho lista: " + listaloka.size());
        System.out.println("Lista loukinha está vazia?" + listaloka.isEmpty());
        if (listaloka.isEmpty()) {
            System.out.println("Ta vazia.");
        }else{
            System.out.println("Não está vazia.");
        }
        
        System.out.println("79.99 está na lista? " + listaloka.contains(79.99));
        
        System.out.println("Removendo o elemento Eita gota serena : " + listaloka.remove("Eita Gota Serena"));
        System.out.println("tamanho da lista" + listaloka.size());

    }
}
