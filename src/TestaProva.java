public class TestaProva {
    public static void main(String[] args){
        Empregado[] emp = new Empregado[6];
        emp[0] = new EmpregadoHorista("João", 9.97, 44);
        emp[1] = new EmpregadoHorista("Maria", 8.00, 30);
        emp[2] = new EmpregadoAssalariado("José",1245.88);
        emp[3] = new EmpregadoAssalariado("Pedro",1336.24);
        emp[4] = new EmpregadoComissionado("Tiago",25890.99,0.03);
        emp[5] = new EmpregadoComissionado("André",27890.80,0.05);

        Pagaveis[] gastosTotais = new Pagaveis[8];

        for(int i=0;i<emp.length;i++){
            System.out.println(emp[i].imprime()+"\n");
            gastosTotais[i] = emp[i];
        }

        gastosTotais[6] = new Fatura("Desinfetante",5,2.89);
        gastosTotais[7] = new Fatura("Toner Impressora", 7, 127.89);

        double totalGastos = 0;
        for(int i=0;i<gastosTotais.length;i++){
            totalGastos += gastosTotais[i].getTotalAPagar();
        }

        System.out.println("Saída Total: "+totalGastos);

    }


}