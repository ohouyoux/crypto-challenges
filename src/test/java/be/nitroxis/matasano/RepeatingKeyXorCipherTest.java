package be.nitroxis.matasano;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class RepeatingKeyXorCipherTest {
  
    private final RepeatingKeyXorCipher systemUnderTest = new RepeatingKeyXorCipher("ICE");

    @Test
    public void shouldDecryptEnglishSentence() {
        String result = systemUnderTest.encrypt("Burning 'em, if you ain't quick and nimble\nI go crazy when I hear a cymbal");

        assertThat(result).isEqualTo("0b3637272a2b2e63622c2e69692a23693a2a3c6324202d623d63343c2a26226324272765272a282b2f20430a652e2c652a3124333a653e2b2027630c692b20283165286326302e27282f");
    }
}
