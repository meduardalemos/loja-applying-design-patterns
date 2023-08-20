package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximoDesconto;

    public Desconto(Desconto proximoDesconto){
        this.proximoDesconto = proximoDesconto;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximoDesconto.calcular(orcamento);
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);
}
