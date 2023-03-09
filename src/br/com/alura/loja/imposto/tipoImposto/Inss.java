package src.br.com.alura.loja.imposto.tipoImposto;

import src.br.com.alura.loja.imposto.Imposto;
import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Inss implements Imposto {
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
