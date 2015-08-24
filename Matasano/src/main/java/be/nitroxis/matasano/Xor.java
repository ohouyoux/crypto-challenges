package be.nitroxis.matasano;

/**
 * Utility class for the exclusive disjunction function.
 *
 * @author Olivier Houyoux
 * @see https://en.wikipedia.org/wiki/Exclusive_or
 */
public class Xor {

    /**
     * Applies the exclusive disjunction function to the given byte arrays.
     *
     * @param first the first byte array
     * @param second the second byte array used in the function
     * @return the result of the exclusive disjunction function
     */
    public byte[] apply(final byte[] first, final byte[] second) {
        int size = Math.max(first.length, second.length);
        byte[] result = new byte[size];
        boolean firstArgShorter = first.length < second.length;
        byte[] shorter = firstArgShorter ? first : second;
        byte[] longer = firstArgShorter ? second : first;

        for (int i = 0; i < longer.length; i++) {
            result[i] = (byte) (longer[i] ^ shorter[i % shorter.length]);
        }

        return result;
    }
}
