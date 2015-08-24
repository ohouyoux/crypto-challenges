package be.nitroxis.matasano;

import com.google.common.base.Preconditions;

/**
 * Utility class for hexadecimal encoding.
 *
 * @author Olivier Houyoux (a590568)
 */
public class Hex {

    /**
     * Converts an array of characters representing hexadecimal values into an array of bytes of those same values.
     *
     * @param data an array of characters containing hexadecimal digits
     * @return A byte array containing binary data decoded from the supplied char array.
     * @throws IllegalArgumentException if an odd number of characters or any illegal values are supplied
     */
    public byte[] decode(final char[] data) {
        Preconditions.checkArgument(data.length % 2 == 0, "Odd number of characters");

        // returned array will be half the length of the passed array, as it takes two characters to represent any
        // given byte
        byte[] out = new byte[data.length >> 1];

        // two characters form the hex value.
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
}
