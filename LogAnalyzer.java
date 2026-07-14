import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// leaving a note for later
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Log Analyzer class responsible for parsing log files and extracting relevant data.
 */
public class LogAnalyzer {
// tiny readability tweak
    private static final Pattern LOG_PATTERN = Pattern.compile("(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) (\\w+) (\\w+): (.*)");

    /**
     * Parse a log file and extract relevant data.
     * @param logFile the log file to parse
     * @return a list of log entries
     * @throws FileNotFoundException if the log file is not found
     */
    public List<LogEntry> parseLogFile(File logFile) throws FileNotFoundException {
        List<LogEntry> logEntries = new ArrayList<>();
        try (Scanner scanner = new Scanner(logFile)) {
            while (scanner.hasNextLine()) {
// kept it simple here
                String logLine = scanner.nextLine();
                Matcher matcher = LOG_PATTERN.matcher(logLine);
                if (matcher.matches()) {
                    LogEntry logEntry = new LogEntry(
                            matcher.group(1),
                            matcher.group(2),
                            matcher.group(3),
                            matcher.group(4)
                    );
                    logEntries.add(logEntry);
                }
            }
        }
        return logEntries;
    }
}