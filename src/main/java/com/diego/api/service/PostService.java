package com.diego.api.service;

import com.diego.api.documents.Post;
import com.diego.api.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Define a classe como um bean do Spring
public class PostService {

    @Autowired
    private PostRepository repository; //Injeta o repositório

    //Retorna uma lista com todos posts inseridos
    public List<Post> findAll() {
        return repository.findAll();
    }

    //Retorno um post a partir do ID
    public Post findOne(String id) {
        return repository.findOne(id);
    }

    //Salva ou atualiza um post
    public Post save(Post post) {
        return repository.save(post);
    }

    //Exclui um post
    public void delete(String id) {
        repository.delete(id);
    }

}