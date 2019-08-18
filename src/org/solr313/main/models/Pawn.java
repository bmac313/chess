import java.util.ArrayList;

public class Pawn extends Piece {
	
	public Pawn(String n, String c, boolean cap, Square loc, int ms, ArrayList<String> ld) {
		super(n, c, cap, loc, ms, ld);
		ld.add("up");
		ld.add("dx-up-left");
		ld.add("dx-up-right");
	}
	
}