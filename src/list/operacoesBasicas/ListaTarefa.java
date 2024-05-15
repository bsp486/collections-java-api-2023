package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicinarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int numeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescrioesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("numero total de tarefas: "+listaTarefa.numeroTotalTarefas());

        listaTarefa.adicinarTarefa("tarefa 1");
        listaTarefa.adicinarTarefa("tarefa 1");
        listaTarefa.adicinarTarefa("tarefa 2");
        System.out.println("numero total de tarefas: "+listaTarefa.numeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("numero total de tarefas: "+listaTarefa.numeroTotalTarefas());

        listaTarefa.adicinarTarefa("tarefa 1");
        listaTarefa.adicinarTarefa("tarefa 3");
        System.out.println("numero total de tarefas: "+listaTarefa.numeroTotalTarefas());

        listaTarefa.obterDescrioesTarefas();
    }


}
