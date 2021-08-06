package exerpratico;

public class Livro implements Publicacao {
    // Atributos
    private String titulo, autor;
    private int totPaginas;
    private boolean aberto;
    private int pagAtual;
    private Pessoa leitor;   
    
    // To-string   
    public String detalhes() {
        return "Livro{" + "titulo=" 
                + titulo + "\n, autor=" 
                + autor + ",\n totPaginas=" 
                + totPaginas + ",\n aberto=" 
                + aberto + ",\n pagAtual=" 
                + pagAtual + ",\n Nome= " 
                + leitor.getNome() + ", Idade= " 
                + leitor.getIdade() + ", Sexo= " 
                + leitor.getSexo() + '}';
    }

    // Constructor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    // Métodos mutantes
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    // Abstracts

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    } 

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }
    
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
}
