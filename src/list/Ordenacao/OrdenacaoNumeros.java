package list.Ordenacao;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaInteiros;

    public OrdenacaoNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    //Adiciona um número à lista.
    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }
    //Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosCrescentes = new ArrayList<>(listaInteiros);
        Collections.sort(numerosCrescentes);
        return numerosCrescentes;
    }

    //Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDecrescentes = new ArrayList<>(listaInteiros);
        numerosDecrescentes.sort(Collections.reverseOrder());
        return numerosDecrescentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(200);

        System.out.println(ordenacaoNumeros.listaInteiros);
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
