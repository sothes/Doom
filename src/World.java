public class World

{
	private GameField Field;
	private String Canvas;
	
	World(){
		Field = new GameField();
		//Canvas=Field.convert2D();
	}
	
	private void draw(){
		System.out.println(Field.toString());
	}
	
}
