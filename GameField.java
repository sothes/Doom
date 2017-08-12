public class GameField
{
	private String Field;
	public GameTile[][] Level;
	private int Breite=10;
	GameField(){
		Field = "##########"+
				"#        #"+
				"##   ## ##"+
				"### ######"+
				"##########";
		toArray();
		System.out.println(12);
	}
	
	void toArray(){
		Level=new GameTile[5][10];
		int x;
		int y=0;
		int b =0;
		int i=0;
			for(x=0;x<5;x++){
				for(y=0;y<10;y++){
					if(String.valueOf(Field.charAt(i)).equals(" ")){
						Level[x][y]=new EmptyTile();
					}
					if(String.valueOf(Field.charAt(i)).equals("#")){
						Level[x][y]=new WallTile();
					}
					i++;
			}
		}
	}

	@Override
	public String toString()
	{
		String s="";
		for(int i=0;i<5;i++){
			s=s+"\n";
			for(int a=0;a<10;a++){
				s=s+Level[i][a].toString();
			}
		}
		return s;
	}
	
}
