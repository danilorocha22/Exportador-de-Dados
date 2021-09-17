package factory;

import entity.Produto;
import exportadores.ExportadorListaProdutoCsv;
import exportadores.ExportadorListaProdutoHtml;
import exportadores.ExportadorListaProdutoMarkdown;

import java.util.List;

public interface IExportadorListaProduto {

    public String abrirTabela();
    public String fecharTabela();
    public String abrirLinha();
    public String  fecharLinha();
    public String fecharLinhaTitulos();
    public String abrirColuna(String valor);
    public String fecharColuna();
    public String exportar(List<Produto> produtoList);

    public static IExportadorListaProduto newInstance() {
        return newInstance("html");
    }//metodo

    public static IExportadorListaProduto newInstance(String tipoDeArquivo) {
        switch (tipoDeArquivo) {
            case "html" : return new ExportadorListaProdutoHtml();
            case "md" : return new ExportadorListaProdutoMarkdown();
            case "csv" : return new ExportadorListaProdutoCsv();
            default: throw new UnsupportedOperationException("Formato não suportado: "+ tipoDeArquivo);
        }
    }//metodo

}//classe
