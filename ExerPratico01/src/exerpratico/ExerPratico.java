package exerpratico;
/*
 * @author Lucca
 */
public class ExerPratico {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 22, 'H');
        p[1] = new Pessoa("Aran", 25, 'H');
        p[2] = new Pessoa("Victoria", 23, 'M');
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        System.out.println(l[0].detalhes());
        
    }
    
}
