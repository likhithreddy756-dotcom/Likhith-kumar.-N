import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashSet<String> groups = new HashSet<>();

        for (String s : str) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            groups.add(new String(ch));
        }

        System.out.println("Number of anagramic groups: " + groups.size());
    }
}

Output:

Number of anagramic groups: 3

Explanation:

- "eat", "tea", "ate" → one group
- "tan", "nat" → one group
- "bat" → one group

So, total 3 anagramic groups.
