package com.vote.resultat.vote;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@PersistenceContext
public class ResultatServiceImpl{

    @PersistenceUnit(unitName="Votes")
    private EntityManager entityManager;
    private votes votes;


    public String getResult() {
        Query query = entityManager.createQuery("SELECT * From votes tes");
        query.getResultList();
        System.out.println(query);
        return query.toString();
    }

    public List<votes> findAll() {
        return null;
    }
}
