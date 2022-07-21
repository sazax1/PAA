public class EmpregadoComissionado extends Empregado implements Pagaveis{
  double vendas;
  double comissao;
   double gastosTotais;
   
    public EmpregadoComissionado(String categoria, String nome, double vendas, double comissao) {
        super("Comissionado",nome);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


 
  public double getGastosTotais(){
      gastosTotais = comissao*vendas;  
      return gastosTotais;
    }
  
    public String imprime(){
        String categoria = "Categoria: "+getCategoria()+"\n";
        String nome = "Nome: "+getNome()+"\n";
        String vendas = "Total de Vendas: "+getVendas()+"\n";
        String comissao = "Comissão: "+getComissao();+"\n"
        String gastosTotais = "Total Pagamento: "+getGastosToais()+"\n";
        String saida = categoria+nome+vendas+comissao+gastosTotais;
        return saida;
    }

}