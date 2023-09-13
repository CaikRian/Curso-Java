/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmercado;

/**
 *
 * @author 2110810
 */
public class ListaLinear {
    
    private int quantidadeMaxima;
    private int quantidade;
    private Produto[] lista;
    
    public ListaLinear(){
    quantidadeMaxima = 5;
    quantidade = 0;
    lista = new Produto[quantidadeMaxima];
    }
    
    public void adicionarProduto(Produto p){
        
        //SE a quantidade for menor que a quantidade máxima, armazena o valor na variável
        if(quantidade < quantidadeMaxima){
            lista[quantidade] = p;
            quantidade++;
                    }
    }
    
    public void mostra(){
        //Enquanto o 'i' for menor que a quantidade, irá continuar imprimindo os valores contidos na variável 
        for(int i = 0; i < quantidade;  i++){
            System.out.println(lista[i]);
        }
    }
    
    
    
    
}
