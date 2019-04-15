package terrenoAgricola;

import java.util.concurrent.Semaphore;

public class Hectarea {
	private boolean isOcuped;
	private Semaphore semaphore;
	
	public Hectarea(boolean isOcuped, Semaphore semaphore) {
		super();
		this.isOcuped = isOcuped;
		this.semaphore = semaphore;
	}

	public boolean isOcuped() {
		return isOcuped;
	}

	public void setOcuped(boolean isOcuped) {
		this.isOcuped = isOcuped;
	}

	public Semaphore getSemaphore() {
		return semaphore;
	}

	public void setSemaphore(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
}
