package ex11;

import java.sql.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CampDAO cdao = new CampDAO();
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 캠핑장관리 *************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.캠핑장목록 |2.캠핑장조회 |3.캠핑장정보수정 |0.종료");
			System.out.println("4.시설물관리 |5.유형관리   |6.캠핑장등록");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu = sc.nextLine();
			switch (menu) {
				case "0":
					run = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				case "1":
					List<CampVO> array = cdao.list();
					System.out.println("캠프번호\t캠핑장\t주소\t전화번호");
					for (CampVO vo : array) {
						System.out.printf("%s\t%-2s\t%s\t%s\n",
								vo.getCno(), vo.getCname(),
								vo.getJuso(), vo.getTel());
					}
					System.out.println(array.size() + "개 등록되었습니다.");
					break;
				case "2":
					while (true) {
						System.out.print("\n조회할 번호 : ");
						String cno = sc.nextLine();
						if (cno == "") {
							System.out.println("조회 취소");
							break;
						} else {
							CampVO cvo = cdao.read(cno);
							if (cvo.getCname() == null) {
								System.out.println("캠핑장X");
							} else {
								System.out.printf("캠핑장 이름 : %s\n", cvo.getCname());
								System.out.printf("캠핑장 주소 : %s\n", cvo.getJuso());
								System.out.printf("캠핑장 전화 : %s\n", cvo.getTel());
							}
						}
					}
					break;
				case "3":
					while (true) {
						System.out.print("수정할 캠핑장 번호 : ");
						String cno = sc.nextLine();
						if (cno == "") {
							System.out.println("수정 취소");
							break;
						} else {
							CampVO cvo = cdao.read(cno);
							if (cvo.getCname() == null) {
								System.out.println("캠핑장 X");
							} else {
								System.out.println("캠핑장 이름 : " + cvo.getCname());
								System.out.print("새로운 캠핑장 이름 : ");
								String nname = sc.nextLine();
								if (nname != "")
									cvo.setCname(nname);
								System.out.println("캠핑장 주소 : " + cvo.getJuso());
								System.out.print("새로운 캠핑장 주소 : ");
								String njuso = sc.nextLine();
								if (njuso != "")
									cvo.setJuso(njuso);
								System.out.println("캠핑장 전화 : " + cvo.getCname());
								System.out.print("새로운 캠핑장 전화 : ");
								String ntel = sc.nextLine();
								if (ntel != "")
									cvo.setTel(ntel);

								System.out.println("수정(?<?)");
								String sel = sc.nextLine();
								if (sel.equals("Y") | sel.equals("y") | sel.equals("ㅛ")) {
									// 수정작업
									cdao.update(cvo);
									System.out.println("수정 완료");
								} else {
									System.out.println("수정 취소");
								}
								break;
							}
						}
					}
					break;
				case "4":
					Facil.run();
					break;
				case "5":
					break;
				case "6":
					CampVO cvo = new CampVO();
					cvo.setCno(cdao.getNo());
					System.out.println("새로운번호 : " + cvo.getCno());
					System.out.print("캠핑장이름 : ");
					String cname = sc.nextLine();
					if (cname == "") {
						System.out.println("캠핑장등록 취소");
					} else {
						System.out.print("캠핑장주소 : ");
						String juso = sc.nextLine();
						System.out.print("캠핑장전호 : ");
						String tel = sc.nextLine();
						cvo.setCname(cname);
						cvo.setJuso(juso);
						cvo.setTel(tel);
						// System.out.println(cvo.toString());
						cdao.insert(cvo);
						System.out.println("캠핑장 등록완료");
					}
					break;
				default:
					System.out.println("다시 선택");
					break;
			}
		}
	}
}
