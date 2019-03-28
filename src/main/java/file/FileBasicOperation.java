package file;

import java.io.File;

/**
 * Basic operations with file.
 */
public interface FileBasicOperation {

    /**
     * Upload file in storage on given path.
     *
     * @param file file which we want to upload
     * @param path path of the file on the storage
     */
    void uploadFile(File file, String path);

    /**
     * Download file from storagePath to location specified with(path).
     *
     * @param path        where we want to upload file
     * @param storagePath where file is located
     */
    void downlaodFile(String path, String storagePath);

}
