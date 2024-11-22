package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
     * Retrieves an array of checked out books associated with the specified user ID. If the user
     * has no books checked out, the returned list will be empty. Since multiple households may
     * share a single account, the user ID is of the form "libraryID:userName".
     * e.g., "12345:John Doe"
     *
     * @param userId the ID of the user whose books are to be retrieved
     * @return an array of Book objects the user has checked out
     * 
     * Didn't enforce/validate the input userId String. So if the input is not
     * in the format of libraryID:userName, this API won't fail immediately,
     * and may not handle the error gracefully.
     */
    public Book[] getBooks(UserId userId) {
        return libraryService.getBooks(userId.getUserName(), userId.getLibraryID());        
    }
}
