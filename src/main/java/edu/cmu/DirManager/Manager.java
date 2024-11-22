package edu.cmu.DirManager;

/**
 * Manager for directory operations.
 */
public class Manager {
    private DirOps dirOps;

    /**
     * Creates a new directory at the specified path.
     * 
     * @param path the path where the new directory should be created
     * @throws DirectoryAlreadyExistsException if the directory already exists
     * @throws InvalidPathException if the specified path is invalid
     */
    public void newDirectory(String path) throws DirectoryAlreadyExistsException, InvalidPathException {
        if (dirOps.checkDirectoryExists(path)) {
            throw new DirectoryAlreadyExistsException("Directory already exists at path: " + path);
        } else if (!dirOps.checkPathValid(path)) {
            throw new InvalidPathException("The path is invalid: " + path);
        } else {
            dirOps.createDirectory(path);
        }
    }
}

/**
 * Exception thrown when attempting to create a directory that already exists.
 */
class DirectoryAlreadyExistsException extends Exception {
    public DirectoryAlreadyExistsException(String message) {
        super(message);
    }
}

/**
 * Exception thrown when the specified path is invalid.
 */
class InvalidPathException extends Exception {
    public InvalidPathException(String message) {
        super(message);
    }
}