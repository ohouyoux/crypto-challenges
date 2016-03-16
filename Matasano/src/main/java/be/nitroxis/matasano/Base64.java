package be.nitroxis.matasano;

import sun.misc.BASE64Encoder;

/**
 * Utility class for Base64 encoding.
 *
 * @author Olivier Houyoux
 * @see https://en.wikipedia.org/wiki/Base64
 */
public class Base64 {

    /**
     * Converts an hexadecimal {@code String} into it's Base64 representation.
     *
     * @param hex the hexadecimal {@code String} to be converted
     * @return the Base64 {@code String}
     * @see https://en.wikipedia.org/wiki/Hexadecimal
     */
    public String hexToBase64(final String hex) {
        char[] characters = hex.toCharArray();
        byte[] data = new Hex().decode(characters);

        // TODO use java.util.Base64 from Java 8
        BASE64Encoder encoder = new BASE64Encoder();

        return encoder.encode(data);
    }
}
