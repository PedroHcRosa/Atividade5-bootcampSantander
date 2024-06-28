public class Dev {
    private String nome;
    private int idade;
    private String linguagemPrincipal;

    public Dev(String nome, int idade, String linguagemPrincipal) {
        this.nome = nome;
        this.idade = idade;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    @Override
    public String toString() {
        return "Dev: " + nome + ", Idade: " + idade + ", Linguagem Principal: " + linguagemPrincipal;
    }
}

