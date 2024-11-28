package Financiamento;

public class programaPrincipal {
    public static void main(String[] args){
        double valorTotal = 1000.0;
        double entrada = 100.0;
        int parcelas = 10;

        if (entrada < valorTotal * 0.2){
            System.out.println("A entrada deve ser pelo menos 20% do valor total");
        } else if (parcelas < 6) {
            System.out.println("O número mínimo de parcelas deve ser 6");
        } else {
            financiamentoBancario f = new financiamentoBancario(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        }
    }
}
