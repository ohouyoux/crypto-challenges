package be.nitroxis.matasano.script

/**
 * Utility class for Base64 encoding.
 *
 * @author Olivier Houyoux
 * @see https://en.wikipedia.org/wiki/Base64
 */
class Base64 {

    /**
     * Converts an hexadecimal {@code String} into it's Base64 representation.
     *
     * @param hex the hexadecimal {@code String} to be converted
     * @return the Base64 {@code String}
     * @see https://en.wikipedia.org/wiki/Hexadecimal
     */
    static String hexToBase64(String hex) {
        hex.decodeHex().encodeBase64().toString()
    }
}
