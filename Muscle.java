public abstract class Muscle extends Component{
	
	public Readable readFromMem;
	public int[] readFromPos;
	private boolean[] state;
	
	private void readState(){
		state = readFromMem.read(readFromPos);
		
	}
	
	abstract public void work();
	
}