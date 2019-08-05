import java.util.*;

public class Dfs {
    public static void main(String[] args) {
        dfs("");
        stack("");
    }

    public static void dfs(String now) {
        if (now.length() == 3) {
            System.out.println(now);
            return;
        } else {
            for (int i = 1; i >= 0; i--) {
                String next = now + Integer.toString(i);
                dfs(next);
            }
        }
    }

    public static void stack(String s) {
        Deque<String> st = new ArrayDeque<>();
        st.push(s);
        while (!st.isEmpty()) {
            String now = st.poll();
            if (now.length() == 3) {
                System.out.println(now);
            } else {
                for (int i = 1; i >= 0; i--) {
                    String next = now + Integer.toString(i);
                    st.push(next);
                }
            }
            // System.out.println(st);
        }
    }

}
