/**
 * Log Entry class representing a single log entry.
 */
public class LogEntry {
    private String timestamp;
    private String level;
    private String message;

    /**
     * Constructor for LogEntry.
     * @param timestamp the timestamp of the log entry
     * @param level the level of the log entry
     * @param message the message of the log entry
     */
    public LogEntry(String timestamp, String level, String message) {
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
    }

    // Getters and setters
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}