package aula3.exemplos;

public class OrientacaoObjetos {

    // Orientação a objetos
    // analise -> projeto -> implementacao -> testes -> implantacao

    // Classe
    // Estrutura que abstrai um conceito que precisa ser representado

    // Objeto
    // Instância de uma classe
    // A partir de uma classe posso criar n objetos 

    // Classe = Atributos e Métodos
    // Atributos definem estado de um objeto
    // Métodos definem comportamento de um objeto

    // Crie um programa que calcula a area e perimetro de dois
    // quadrados

    public static void main(String[] args) {
        
        double lado1 = 10;
        double lado2 = 5;

        double area1 = calcularArea(lado1);
        double area2 = calcularArea(lado2);;

        double perimetro1 = calcularPerimetro(lado1);
        double perimetro2 = calcularPerimetro(lado2);;

        System.out.println(area1);
        System.out.println(perimetro1);
        System.out.println(area2);
        System.out.println(perimetro2);

        Quadrado q1 = new Quadrado(3.0);
        //q1.lado = 0.0;
        q1.setLado(10);

        Quadrado q2 = new Quadrado(5.0);
        // q2.lado = 5;

        System.out.println(q1.getLado());

        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro());


        Retangulo r1 = new Retangulo(10.0, 5.0);
        // r1.base = 10.0;
        // r1.altura = 5.0;

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());



        // Relacionamento entre classes
        // dependência, associacao (agregação e composição)
        
        // Dependência - classe recebe no parâmetro de um método outra classe
        // ou quando acessa um objeto estático de outra classe

        // Associação (Agregação)
        // Todo-Parte - Diario - Professor - Parte existe sem o todo

        // Associação (Composição)
        // Todo-Parte - Diario - Aulas - Parte não existe sem o todo - ciclo de vida
        // está atrelado


        // Endereco e1 = new Endereco("0220222", 16, "casa 2");
        // Cliente c1 = new Cliente(1, "Maria", "maria@email.com", e1);
        Cliente c1 = new Cliente(1, "Maria", "maria@email.com", "0220222", 16, "casa 2");
        
        
    }

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetro(double lado) {
        return 4 * lado;
    }
}
