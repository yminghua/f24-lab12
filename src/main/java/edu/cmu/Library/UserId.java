package edu.cmu.Library;

/**
 * Encapsulates the userId with libraryID and userName.
 */
public class UserId {
    private final String libraryID;
    private final String userName;

    public UserId(String libraryID, String userName) {
        if (libraryID == null || userName == null || libraryID.isBlank() || userName.isBlank()) {
            throw new IllegalArgumentException("LibraryID and userName must not be null or blank.");
        }
        this.libraryID = libraryID;
        this.userName = userName;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public String getUserName() {
        return userName;
    }
}
