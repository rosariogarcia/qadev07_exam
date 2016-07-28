package org.fundacionjala.exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to solve the Kata 2 of exam
 *
 * @author Rosario Garcia
 */
public class SearchEngine {

    private static final String WILDCARD = "_";
    private static final String REGEX_QE = "\\\\E.\\\\Q";
    private static final String REGEX_Q = "\\Q";
    private static final String REGEX_E = "\\E";
    private static final int NO_MATCH = -1;

    public static int find(String needle, String haystack) {
        String regNeedle = REGEX_Q + needle.replaceAll(WILDCARD, REGEX_QE) + REGEX_E;
        Matcher m = Pattern.compile(regNeedle).matcher(haystack);
        return !(m.find()) ? NO_MATCH : m.start();
    }
}
