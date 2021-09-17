package exportadores;

import java.util.ArrayList;
import java.util.List;

public class ExportadorListaProdutoMarkdown extends AbstractExportadorListaProduto {
    private static final String SEPARADOR_LN = "-", SEPARADOR_COL = "|";

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "\n";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        List<String> itens = new ArrayList<String>();
        for (int i = 0; i < TITULOS_COLUNAS.size(); i++) {
            itens.add("-----");
        }
        return gerarColunasLinha(itens);
    }

    @Override
    public String abrirColuna(String valor) {
        return valor;
    }

    @Override
    public String fecharColuna() {
        return " "+ SEPARADOR_COL;
    }

}//Classe
