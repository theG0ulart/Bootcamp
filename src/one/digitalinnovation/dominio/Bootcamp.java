package one.digitalinnovation.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private List<ConteudoEducacional> conteudos = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public List<ConteudoEducacional> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<ConteudoEducacional> conteudos) {
        this.conteudos = conteudos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }
}
