public class Main {
    public static void main(String[] args) {
        // Criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp("Java Masterclass");

        // Criando cursos
        Curso cursoJava = new Curso("Java Fundamentals", "Iniciante", 40, "Introdução ao Java");
        Curso cursoAdvanced = new Curso("Advanced Java Programming", "Avançado", 60, "Programação avançada em Java");

        // Adicionando cursos ao Bootcamp
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoAdvanced);

        // Criando mentorias
        Mentoria mentorJava = new Mentoria("Mentoria Java", "Mentoria sobre tópicos avançados de Java", "Segunda-feira às 14h");

        // Adicionando mentoria ao Bootcamp
        bootcamp.adicionarMentoria(mentorJava);

        // Criando devs
        Dev dev1 = new Dev("Alice", 25, "Java");
        Dev dev2 = new Dev("Bob", 30, "Python");

        // Matriculando devs no Bootcamp
        bootcamp.matricularDev(dev1);
        bootcamp.matricularDev(dev2);

        // Imprimindo informações do Bootcamp
        System.out.println("Nome do Bootcamp: " + bootcamp.getNome());
        System.out.println("Cursos Oferecidos:");
        for (Curso curso : bootcamp.getCursosOferecidos()) {
            System.out.println(curso);
        }
        System.out.println("\nMentorias Oferecidas:");
        for (Mentoria mentoria : bootcamp.getMentoriasOferecidas()) {
            System.out.println(mentoria);
        }
        System.out.println("\nDevs Matriculados:");
        for (Dev dev : bootcamp.getDevsMatriculados()) {
            System.out.println(dev);
        }
    }
}
