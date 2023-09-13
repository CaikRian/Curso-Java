/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmercado;

/**
 *
 * @author 2110810
 */
public class AppMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarando os valores
        Produto p1 = new Produto("Arroz", 1.99);
        Produto p2 = new Produto("Feijão", 12.00);
        Produto p3 = new Produto("Carne", 6);
        
        //----> chama a função e envia os parâmetros
        
        
        //--> Imprime na tela o resultado da variavel
        //System.out.println(p3);
        
        //ListaLinear lista1 = new ListaLinear();
       // lista1.adicionarProduto(p1);
        //lista1.adicionarProduto(p2);
       // lista1.adicionarProduto(p3);
        
        //exibe todo valor armazenado no vetor
        //lista1.mostra();
        
        ListaEncadeada lista2 = new ListaEncadeada();
        lista2.adiciona(p1);
        lista2.adiciona(p2);
        lista2.adiciona(p3);
        lista2.mostra();
        
    }
    
}
