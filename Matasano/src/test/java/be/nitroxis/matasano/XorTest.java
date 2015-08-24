package be.nitroxis.matasano;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class XorTest {

    private final Xor systemUnderTest = new Xor();

    @Test
    public void shouldApplyExclusiveDisjunction() {
        Hex hex = new Hex();
        byte[] data1 = hex.decode("1c0111001f010100061a024b53535009181c".toCharArray());
        byte[] data2 = hex.decode("686974207468652062756c6c277320657965".toCharArray());
        char[] result = hex.encode(systemUnderTest.apply(data1, data2));

        assertThat(new String(result)).isEqualTo("746865206b696420646f6e277420706c6179");
    }
}
