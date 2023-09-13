/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmercado;

/**
 *
 * @author 2110810
 */
public class Sacola {
    
    private Produto produto;
    private Sacola proximo; // --> isso é uma estrutura autorreferenciada(ela se auto utiliza)
    
    
    public Sacola(){}

    public Sacola(Produto p){
        this.produto = p;
        this.proximo = null;
    
    }
    public Produto getProduto() {
        return produto;
    }
    

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the proximo
     */
    public Sacola getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Sacola proximo) {
        this.proximo = proximo;
    }
    
    
    
    
    
}
