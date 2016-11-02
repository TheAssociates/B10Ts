import java.util.*;

public class Test{
	
	public static void main(String[]args){
		NonSensor aa = new NonSensor(false);
		NonSensor ab = new NonSensor(true);
		Gate a = new Gate(new Readable[]{aa,ab},new int[][]{new int[]{0},new int[]{0}},pRule.OR.rule);
		Memory c = new Memory(1);
		Connection b = new Connection(a, new int[]{0}, c, new int[]{0});
		NoMouthMustScream d = new NoMouthMustScream(c,new int[]{0},"hello world");
		
		System.out.println(Arrays.toString((pRule.OR.rule.a(new boolean[]{false,true}))));

		
		
		Chip e = new Chip(new Component[]{aa,ab,a,b,c,d});
		e.tick();
		e.tick();
		e.tick();
		e.tick();
		e.tick();
		
	}
}