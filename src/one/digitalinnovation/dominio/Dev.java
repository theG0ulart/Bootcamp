package one.digitalinnovation.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String nome;
    private List<ConteudoEducacional> conteudosInscritos = new ArrayList<>();
    private List<ConteudoEducacional> conteudosConcluidos = new ArrayList<>();

    public void inscrever(ConteudoEducacional conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            System.out.println("Você já está inscrito.");
        } else {
            conteudosInscritos.add(conteudo);
        }
    }

    public void inscrever(Bootcamp bootcamp) {
        for (ConteudoEducacional conteudo : bootcamp.getConteudos()) {
            inscrever(conteudo);
        }
        bootcamp.getDevs().add(this);
    }

    public void progredir() {
        Optional<ConteudoEducacional> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não tem mais nenhum conteúdo");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    public List<ConteudoEducacional> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<ConteudoEducacional> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<ConteudoEducacional> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<ConteudoEducacional> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
