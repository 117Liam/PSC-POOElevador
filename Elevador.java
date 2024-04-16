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

public class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidade;
    int pessoasPresentes;

    public void Inicializar(int capacidade, int totalAndares, int andarAtual) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = andarAtual;
        this.pessoasPresentes = 0; // Inicializa sem pessoas
    }

    public void Entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Elevador cheio. Não é possível entrar mais pessoas.");
        }
    }

    public void Sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Elevador vazio. Não há ninguém para sair.");
        }
    }

    public void Subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Elevador subiu para o andar: " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }

    public void Descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Elevador desceu para o andar: " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }
}