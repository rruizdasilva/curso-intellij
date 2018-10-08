package br.com.alura.bytebank;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.visualizador.OpcoesPagamento;

import java.io.IOException;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);

        for (Pagamento pagamento: pagamentos) {

            double valorBruto = pagamento.getValor();

            if (valorBruto > 100) {
                double valorComAcrescimento = valorBruto * 1.1;

                pagamento.setValor(valorComAcrescimento);
            }

            System.out.println(pagamento);



        }


    }

}

