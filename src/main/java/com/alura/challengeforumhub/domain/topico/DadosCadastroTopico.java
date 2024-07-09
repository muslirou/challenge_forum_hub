package com.alura.challengeforumhub.domain.topico;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico (
        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotNull
        LocalDateTime data_criacao,

        @NotNull
        Boolean status,

        @NotBlank
        String autor,

        @NotNull
        Curso curso,

        @NotBlank
        String respostas) {

}
