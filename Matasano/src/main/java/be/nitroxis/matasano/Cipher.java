package be.nitroxis.matasano;

/**
 * Defines a cipher operations.
 *
 * @author Olivier Houyoux
 * @param <R> the type of raw data being encrypted
 * @param <E> the type of encrypted data
 */
public interface Cipher<R, E> {

    /**
     * Encrypts a message.
     *
     * @param raw the message to be encrypted
     */
    void encrypt(R raw);

    /**
     * Decrypts a message.
     *
     * @param encrypted the encrypted message
     * @return the decrypted message
     */
    R decrypt(E encrypted);
}
