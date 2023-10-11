import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Contagem de dois números]");

        System.out.println("Digite um número: ");
        int numeroUm = scan.nextInt();
        System.out.println("Digite um número maior que o anterior: ");
        int numeroDois = scan.nextInt();
        System.out.println("================");

        scan.close(); // Fecha-se o scanner, pois não será mais necessário
        
        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número inserido deve ser MAIOR que o primeiro");
        }
    }
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        // Em caso do segundo número inserido ser menor que o primeiro, não poderemos contar do menor ao maior
		if (numeroDois < numeroUm) {
            throw new ParametrosInvalidosException();
        }
		
        System.out.println("Quantos números há de " + numeroUm + " até chegarmos em " + numeroDois + "?");
        System.out.println("VVVVVVVVVV");

        // Define a quantidade de ocorrências "for"
		int contagem = numeroDois - numeroUm;

        // Loop de 1 até o máximo de ocorrências da contagem, assim contando do primeiro até o segundo número
		for (int i = 1; i <= contagem; i++) {
            int numeroImpresso = numeroUm + i;
            System.out.println(numeroImpresso);
        }

        System.out.println("^^^^^^^^^^");
        System.out.println("Para " + numeroUm + ", há " + contagem + " até chegarmos em " + numeroDois);
	}
}
