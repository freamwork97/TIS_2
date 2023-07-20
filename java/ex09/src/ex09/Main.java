package ex09;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 메인메뉴 *****************************");
			System.out.println("------------------------------------------------------");
			System.out.println("1.사용자목록 |2.사용자조회 |3.사용자수정 |4.사용자등록");
			System.out.println("5.사용자삭제 |6.메시지관리 |0.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");
			String menu = sc.nextLine();
			switch (menu) {
				case "0":
					run = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				case "1":
					System.out.println("아이디\t이름\t전화번호\t포인트");
					for (UserVO vo : udao.list()) {
						System.out.printf("%s\t%s\t%s\t%d\n",
								vo.getId(), vo.getUname(),
								vo.getPhone(), vo.getPoint());
					}
					System.out.println(udao.list().size() + "명 등록되었습니다.");
					break;
				case "2":
					System.out.print("조회할 아이디 : ");
					String id = sc.nextLine();
					if (id == "") {
						System.out.println("조회 종료");
						break;
					} else {
						UserVO uvo = udao.read(id);
						if (uvo.getUname() == null) {
							System.out.println("사용자X");
						} else {
							System.out.println("사용자이름 : " + uvo.getUname());
							System.out.println("사용자전화 : " + uvo.getPhone());
							System.out.println("사용자포인트 : " + uvo.getPoint());
						}
					}
					break;
				case "3":
					System.out.print("수정할 아이디 : ");
					id = sc.nextLine();
					if (id == "") {
						System.out.println("수정 종료");
						break;
					} else {
						UserVO uvo = udao.read(id);
						if (uvo.getUname() == null) {
							System.out.println("사용자X");
						} else {
							System.out.print("이름 : " + uvo.getUname() + ">");
							String uname = sc.nextLine();
							if (uname != "")
								uvo.setUname(uname);
							System.out.print("전화번호 : " + uvo.getPhone() + ">");
							String phone = sc.nextLine();
							if (phone != "")
								uvo.setPhone(phone);
							System.out.println(uvo.toString());
							System.out.print("수정해?(Y/y)");
							String sel = sc.nextLine();
							if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
								udao.update(uvo);
								System.out.println("수정 완료");
							} else {
								System.out.println("수정 취소");
							}
						}
					}
					break;
				case "4":
					while (true) {
						System.out.print("아이디 : ");
						id = sc.nextLine();
						if (id == "") {
							System.out.println("등록 취소");
							break;
						} else {
							UserVO uvo = udao.read(id);
							if (uvo.getUname() == null) {
								System.out.print("이름 : ");
								String sname = sc.nextLine();
								if (sname == "") {
									System.out.println("이름입력해");
									break;
								} else {
									uvo.setId(id);
									uvo.setUname(sname);
									System.out.print("전화번호 : ");
									String phone = sc.nextLine();
									uvo.setPhone(phone);
									System.out.print("등록해?(Y/y)");
									String sel = sc.nextLine();
									if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
										udao.insert(uvo);
										System.out.println("등록 완료");
									} else {
										System.out.println("등록 취소");
									}
								}
								break;
							} else {
								System.out.println("사용중인 아이디");

							}
						}
					}
					break;
				case "5":
					System.out.print("삭제할 아이디 : ");
					id = sc.nextLine();
					if (id == "") {
						System.out.println("삭제 취소");
					} else {
						UserVO uvo = udao.read(id);
						if (uvo.getUname() == null) {
							System.out.println("사용자X");
						} else {
							System.out.println("사용자이름 : " + uvo.getUname());
							System.out.println("삭제해?(Y/y)");
							String sel = sc.nextLine();
							if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
								try {
									udao.delete(id);
									System.out.println("삭제 완료");
								} catch (Exception e) {
									System.out.println("삭제 실패");

								}
							} else {
								System.out.println("삭제 취소");
							}
						}
					}
					break;
				case "6":
					System.out.print("아이디 : ");
					id = sc.nextLine();
					if (id == "") {
						System.out.println("메시지관리 취소");
					} else {
						UserVO uvo = udao.read(id);
						if (uvo.getUname() == null) {
							System.out.println("사용자X");
						} else {
							Messages.run(uvo);
						}
					}
					break;
				default:
					System.out.println("다시선택");
					break;
			}
		}
	}
}
