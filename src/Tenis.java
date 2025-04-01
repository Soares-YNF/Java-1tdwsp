public class Tenis {
    String cor;
    String Modelo;
    int tamanho;
    double preco;
    boolean disponivel;
    Fornecedor fornecedor;
    Marca marca;

    // Metodo para aumentar o preço do tenis em porcentagem (10,20)

    void aumentarPreco(float porcentagem){
        preco += preco * porcentagem/100;
    }}

