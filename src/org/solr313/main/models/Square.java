public class Square {

	private int xCoord;         // x coordinate of the square on the Board
	private int yCoord;         // y coordinate of the square on the Board
	private String color;       // 'black' or 'white'
	
	public Square(int x, int y, String c) {
		this.xCoord = x;
		this.yCoord = y;
		this.color = c;
	}
	
	public int getX() {
		return this.xCoord;
	}
	
	public void setX(int x) {
		this.xCoord = x;
	}
	
	public int getY() {
		return this.yCoord;
	}
	
	public void setY(int y) {
		this.yCoord = y;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String c) {
		this.color = c;
	}

}