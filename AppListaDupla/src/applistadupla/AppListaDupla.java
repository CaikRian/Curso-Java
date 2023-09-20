package applistadupla;

public class AppListaDupla {

    public static void main(String[] args) {
        // Testar os métodos DENTRO deste espaço
        ListaDupla l = new ListaDupla();
        l.adicionaNoFim(10);
        l.adicionaNoFim(20);
        l.adicionaNoFim(30);
        l.adicionaNoFim(40);        
        l.adicionaNaPosicao(2, 50);
        l.adiciona(1);
        l.adiciona(2);
        l.adiciona(3);
        l.imprime();
    }
}
