import java.util.*;

public class Test{
	
	public static void main(String[]args){
		
		NonSensor aa = new NonSensor(false);
		NonSensor ab = new NonSensor(true);
		Gate a = new Gate(new Readable[]{aa,ab},new int[][]{new int[]{0},new int[]{0}},pRule.OR.rule);
		Gate ac = new Gate(new Readable[]{a}, new int[][]{new int[]{0}}, pRule.NOT.rule);
		Memory c = new Memory(1);
		Connection b = new Connection(ac, new int[]{0}, c, new int[]{0});
		NoMouthMustScream d = new NoMouthMustScream(c,new int[]{0},"hello world");
		
		Chip e = new Chip(new Component[]{aa,ab,a,ac,b,c,d});
		e.tick();
		
	}
}