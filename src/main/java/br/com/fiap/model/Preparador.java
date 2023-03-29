package br.com.fiap.model;

/**
 * @author Benefrancis do Nascimento
 * <p>
 * Classe que representa o profissional de Educação Física
 */
public class Preparador {

    private long id;

    private String nome;

    //Número de registro no Conselho Regional de Educação Física
    private String CREF;

    public Preparador() {
    }

    public Preparador(long id, String nome, String CREF) {
        this.id = id;
        this.nome = nome;
        this.CREF = CREF;
    }


    public long getId() {
        return id;
    }

    public Preparador setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Preparador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCREF() {
        return CREF;
    }

    public Preparador setCREF(String CREF) {
        this.CREF = CREF;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Preparador{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", CREF='").append(CREF).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
