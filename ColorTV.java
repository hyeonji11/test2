class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}
public class ColorTV extends TV {
	int color;
	public ColorTV(int s, int c) {
		super(s);
		color = c;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

	}

}
