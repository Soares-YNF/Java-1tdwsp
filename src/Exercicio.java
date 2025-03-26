import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        // Criando entrada para o nome do aluno

        Scanner sc = new Scanner(System.in);

        //solicitar o nome do aluno

        System.out.println("Digite seu nome:  ");
        String nome = sc.nextLine(); // capturar o texto

        //exibir o nome do usuario

        System.out.println("O nome digitado foi: " + nome);

        //Declarar 3 variaveis(cp1, cp2,cp3)

        Float cp1, cp2, cp3;
        double media;

        // Ver as notas cp

        System.out.println("Coloque sua nota do cp1");
        cp1 = Float.parseFloat(new Scanner(System.in).nextLine());

        System.out.println("Coloque sua nota do cp2");
        cp2 = Float.parseFloat(new Scanner (System.in).nextLine());

        System.out.println("Coloque sua nota do cp3");
        cp3 = Float.parseFloat(new Scanner (System.in).nextLine());


        media = (cp1 + cp2 +cp3) / 3;

        //Exibir a media do Semestre

        System.out.println("A media dos Cps " + media);

        //Fechando o Scanner

        sc.close();
    }}




