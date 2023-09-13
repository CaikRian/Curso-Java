/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmercado;

/**
 *
 * @author 2110810
 */
public class ListaEncadeada {
    
    private int quantidade;
    private Sacola produtos;
    
    public ListaEncadeada(){
        quantidade = 0;
        produtos = null;
    }
    
    public void adiciona(Produto p){
        if(produtos == null){  
            produtos = new Sacola(p);   
        } else { 
            Sacola temp = produtos;
            while(temp.getProximo() != null){  
                temp = temp.getProximo();        
            }
            temp.setProximo(new Sacola(p));
        }
    }
    
    public void mostra(){
        for(Sacola temp =  produtos; temp != null; temp = temp.getProximo()){
            System.out.println(temp.getProduto());
        }
    }
}
