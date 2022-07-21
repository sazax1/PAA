public class EmpregadoHorista extends Empregado implements Pagaveis{
  double vh;
  double ht;
   double gastosTotais;

    public EmpregadoHorista(String Categoria, String nome, double vh, double ht) {
        super(Categoria, nome);
        this.vh = vh;
        this.ht = ht;
    }
  

    

    public double getVh() {
        return vh;
    }

    public double getHt() {
        return ht;
    }
    
    public double getGastosTotais(){
      gastosTotais = vh*ht;
        return gastosTotais;
    }

    public void setVh(double vh) {
        this.vh = vh;
    }

    public void setHt(double ht) {
        this.ht = ht;
    }
    
    
  
    public String imprime(){
        String categoria = "Categoria: "+getCategoria()+"\n";
        String nome = "Nome: "+getNome()+"\n";
        String vh = "Valor Hora:"+getVh(),+"\n";
        String ht = "Horas Trabalhadas: "+getHt()+"\n";
        String gastosTotais = "Total Pagamento: "+getGastosTotais()+"\n";
        String saida = categoria+nome+vh+ht+gastosTotais;
        return saida;
    }

}