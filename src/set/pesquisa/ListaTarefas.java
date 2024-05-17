package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefaSet;

    public ListaTarefas() {
        this.listaTarefaSet = new HashSet<>();
    }

    //: Adiciona uma nova tarefa ao Set.
    private void adicionarTarefa(String descricao) {
        listaTarefaSet.add(new Tarefa(descricao));
    }

    //: Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    private void removerTarefa(String descricao) {
        if (listaTarefaSet.contains(descricao)) {
            listaTarefaSet.remove(descricao);
        }
    }

    //: Exibe todas as tarefas da lista de tarefas.
    private void exibirTarefas() {
        System.out.println(listaTarefaSet);
    }

    //: Conta o número total de tarefas na lista de tarefas.
    private void contarTarefas() {
        System.out.println("total de tarefas: " + listaTarefaSet.size());
    }

    //: Retorna um Set com as tarefas concluídas.
    private Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();
        for(Tarefa t: listaTarefaSet){
            if(t.isConcluido()){
                tarefasConcluidasSet.add(t);
            }
        }
        return tarefasConcluidasSet;
    }

    //: Retorna um Set com as tarefas pendentes.
    private Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();
        for(Tarefa t: listaTarefaSet){
            if(!t.isConcluido()){
                tarefasPendentesSet.add(t);
            }
        }
        return tarefasPendentesSet;
    }

    //: Marca uma tarefa como concluída de acordo com a descrição.
    private void marcarTarefaConcluida(String descricao) {
        for(Tarefa t: listaTarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
                break;
            }
        }
    }

    //: Marca uma tarefa como pendente de acordo com a descrição.
    private void marcarTarefaPendente(String descricao) {
        for(Tarefa t: listaTarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(false);
                break;
            }
        }
    }

    //: Remove todas as tarefas da lista de tarefas.
    private void limparListaTarefas() {
        listaTarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        listaTarefas.contarTarefas();

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
