package com.money.projetoMoney.model;

import com.money.projetoMoney.model.descontos.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class Orcamento {
        private BigDecimal valorOrcamento;
        private int qtdItens;
        private BigDecimal descontoOrcamento;
    public Orcamento() {
    }

    public Orcamento(BigDecimal valorOrcamento, int qtdItens, BigDecimal descontoOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
        this.descontoOrcamento = descontoOrcamento;
    }
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getDescontoOrcamento() {
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
}
