package com.vote.resultat.vote;

import jdk.nashorn.internal.objects.annotations.Constructor;

import javax.persistence.*;

@Entity
@Table (name = "Votes")
public class Resultat {
    @Id
    @GeneratedValue
    int vote_id;
    String voteValue;

    public Resultat(int vote_id, String voteValue) {
        this.vote_id = vote_id;
        this.voteValue = voteValue;
    }

    public Resultat() {
    }

    @Column(columnDefinition = "vote_id", nullable = true)
    public int getVote_id() {
        return vote_id;
    }

    public void setVote_id(int vote_id) {
        this.vote_id = vote_id;
    }

    @Column(columnDefinition = "voteValue", nullable = true)
    public String getVoteValue() {
        return voteValue;
    }

    public void setVoteValue(String voteValue) {
        this.voteValue = voteValue;
    }
}
