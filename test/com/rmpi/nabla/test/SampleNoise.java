package com.rmpi.nabla.test;

import com.rmpi.nabla.Nabla;
import com.rmpi.nabla.provider.MappedNoiseProvider;
import com.rmpi.nabla.provider.SimpleSentenceFactory;

import java.util.Map;

public class SampleNoise {
    public static void main(String[] args) {
        Nabla nabla = new Nabla(new MappedNoiseProvider(Map.of("S", new String[] { "사람이", "고래가", "원숭이가", "뱀이", "고양이가", "개가", "컴퓨터가" }
            , "O", new String[] { "사람을", "고래를", "원숭이를", "뱀을", "고양이를", "개를", "컴퓨터를" }
            , "V", new String[] { "죽였습니다.", "조롱했습니다.", "강화했습니다.", "만났습니다.", "잃었습니다." })));
        for (int i = 0; i < 100; i++)
            System.out.println(nabla.getNoisySentence(SimpleSentenceFactory.getSentence("SOV", "")));
    }
}
