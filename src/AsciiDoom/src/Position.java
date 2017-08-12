public class Position
{
	private int xCord;
	private int yCord;
	
	Position(){
		xCord=1;
		yCord=1;
	}
	Position(int x, int y){
		xCord=x;
		yCord=y;
	}
	
	public void setXCord(int x){
		xCord=x;
	}
	public void setYCord(int y){
		yCord=y;
	}
	
	public int getXCord(){
		return xCord;
	}
	public int getYCord(){
		return yCord;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this.xCord==((Position)obj).xCord && this.yCord==((Position)obj).yCord)return true;
		else{return false;}
	}
	
	
}
