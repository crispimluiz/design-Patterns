package com.money.projetoMoney.model.descontos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto{
    //Contrutor da class Desconto
    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }
    public BigDecimal calcular(Orcamento orcamento){//aplica desconto
       if (orcamento.getValorOrcamento().compareTo(new BigDecimal("500")) > 0) {
              BigDecimal desconto = orcamento.getValorOrcamento().multiply( new BigDecimal("0.1"));
              orcamento.setDescontoOrcamento(desconto);
           return desconto;
        } else {//senao aplica o próximo
            return proximo.calcular(orcamento);
        }
    }
}
