package theblank.blank1;

import java.util.ArrayList;
import java.util.List;

class ExamResult {
	private String examName;
	
	private String examAbout;
	
	private int score;
	
	public ExamResult() {
	}
	
	public ExamResult(String examName, String examAbout, int score) {
		super();
		this.examName = examName;
		this.examAbout = examAbout;
		this.score = score;
	}
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamAbout() {
		return examAbout;
	}
	public void setExamAbout(String examAbout) {
		this.examAbout = examAbout;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

class ExamStub {
	public List<ExamResult> getResult() {
		List<ExamResult> list = new ArrayList<ExamResult>();
		
		list.add(new ExamResult("국어", "2022학년도 2학기 기말고사", 92));
		list.add(new ExamResult("영어", "2022학년도 2학기 기말고사", 50));
		list.add(new ExamResult("수학", "2022학년도 2학기 기말고사", 28));
		
		return list;
	}
}

public class Blank14 {

	public static void main(String[] args) {
		// 80 이상: A
		// 60 이상 80 미만: B
		// 40 이상 60 미만: C
		// 40 미만: F
		
		List<ExamResult> list = new ExamStub().getResult();
		
		System.out.println(list.get(0).getExamAbout() + "의 절대 등급 계산 결과");
		
		____ (____) {
			
			____
			
			System.out.println(result.getExamName() + ": " + grade);
		}
	}
}
