package com.diego.api.documents;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Document(collection = "posts")
public class Post {

    @Id
    private String id;

    @NotBlank(message = "Autor é uma informação obrigatória.")
    private String autor;

    @NotBlank(message = "Título é uma informação obrigatória.")
    private String titulo;

    @NotBlank(message = "Texto é uma informação obrigatória.")
    private String texto;

    @DateTimeFormat(iso = ISO. DATE_TIME, pattern = "yyyy-MM-dd")
    @NotNull(message = "Data é uma informação obrigatória.")
    private Date data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
