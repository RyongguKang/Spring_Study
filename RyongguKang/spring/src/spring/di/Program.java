package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		  //Exam exam = new NewlecExam();
		  Exam exam = new NewlecExam(10,10,10,10,);
		  ExamConsole console = new GridExamConsole();
		  
		  console.setExam(exam);
		 */
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println();
		
		//이름을 불러오는데 캐스팅이 필수가 되기때문에 자주사용되지는 않음
		ExamConsole console = (ExamConsole) context.getBean("console");
		//클래스명으로 설정하여 형식변환이 필요없기때문에 선호되는 방법
//		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
		
		
//		for(Exam e : exams)
//			System.out.println(e);

	}

}
