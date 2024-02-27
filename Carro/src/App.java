class Carro{
private double combustivel = 0;
private double consumo;

Carro(double consumo){
    this.combustivel = 0;
    this.consumo = consumo;

}

public double getcombustivel(){
    return combustivel;
}

public double setcombustivel(double combustivel){
    this.combustivel = combustivel;
}

public double getconsumo(){
    return consumo;
}

public double setconsumo(double consumo){
    this.consumo = consumo;
}





public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


}



