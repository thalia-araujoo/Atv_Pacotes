package br.edu.ifce.biblioteca.model
public class Livro{
    private String Título;
    private String Autor;
    private int Ano;
    private String Status;

    public void String setTitulo{
        this.Titulo=Titulo;
    }
    public String getTitulo(){
        return this.Titulo;
    }

    public void String setAutor{
        this.Autor=Autor;
    }
    public String Autor(){
        return this.Autor;
    }

    public void int setAno{
        this.Ano=Ano;
    }
    public int getAno(){
        return this.Ano;
    }

    public void String setStatus{
        this.Status=Status;
    }
    public String getStatus(){
        return this.Status;
    }

    public void imprimirLivro(){
        System.out.println("Titulo do livro: "+this.Titulo);
        System.out.println("Autor: "+this.Autor);
        System.out.println("Ano: "+this.Ano);
        System.out.println("Status: "+this.Status);
        
    }

}