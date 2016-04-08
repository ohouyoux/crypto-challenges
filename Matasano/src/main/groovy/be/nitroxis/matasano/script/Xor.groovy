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
        def shorter = s1.size() < s2.size() ? s1.decodeHex() : s2.decodeHex();
        def longer = s1.size() < s2.size() ? s2.decodeHex() : s1.decodeHex();
        def result = new byte[longer.length];
        longer.eachWithIndex() {
          v, i -> result[i] = v ^ shorter.getAt(i % shorter.length)
        }

        result.encodeHex()
    }
}
