package termproject;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MemberManager {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����� �ο��� >>");
		int num = in.nextInt();
		System.out.println(num+"���� �̸��� ��ȭ��ȣ�� �Է��մϴ�.");
		Member m[] = new Member[num]; 
		int that;
		
		String name="", tel="";
		for(int i=0;i<m.length;i++) {
			System.out.print("�̸��� ��ȭ��ȣ �Է� : ");
			m[i] = new Member();
			name = in.next();
			m[i].setName(name);
			tel = in.next();
			m[i].setTel(tel);
			
		}System.out.print("����Ǿ����ϴ�.\n");
		
		int select;
		for(;;) {
			System.out.print("\n��Ϻ��� [1], �˻� [2], ����[3], ����[4], ����[5] >> ");
			select = in.nextInt();
			
			if(select==1) {
				for(int i=0;i<m.length;i++)
				System.out.println("["+(i+1)+"] "+m[i].getName()+" "+m[i].getTel());
			}
			else if(select==2) {
				for(;;) {
				System.out.print("\n��� �˻�[6], �˻� ����[7] >> ");
				select=in.nextInt();
				if(select==6) {
					System.out.print("�˻��� �̸��� �Է��ϼ���. ");
					that=-1;
					String find = in.next();
					for(int i=0;i<m.length;i++) {
						if(m[i].getName().equals(find))
							that = i;
					}
					if(that!=-1)
						System.out.print(m[that].getName()+"�� ��ȣ�� "+m[that].getTel()+"�Դϴ�.\n");
					else System.out.print("�˻��� �̸��� �����ϴ�.\n");
				}
				else if(select==7) break;
				}
			}
			
			else if(select==3) {
				System.out.print("\n");
				for(int i=0;i<m.length;i++)
					System.out.println("["+(i+1)+"] "+m[i].getName()+" "+m[i].getTel());
				System.out.print("��ȣ�� �����ϸ� �����˴ϴ�. >> ");
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
				System.out.print("������ ��ȣ�� �����ϼ���. >> ");
				int change = in.nextInt();
				System.out.print("�̸��� ��ȭ��ȣ �Է� >> ");
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
				System.out.print("���α׷��� �����մϴ�.");
				break;
			}
			
		}
		
	}

}
