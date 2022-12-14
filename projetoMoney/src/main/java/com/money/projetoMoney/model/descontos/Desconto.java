package com.money.projetoMoney.model.descontos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    public abstract BigDecimal calcular(Orcamento orcamento);
}
