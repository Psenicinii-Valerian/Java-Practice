package it.step.inner.annonymous;

import java.util.*;

public class SortingLists {

    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();
        texts.add("DDD");
        texts.add("CCCCC");
        texts.add("BBBBBBB");
        texts.add("AAAAAAAAA");

        // Collections.sort(texts, new StringsLengthComparator());

         Collections.sort(texts);
         Comparator<String> stringsAnonimComparator = new Comparator<String>() {
             public int compare(String s1, String s2) {
                 return s2.length() - s1.length();
             }
         };

         texts.sort(stringsAnonimComparator);
    }
}
