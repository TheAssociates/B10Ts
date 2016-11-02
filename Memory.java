public class Memory implements Component,Readable{

	private boolean[] state;
	
	
	public Memory(int size){
		state = new boolean[size];
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
		} catch (ArrayIndexOutOfBoundsException h){
			return false;
		}
		
	}
	
	public boolean write(int pos, boolean val){
		try {
			state[pos] = val;
			return true;
		} catch(ArrayIndexOutOfBoundsException g) {
			return false;
		}
	}
	
	public void write(int[] pos, boolean[] val){
		for(int i = 0; i < pos.length; i++){
			state[pos[i]] = val[i];
		}
	}
	
	public void wipe(){
		state = new boolean[state.length];
	}
	
	public void update(){}
	
	private int lcodeToInt(String alpha){
		alpha = alpha.toUpperCase();
		int out = 0;
		for(int i = 0; i < alpha.length(); i++){
			out = (((int)(alpha.charAt(i))- 'A' + 1) * (int)(Math.pow(26,alpha.length()-1-i)));
		}
		return out;
	}
	
}