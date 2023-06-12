class pessoa{
  String nome;
  int idade;
  char sexo;
  String cpf;
}
class conta{
  String numero;
  pessoa titular;
  double saldo;
  double limite;
}
public class Main {
  public static void main(String[] args) {
    pessoa p1 = new pessoa();
     p1.nome = "Maria" ;
     p1.idade = 18;
     p1.sexo = 'f';
     p1.cpf = "123.456.789-00";
     
     pessoa p2 = new pessoa();
     p2.nome = "joao";
     p2.idade = 22;
     p2.sexo = 'm';
     p2.cpf = "234.567.890-00";
     
     
     conta c1 = new conta();
     c1.numero = "1234-5";
     c1.titular = p1;
     c1.saldo = 100.0;
     c1.limite = 200.0;
     
     conta c2 = new conta();
     c2.numero = "2345-6";
     c2.titular = p2;
     c2.saldo = 150.0;
     c2.limite = 200.0;
     
     System.out.println(c1.saldo);
     System.out.println(c1.titular.nome);
     System.out.println("saldo da conta " + c2.numero + ":" + c2.saldo);
    System.out.println("Hello world!");
  }
}
