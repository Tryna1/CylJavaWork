package work6;

//6.9.11
public class LinearEquation {
	private int a, b, c, d, e, f;
	public LinearEquation(int a, int b, int c, int d, int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.f = f;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public int getF() {
		return f;
	}
	public boolean isSolvable() {
		if(a*d - b*c != 0)
			return true;
		else
			return false;
	}
	public double getX() {
		return (e*d - b*f) / (a*d - b*c);
	}
	public double getY() {
		return (a*f - e*c) / (a*d - b*c);
	}
}
