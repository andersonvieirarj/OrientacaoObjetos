import java.util.Scanner;
public class Tabuada { //NOME DA CLASSE
    Scanner ler = new Scanner (System.in);
    int numero; //DEFINIÇÃO DOS ATRIBUTOS
    int op;
    int resultado;
        public void calcularTabuada() { // DEFINIÇÃO DOS MÉTODOS
            for (op = 1; op <= 10; op++) {
                resultado = numero * op;
                System.out.println(numero + "X" + op + "=" + resultado);
            }
        }
        public void entradaDados(){
                System.out.println("Digite um número: ");
                numero = ler.nextInt();
            }
       }
