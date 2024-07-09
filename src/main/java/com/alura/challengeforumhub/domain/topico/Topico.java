package com.alura.challengeforumhub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private LocalDateTime data_criacao;
    private Boolean status;
    private String autor;

    @Enumerated(EnumType.STRING)
    private Curso curso;
    private String respostas;

    public Topico (DadosCadastroTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.data_criacao = dados.data_criacao();
        this.status = dados.status();
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.respostas = dados.respostas();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Boolean getStatus() { return status;}

    public String getAutor() {
        return autor;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getRespostas() {
        return respostas;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void atualizarInformacoes(DadosAtualizarTopico dados) {

        if(dados.autor() != null) {
            this.autor = dados.autor();
        }
        if(dados.titulo() != null ) {
            this.titulo = dados.titulo();
        }
        if(dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if(dados.curso() != null) {
            this.curso = dados.curso();
        }
    }

    public void excluir() {
        this.status = false;
    }

}
