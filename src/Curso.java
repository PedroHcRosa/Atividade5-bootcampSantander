public class Curso {
    private String nome;
    private String nivel;
    private int duracao; // em horas
    private String conteudo;

    public Curso(String nome, String nivel, int duracao, String conteudo) {
        this.nome = nome;
        this.nivel = nivel;
        this.duracao = duracao;
        this.conteudo = conteudo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", Nível: " + nivel + ", Duração: " + duracao + " horas, Conteúdo: " + conteudo;
    }
}
