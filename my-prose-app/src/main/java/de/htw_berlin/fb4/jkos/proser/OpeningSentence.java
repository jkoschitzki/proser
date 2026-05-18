package de.htw_berlin.fb4.jkos.proser;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class OpeningSentence implements Sentence {

    private String content;

    public OpeningSentence(String content) {
        this.content = content;
    }

    @Override
    public String get() {
        return content;
    }
}

