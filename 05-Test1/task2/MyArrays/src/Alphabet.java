public class Alphabet {
    public static boolean isAlphabet(String t){
        int current = 0;
        for (int i=0 ; i<t.length() ; i++)
        {
            if (current > (int)t[i]) return false;
        }

        return true;
    }
}
