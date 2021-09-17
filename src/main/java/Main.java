import entity.Produto;
import factory.IExportadorListaProduto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(10, "Notebook", "Acer", "A-53"));
        produtos.add(new Produto(15, "Celular", "Samsung", "J4+"));
        produtos.add(new Produto(20, "Vídeo Game", "PlayStation", "PS-5"));

        IExportadorListaProduto exportadorPadrao = IExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        System.out.println(exportadorPadrao.exportar(produtos));

        IExportadorListaProduto exportadorMarkdown = IExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        System.out.println(exportadorMarkdown.exportar(produtos));

        IExportadorListaProduto exportadorCsv = IExportadorListaProduto.newInstance("csv");
        System.out.println("Lista de Produtos em CSV\n");
        System.out.println(exportadorCsv.exportar(produtos));
    }//psvm
}
