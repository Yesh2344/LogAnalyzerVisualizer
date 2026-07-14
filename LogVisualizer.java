import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Log Visualizer class responsible for visualizing log data.
 */
public class LogVisualizer {
    /**
     * Visualize log data using a bar chart.
     * @param logEntries the log entries to visualize
     */
    public void visualizeLogData(List<LogEntry> logEntries) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (LogEntry logEntry : logEntries) {
            dataset.addValue(1, logEntry.getLevel(), logEntry.getTimestamp());
        }
        JFreeChart chart = ChartFactory.createBarChart(
                "Log Data",
                "Timestamp",
                "Count",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        ChartFrame chartFrame = new ChartFrame("Log Data", chart);
        chartFrame.pack();
        chartFrame.setVisible(true);
    }
}