package com.alura.challengeforumhub.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(String titulo, String mensagem, LocalDateTime data_criacao, Boolean status, String autor, Curso curso) {

    public DadosDetalhamentoTopico (Topico topico) {
        this(topico.getTitulo(), topico.getMensagem(), topico.getData_criacao(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }
}
