public abstract class Sensor implements Component,Readable{
	
	public Readable readFrom;
	public int[] readFromPos;
	public boolean[] state;
	
	public boolean[] read(int[] pos){
		boolean[] out = new boolean[pos.length];
		int i = 0;
		for(int x : pos){
			out[i] = state[x];
		}
		return out;
	}
	
	public boolean read(int pos){ // must deal wih ArrayIndexOutOfBoundsException at higher level
		return state[pos];
	}
	
	abstract public void update();
	
	
}