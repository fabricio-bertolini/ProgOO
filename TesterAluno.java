import java.util.Scanner;

public class TesterAluno
{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno1.setNome(scan.next());
        System.out.println("Digite a matrícula do aluno: ");
        aluno1.setMatricula(scan.next());
        System.out.println("Digite o curso do aluno: ");
        aluno1.setCurso(scan.next());
        
        aluno1.listar();
    }
}

