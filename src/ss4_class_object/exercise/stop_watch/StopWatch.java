package ss4_class_object.exercise.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    long getStartTime() {
        return this.startTime;
    }

    long getEndTime() {
        return this.endTime;
    }

    long Start() {
        return this.startTime = System.currentTimeMillis();
    }

    long Stop() {
        return this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
