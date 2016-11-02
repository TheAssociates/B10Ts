public class NonSensor extends Sensor{
	
	private boolean pState;
	
	public NonSensor (boolean pState){
		this.pState = pState;
	}
	
	public void update(){
		this.state = new boolean[]{pState};
	}
	
}