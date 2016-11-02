import java.util.HashMap;
import java.util.ArrayList;

public enum pRule{
	
	NOT (new boolean[][][]{
			new boolean[][]{
				new boolean[]{true},new boolean[]{false}	
			},
			new boolean[][]{
				new boolean[]{false},new boolean[]{true}
			}
		}),

	OR (new boolean[][][]{
			new boolean[][]{
				new boolean[]{true,true},new boolean[]{true}	
			},
			new boolean[][]{
				new boolean[]{false,false},new boolean[]{false}
			},
			new boolean[][]{
				new boolean[]{true,false},new boolean[]{true}	
			},
			new boolean[][]{
				new boolean[]{false,true},new boolean[]{true}	
			}			
		}),
		
	XOR (new boolean[][][]{
			new boolean[][]{
				new boolean[]{true,true},new boolean[]{false}	
			},
			new boolean[][]{
				new boolean[]{false,false},new boolean[]{false}
			},
			new boolean[][]{
				new boolean[]{true,false},new boolean[]{true}	
			},
			new boolean[][]{
				new boolean[]{false,true},new boolean[]{true}	
			}			
		}),
		
	AND (new boolean[][][]{
			new boolean[][]{
				new boolean[]{true,true},new boolean[]{true}	
			},
			new boolean[][]{
				new boolean[]{false,false},new boolean[]{false}
			},
			new boolean[][]{
				new boolean[]{true,false},new boolean[]{false}	
			},
			new boolean[][]{
				new boolean[]{false,true},new boolean[]{false}	
			}			
		});
		
	
	
	
	public Rule rule;
	
	pRule(boolean[][][] ruleSet){
		HashMap<ArrayList<Boolean>,ArrayList<Boolean>> rmap = new HashMap<ArrayList<Boolean>,ArrayList<Boolean>>();
		for(boolean[][] x : ruleSet){
			rmap.put(Rule.bTB(x[0]),Rule.bTB(x[1]));
		}
		this.rule = new Rule(rmap);
	}
	
}