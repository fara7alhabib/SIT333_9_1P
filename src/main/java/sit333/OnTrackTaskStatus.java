package sit333;

public class OnTrackTaskStatus {

    public String checkStatus(String studentId, String taskName, String status) {

        if (studentId == null || studentId.isEmpty()) {
            return "Invalid student ID";
        }

        if (taskName == null || taskName.isEmpty()) {
            return "Invalid task name";
        }

        if (status == null || status.isEmpty()) {
            return "Task has not been submitted yet";
        }

        if (status.equalsIgnoreCase("Completed")) {
            return taskName + " is completed";
        }

        if (status.equalsIgnoreCase("Needs Improvement")) {
            return taskName + " needs improvement. Please check tutor feedback and resubmit";
        }

        if (status.equalsIgnoreCase("Submitted")) {
            return taskName + " has been submitted and is waiting for tutor review";
            // trigger CI
        }

        return "Unknown task status";
    }
}
