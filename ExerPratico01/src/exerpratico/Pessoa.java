package exerpratico;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    // Método
    public void fazerAniversario() {
        this.idade++;
    }
    
    // Constructor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    // Métodos especiais - Encapsulamento - getters & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
