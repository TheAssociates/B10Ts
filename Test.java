public class Test{
	
	public static void main(String[]args){
		NonSensor a = new NonSensor(true);
		Memory c = new Memory(1);
		Connection b = new Connection(a, new int[]{0}, c, new int[]{0});
		NoMouthMustScream d = new NoMouthMustScream(c,new int[]{0},"hello world");
		Chip e = new Chip(new Component[]{a,b,c,d});
		e.tick();
		e.tick();
		e.tick();
		e.tick();
		e.tick();
		
	}
}