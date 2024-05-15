package list.pesquisa;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;


    public SomaNumeros(){
        this.listaInteiros = new ArrayList<>();
    }

    // Adiciona um número à lista de números.
    public void adicionarNumero(int numero) {
        listaInteiros.add(numero);
    }

    // Retorna uma lista contendo todos os números presentes na lista.
    public void exibirNumeros(){
        System.out.println(this.listaInteiros.toString());
    }

    // Calcula a soma de todos os números na lista e retorna o resultado.
    public void calcularSoma(){
        int soma = 0;
        for(Integer i : listaInteiros){
            soma += i;
        }
        System.out.println("Soma dos números = " + soma);
    }
    // Encontra o maior número na lista e retorna o valor.
    public void encontrarMaiorNumero(){
        int maiorNumero = 0;
        for(Integer i : listaInteiros){
            if(i > maiorNumero){
                maiorNumero = i;
            }
        }
        System.out.println("Maior número = " + maiorNumero);
    }
    //: Encontra o menor número na lista e retorna o valor.
    public void encontrarMenorNumero(){
        int menorNumero = 0;
        for(Integer i : listaInteiros) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        System.out.println("Menor número = " + menorNumero);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        System.out.println("Números adicionados:");

        if(somaNumeros.listaInteiros.isEmpty()){
            throw new RuntimeException("A lista esta vazia!");
        }

        // Exibindo a lista de números adicionados
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        somaNumeros.calcularSoma();

        // Encontrando e exibindo o maior número na lista
        somaNumeros.encontrarMaiorNumero();

        // Encontrando e exibindo o menor número na lista
        somaNumeros.encontrarMenorNumero();
    }
}
