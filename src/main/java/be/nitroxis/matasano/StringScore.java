package be.nitroxis.matasano;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Scores a piece of data made of a string. It will always return one if the content to test is English text, zero
 * otherwise
 *
 * @author Olivier Houyoux
 */
public class StringScore implements Score<String> {

    private static final Pattern PATTERN = Pattern.compile("[a-zA-Z0-9\\s]+");

    @Override
    public int getScore(final String data) {
        Matcher matcher = PATTERN.matcher(data);

        return matcher.matches() ? 1 : 0;
    }
}
