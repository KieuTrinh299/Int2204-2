package lab03.tu;



public class Coder {
	private int tuoi;
	private String ten;
	private String ngonngu;
	public int getTuoi() {
		return this.tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getTen() {
		return this.ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNgonNgu() {
		return this.ngonngu;
	}
	public void setNgonNgu(String ngonngu) {
		this.ngonngu = ngonngu;
	}
	public Coder(int tuoi, String ten, String ngonngu) {
		this.tuoi = tuoi;
		this.ten = ten;
		this.ngonngu = ngonngu;
	}
	public void xuat() {
		System.out.println(this.tuoi + " " + this.ten + " " + this.ngonngu);
	}
	public static void main(String[] args) {
		Coder V = new Coder(20,"ABC", "JAVA");
		V.xuat();
	}

}
