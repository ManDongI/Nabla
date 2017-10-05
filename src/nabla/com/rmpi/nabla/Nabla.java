package com.rmpi.nabla;

import com.rmpi.nabla.provider.NoiseProvider;
import com.rmpi.nabla.structure.Sentence;

import java.util.Arrays;

public class Nabla {
    private NoiseProvider provider;

    public Nabla(NoiseProvider provider) {
        this.provider = provider;
    }

    public String getNoisySentence(Sentence sentence) {
        return getNoisySentence(sentence, " ");
    }

    public String getNoisySentence(Sentence sentence, String delimiter) {
        String[] noises = new String[sentence.heads.length];
        Arrays.setAll(noises, index -> provider.generateNoise(sentence.heads[index]));
        return String.join(delimiter, noises);
    }
}
