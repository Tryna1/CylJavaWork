package work6;

public class Stopwatch {
	private long startTime;
	private long endTime;
	
	Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	
	public void start() { //将startTime改为当前时间
		startTime = System.currentTimeMillis();
	}
	public void end() { //将endTime改为当前时间
		endTime = System.currentTimeMillis();
	}
	
	public long getstartTime() {
		return startTime;
	}
	
	public long getendtTime() {
		return endTime;
	}
	
	public long getElapsedTime(){
		return endTime - startTime;
	}

	
}

