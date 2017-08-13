public class GameTile
{
	private Position location;
	
	GameTile(){
		location = new Position();
	}
	GameTile(Position pos){
		location= pos;
	}

	@Override
	public String toString()
	{
		return "";
	}
	
	
}
