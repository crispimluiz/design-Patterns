import com.money.projetoMoney.model.Orcamento;
import com.money.projetoMoney.model.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteOrcamentoProxy {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 9, new BigDecimal("0"));
        System.out.println("Valor desconto antes = " + orcamento.getDescontoOrcamento());
        System.out.println("Valor desconto antes = " + orcamento.getDescontoOrcamento());
        //Testo do proxy
        OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
        System.out.println("Valor desconto antes = " + proxy.getDescontoOrcamento());
        System.out.println("Valor desconto antes = " + proxy.getDescontoOrcamento());
    }
}
