package com.bytelegend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Convert all comments in this class to Javadoc with standard Javadoc tags: @author @see @return @throws
 * Feel free to put your own name into "author" tag, because you are the author of this code.
 *
 * @Author: James Kinder
 * @See: https://github.com/ByteLegendQuest/java-write-javadoc/blob/main/src/main/java/com/bytelegend/ChallengeEn.java
 */
public class ChallengeEn {
    /**
     * Read a text file with UTF-8 encoding and return its content.
     *
     * @Param filePath: path of the file to be read
     * @Return: the content string of the text file
     * @Throws IOException upon failures
     */
    public static String readUtf8Text(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
