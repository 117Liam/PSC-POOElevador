//Crie uma classe Elevador para armazenar as informações de um elevador de prédio. 
//A classe deve armazenar o andar atual (terreo = 0), total de andares no predio (desconsiderando o terreo), capacidade do elevador e quantas pessoas estao presentes nele.
//A classe deve tambe´m disponibilizar os seguintes metodos:
//Inicializar: que deve receber como parametros a capacidade do elevador e o total de andares no predio (os elevadores sempre comecam no terreo e vazio);
//Entrar: para acrescentar uma pessoa no elevador (so´ deve acrescentar se ainda houver espaco);
//Sair: para remover uma pessoa do elevador (so deve remover se houver alguem dentro dele);
//Subir: para subir um andar (nao deve subir se ja estiver no ultimo andar);
//Descer: para descer um andar (nao deve descer se ja estiver no te´rreo)
//Crie uma classe Elevador para armazenar as informacoes de um elevador de predio.
//A classe deve armazenar o andar atual (terreo = 0), total de andares no predio (desconsiderando o terreo), capacidade do elevador e quantas pessoas esta~o presentes nele. A classe deve tambe´m disponibilizar os seguintes metodos:
//Inicializar: que deve receber como para^metros a capacidade do elevador e o total de andares no predio (os elevadores sempre comecam no terreo e vazio);
//Entrar: para acrescentar uma pessoa no elevador (so deve acrescentar se ainda houver espaco);
//Sair: para remover uma pessoa do elevador (so deve remover se houver alguem dentro dele);
//Subir: para subir um andar (nao deve subir se ja estiver no último andar);
//Descer: para descer um andar (nao deve descer se ja´ estiver no te´rreo);

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador elevador = new Elevador();

        System.out.print("Informe o andar atual do elevador: ");
        int andarAtual = scanner.nextInt();
        System.out.print("Informe o total de andares no prédio: ");
        int totalAndares = scanner.nextInt();
        System.out.print("Informe a capacidade do elevador: ");
        int capacidade = scanner.nextInt();

        elevador.Inicializar(capacidade, totalAndares, andarAtual);

        System.out.println("Andar Atual: " + elevador.andarAtual);
        System.out.println("Pessoas Presentes: " + elevador.pessoasPresentes);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Entrar no elevador");
            System.out.println("2 - Sair do elevador");
            System.out.println("3 - Subir um andar");
            System.out.println("4 - Descer um andar");
            System.out.println("5 - Sair do programa");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                elevador.Entrar();
            } else if (escolha == 2) {
                elevador.Sair();
            } else if (escolha == 3) {
                elevador.Subir();
            } else if (escolha == 4) {
                elevador.Descer();
            } else if (escolha == 5) {
                continuar = false;
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }

            System.out.println("Andar Atual: " + elevador.andarAtual);
            System.out.println("Pessoas Presentes: " + elevador.pessoasPresentes);
        }

        System.out.println("Encerrando o programa.");
        scanner.close();
    }
}
