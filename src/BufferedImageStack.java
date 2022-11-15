import java.awt.image.BufferedImage;
import java.util.Arrays;


public class BufferedImageStack {
	
	BufferedImage[] stack;
	int track = 0;
	public BufferedImageStack() {
		stack = new BufferedImage[2];
	}
	
	public void push(BufferedImage image) {
		if(track < stack.length ) {
			stack[track] = image;
			track++;
		}
		else {
			BufferedImage[] temp = Arrays.copyOf(stack, stack.length*2);
			stack = temp;
			stack[track] = image;
			track++;
		}
		
	}
	public BufferedImage pop() {
		BufferedImage removed = stack[track-1];
		stack[track-1]=null;
		return removed;
		
	}
	public boolean isEmpty() {
		if(getSize() == 0) {
			return true;
		}
		else {
		return false;
		}
	}
	public BufferedImage get(int index) {
		BufferedImage bf = null;
		for(int c = 0;c<stack.length;c++) {
			if(c== index) {
				bf = stack[c];
			}
		}
		
		return bf;
		
	}
	public int getSize() {
		int cnt = 0;
		for(int i = 0; i < stack.length; i++) {
			if(stack[i] != null) {
				cnt++;
			}
		}
		return cnt;
		
	}
	public int getArraySize() {
		return stack.length;
		
	}
}
