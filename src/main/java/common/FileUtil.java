package common;

import java.io.File;

/**
 * Contains some helper methods for working with files.
 */
public final class FileUtil {

    private FileUtil() {

    }

    /**
     * @param archivePath where to storage archive
     * @param files       list of files you want in archive
     */
    public static void zip(String archivePath, File... files) {
        System.out.println("Perform zip operation");
    }

}
