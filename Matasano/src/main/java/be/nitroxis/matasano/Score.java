package be.nitroxis.matasano;

/**
 * Scores a piece of data.
 *
 * @author Olivier Houyoux
 * @param <T> the type of data to score
 */
public interface Score<T> {

    /**
     * Scores a piece of data, trying to figure out if it's plain English text.
     *
     * @param data the data to score
     * @return the score
     */
    int getScore(byte[] data);
}
