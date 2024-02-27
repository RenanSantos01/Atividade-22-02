class Containvestimento{
    private String nometitular;
    private int numerodaconta;
    private double saldodaconta;
    private double taxadejuros;

Containvestimento(String nometitular, int numerodaconta, double saldodaconta, double taxadejuros){
    this.nometitular = nometitular;
    this.numerodaconta = numerodaconta;
    this.saldodaconta = saldodaconta;
    this.taxadejuros = taxadejuros;
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

public double gettaxadejuros(){
    return taxadejuros;
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

double juros = saldodaconta *(taxadejuros/100);
saldodaconta += juros;
}

@Override
public String toString(){
    return "Nome do titular: " + nometitular + "Numero da conta: " + numerodaconta + "Saldo da conta: " + saldodaconta + "\n";
}

    public static void main(String[] args) throws Exception {
        Containvestimento containvestimento = new Containvestimento("Renan", 8888888, 1000, 10.0);
        
        System.out.println(containvestimento.toString());

        containvestimento.depositar(1000);
        System.out.println(containvestimento.toString());

        containvestimento.sacar(1000);
        System.out.println(containvestimento.toString());

        for(int i = 0; i < 5; i++){
            containvestimento.adicionejuros();
        }
    
        System.out.println("A taxa de eh: " + containvestimento.getsaldodaconta());


    }
}





