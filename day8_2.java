
class Person{
	// 剰澗 馬是 適掘什岡 戚遂馬走 x
	String name;
	/*Person(){
		System.out.println("採乞 適掘什税 持失切");
	}*/
	Person(String name){
		this.name=name;
	}
	void hi() {
		System.out.println("照括馬室推!");
	}
}

class Student extends Person {
	Student(String name) {
		super(name);
	}
	//        雌紗閤惟 背捜 -> Person(雌是適掘什)岡 乞砧 紫遂 亜管馬陥
	int Score;
	/*String name;
	void hi()
	{                     -> 雌紗 閤焼辞 戚杏 照幻級嬢亀 喫
	System.out.println("照括馬室推!");
	}*/  
	/*Student(){
		///// 採乞適掘什税 奄沙持失切研 硲窒!!
		System.out.println("切縦 適掘什税 持失切");
	}*/
	void hi() {
		// 採乞適掘什人 敗呪税 戚硯戚 旭壱,
		// 昔切亀 旭精井酔
		// -> [神獄虞戚漁] == 仙舛税
		System.out.println("ぞしぞしぞし");
	}
	void study()
	{
		System.out.println("因採掻...");
	}
}
// 神獄稽漁: 旭精戚硯税 敗呪 識情聖 買遂
// 昔切税 展脊 or 鯵呪亜 陥牽陥. 雌紗x

// 神獄虞戚漁: 旭精戚硯税 敗呪 識情聖 買遂
// 昔切税 展脊and姐呪亜 疑析馬陥. 雌紗o
public class day8_2 {

	public static void main(String[] args) {
		
		Person p=new Person("畠掩疑");
		System.out.println("---------------");
		Student s=new Student("焼巷巷");
		
		p.hi();
		s.hi();
		

	}

}
