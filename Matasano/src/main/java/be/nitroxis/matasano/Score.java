package be.nitroxis.matasano;

/**
 * Scores a piece of data.
 *
 * @author Olivier Houyoux
 */
public class Score {

    /**
     * Scores a piece of data, trying to figure out if it's plain English text.
     *
     * @param data the data to score
     * @return the score
     */
    public int getScore(final byte[] data) {
        int score = 0;

        for (int i = 0; i < data.length; i++) {
            boolean isEnglish = isEnglish(data[i]);

            if (isEnglish) {
                score++;
            }
        }

        return score;
    }

    private boolean isEnglish(final byte c) {
        return (c >= '0' && c <= '9')
               || (c >= 'a' && c <= 'z')
               || (c >= 'A' && c <= 'Z')
               || c == ' ';
    }
}
