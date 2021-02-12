package com.abnuj.completejokeapp2021;

public class JokesModel {
    int jokesid;
    String jokes;

    public JokesModel() {
    }

    public JokesModel(int jokesid, String jokes) {
        this.jokesid = jokesid;
        this.jokes = jokes;
    }

    public int getJokesid() {
        return jokesid;
    }

    public void setJokesid(int jokesid) {
        this.jokesid = jokesid;
    }

    public String getJokes() {
        return jokes;
    }

    public void setJokes(String jokes) {
        this.jokes = jokes;
    }
}
