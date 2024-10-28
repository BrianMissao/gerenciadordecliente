package com.teste.gerenciadordeusuario.entidades;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deve_ser_possivel_informar_um_nome() {
        String nomeEsperado = "João teste";

        Cliente cliente = new Cliente(nomeEsperado);

        assertThat(cliente.getNome()).isEqualTo(nomeEsperado);
    }
  
}