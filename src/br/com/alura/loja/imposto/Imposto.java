package src.br.com.alura.loja.imposto;

import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);
}
