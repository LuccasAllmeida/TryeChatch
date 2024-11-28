package Financiamento;

public class financiamentoBancario {

    public Double valorTotal;
    public Double entrada;
    public Integer parcelas;

    public financiamentoBancario(Double valorTotal, Double entrada, Integer parcelas) {
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao(){
        return (valorTotal - entrada) / parcelas ;
    }
}
