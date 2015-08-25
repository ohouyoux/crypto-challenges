package be.nitroxis.matasano;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class SingleByteXorCipherTest {

    private final SingleByteXorCipher systemUnderTest = new SingleByteXorCipher();

    @Test
    public void shouldDecryptEnglishSentence() {
        String result = systemUnderTest.decrypt("1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736");

        assertThat(result).isEqualTo("Cooking MC's like a pound of bacon");
    }
}
