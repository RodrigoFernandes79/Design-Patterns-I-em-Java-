package src;

import src.br.com.alura.loja.imposto.CalculadoraDeImpostos;
import src.br.com.alura.loja.imposto.tipoImposto.Tipo;
import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        var inss = calculadoraDeImpostos.calcular(orcamento, Tipo.INSS);
        System.out.println(inss);
        var iss = calculadoraDeImpostos.calcular(orcamento, Tipo.ISS);
        System.out.println(iss);
    }
}