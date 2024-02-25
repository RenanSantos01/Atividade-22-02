class Contacorrente{
private String nomedotitular;
private int numerodaconta;
private double saldodaconta;
    

Contacorrente(String nomedotitular, int numerodaconta, double saldodaconta){
    this.nomedotitular = nomedotitular;
    this.numerodaconta = numerodaconta;
    this.saldodaconta = saldodaconta;

}

public String getnomedotitular(){
    return nomedotitular;
}

public int getnumerodaconta(){
    return numerodaconta;
}

public double getsaldodaconta(){
    return saldodaconta;
}


public void depositar(double valor){
    System.out.println("Depositar valor de" + valor + "Realizado");
    saldodaconta += valor;
}

public void sacar(double valor){
    if(saldodaconta == 0.0){
        System.out.println("Saldo insufuciiente");
    }
    else if (saldodaconta > 0.0) {
        System.out.println("Saque no valor de" + valor + "Realizado");
        saldodaconta -= valor;       
    }

}

@Override
public String toString(){
    return "Numedo da conta: " + numerodaconta + "Nome do titular: " + nomedotitular + "Saldo: " + saldodaconta + "\n";
}

public class App {
    public static void main(String[] args) throws Exception {
    Contacorrente contacorrente = new Contacorrente("Renan", 485523, 0.0);    
     
    System.out.println(contacorrente.toString());

    contacorrente.depositar(2000.00);
    System.out.println(contacorrente.toString());


    contacorrente.sacar(560.50);
    System.out.println(contacorrente.toString());
        
    }
}



}






