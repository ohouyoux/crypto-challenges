package be.nitroxis.matasano.script

/**
 * Utility class for the exclusive disjunction function.
 *
 * @author Olivier Houyoux
 * @see https://en.wikipedia.org/wiki/Exclusive_or
 */
class Xor {

    /**
     * Applies the exclusive disjunction function to the given {@code String}s.
     *
     * @param s1 the first {@code String}
     * @param s2 the second {@code String} used in the function
     * @return the result of the exclusive disjunction function
     */
    static String apply(String s1, String s2) {
        def b1 = s1.decodeHex()
        def b2 = s2.decodeHex()
        
        apply(b1, b2).encodeHex()
    }

    /**
     * Applies the exclusive disjunction function to the given arrays of bytes.
     *
     * @param b1 the first array of bytes
     * @param b2 the second array of bytes used in the function
     * @return the result of the exclusive disjunction function
     */
    static byte[] apply(byte[] b1, byte[] b2) {
        def shorter = b1.length < b2.length ? b1 : b2;
        def longer = b1.length < b2.length ? b2 : b1;
        def result = new byte[longer.length];
        longer.eachWithIndex() {
          v, i -> result[i] = v ^ shorter.getAt(i % shorter.length)
        }

        result
    }
}
