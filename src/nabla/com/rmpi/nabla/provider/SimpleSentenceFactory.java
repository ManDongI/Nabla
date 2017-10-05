package com.rmpi.nabla.provider;

import com.rmpi.nabla.structure.Head;
import com.rmpi.nabla.structure.Sentence;

import java.util.Arrays;

public class SimpleSentenceFactory {
    public static Sentence getSentence(String headInfo, String delimiter) {
        String[] headTypes = headInfo.split(delimiter);
        Head[] heads = new Head[headTypes.length];
        Arrays.setAll(heads, index -> new Head(headTypes[index]));
        return new Sentence(heads);
    }
}
