package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
     * Retrieves an array of checked out books associated with the specified user ID. If the user
     * has no books checked out, the returned list will be empty. Since multiple households may
     * share a single account, the user ID is of the form "libraryID:userName".
     * e.g., "12345:John Doe"
     *
     * @param name the name of the user
     * @param id the library ID of the user
     * @return an array of Book objects the user has checked out
     * @throws IllegalArgumentException if the name or id is null or blank
     */
    public Book[] getBooks(String name, String id) {
        if (name == null || name.isBlank() || id == null || id.isBlank()) {
            throw new IllegalArgumentException("Both name and id must be non-null and non-blank.");
        }
        return libraryService.getBooks(name, id);
    }
}
