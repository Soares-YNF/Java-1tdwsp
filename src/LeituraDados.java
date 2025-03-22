import java.util.Scanner;

public class LeituraDados {

    public static void main(String[] args) {

        //Criar o obejeto responsavel por ler as informações

        Scanner leitor = new Scanner(System.in);

        //Criar uma Variavel e lê um valor do tipo float

        float valor=leitor.nextFloat();
        System.out.println("Digite o Valor do produto: ");

        //le a quantidade do produto

        System.out.println("Digite a quantidade: ");
        int qtd = leitor.nextInt();

        //Exibir o valor total

        float valorTotal = valor + qtd;
        System.out.println();






    }
}
