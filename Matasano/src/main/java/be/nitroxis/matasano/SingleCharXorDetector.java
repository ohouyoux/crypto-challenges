package be.nitroxis.matasano;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Finds of the 60-character strings in this file has been encrypted by single-character XOR.
 *
 * @author Olivier Houyoux
 */
public class SingleCharXorDetector {

    public static void main(final String[] args) throws IOException {
        ClassLoader loader = SingleCharXorDetector.class.getClassLoader();
        String path = loader.getResource("4.txt").getFile();
        File file = new File(path);
        Cipher<String, String> cipher = new SingleByteXorCipher();
        Score<String> score = new StringScore();

        try (final Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String hex = scanner.nextLine();
                String decrypted = cipher.decrypt(hex);
                int result = score.getScore(decrypted);

                if (result == 1) {
                    System.out.println(decrypted);
                }
            }
        }
    }
}
