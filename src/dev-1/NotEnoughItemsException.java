public class NotEnoughItemsException extends Exception {
    /**
     * introduced there more than 3 options
     */
    public NotEnoughItemsException() {
        super();
    }

    public NotEnoughItemsException(String message) {
        super(message);
    }
}
