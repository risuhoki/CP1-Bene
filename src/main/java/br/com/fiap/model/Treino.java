package br.com.fiap.model;

import java.time.LocalDateTime;

/**
 * @author Benefrancis do Nascimento
 *
 * Classe para representar o plano de treino específico para o atleta
 *
 */
public class Treino {

    private long id;

    private String nome;

    private String descricao;

    private Preparador preparador;

    private LocalDateTime inicio;

    private LocalDateTime fim;

    private Fundamento fundamento;

    private Atleta atleta;


    public Treino() {
    }

    public Treino(long id, String nome, String descricao, Preparador preparador, LocalDateTime inicio, LocalDateTime fim, Fundamento fundamento, Atleta atleta) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preparador = preparador;
        this.inicio = inicio;
        this.fim = fim;
        this.fundamento = fundamento;
        this.atleta = atleta;
    }


    public long getId() {
        return id;
    }

    public Treino setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Treino setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Treino setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Preparador getPreparador() {
        return preparador;
    }

    public Treino setPreparador(Preparador preparador) {
        this.preparador = preparador;
        return this;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public Treino setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
        return this;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public Treino setFim(LocalDateTime fim) {
        this.fim = fim;
        return this;
    }

    public Fundamento getFundamento() {
        return fundamento;
    }

    public Treino setFundamento(Fundamento fundamento) {
        this.fundamento = fundamento;
        return this;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public Treino setAtleta(Atleta atleta) {
        this.atleta = atleta;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Treino{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", preparador=").append(preparador);
        sb.append(", inicio=").append(inicio);
        sb.append(", fim=").append(fim);
        sb.append(", fundamento=").append(fundamento);
        sb.append(", atleta=").append(atleta);
        sb.append('}');
        return sb.toString();
    }
}
