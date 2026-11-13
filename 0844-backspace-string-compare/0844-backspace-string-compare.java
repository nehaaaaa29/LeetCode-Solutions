class Solution {
public boolean backspaceCompare(String s, String t) {
 
    StringBuilder ss = new StringBuilder();

    int n = 0;

    while (n < s.length()) {

        if (s.charAt(n) != '#') {
            ss.append(s.charAt(n));
        }
        else if (ss.length() > 0) {
            ss.deleteCharAt(ss.length() - 1);
        }

        n++;
    }
    StringBuilder tt= new StringBuilder();
    int k=0;
      while (k < t.length()) {

        if (t.charAt(k) != '#') {
            tt.append(t.charAt(k));
        }
        else if (tt.length() > 0) {
            tt.deleteCharAt(tt.length() - 1);
        }

        k++;
    }

return ss.toString().equals(tt.toString());
}
}

