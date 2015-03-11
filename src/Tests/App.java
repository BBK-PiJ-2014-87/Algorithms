package Tests;

public class App {
	public static int gdc(int p, int q) {
		if (q == 0)
			return p;
		int r = p % q;
		System.out.println("p: "+ p + ", q: "+ q + ", r: " + r);
		return gdc(q, r);

	}

	public static void main(String[] args) {
		App test = new App();
		System.out.println(App.gdc(23, 8));
	}

}
