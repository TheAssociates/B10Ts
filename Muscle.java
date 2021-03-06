public abstract class Muscle implements Component{
	
	public Readable readFromMem;
	public int[] readFromPos;
	public boolean[] state;
	
	private void readState(){
		state = readFromMem.read(readFromPos);
		
	}
	
	abstract public void work();
	
	public void update(){
		readState();
		work();
	}
}