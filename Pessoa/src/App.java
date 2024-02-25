class Pessoa{
private String nome;
private int idade;
private double peso;
private double altura;

public Pessoa(String nome, int idade, double peso, double altura){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;

}

public String getnome(){
    return this.nome;
}

public int getidade(){
    return this.idade;
}

public double getpeso(){
    return this.peso;
}

public double getaltura(){
    return this.altura;
}

public void envelhecer(){
    idade++;
    if (this.idade < 21) {
        this.crescer (0.5);        
    }
}

public void engordar(double peso){
    this.peso += peso;
}

public void emagrecer(double peso){
    this.peso -= peso;
}

public void crescer(double altura){
    this.altura += altura;
}

public static void main(String[] args) throws Exception {
    Pessoa pessoa = new Pessoa("Renan", 18, 70, 173);
    pessoa.envelhecer();
    pessoa.engordar(10);
    pessoa.emagrecer(5);
    pessoa.crescer(1);
    
    System.out.println("Nome: " + pessoa.getnome());
    System.out.println("Idade: " + pessoa.getidade());
    System.out.println("Peso: " + pessoa.getpeso());
    System.out.println("Altura: " + pessoa.getaltura());
    
    }

}



