package tonhi.com.test;

import tonhi.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien obama= new SinhVien();
		SinhVien nhi =new SinhVien("Tố Nhi",9);
		System.out.println("Điểm Nhi="+nhi.getDiem());
		System.out.println("Tên của Nhi ="+nhi.getHoTen());
		System.out.println("Tên obama="+obama.getHoTen());
		obama.setHoTen("Ông OBAMA");
		System.out.println("Tên obama="+obama.getHoTen());
		System.out.println("---------------");
		nhi.xuatThongTin();
		System.out.println("---------------");
		System.out.println(nhi);
		
	}

}
