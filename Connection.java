public class Connection extends Component{
	
	private Readable readFrom;
	private int[] readFromPos;
	
	private Memory writeTo;
	private int[] writeToPos;
	
	private boolean[] state;
	
	public void update(){
		writeTo.write(writeToPos, readFrom.read(readFromPos));
	}
	
}