//1 - Pacote
package fundamentos;

// 2 - Bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 Atributos
    static Scanner entrada = new Scanner(System.in);// instanciar o objeto de entrada do console

    //3.2 Metodos e Funções
    public static void main(String[] args){
        String opcao;
        int area = 0; // receber o resultado dos calculos de areas
        
        System.out.println("Escolha o Caluculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Regangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); // leitura da opção
        switch(opcao){
            case "1":
                calcularAreaDoQuadrado();
                break;
            case "2":
                // ToDo: calcular area do retangulo
                break;
            default:
                System.out.println("Opcao Invalido: " + opcao);
        }
        if (area > 0){
            System.out.println("A area e de " + area + "m²" );
        }


    }

    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado
        return lado * lado ^ 2; // retorna a area do quadrado
        }

    public static int calcularAreaDoRetangulo(){
        int lado; // tamanho do lado do retangulo

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado
        return lado ^ 2; // retorna a area do retangulo


    }


}
