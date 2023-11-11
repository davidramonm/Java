package managedBeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Controle;

@ManagedBean
@RequestScoped
public class brgIndex
{

    private String temperatura;
    private String umidade;
    private String precipitacao;
    private String resposta;

    public brgIndex()
    {
    }

    public String cadastrarEstacao()
    {
        List<String> listadadosEstacao = new ArrayList<String>();
        listadadosEstacao.add(temperatura);
        listadadosEstacao.add(umidade);
        listadadosEstacao.add(precipitacao);
        Controle controle = new Controle();
        controle.cadastroEstacao(listadadosEstacao);
        return "/PagResposta";
    }

    public String getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(String temperatura)
    {
        this.temperatura = temperatura;
    }

    public String getUmidade()
    {
        return umidade;
    }

    public void setUmidade(String umidade)
    {
        this.umidade = umidade;
    }

    public String getPrecipitacao()
    {
        return precipitacao;
    }

    public void setPrecipitacao(String precipitacao)
    {
        this.precipitacao = precipitacao;
    }

    public String getResposta()
    {
        return resposta;
    }

    public void setResposta(String resposta)
    {
        this.resposta = resposta;
    }

}
