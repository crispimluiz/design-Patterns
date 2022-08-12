package com.money.projetoMoney.model.descontos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoQuantidadeItens(
                new DescontoPorValor(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
