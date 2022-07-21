public class EmpregadoAssalariado extends Empregado implements Pagaveis{
    double salario;

    public EmpregadoAssalariado(String Categoria, String nome, double salario) {
        super("Assalariado",nome);
        this.salario = salario;
    }
    
    public double getGastosTotais(){
      double gastosTotais = salario;
        return gastosTotais;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
  
    
    
    public String imprime(){
        String categoria = "Categoria: "+getCategoria()+"\n";
        String nome = "Nome: "+getNome()+"\n";
        String gastosTotais = "Total Pagamento: "+getGastosTotais();
        String saida = categoria+nome+gastosTotais;
        return saida;
    }

    
}