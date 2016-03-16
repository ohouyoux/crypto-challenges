package be.nitroxis.matasano;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Base64Test {

    @Test
    public void shouldConvertHexToBase64() {
        String hex = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f757"
          + "3206d757368726f6f6d";
        String result = Base64.hexToBase64(hex);

        assertThat(result)
          .isEqualTo("SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t");
    }
}
