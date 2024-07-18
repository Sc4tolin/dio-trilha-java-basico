//int, byte, short, long, float, boolean e char (Não são objetos portanto, são valores brutos e são armazenados na pilha de memoria (Memory Stack))
//float e double 

// cep e cpf se começar com zero, precisa ser string, caso contrario, será int.

//float terá que colocar um F no final 

//Long precisa ser finalizado com L
//Java é fortemente TIPADO



public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        final double VALOR_DE_PI = 3.14;
        String meuNome = "weid";

        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        

        int numero = 5;
        numero = 10;
        System.out.println(numero);

       
        


    }
}
