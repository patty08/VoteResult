package com.vote.resultat.vote;

public class Resultat {
    int vote_id;
    String voteValue;

    public Resultat(int vote_id, String voteValue) {
        this.vote_id = vote_id;
        this.voteValue = voteValue;
    }

    public int getVote_id() {
        return vote_id;
    }

    public void setVote_id(int vote_id) {
        this.vote_id = vote_id;
    }

    public String getVoteValue() {
        return voteValue;
    }

    public void setVoteValue(String voteValue) {
        this.voteValue = voteValue;
    }
}
