package ex06;

import java.util.*;
import java.sql.*;

public class ProductDAO {
	Connection con = Database.connect();

	// 상품등록 1
	public void insert(ProductVO vo) {
		try {
			String sql = "INSERT INTO PRODUCTS(PCODE, PNAME, PPRICE) VALUES(pcode_seq.nextval,? ,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setInt(2, vo.getPprice());
			ps.execute();

		} catch (Exception error) {
			System.out.println("상품등록 : " + error.toString());
		}
	}

	// 상품조회 2
	public ProductVO read(int pcode) {
		ProductVO vo = new ProductVO();
		try {
			String sql = "select * from products where pcode =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pcode);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
			}
		} catch (Exception error) {
			System.out.println("상품수정 : " + error.toString());
		}
		return vo;
	}

	// 상품목록 3
	public List<ProductVO> list() {
		List<ProductVO> array = new ArrayList<>();
		try {
			String sql = "select * from products order by pcode desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
				array.add(vo);
			}
		} catch (Exception error) {
			System.out.println("상품목록 : " + error.toString());
		}
		return array;
	}

	// 상품수정 4
	public void update() {
		try {
			String sql = "select * from products order by pcode desc";
			PreparedStatement ps = con.prepareStatement(sql);

		} catch (Exception error) {
			System.out.println("상품수정 : " + error.toString());
		}
	}

	// 상품삭제 5
	public void delete(int pcode) throws Exception {

		String sql = "delete from products where pcode=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pcode);
		ps.execute();

	}
	// 판매상품조회 6

}
