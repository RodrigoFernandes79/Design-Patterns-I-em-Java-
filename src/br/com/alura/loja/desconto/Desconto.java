package src.br.com.alura.loja.desconto;

import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto chamarProximoDesconto;

    public Desconto(Desconto chamarProximoDesconto) {
        this.chamarProximoDesconto = chamarProximoDesconto;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
