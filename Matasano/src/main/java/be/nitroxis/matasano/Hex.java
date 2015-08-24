package be.nitroxis.matasano;

import com.google.common.base.Preconditions;

/**
 * Utility class for hexadecimal encoding.
 *
 * @author Olivier Houyoux
 */
public class Hex {

    private static final char[] DIGITS = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };

    /**
     * Converts an array of characters representing hexadecimal values into an array of bytes of those same values.
     *
     * @param data an array of characters containing hexadecimal digits
     * @return A byte array containing binary data decoded from the supplied char array
     */
    public byte[] decode(final char[] data) {
        Preconditions.checkArgument(data.length % 2 == 0, "Odd number of characters");

        // Returned array will be half the length of the passed array, as it takes two characters to represent any
        // given byte
        byte[] out = new byte[data.length >> 1];

        // two characters form the hex value
        for (int i = 0, j = 0; j < data.length; i++) {
            int f = toDigit(data[j]) << 4;
            j++;

            f |= toDigit(data[j]);
            j++;

            out[i] = (byte) (f & 0xFF);
        }

        return out;
    }

    private int toDigit(final char ch) {
        int digit = Character.digit(ch, 16);

        if (digit == -1) {
            throw new IllegalArgumentException("Illegal hexadecimal character " + ch);
        }

        return digit;
    }

    /**
     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.
     *
     * @param data the array of bytes to convert to hexadecimal characters
     * @return the array of characters containing hexadecimal values
     */
    public char[] encode(final byte[] data) {
        // Returned array will be twice the length of the passed array, as it takes two characters to represent any
        // given byte
        char[] out = new char[data.length << 1];

        // two characters form the hex value
        for (int i = 0, j = 0; i < data.length; i++) {
            out[j] = DIGITS[(0xF0 & data[i]) >>> 4];
            j++;

            out[j] = DIGITS[0x0F & data[i]];
            j++;
        }

        return out;
    }
}
