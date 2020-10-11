import java.util.Scanner;

public class Numeros {
    private int numero;
    private int maior;

    public Numeros(int maior) {
        this.maior = 0;
    }

    public void obterMaior(int maior) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.printf("%nO número maior é: %d", maior);
    }
}