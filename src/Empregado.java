public abstract class Empregado implements Pagaveis{
  String nome;
  String categoria;
  
    public Empregado(String Categoria, String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
 
  public abstract String imprime();
  public abstract double getGastosTotais();
}