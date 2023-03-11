package src.br.com.alura.loja.desconto;

import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto chamarProximoDesconto;

    public Desconto(Desconto chamarProximoDesconto) {
        this.chamarProximoDesconto = chamarProximoDesconto;
    }

    private BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicarDesconto(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return chamarProximoDesconto.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicarDesconto(Orcamento orcamento);
}
