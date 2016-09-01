import java.util.Scanner;

public class UserInfoTest{
	public static void main(String[] args){
		char check='y';
		Scanner scanner = new Scanner(System.in);
		UserInfo userinfo = new UserInfo();
		//Name:
		System.out.printf("Please Enter Name: ");
		userinfo.setName(scanner.nextLine());
		//ID:
		System.out.printf("Please Enter ID: ");
		userinfo.setID(scanner.nextLine());
		//DOB:
		do{
			System.out.printf("Please type in DOB Month (1-12): ");
			userinfo.setDOB_M(scanner.nextInt());
		}while(userinfo.getDOB_M()<1 || userinfo.getDOB_M()>12);
		System.out.printf("Please type in day: ");
		userinfo.setDOB_D(scanner.nextInt());
		System.out.printf("Please type in the year: ");
		userinfo.setDOB_Y(scanner.nextInt());
		System.out.printf("\n\nType y if you want to view Info, press any other key to exit \n\nInput: ");
		check = scanner.next().charAt(0);
		if (check=='y'||check=='Y'){
			System.out.printf("Name: %s \nID: %s \nDOB: %02d/%02d/%04d\n\n", userinfo.getName(), userinfo.getID(), userinfo.getDOB_M(), userinfo.getDOB_D(), userinfo.getDOB_Y());
		}else{
			System.out.printf("OK. Bye. \n");
		}
	}
}
