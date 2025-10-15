package com.lipe.gerenciador_estoque.Entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String senha;

    //relacionamento um usuário para muitos produtos//
    @OneToMany(mappedBy = "usuario", cascade= CascadeType.ALL)
    private List <Produto> produtos_cadastrados = new ArrayList <> ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }   

    public List<Produto> getProdutosCadastrados() {
        return produtos_cadastrados;
    }
}