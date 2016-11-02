public class NonSensor extends Sensor{
	
	private boolean pState;
	
	public NonSensor(Readable readFrom, int[] readFromPos, boolean pState){
		this.readFrom = readFrom;
		this.readFromPos = readFromPos;
		this.pState = pState;
	}
	
	public void update(){
		this.state = new boolean[]{pState};
	}
	
}