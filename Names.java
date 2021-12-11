package Exercises;

import java.util.ArrayList;

public class Names {
    public static ArrayList<String> NameOptimize(ArrayList<String> str){
        ArrayList<String> output = new ArrayList<String>();
        for(int i = 0; i < str.size(); i++){
            str.get(i).trim();
            String words[]=str.get(i).split("\\s+");  
            String capitalizeWord="";  
            for(String w:words){  
                if (!w.isEmpty()) {
                    String first=w.substring(0,1);  
                    String afterFirst=w.substring(1);  
                    capitalizeWord+=first.toUpperCase()+afterFirst.toLowerCase()+" ";
                }
            }
            output.add(capitalizeWord);
        }
        return output;
    }
    public static void main(String[] args) {
        ArrayList<String> fullNames = new ArrayList<String>();
        fullNames.add("Nguyễn  hữu tiến ");
        fullNames.add("  Lê vĂn tốt ");
        fullNames.add("nguyễn việt ANh");
        fullNames.add("  Hoàng trọng  kHoa");
        fullNames.add(" ĐàO việt phong");

        fullNames = NameOptimize(fullNames);
        for(int i = 0; i < fullNames.size(); i++){
            System.out.println(fullNames.get(i));
        }
    }
}
