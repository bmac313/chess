import java.util.ArrayList;

public abstract class Piece {
	
	private String name;                        // individual identifier for the piece (e.g. pawn1, pawn2, knight1 etc.)
	private String color;                       // 'black' or 'white'
	private boolean captured;                   // set to true if piece is captured and removed from board
	private Square location;                    // instance of class 'Square' containing the piece's location data
	private int maxSquares;                     // maximum number of squares the piece can move in a turn
	private ArrayList<String> legalDirections;  // lists the directions the piece can move in String format
	
	public Piece(String n, String c, boolean cap, Square loc, int ms, ArrayList<String> ld) {
		this.name = n;
		this.color = c;
		this.captured = cap;
		this.location = loc;
		this.maxSquares = ms;
		this.legalDirections = ld;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(int c) {
		this.maxSquares = maxSquares;
	}
	
	public boolean isCaptured() {
		return this.captured;
	}
	
	public void setCaptured(boolean cap) {
		this.captured = cap;
	}
	
	public Square getLocation() {
		return this.location;
	}
	
	public void setLocation(Square loc) {
		this.location = loc;
	}
	
	public int getMaxSquares() {
		return this.maxSquares;
	}
	
	public void setMaxSquares(int maxSquares) {
		this.maxSquares = maxSquares;
	}
	
	public ArrayList<String> getLegalDirections() {
		return this.legalDirections;
	}
	
	public void setLegalDirections(ArrayList<String> ld) {
		this.legalDirections = ld;
	}
	
}