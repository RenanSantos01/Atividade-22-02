class Containvestimento{
    private String nometitular;
    private int numerodaconta;
    private double saldodaconta;

Containvestimento(String nometitular, int numerodaconta, double saldodaconta){
    this.nometitular = nometitular;
    this.numerodaconta = numerodaconta;
    this.saldodaconta = saldodaconta;
}

public String getnometitular(){
    return nometitular;
}

public int getnumerodaconta(){
    return numerodaconta;
}

public double getsaldodaconta(){
    return saldodaconta;
}

public void depositar(double valor){
    System.out.println("Depositar valor de: " + valor + "realizado");
    saldodaconta += valor;
}

public void sacar(double valor){
    System.out.println("Saque no valor de: " + valor + "realizado");
    saldodaconta -= valor;
}

public void adicionejuros(){

}

@Override
public String toString(){
    return "Nome do titular: " + nometitular + "Numero da conta: " + numerodaconta + "Saldo da conta: " + saldodaconta + "\n";
}

public class App {
    public static void main(String[] args) throws Exception {
        Containvestimento containvestimento = new Containvestimento("Renan", 8888888, 1000);
        
        System.out.println(containvestimento.toString());

        containvestimento.depositar(1000);
        System.out.println(containvestimento.toString());

        containvestimento.sacar(1000);
        System.out.println(containvestimento.toString());

        


    }
}



}





