import java.util.*;

public class Rule{
	
	private HashMap<ArrayList<Boolean>,ArrayList<Boolean>> definition;
	
	public Rule(HashMap<ArrayList<Boolean>,ArrayList<Boolean>> def){
		definition = def;
		
	}
	
	public boolean[] a(boolean[] imp){
		
		return BTb(definition.get(bTB(imp)));
	}
	
	
	private static ArrayList<Boolean> bTB(boolean[] imp){
		ArrayList<Boolean> out = new ArrayList<Boolean>();
		for(boolean x : imp) out.add(new Boolean(x));
		return out;
	}
	
	private static boolean[] BTb(ArrayList<Boolean> imp){
		boolean[] out = new boolean[imp.size()];
		for(int i = 0; i < out.length; i++){
			out[i] = imp.get(i);
		}
		return out;
	}
	
	
	
	public static void main(String[]args){
		HashMap ORd = new HashMap<ArrayList<Boolean>,ArrayList<Boolean>>();
		ORd.put(bTB(new boolean[]{true,false}),bTB(new boolean[]{true}));
		ORd.put(bTB(new boolean[]{false,true}),bTB(new boolean[]{true}));
		ORd.put(bTB(new boolean[]{true,true}),bTB(new boolean[]{true}));
		ORd.put(bTB(new boolean[]{false,false}),bTB(new boolean[]{false}));
		Rule OR = new Rule(ORd);
		System.out.println(Arrays.toString(OR.a(new boolean[]{true,false})));
		
	}
}