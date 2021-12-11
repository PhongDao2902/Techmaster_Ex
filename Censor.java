package Exercises;

import java.util.Map;
import java.util.regex.Pattern;

class Main {
 
    private static String censor(String text) {
        Map<String, String> filters = Map.of(
            "fuck", "f*ck",
            "sex", "s*x",
            "rape", "r*ape",
            "shit", "sh*t",
            "bitch", "b*tch",
            "damn", "d*mn"
        );
 
        for (var filter : filters.entrySet()) {
            String pattern = "\\b" + Pattern.quote(filter.getKey()) + "\\b";
            text = text.replaceAll(pattern, filter.getValue());
        }
        return text;
    }
    public static void main(String[] args) {
        String text = "He says : fuck off, you son of a bitch";
        String result = censor(text);
        System.out.println(result);
    }
}