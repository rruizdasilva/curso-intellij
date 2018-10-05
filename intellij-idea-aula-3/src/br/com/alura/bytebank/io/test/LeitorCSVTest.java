package br.com.alura.bytebank.io.test;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeitorCSVTest {

    @org.junit.jupiter.api.Test
    void pagamentosDeAbril() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);
        assertEquals(5, pagamentos.size());


    }

    @org.junit.jupiter.api.Test
    void pagamentosMaio() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(3);
        assertEquals(5, pagamentos.size());


    }

    @org.junit.jupiter.api.Test
    void pagamentosJunho() throws IOException {
        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(2);
        assertEquals(5, pagamentos.size());


    }


}