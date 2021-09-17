package exportadores;

import entity.Produto;
import factory.IExportadorListaProduto;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractExportadorListaProduto implements IExportadorListaProduto {
    protected static final List<String> TITULOS_COLUNAS = Arrays.asList(
            "Id", "Descrição", "Marca", "Modelo", "Estoque"
    );

    @Override
    public final String exportar(List<Produto> produtoList) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(abrirTabela());
        stringBuilder.append(gerarColunasLinha(TITULOS_COLUNAS));
        stringBuilder.append(fecharLinhaTitulos());
        gerarLinhasProdutos(stringBuilder, produtoList);
        stringBuilder.append(fecharTabela());
        return stringBuilder.toString();
    }//metodo

    private void gerarLinhasProdutos(StringBuilder stringBuilder, List<Produto> produtoList) {
        for (Produto produto : produtoList) {
            List<String> itens = Arrays.asList(
                    String.valueOf(produto.getId()),
                    produto.getDescricao(),
                    produto.getMarca(),
                    produto.getModelo(),
                    String.valueOf(produto.getEstoque()));
            stringBuilder.append(gerarColunasLinha(itens));
        }
    }//metodo

    protected String gerarColunasLinha(List<String> titulosColunas) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(abrirLinha());
        for (String titulo : titulosColunas)
            stringBuilder.append(abrirColuna(titulo)).append(fecharColuna());
        stringBuilder.append(fecharLinha());
        return stringBuilder.toString();
    }//metodo

}//classe
