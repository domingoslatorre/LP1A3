package aula1.exemplos;

import java.util.Scanner;

public class Introducao {

    public static void main(String[] args) {
        // comentário de uma linha

        /*
         * comentário de várias linhas
         */


        // Tipos primitivos

        // Inteiros
        // byte, short, int, long

        int n1 = 10;
        byte n2 = 100; // -128 a 12

        // ponto flutuante
        // float, double

        float nota1 = 9.5f;
        double nota2 = 9.5;

        // char
        char letra = 'a';

        // bool
        boolean ligado = true;

        // String
        String frase = "Olá mundo";
        System.out.println(frase);
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

        // Arrays
        // double[] numeros = new double[3];
        double[] numeros = { 2.3, 5.3, 8.3 };
        numeros[0] = 2.3;
        numeros[1] = 5.3;
        numeros[2] = 8.3;
        // numeros[8] = 7.5;

        char[] caracteres = "Olá mundo".toCharArray();
        System.out.println(caracteres[0]);
        

        // variáveis e constantes
        
        int idade = 20;

        int idade2;
        idade2 = 22;

        // Java 10 - inferência de tipo
        var idade3 = 10;
        var nome = "João";
        var letras = "João".toCharArray();

        // constante
        final double TESTE = 10.2;
        final var SOBRENOME = "Santos";

        // Entrada e saída de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu nome");
        String nomeDigitado = sc.nextLine();

        System.out.println("Entre com a sua idade");
        int idadeDigitada = sc.nextInt();

        System.out.println(nomeDigitado + " " + idadeDigitada);

        sc.close();


    }
    
}
