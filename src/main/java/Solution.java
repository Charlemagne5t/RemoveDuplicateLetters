import java.util.*;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        int[] count = new int[26];
        for (char ch : array) {
            count[ch - 'a']++;
        }
        boolean[] visited = new boolean[26];

        for (char ch : array) {
            count[ch - 'a']--;
            if(visited[ch- 'a']){
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > ch && count[stack.peek() -'a'] > 0){
                visited[stack.peek() - 'a'] = false;
                stack.pop();
            }
            stack.push(ch);
            visited[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }
}
