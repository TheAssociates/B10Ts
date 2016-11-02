public class Chip{
	
	private Component[] parts;
	
	public Chip(Component[] prts ){
		parts = prts;
	}
	
	public void tick(){
		for(int i = 0; i < parts.length; i++){
			for(Component x : parts) x.update();
		} 
	}
	
}