import java.util.Scanner;

/* Nome: Fabrício Valladares Bertolini | Matric: 0050016768 */
import java.util.Scanner;

public class FabricioBertoliniTabuada {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Entre com seu nome: ");
        String nome = input.next();

        System.out.printf("\nOlá %s,entre com um número: ",nome);
        int num = input.nextInt();

        System.out.printf("\nTabuada de adição de %d",num);
        for(int i = 1; i <= 10; ++i)
        {
          System.out.printf("\n%d + %d = %d ", num, i, num + i);
        }

        input.close();
    }
}
