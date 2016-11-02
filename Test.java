public class Test{
	
	public static void main(String[]args){
		NonSensor a = new NonSensor(true);
		NoMouthMustScream b = new NoMouthMustScream(a,new int[]{0},"hello world");
		Chip c = new Chip(new Component[]{a,b});
		c.tick();
		c.tick();
		c.tick();
		c.tick();
		c.tick();
		
	}
}