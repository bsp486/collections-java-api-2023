package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        listaItem.add(item);
    }

    public void exibirItens(){
        System.out.println(listaItem);
    }

    private void removerItem(String nome){
        List<Item> listaItemRemover = new ArrayList<>();
        for(Item t : listaItem){
            if(t.getNome().equalsIgnoreCase(nome)) {
                listaItemRemover.add(t);
            }
        }
        listaItem.removeAll(listaItemRemover);
    }

    private double calcularValorTotal(){
        double somatorio = 0;
        for(Item t : listaItem){
            somatorio += t.valorTotalItem();
        }
        return somatorio;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("pedra", 30.55, 3);
        carrinhoDeCompras.adicionarItem("areia", 50, 1);
        carrinhoDeCompras.adicionarItem("areia", 50, 2);
        carrinhoDeCompras.adicionarItem("cimento", 44.46, 4);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("areia");
        carrinhoDeCompras.exibirItens();
        System.out.println("O total do carrinho é R$ "+carrinhoDeCompras.calcularValorTotal());
    }
}
