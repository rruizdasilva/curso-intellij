package br.com.alura.bytebank.registrador;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamento {

    private final static List<Pagamento> PAGAMENTO = new ArrayList<>();

    public void registra(List<Pagamento> pagamentos) {
        for (int i = 0; i < pagamentos.size(); i++) {
            Pagamento pagamento = pagamentos.get(i);
            verificaTipo(pagamento);
            salva(pagamento);
        }
        exibeEfetuados();
    }

    private void exibeEfetuados() {
        if (!PAGAMENTO.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (int i = 0; i < PAGAMENTO.size(); i++) {
                System.out.println(PAGAMENTO.get(i));
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }

    private void verificaTipo(Pagamento pagamento) {
        if (pagamento.getTipo().equals(Tipo.CREDITO)) {
            pagamento.setValor(pagamento.getValor() * 1.02);
        }
        if (pagamento.getTipo().equals(Tipo.DEBITO)) {
            pagamento.setValor(pagamento.getValor() * 1.001);
        }
        if (pagamento.getTipo().equals(Tipo.DINHEIRO)) {
        }
    }

    private void salva(Pagamento pagamento) {
        PAGAMENTO.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }

}
