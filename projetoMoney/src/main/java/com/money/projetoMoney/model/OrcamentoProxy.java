package com.money.projetoMoney.model;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{
    //valor que deixaremos em proxy
    private BigDecimal descontoOrcamento;
    //Objeto original
    private Orcamento orcamento;
    //Contrutor
    public OrcamentoProxy(Orcamento orcamento) {
        this.descontoOrcamento = descontoOrcamento;
        this.orcamento = orcamento;
    }
    //sobreescrever a variavel que fica em cache (proxy)
    @Override
    public BigDecimal getDescontoOrcamento() {
        if(descontoOrcamento == null){ //se for null chama
            this.descontoOrcamento = orcamento.getDescontoOrcamento();
        }//se nao for null so mostra o que tem
        return this.descontoOrcamento;
    }
}
