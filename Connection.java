public class Connection implements Component{
	
	private Readable readFrom;
	private int[] readFromPos;
	
	private Memory writeTo;
	private int[] writeToPos;
	
	public Connection(Readable readFrom,int[] readFromPos,Memory writeTo,int[] writeToPos){
		this.readFrom = readFrom;
		this.readFromPos = readFromPos;
		this.writeTo = writeTo;
		this.writeToPos = writeToPos;
	}
		
	public void update(){
		writeTo.write(writeToPos, readFrom.read(readFromPos));
	}
	
}