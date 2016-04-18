package be.nitroxis.matasano;

import com.google.common.base.Preconditions;

/**
 * An encoder of hex encoded string with repeating character XOR.
 *
 * @author Olivier Houyoux
 */
public class RepeatingKeyXorCipher implements Cipher<String, String> {
  
    private final String key;
  
    /**
     * Instantiates a new {@code RepeatingKeyXorCipher}.
     *
     * @param key the key used for repeating-key XOR (must not be {@code null})
     */
    public RepeatingKeyXorCipher(final String key) {
        this.key = Preconditions.checkNotNull(key);
    }
  
    @Override
    public String encrypt(final String raw) {
        byte[] result = Xor.apply(raw.getBytes(), key.getBytes());
        char[] characters = Hex.encode(result);
        
        return String.valueOf(characters);
    }

    @Override
    public String decrypt(final String hex) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
