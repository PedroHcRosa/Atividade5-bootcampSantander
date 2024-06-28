import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursosOferecidos;
    private List<Mentoria> mentoriasOferecidas;
    private List<Dev> devsMatriculados;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursosOferecidos = new ArrayList<>();
        this.mentoriasOferecidas = new ArrayList<>();
        this.devsMatriculados = new ArrayList<>();
    }

    // Métodos para adicionar cursos, mentorias e devs
    public void adicionarCurso(Curso curso) {
        cursosOferecidos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentoriasOferecidas.add(mentoria);
    }

    public void matricularDev(Dev dev) {
        devsMatriculados.add(dev);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public List<Curso> getCursosOferecidos() {
        return cursosOferecidos;
    }

    public List<Mentoria> getMentoriasOferecidas() {
        return mentoriasOferecidas;
    }

    public List<Dev> getDevsMatriculados() {
        return devsMatriculados;
    }
}