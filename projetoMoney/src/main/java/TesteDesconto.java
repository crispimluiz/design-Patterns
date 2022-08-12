import com.money.projetoMoney.model.Orcamento;
import com.money.projetoMoney.model.calculos.CalculadoraDeImpostos;
import com.money.projetoMoney.model.calculos.Icms;
import com.money.projetoMoney.model.calculos.Inss;
import com.money.projetoMoney.model.descontos.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 3, new BigDecimal("0"));
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println("Valor orçamento = " + orcamento.getValorOrcamento());
        System.out.println("Valor metodo desconto = " + calculadora.calcular(orcamento));
        System.out.println("Valor desconto = " + orcamento.getDescontoOrcamento());
    }
}