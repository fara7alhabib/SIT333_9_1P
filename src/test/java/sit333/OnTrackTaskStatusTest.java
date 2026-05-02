package sit333;

import org.junit.Assert;
import org.junit.Test;

public class OnTrackTaskStatusTest {

    @Test
    public void testCompletedStatus() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();

        String result = statusChecker.checkStatus("223803449", "9.1P", "Completed");

        Assert.assertEquals("9.1P is completed", result);
    }

    @Test
    public void testNeedsImprovementStatus() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();

        String result = statusChecker.checkStatus("223803449", "9.1P", "Needs Improvement");

        Assert.assertEquals("9.1P needs improvement. Please check tutor feedback and resubmit", result);
    }

    @Test
    public void testSubmittedStatus() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();

        String result = statusChecker.checkStatus("223803449", "9.1P", "Submitted");

        Assert.assertEquals("9.1P has been submitted and is waiting for tutor review", result);
    }

    @Test
    public void testNotSubmittedStatus() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();

        String result = statusChecker.checkStatus("223803449", "9.1P", "");

        Assert.assertEquals("Task has not been submitted yet", result);
    }

    @Test
    public void testInvalidStudentId() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();

        String result = statusChecker.checkStatus("", "9.1P", "Submitted");

        Assert.assertEquals("Invalid student ID", result);
    }

    @Test
    public void testInvalidTaskName() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();

        String result = statusChecker.checkStatus("223803449", "", "Submitted");

        Assert.assertEquals("Invalid task name", result);
    }
}