package applistacircular;

public class ListaCircular {

    private Celula cabeca;
    private Celula cauda;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
    }

    // Não modificar a assinatura
    public void adiciona(int valor) {
        // Implementar aqui:
        // Adicionar um elemento no fim da lista.
    }

    // Não modificar a assinatura
    public void adicionaNoComeco(int valor) {
        // Implementar aqui:
        // Adicionar um elemento no começo da lista.
    }
    
    // Não modificar a assinatura
    public void remove(int valor) {
        // Implementar aqui:
        // Remover um elemento presente na lista.
    }

    public void imprime() {
        if (this.cabeca != null) {
            Celula c = this.cabeca;
            do {
                System.out.println(c.getValor());
                c = c.getProximo();
            } while (c != this.cabeca);
        }
    }
}
