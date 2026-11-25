import java.util.Scanner;
public class Main {

    static double calcularDesconto(double valor) {
        double desconto = valor * 0.10;
        return desconto;
    }

    static double calcularParcelas(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        return valorParcela;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Nome do fornecedor: ");
        String nome = ler.nextLine();

        System.out.print("Qual valor total? ");
        double valor  = ler.nextDouble();

        System.out.print("Quantas parcelas? ");
        int parcelas = ler.nextInt();

        double valorParcela = calcularParcelas(valor, parcelas);

        for (int i = 1; i <= parcelas; i++) {
            System.out.println("Parcela " + i + ": " + valorParcela);
        }

    }
}