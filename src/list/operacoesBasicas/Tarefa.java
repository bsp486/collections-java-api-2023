package list.operacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descrica) {
        this.descricao = descrica;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
