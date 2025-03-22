import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Declarar 3 variaveis(cp, challange,cp)

        double cp;
        double challange;
        double gs;
        double media;

        //Criando um Scanner para receber as medias

        Scanner scanner = new Scanner(System.in);

        // Ver as notas.

        System.out.println("Coloque sua nota do cp");
        cp = Double.parseDouble(scanner.nextLine());

        System.out.println("Coloque sua nota do Challange 0");
        challange = Double.parseDouble(scanner.nextLine());

        System.out.println("Coloque sua nota do Gs 0");
        gs = Double.parseDouble(scanner.nextLine());


        media = (cp + challange + gs) / 3;

        //Exibir a media do Semestre

        System.out.println("A media do semestre é " + media);

        //Fechando o Scanner

    }}