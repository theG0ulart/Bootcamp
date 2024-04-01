package one.digitalinnovation;

import one.digitalinnovation.dominio.Curso;

public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java básico");
        cursoJava.setDescricao("Aprenda os conceitos básicos sobre java");
        cursoJava.setCargaHoraria(8);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo("Java .NET");
        cursoDotNet.setDescricao("Aprenda os conceitos básicos sobre C#");
        cursoDotNet.setCargaHoraria(8);
    }
}
