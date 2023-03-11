package src.br.com.alura.loja.desconto;

import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {
    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto chamarProximoDesconto) {
        super(chamarProximoDesconto);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return chamarProximoDesconto.calcular(orcamento);
    }
}