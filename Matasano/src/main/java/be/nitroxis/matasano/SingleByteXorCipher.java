package be.nitroxis.matasano;

/**
 * A decoder of hex encoded string with one single character XOR.
 *
 * @author Olivier Houyoux
 */
public class SingleByteXorCipher implements Cipher<String, String> {

    @Override
    public void encrypt(final String raw) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public String decrypt(final String hex) {
        String decrypted = "";
        byte[] encrypted = new Hex().decode(hex.toCharArray());
        Xor xor = new Xor();
        Score<byte[]> score = new ByteScore();
        int result = 0;

        for (char c = 0; c < 255; c++) {
            byte[] guess = new byte[] { (byte) c, };
            byte[] decoded = xor.apply(encrypted, guess);
            int currentScore = score.getScore(decoded);

            if (currentScore > result) {
                result = currentScore;
                decrypted = new String(decoded);
            }
        }

        return decrypted;
    }
}
