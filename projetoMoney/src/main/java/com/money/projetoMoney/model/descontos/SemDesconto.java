package com.money.projetoMoney.model.descontos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }
    public BigDecimal calcular(Orcamento orcamento){
            return BigDecimal.ZERO;
    }
}
