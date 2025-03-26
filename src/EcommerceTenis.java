//Colocando o java Scanner
import java.util.Scanner;

public class EcommerceTenis {
    public static void main(String[] args) {

        //Inicializando o objeto Tenis

        Tenis tenis = new Tenis();

        //inicializando o input
        //fazendo o Scanner Para leitura de dados

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o Tamanho do Tenis desejado");
        tenis.tamanho = leitura.nextInt();

        System.out.println("Agora digite a cor");
        tenis.cor = leitura.next();

        System.out.println("Disponabilidade");
        tenis.disponivel = leitura.nextBoolean();

        System.out.println("Modelo");
        tenis.Modelo = leitura.next();

        System.out.println("Preço");
        tenis.preco = leitura.nextFloat();

        System.out.println("tenis cor: " + tenis.cor);
        System.out.println("Modelo: " + tenis.Modelo);
        System.out.println("preço: " + tenis.preco);
        System.out.println("Tamanho: "+ tenis.tamanho);
        System.out.println("Disponabilidade: " +tenis.disponivel);









    }}
