import java.util.Scanner; 
public class IO{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入你的名字");
		String youName = myscanner.next();

		System.out.println("请输入你的工资");
		int youMoney = myscanner.nextInt();
		System.out.println("请输入你的年龄");
		int youAge = myscanner.nextInt();
		System.out.println("请输入你的家庭住址");
		String youAddress = myscanner.next();
		System.out.println("请核对信息");
		System.out.println("姓名" + "\t" + "工资" + "\t" 
								+ "年龄" + "\t" + "家庭住址" + "\n"
								+ youName + "\t" + youMoney + "\t" + youAge +"\t"
								+ youAddress);
	}

}
