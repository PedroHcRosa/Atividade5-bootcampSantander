public class Mentoria {
    private String tema;
    private String descricao;
    private String horario;

    public Mentoria(String tema, String descricao, String horario) {
        this.tema = tema;
        this.descricao = descricao;
        this.horario = horario;
    }

    // Getters
    public String getTema() {
        return tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Mentoria: " + tema + ", Horário: " + horario + ", Descrição: " + descricao;
    }
}
