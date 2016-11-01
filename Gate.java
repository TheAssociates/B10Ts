public class Gate extends Component implements Readable{
	
	Readable[] readFrom;
	int[][] readFromPos;
	
	Rule rule;
	boolean[] state;
	
	public Gate(Readable[] readFr, int[][] readFrPos,Rule r){
		readFrom = readFr;
		readFromPos = readFrPos;
		rule = r;
	}
	
	
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
	
}