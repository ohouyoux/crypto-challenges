package be.nitroxis.matasano;

import java.io.UnsupportedEncodingException;

/**
 * Utility class used to compute the Hamming distance.
 *
 * @author Olivier Houyoux
 * @see https://en.wikipedia.org/wiki/Hamming_distance
 */
public final class Hamming {

    /**
     * Computes the Hamming distance between two {@code String}s.
     *
     * @param s1 the first {@code String}
     * @param s2 the second {@code String} (must have the same length as {@code s1})
     * @return the Hamming distance
     */
    public static int getDistance(final String s1, final String s2) {
        try {
            return getDistance(s1.getBytes("UTF-8"), s2.getBytes("UTF-8"));
        } catch (final UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Computes the Hamming distance between two byte arrays.
     *
     * @param b1 the first byte array
     * @param b2 the second byte array (must have the same size as {@code b1})
     * @return the Hamming distance
     */
    public static int getDistance(final byte[] b1, final byte[] b2) {
        int distance = 0;
        int min = Math.min(b1.length, b2.length);
        int max = Math.max(b1.length, b2.length);

        for (int i = 0; i < min; i++) {
            int xor = b1[i] ^ b2[i];
            distance += Integer.bitCount(xor);
        }
    
        distance += 8 * (max - min);
    
        return distance;
    }

    private Hamming() {
        // Does nothing
    }
}
