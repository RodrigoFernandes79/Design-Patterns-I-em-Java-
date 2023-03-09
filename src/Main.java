package src;

import src.br.com.alura.loja.imposto.CalculadoraDeImpostos;
import src.br.com.alura.loja.imposto.tipoImposto.Inss;
import src.br.com.alura.loja.imposto.tipoImposto.Iss;
import src.br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        var inss = new Inss();
        var calculoInss = calculadoraDeImpostos.calcular(orcamento, inss);
        System.out.println(calculoInss);

        var iss = new Iss();
        var calculoIss = calculadoraDeImpostos.calcular(orcamento, iss);
        System.out.println(calculoIss);
    }
}