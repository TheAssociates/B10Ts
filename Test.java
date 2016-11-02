import java.util.*;

public class Test{
	
	public static void main(String[]args){
		NonSensor aa = new NonSensor(true);
		HashMap<ArrayList<Boolean>,ArrayList<Boolean>> NOT = new HashMap<ArrayList<Boolean>,ArrayList<Boolean>>();
		NOT.put(Rule.bTB(new boolean[]{true}),Rule.bTB(new boolean[]{false}));
		NOT.put(Rule.bTB(new boolean[]{false}),Rule.bTB(new boolean[]{true}));
		Rule r = new Rule(NOT);
		Gate a = new Gate(new Readable[]{aa},new int[][]{new int[]{0}},r);
		Memory c = new Memory(1);
		Connection b = new Connection(a, new int[]{0}, c, new int[]{0});
		NoMouthMustScream d = new NoMouthMustScream(c,new int[]{0},"hello world");
		
		

		
		
		Chip e = new Chip(new Component[]{aa,a,b,c,d});
		e.tick();
		e.tick();
		e.tick();
		e.tick();
		e.tick();
		
	}
}