public class Chip{
	
	private Component[] parts;
	
	public Chip(Component[] prts ){
		parts = prts;
	}
	
	public void tick(){
		for(Component x : parts) x.update();
	}
	
	
	
}