package terrenoAgricola;

import java.util.List;

public class Hermano extends Thread{
	private  List<Hectarea> field;
	
	public Hermano(List<Hectarea> field) {
		this.field = field;
	}
	
	@Override
	public void run() {
		
	}
}
