/* @author Ernst Nolte - 43769780
 * @version 1.0
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OnlineQuizz extends Assessment
{
	private LocalDate due_date;
	private int pass_score;
	
	public OnlineQuizz()
	{
		this("","",LocalDate.of(1995,1,1),0);
	}
	
	public OnlineQuizz(String assessment_name, String module_code, LocalDate due_date, int pass_score)
	{
		super(assessment_name, module_code);
		setDueDate(due_date);
		setPassScore(pass_score);
	}

	public void setDueDate(LocalDate due_date)
	{
		this.due_date = due_date;
		return;
	}

	public void setPassScore(int pass_score)
	{
		this.pass_score = pass_score;
		return;
	}

	public LocalDate getDueDate()
	{
		return due_date;
	}

	public int getPassScore()
	{
		return pass_score;
	}

	@Override
	public String toString()
	{
		return super.toString() + String.format("\nDue Date:\t%s\nPass Score:\t%d", getDueDate().toString(), getPassScore());
	}

	public String howLongUntil()
	{
		LocalDate today = LocalDate.now();
		long days_until = ChronoUnit.DAYS.between(today, getDueDate());

		return String.format("'%s' is %s days away from today (%s)", getAssessmentName(), days_until, today);
	}
}