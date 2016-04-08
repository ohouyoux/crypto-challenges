package be.nitroxis.matasano;

/**
 * Utility class for the exclusive disjunction function.
 *
 * @author Olivier Houyoux
 * @see https://en.wikipedia.org/wiki/Exclusive_or
 */
public final class Xor {

    /**
     * Applies the exclusive disjunction function to the given {@code String}s.
     *
     * @param first the first {@code String}
     * @param second the second {@code String} used in the function
     * @return the result of the exclusive disjunction function
     */
    public static String apply(final String first, final String second) {
      byte[] data1 = Hex.decode(first.toCharArray());
      byte[] data2 = Hex.decode(second.toCharArray());
      char[] result = Hex.encode(apply(data1, data2));

      return new String(result);
    }

    /**
     * Applies the exclusive disjunction function to the given byte arrays.
     *
     * @param first the first byte array
     * @param second the second byte array used in the function
     * @return the result of the exclusive disjunction function
     */
    public static byte[] apply(final byte[] first, final byte[] second) {
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

    private Xor() {
      // Does nothing
    }
}
