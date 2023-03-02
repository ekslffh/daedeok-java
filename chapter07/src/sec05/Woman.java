package sec05;

public class Woman {
	String name;
	int age;
	
	Woman(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getInfo() {
		return "�̸� : " + name + "\n���� : " + age; 
	}
}

class Job extends Woman {
	private String jobName;
	
	Job(String name, int age, String jobName) {
		super(name, age);
		this.jobName = jobName;
	}
	
	@Override
	String getInfo() {
		String info = super.getInfo();
		return info + "\n������ " + jobName + "�Դϴ�.";
	}
}