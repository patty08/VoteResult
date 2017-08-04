package com.vote.resultat.vote;

import javax.persistence.*;

@Entity
@Table (name = "votes")
public class votes {

    @Id
    private int id;
    private String voteValue;

    public votes(int vote_id, String voteValue) {
        this.id = vote_id;
        this.voteValue = voteValue;
    }

    public votes() {}

    @Column(columnDefinition = "id")
    public int getId() {
        return id;
    }

    public void setId(int vote_id) {
        this.id = vote_id;
    }

    @Column(columnDefinition = "voteValue", nullable = true)
    public String getVoteValue() {
        return voteValue;
    }

    public void setVoteValue(String voteValue) {
        this.voteValue = voteValue;
    }
}
