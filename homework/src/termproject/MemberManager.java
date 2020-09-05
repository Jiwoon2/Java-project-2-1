package termproject;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MemberManager {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("등록할 인원수 >>");
		int num = in.nextInt();
		System.out.println(num+"명의 이름과 전화번호를 입력합니다.");
		Member m[] = new Member[num]; 
		int that;
		
		String name="", tel="";
		for(int i=0;i<m.length;i++) {
			System.out.print("이름과 전화번호 입력 : ");
			m[i] = new Member();
			name = in.next();
			m[i].setName(name);
			tel = in.next();
			m[i].setTel(tel);
			
		}System.out.print("저장되었습니다.\n");
		
		int select;
		for(;;) {
			System.out.print("\n목록보기 [1], 검색 [2], 삭제[3], 수정[4], 종료[5] >> ");
			select = in.nextInt();
			
			if(select==1) {
				for(int i=0;i<m.length;i++)
				System.out.println("["+(i+1)+"] "+m[i].getName()+" "+m[i].getTel());
			}
			else if(select==2) {
				for(;;) {
				System.out.print("\n계속 검색[6], 검색 종료[7] >> ");
				select=in.nextInt();
				if(select==6) {
					System.out.print("검색할 이름을 입력하세요. ");
					that=-1;
					String find = in.next();
					for(int i=0;i<m.length;i++) {
						if(m[i].getName().equals(find))
							that = i;
					}
					if(that!=-1)
						System.out.print(m[that].getName()+"의 번호는 "+m[that].getTel()+"입니다.\n");
					else System.out.print("검색한 이름이 없습니다.\n");
				}
				else if(select==7) break;
				}
			}
			
			else if(select==3) {
				System.out.print("\n");
				for(int i=0;i<m.length;i++)
					System.out.println("["+(i+1)+"] "+m[i].getName()+" "+m[i].getTel());
				System.out.print("번호를 선택하면 삭제됩니다. >> ");
				int delete = in.nextInt();
				
				List<Member> list = new ArrayList<>(Arrays.asList(m));
				list.remove(delete-1);
				m = list.toArray(new Member[list.size()]);
				System.out.print("\n");
				for(int i=0;i<m.length;i++)
					System.out.println("["+(i+1)+"] "+m[i].getName()+" "+m[i].getTel());
			}
			else if(select==4) {
				System.out.print("\n");
				for(int i=0;i<m.length;i++)
					System.out.println("["+(i+1)+"] "+m[i].getName()+" "+m[i].getTel());
				System.out.print("수정할 번호를 선택하세요. >> ");
				int change = in.nextInt();
				System.out.print("이름과 전화번호 입력 >> ");
				String newName = in.next();
				String newTel = in.next();
				m[change-1].setName(newName);
				m[change-1].setTel(newTel);
				System.out.print("\n");
				for(int i=0;i<m.length;i++)
					System.out.println("["+(i+1)+"] "+m[i].getName()+" "+m[i].getTel());
			}
			else if(select==5) {
				System.out.print("\n");
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}

}
