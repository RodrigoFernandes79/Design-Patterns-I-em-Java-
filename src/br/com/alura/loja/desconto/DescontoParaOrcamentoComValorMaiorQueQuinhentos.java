package src.br.com.alura.loja.desconto;

import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto chamarProximoDesconto) {
        super(chamarProximoDesconto);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }


    @Override
    public boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}