import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for LogAnalyzer.
 */
public class LogAnalyzerTest {
    @Test
    public void testParseLogFile() {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        File logFile = new File("log.txt");
        try {
            List<LogEntry> logEntries = logAnalyzer.parseLogFile(logFile);
            assertNotNull(logEntries);
            assertEquals(10, logEntries.size());
        } catch (FileNotFoundException e) {
            fail("Error parsing log file: " + e.getMessage());
        }
    }
}