/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmercado;

/**
 *
 * @author 2110810
 */
public class Produto {
    private String nome;
    private double preco;
    
    public Produto(){}
    
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //---> sobrepor a String
    @Override
    public String toString(){
        return this.nome + "\tR$" + this.preco;
    }
    
    
    
}
