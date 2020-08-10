package com.abc.retrofit;


import java.util.ArrayList;

public class Pokemon {


    private int count;
    private String previous;
    private String next;
    private ArrayList<Results> results;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }

    public class Results

    {
        private String name;
        private String url;


        public String getUrl () {
        return url;
    }

        public String getName () {
        return name;
    }

        public void setName(String name) {
            this.name = name;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}

