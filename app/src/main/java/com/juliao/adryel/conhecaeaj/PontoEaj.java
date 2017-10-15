package com.juliao.adryel.conhecaeaj;

/**
 * Created by ADRYEL on 14/10/2017.
 */

public class PontoEaj {
    private String nomeLocal;
    private String nomeResponsavel;
    private int telefone;
    private String descricao;
    private int img;
    private String email;
    private String horarioFuncionamento;

    public PontoEaj() {
    }

    public PontoEaj(String nomeLocal, String nomeResponsavel, int telefone, String descricao, int img, String email, String horarioFuncionamento) {
        this.nomeLocal = nomeLocal;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
        this.descricao = descricao;
        this.img = img;
        this.email = email;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getImg() {
        return img;
    }

    public String getEmail() {
        return email;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }
}
