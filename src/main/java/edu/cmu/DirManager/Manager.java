package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @return 0 if the directory creation was successful
     *        -1 if the directory already exists,
     *        -2 if the path is invalid
     * 
     * magic number, not self-explanatory, failure is not informatively.
     */
    public DirectoryCreationStatus newDirectory(String path) {
        if (dirOps.checkDirectoryExists(path)) {
            return DirectoryCreationStatus.DIRECTORY_ALREADY_EXISTS;
        } else if (!dirOps.checkPathValid(path)) {
            return DirectoryCreationStatus.INVALID_PATH;
        } else {
            dirOps.createDirectory(path);
            return DirectoryCreationStatus.SUCCESS;
        }
    }

    /**
     * Enum representing the status of a directory creation operation.
     */
    enum DirectoryCreationStatus {
        SUCCESS,                   // Directory creation was successful
        DIRECTORY_ALREADY_EXISTS,  // The directory already exists
        INVALID_PATH               // The specified path is invalid
    }
}
