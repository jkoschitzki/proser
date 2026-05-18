package de.htw_berlin.fb4.jkos.proser;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class App 
{
    public static void main( String[] args )
    {
        // Create instances of custom sentences
        OpeningSentence opening = new OpeningSentence("Once upon a time, in a land far away, there was a brilliant idea.");
        ClosingSentence closing = new ClosingSentence("And they lived happily ever after, forever changed by this journey.");

        // Use ProseBuilder to register sentences
        ProseBuilder proseBuilder = new ProseBuilder();
        proseBuilder.register(opening);
        proseBuilder.register(closing);

        // Get and print the complete prose
        String prose = proseBuilder.get();
        System.out.println("Generated Prose:");
        System.out.println(prose);
    }
}
