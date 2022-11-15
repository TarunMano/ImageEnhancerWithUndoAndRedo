import java.awt.image.BufferedImage;


public class BufferedImageStack {
	
	BufferedImage[] stack;
	int track = 0;
		
	
	public void push(BufferedImage image) {
		if(track < stack.length ) {
			stack[track] = image;
			track++;
		}
		else {
			BufferedImage[] temp = new BufferedImage[stack.length*2];
			stack = temp;
		}
		
	}
	public void pop() {
		
	}
	public boolean isEmpty() {
		return false;
		
	}
	public BufferedImage get(int index) {
		return null;
		
	}
	public int getSize() {
		return stack.length;
		
	}
	public int getArraySize() {
		return 0;
		
	}
}
