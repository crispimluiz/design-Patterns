package com.money.projetoMoney.model.descontos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeItens extends Desconto{
    public DescontoQuantidadeItens(Desconto proximo) {
        super(proximo);
    }
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQtdItens() > 5) {
            return orcamento.getValorOrcamento().multiply(new BigDecimal("0.1"));
        }else {
            return proximo.calcular(orcamento);
        }
    }
}
