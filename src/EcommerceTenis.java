//Colocando o java Scanner
import java.util.Scanner;

public class EcommerceTenis {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Inicializando o objeto Tenis

        Tenis tenis = new Tenis();
       tenis.marca = new Marca();
       tenis.fornecedor = new Fornecedor();

        //inicializando o input
        //fazendo o Scanner Para leitura de dados

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

        //Adicionando o Fornecedor No Ecommerce Tenis


        System.out.println("Nome do Fornecedor:Nike");
        tenis.fornecedor.Nome=leitura.nextLine();

        System.out.println("Cnpj Do Fornecedor:00000 ");
        tenis.fornecedor.Cnpj = leitura.nextLine();

        System.out.println("Contato do fornecedor:11957730242 ");
        tenis.fornecedor.Contato = leitura.nextLine();

        //adicionando a Marca no Ecommerce Tenis

     System.out.println("Nome do Marca: " + tenis.marca.Nome);
     tenis.marca.Nome = leitura.nextLine();

     System.out.println("Logo da marca: " + tenis.marca.Logo);
     tenis.marca.Logo = leitura.nextLine();

       //adicionando metodo para aumentar o preço

      tenis.aumentarPreco(10);

     System.out.println("Valor atualizado: " + tenis.preco);
    }}
