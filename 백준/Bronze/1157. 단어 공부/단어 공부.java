import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String s = br.readLine();
        s = s.toLowerCase();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, 0);
        }
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {        
                map.put(ch, map.get(ch) + 1);
            }
        }
        
        int maxValue = Collections.max(map.values());
        List<Character> maxChars = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            if (map.get(c) == maxValue) {
                maxChars.add(c);
            }
        }

        if (maxChars.size() == 1) {
            System.out.println(Character.toUpperCase(maxChars.get(0)));
        } else {
            System.out.println("?");
        }
    }
    
}