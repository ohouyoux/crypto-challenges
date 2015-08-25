package be.nitroxis.matasano;

/**
 * Scores a piece of data made of bytes.
 *
 * @author Olivier Houyoux
 */
public class ByteScore implements Score<byte[]> {

    @Override
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
