package terrenoAgricola;

import java.util.concurrent.Semaphore;

import javax.swing.JLabel;

public class Hectarea extends JLabel{
	private boolean isOcuped;
	private Semaphore semaphore;
	
	public Hectarea(String txt) {
		super(txt);
		this.isOcuped = false;
		this.semaphore = new Semaphore(1);
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
