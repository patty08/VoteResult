package com.vote.resultat.vote;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ResultatService extends CrudRepository{

    String getResult();
    List<votes> findAll();
}
