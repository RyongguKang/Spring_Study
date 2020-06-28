package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	 //순서가 xml파일의 bean을 읽어오고, 그다음 java파일의 Autowired파일이 있는지 확인후, 있으면 해당어노테이션실행, 없으면 bean파일의 property 실행
	@Autowired
//	@Qualifier("exam2")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");;
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("overload constructor");;
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter constructor");;
		this.exam = exam;		
	}

}
