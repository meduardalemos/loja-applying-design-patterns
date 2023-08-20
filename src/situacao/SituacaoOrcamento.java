package situacao;

import excecoes.DomainException;
import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    };

    public void aprovar(Orcamento orcamento){
        throw new DomainException("O orçamento não pode ser aprovado.");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("O orçamento não pode ser reprovado.");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("O orçamento não pode ser finalizado.");
    }
}
