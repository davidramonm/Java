package modelo;

import java.util.List;

public class Validacao
{
    
    public String mensagem;
    public Double valor;
    
    public void validarValor(String valor)
    {
        this.mensagem = "";
        try
        {
            this.valor = Double.valueOf(valor);
        } catch (Exception e)
        {
            this.mensagem = "Insira um dado valido!";
        }
    }
    
    public void validardadosEstacao(List<String> listadadosEstacao)
    {
        this.mensagem = "";
        for (String s : listadadosEstacao)
        {
            if (s.isEmpty())
            {
                this.mensagem = "Nenhum campo pode estar vazio";
            }
        }
        validarValor(listadadosEstacao.get(0));
        validarValor(listadadosEstacao.get(1));
        
    }
    
}
