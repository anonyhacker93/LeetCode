import java.util.HashMap;

class RomanToInt {
    static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);

        map.put("XL", 40);
        map.put("XC", 90);

        map.put("CD", 400);
        map.put("CM", 900);

        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i > 0) {
                String a = s.substring(i - 1, i + 1);
                if (map.containsKey(a)) {
                    sum = sum + map.get(a);
                    i--;
                } else {
                    String key = Character.toString(s.charAt(i));
                    sum = sum + map.get(key);
                }
            } else {
                String key = Character.toString(s.charAt(i));
                sum = sum + map.get(key);
            }

        }
        return sum;
    }
}
