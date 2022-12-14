//ORIENTAÇÃO A OBJETOS
//Surgiu da necessidade de se construir programas mais complexos
//com menos linhas de código, utilizando conceitos do mundo real

//PESSOA: nome, endereço, telefone, bairro, cidade, cpf
//ALUNO: turma, serie, turno, matricula
//FUNCIONARIOS: matricula, dataEntrada, horario

//CLASSE: é o modelo base onde são definidas as características e
//propriedades da mesma. CARACTERÍSTICAS = FUNÇÕES e PROPRIEDADES = VARIÁVEIS

//VARIÁVEIS = ATRIBUTOS ; FUNÇÕES = MÉTODOS

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Criação do objeto tab, da classe Tabuada
        //Toda vez que você quiser "usar" uma classe, você é obrigado a criar
        //um OBJETO
        Tabuada tab = new Tabuada();
        //Chamadas dos métodos da classe, todos PÚBLICOS
        tab.entradaDados();
        tab.calcularTabuada();

    }
    }
//EXERCÍCIO 01: Criar uma Calculadora Básica OO