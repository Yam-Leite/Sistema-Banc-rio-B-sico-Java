package SistemaBacario;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(null);
        Conta cp = new ContaPoupanca(null);

       cc.imprimirExtrato();
       cp.imprimirExtrato();
    }
    
}
