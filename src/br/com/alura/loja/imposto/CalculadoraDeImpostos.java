package src.br.com.alura.loja.imposto;


import src.br.com.alura.loja.imposto.tipoImposto.Tipo;
import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {


    public BigDecimal calcular(Orcamento orcamento, Tipo tipoImposto) {
        switch (tipoImposto) {

            case INSS -> {
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            }
            case ISS -> {
                return orcamento.getValor().multiply(new BigDecimal("0.6"));
            }
            default -> {
                return BigDecimal.ZERO;
            }
        }

    }
}
