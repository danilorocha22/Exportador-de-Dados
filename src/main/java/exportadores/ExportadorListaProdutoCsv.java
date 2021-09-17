package exportadores;

import java.util.ArrayList;
import java.util.List;

public class ExportadorListaProdutoCsv extends AbstractExportadorListaProduto {
    private static final String SEPARADOR_COL = ",";
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
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return valor;
    }

    @Override
    public String fecharColuna() {
        return SEPARADOR_COL;
    }
}
