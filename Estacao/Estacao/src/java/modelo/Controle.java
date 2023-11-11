package modelo;

import DAL.EstacaoDAO;
import java.util.List;

public class Controle
{

    public String mensagem;

    public void cadastroEstacao(List<String> listadadosEstacao)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validardadosEstacao(listadadosEstacao);
        if (validacao.mensagem.equals(""))
        {
            Estacao estacao = new Estacao();
            estacao.setTemperatura(validacao.valor);
            estacao.setUmidade(validacao.valor);
            estacao.setPrecipitacao(listadadosEstacao.get(2));
            EstacaoDAO estacaoDAO = new EstacaoDAO();
            estacaoDAO.cadastroEstacao(estacao);
            this.mensagem = estacaoDAO.mensagem;
        } else
        {
            this.mensagem = validacao.mensagem;
        }

    }

}
