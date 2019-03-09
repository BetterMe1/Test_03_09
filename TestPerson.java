class Person{
    private final String name;
    private String post;
    private final boolean sex;
    private int age;
    private String tel;
    private String adress;
	public Person(String name,boolean sex){
		this.name = name;
		this.sex = sex;
	}
	public String getName(){
		return this.name;
	}
	public boolean getSex(){
		return this.sex;
	}
	public void setPost(String post){
		this.post = post;
	}
	public String getPost(){
		return this.post;
	}
	public void setAge(int age){
		if(age>=0 && age <=120){
			this.age= age;
		}else{
			this.age= 0;
		}
	}
	public int getAge(){
		return this.age;
	}
	public String getTel(){
		return this.tel;
	}
	public void setTel(String tel){
		this.tel= tel;
	}
	public String getAdress(){
		return this.adress;
	}
	public void setAdress(String adress){
		this.adress= adress;
	}
	public void print(String name,String post,boolean sex,int age,String tel,String adress){
		System.out.print("Name:" +name+"\t");
		System.out.println("Post:" +post+"\t");
		if(sex == false){
			System.out.print("Sex:female" +"\t");
		}else{
			System.out.print("Sex:male" +"\t");
		}
		System.out.println("Age:" +age+"\t");
		System.out.print("Tel:" +tel+"\t");
		System.out.println("Adress:" +adress+"\t");
	}
}
class ChinesePerson extends Person{
	public ChinesePerson(String name,boolean sex){
		super(name,sex);	
	}
	public void print(String name,String post,boolean sex,int age,String tel,String adress){
		System.out.print("姓名:" +name+"\t");
		System.out.println("职位:" +post+"\t");
		if(sex == false){
			System.out.print("性别:女" +"\t");
		}else{
			System.out.print("性别:男" +"\t");
		}
		System.out.println("年龄:" +age+"\t");
		System.out.print("电话:" +tel+"\t");
		System.out.println("地址:" +adress+"\t");
	}
}
public class TestPerson{
	public static void main(String[] args){
		Person p;
		if(args.length == 1 && args[0].equals("en")){
			p = new Person("Mary",false);
			p.setPost("HR Director");
			p.setAdress("chaoyang,Beijing");
		}else{
			p = new ChinesePerson("玛丽",false);
			p.setPost("人力资源主管");
			p.setAdress("北京市朝阳路");
		}		
		p.setAge(26);
		p.setTel("18081318888");
		p.print(p.getName(),p.getPost(),p.getSex(),p.getAge(),p.getTel(),p.getAdress());
	}
}