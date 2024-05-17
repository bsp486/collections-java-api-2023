package set.ordenacao;

import java.util.*;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    //: Adiciona um aluno ao conjunto.
    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    //: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    public void removerAlunoPorMatricula(long matricula) {
        for(Aluno a : alunosSet){
            if(a.getMatrícula() == matricula){
                alunosSet.remove(a);
                break;
            }
        }
    }

    //: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    public void exibirAlunosPorNome() {
        Set<Aluno> ordenadoPorNome = new TreeSet<>(alunosSet);
        System.out.println(ordenadoPorNome);
    }

    //: Exibe todos os alunos do conjunto em ordem crescente de nota.
    public void exibirAlunosPorNota() {
        Set<Aluno> ordenadoPorNota = new TreeSet<>(new ComparetorNota());
        ordenadoPorNota.addAll(alunosSet);
        System.out.println(ordenadoPorNota);
    }

    //: Exibe todos os alunos do conjunto.
    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(123456L);

        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
       gerenciadorAlunos.exibirAlunosPorNota();
    }

}

class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matrícula;
    private double nota;

    public Aluno(String nome, long matrícula, double nota) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public long getMatrícula() {
        return matrícula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matrícula == aluno.matrícula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matrícula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matrícula=" + matrícula +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }
}

class ComparetorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
