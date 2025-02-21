public class Aluno {

    // Atributos do aluno
    
    String nome;
    String endereço;
    String telefone;
    String email;
    int matricula;

    // Construtores

public Aluno(String nome, String endereço, String telefone, String email, int matricula){
    this.nome = nome;
    this.endereço = endereço;
    this.telefone = telefone;
    this.email = email;
    this.matricula = matricula;

}
    // Métodos

public void mostrardados() {

    System.out.println("Dados do aluno"); 
    System.out.println("Nome: " + nome);
    System.out.println("Endereço Residencial: " + endereço);
    System.out.println("Telefone de contato: " + telefone);
    System.out.println("E-mail: " + email);
    System.out.println("Matrícula: " + matricula);



}
}
