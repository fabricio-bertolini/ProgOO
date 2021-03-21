import java.util.Scanner;

public class TesterCarro
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BMW bmw = new BMW();

        System.out.println("Defina a velocidade da BMW:");
        bmw.setVelocidade(input.nextInt());
        
        System.out.println("Defina a cor da BMW:");
        bmw.setCor(input.next());

        System.out.println("Defina qual o número de acentos da BMW:");
        bmw.setNum_acentos(input.nextInt());

        bmw.imprimir();

        input.close();
    }
}

