package com.vote.resultat.vote;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ResultatService {

    String existVote();
    List<Resultat> findAll();
}
