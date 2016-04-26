package be.nitroxis.matasano;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HammingTest {

  @Test
  public void shouldComputeDistanceCorrectly() {
      assertThat(Hamming.getDistance("this is a test", "wokka wokka!!!")).isEqualTo(37);
  }
}
