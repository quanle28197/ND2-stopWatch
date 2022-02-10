public class StopWatch {

    private long starTime, stopTime;

    public StopWatch() {
        this.starTime = System.currentTimeMillis();
    }

    public long getStarTime() {
        return starTime;
    }

    public void start() {
        this.starTime = System.currentTimeMillis();
    }

    public long stopTime() {
       return  stopTime;
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }
    public int getElapsedTime() {
        return (int)(this.stopTime - this.starTime);
    }
}
