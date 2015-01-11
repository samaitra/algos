package com.careercup;

/**
 * Created by saikat on 03/01/15.
 * Given a regular expression with characters a-z, ' * ', ' . '
 the task was to find if that string could match another string with characters from: a-z
 where ' * ' can delete the character before it, and ' . ' could match whatever character.
 ' * ' always appear after a a-z character.
 Example:
 isMatch("a*", "") = true;
 isMatch(".", "") = false;
 isMatch("ab*", "a") = true;
 isMatch("a.", "ab") = true;
 isMatch("a", "a") = true;
 */
public class RegexMatcher {


    static boolean isMatch(String regex, String s)
    {
        return checkMatch(regex, s, regex.length() - 1, s.length() - 1);
    }

    static boolean checkMatch(String regex, String s, int i, int j)
    {
        if (i < 0)
        {
            return j < 0;
        }

        boolean result = false;

        if (j >= 0)
        {
            if (regex.charAt(i) == '.' || regex.charAt(i) == s.charAt(j))
                result |= checkMatch(regex, s, i - 1, j - 1);
        }

        if (regex.charAt(i) == '*')
            result |= checkMatch(regex, s, i - 2, j);

        return result;
    }

    public static void main(String args[]){
        RegexMatcher regexMatcher = new RegexMatcher();
        System.out.print(regexMatcher.isMatch("a.", "an"));
    }
}
