package com.alura.challengeforumhub.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDateTime data, Boolean status, String autor, Curso curso) {

    public DadosListagemTopico (Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData_criacao(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }
}
