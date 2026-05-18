package de.htw_berlin.fb4.jkos.proser;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class ClosingSentence implements Sentence {

    private String content;

    public ClosingSentence(String content) {
        this.content = content;
    }

    @Override
    public String get() {
        return content;
    }
}
