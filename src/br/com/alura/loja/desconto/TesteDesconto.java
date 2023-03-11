package src.br.com.alura.loja.desconto;

import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("600"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        var desconto1 = calculadoraDeDescontos.calcular(orcamento1);
        var desconto2 = calculadoraDeDescontos.calcular(orcamento2);
        System.out.println(desconto1);
        System.out.println(desconto2);
    }
}
