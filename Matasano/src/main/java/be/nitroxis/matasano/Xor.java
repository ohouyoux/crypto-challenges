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
     * @param s1 the first {@code String}
     * @param s2 the second {@code String} used in the function
     * @return the result of the exclusive disjunction function
     */
    public static String apply(final String s1, final String s2) {
      byte[] data1 = Hex.decode(s1.toCharArray());
      byte[] data2 = Hex.decode(s2.toCharArray());
      char[] result = Hex.encode(apply(data1, data2));

      return new String(result);
    }

    /**
     * Applies the exclusive disjunction function to the given byte arrays.
     *
     * @param b1 the first byte array
     * @param b2 the second byte array used in the function
     * @return the result of the exclusive disjunction function
     */
    public static byte[] apply(final byte[] b1, final byte[] b2) {
        int size = Math.max(b1.length, b2.length);
        byte[] result = new byte[size];
        byte[] shorter = b1.length < b2.length ? b1 : b2;
        byte[] longer = b1.length < b2.length ? b2 : b1;

        for (int i = 0; i < longer.length; i++) {
            result[i] = (byte) (longer[i] ^ shorter[i % shorter.length]);
        }

        return result;
    }

    private Xor() {
      // Does nothing
    }
}
