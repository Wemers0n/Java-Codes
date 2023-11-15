package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Python", "Java", "C#");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        String UltimaLang = (String) ListaUtil.getUltimo1(langs);
        System.out.println(UltimaLang);

        Integer UltimoNum = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(UltimoNum);

        String UltimaLang2 = ListaUtil.getUltimo2(langs);
        System.out.println(UltimaLang2);

        Integer UltimoNum2 = ListaUtil.getUltimo2(nums);
        System.out.println(UltimoNum2);
    }
}
