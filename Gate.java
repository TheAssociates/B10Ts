public class Gate implements Component,Readable{
	
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
			out[i] = read(x);
		}
		return out;
	}
	
	public boolean read(int pos){ // must deal wih ArrayIndexOutOfBoundsException at higher level
		try{
			return state[pos];
		} catch (NullPointerException g){
			return false;
		}
		
	}
	
	public void update(){
		int o = 0;
		boolean[] input = new boolean[count2D(readFromPos)];
		for(int i = 0; i < readFrom.length; i++){
			for(int j = 0; j < readFromPos[i].length; j++){
				input[o++] = readFrom[i].read(readFromPos[i][j]);	
			}
		}
		state = rule.a(input);
	}
	
	private static int count2D(int[][] x){
		int o = 0;
		for(int[] y : x){
			for(int z : y){
				o++;
			}
		}
		return o;
	}
	
	
	
}