package aula6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Exceções são utilizadas para lidar com erros
// condições imprevistas na execução do programa

// Quando uma exceção é lançada ela interrompe o fluxo normal
// de execução do programa

// Podemos tratar a exceção usando um bloco try-catch

// Exceções verificadas (checked exceptions)
// Declarar explicitamente na assinatura do método ou tratar
// a exception com try-catch.

// Exceções não verificadas (unchecked exceptions)
// Não precisa declarar na assinatura do método, nem tratar com
// try-catch, não serão verificadas em tempo de compilação
// RuntimeException e subclasses

public class Excecoes {

    public static void main(String[] args) {
        // File arquivo = new File("READMEE.md");
        
        // try {
        //     Scanner sc = new Scanner(arquivo);

        //     while (sc.hasNextLine()) {
        //         System.out.println(sc.nextLine());
        //     }

        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     System.out.println("O arquivo não existe");
        // }

        try {
            imprimirArquivo("READMEE.md");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
        
    }

    public static void imprimirArquivo(String path) throws FileNotFoundException {
        File arquivo = new File(path);
        
        Scanner sc = new Scanner(arquivo);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
    
}
