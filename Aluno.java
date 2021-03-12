public class Aluno {
    private String matricula;
    private String nome;
    private String curso;

    public void listar()
    {
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Nome: "+this.nome);
        System.out.println("Curso: "+this.curso);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso.equalsIgnoreCase("si")) this.curso = "Sistema de Informação";
        else this.curso = curso;
    }
}
