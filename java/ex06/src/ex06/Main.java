package ex06;

import java.text.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao = new ProductDAO();
		SaleDAO sdao = new SaleDAO();
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 상품관리 *****************************");
			System.out.println("----------------------------------------------");
			System.out.println("1.등록 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("6.판매정보조회");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			String menu = sc.nextLine();
			switch (menu) {
				case "1":
					ProductVO pro1 = new ProductVO();
					System.out.print("상품이름 : ");
					String pname = sc.nextLine();
					pro1.setPname(pname);
					if (pname == "") {
						System.out.println("입력을 종료합니다.");
						break;
					} else {
						while (true) {
							System.out.print("상품가격 : ");
							String pprice = sc.nextLine();
							if (isNumber(pprice)) {
								pro1.setPprice(Integer.parseInt(pprice));
								dao.insert(pro1);
								System.out.println("상품등록완료");
								break;
							}
						}

					}
					break;

				case "2":
					while (true) {
						System.out.print("\n조회할 상품코드 : ");
						String pcode = sc.nextLine();
						if (pcode == "") {
							System.out.println("입력을 종료합니다.");
							break;
						}
						if (isNumber(pcode)) {
							ProductVO pro2 = dao.read(Integer.parseInt(pcode));
							if (pro2.getPname() == null) {
								System.out.println("해당 상품이 존재하지않습니다.");
							} else {
								System.out.println("상품명 : " + pro2.getPname());
								System.out.println("상품가격 : " + df.format(pro2.getPprice()));

							}
						}
					}

					break;

				case "3":
					for (ProductVO vo : dao.list()) {
						System.out.printf("%d\t%-25s\t%s\n", vo.getPcode(), vo.getPname(), df.format(vo.getPprice()));
					}
					System.out.println(dao.list().size() + "개 상품이 등록되었습니다.");
					break;
				case "4":
					while (true) {
						System.out.print("수정 상품코드 : ");
						String pcode = sc.nextLine();
						if (pcode == "") {
							System.out.println("입력을 종료합니다.");
							break;
						}
						if (isNumber(pcode)) {
							ProductVO pro2 = dao.read(Integer.parseInt(pcode));
							if (pro2.getPname() == null) {
								System.out.println("해당 상품이 존재하지않습니다.");
							} else {

							}
						}
					}
					break;
				case "5":
					while (true) {
						System.out.print("\n삭제할 상품코드 : ");
						String pcode = sc.nextLine();
						if (pcode == "") {
							System.out.println("입력을 종료합니다.");
							break;
						}
						if (isNumber(pcode)) {
							ProductVO pro2 = dao.read(Integer.parseInt(pcode));
							if (pro2.getPname() == null) {
								System.out.println("삭제할 상품이 존재하지않습니다.");
							} else {
								System.out.println("상품명 : " + pro2.getPname());
								System.out.println("상품가격 : " + df.format(pro2.getPprice()));
								System.out.print("삭제하겠습니까?(Y/y)");
								String sel = sc.nextLine();
								if (sel.equals("y") || sel.equals("Y") || sel.equals("ㅛ")) {
									try {
										dao.delete(Integer.parseInt(pcode));
										System.out.println("삭제완료");
									} catch (Exception e) {
										System.out.println("삭제실패");
									}

								}
							}
						}
					}

					break;
				case "6":
					while (true) {
						System.out.print("\n조회할 상품 코드 : ");
						String pcode = sc.nextLine();
						if (pcode == "") {
							System.out.println("입력을 종료합니다");
							break;
						}
						if (isNumber(pcode)) {
							ProductVO pro3 = dao.read(Integer.parseInt(pcode));
							if (pro3.getPname() == null) {
								System.out.println("조회할 상품이 존재하지않습니다.");
							} else {
								System.out.println("상품명 : " + pro3.getPname());
								System.out.println("상품가격 : " + df.format(pro3.getPprice()));
								// 판매내역
								System.out.println("================================================");
								System.out.println("판매수량\t판매가격\t판매금액\t판매일");
								System.out.println("================================================");
								for (SaleVO vo : sdao.list(Integer.parseInt(pcode))) {
									System.out.printf("%d\t%s\t%s\t%s\n",
											vo.getQnt(),
											df.format(vo.getSprice()),
											df.format(vo.getQnt() * vo.getSprice()),
											sdf.format(vo.getSdate()));
								}
							}
						}

					}

					break;
				case "0":
					run = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("다시 선택");
			}
		}
	}

	// 숫자인지 판별하는 메서드
	public static boolean isNumber(String str) {
		try {
			int number = Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			System.out.println("숫자로 입력하세요");
			return false;
		}
	}

}
