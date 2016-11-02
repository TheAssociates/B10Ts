public class NoMouthMustScream extends Muscle{
	
	private String message;
	
	public NoMouthMustScream(Readable readFromMem,int[] readFromPos, String message){
		this.readFromMem = readFromMem;
		this.readFromPos = readFromPos;
		this.message = message;
	}
	
	public void work(){
		System.out.println(message);
	}
}