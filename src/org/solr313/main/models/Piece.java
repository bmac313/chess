package org.solr313.main.models;

import java.util.HashMap;

public abstract class Piece {
	
	private String name;
	private int maxSquares;
	private HashMap moveRoute;
	
	public Piece(String n, int ms, HashMap mr) {
		this.name = n;
		this.maxSquares = ms;
		this.moveRoute = mr;
	}
	
	public int getMaxSquares() {
		return maxSquares;
	}
	
	public void setMaxSquares(int maxSquares) {
		this.maxSquares = maxSquares;
	}
	
	public HashMap getMoveRoute() {
		return moveRoute;
	}
	
	public void setMoveRoute(HashMap moveRoute) {
		this.moveRoute = moveRoute;
	}
	
}