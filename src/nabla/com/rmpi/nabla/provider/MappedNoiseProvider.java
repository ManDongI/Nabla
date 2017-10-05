package com.rmpi.nabla.provider;

import com.rmpi.nabla.structure.Head;

import java.util.Map;
import java.util.Random;

public class MappedNoiseProvider implements NoiseProvider {
    private Random rng;
    private Map<String, String[]> noiseMap;

    public MappedNoiseProvider(Map<String, String[]> noiseMap) {
        this.noiseMap = noiseMap;
        this.rng = new Random();
    }

    @Override
    public String generateNoise(Head head) {
        if (noiseMap.containsKey(head.type)) {
            String[] candidates = noiseMap.<String>get(head.type);
            return candidates[rng.nextInt(candidates.length)];
        } else
            return "";
    }
}
