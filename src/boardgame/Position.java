package boardgame;

public class Position {

	private Integer row;
	private Integer column;
	
	public Position() {
		
	}

	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumm() {
		return column;
	}

	public void setColumm(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}


