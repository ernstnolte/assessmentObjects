/* @author Ernst Nolte - 43769780
 * @version 1.0
 */

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestProgram
{
	public static final int MAX_ASSESSEMENTS = 20;
	public static void main(String[] args)
	{
		int num_ass = 0;
		Assessment[] assessments = new Assessment[5];

		assessments[num_ass++] = new Assessment("Assessment 1", "WVNS211");
		assessments[num_ass++] = new Exam("Exam 1st Opp", "CMPG221", "G04_201", LocalDateTime.of(2025,9,24,9,0));
		assessments[num_ass++] = new OnlineQuizz("Quizz 1", "CMPG222", LocalDate.of(2025,07,28), 40);

		// Define indexes as readable variables
		int exam = 1;
		int quizz = 2;

		// Print assessment objects
		for (int i=0; i < num_ass; i++)
		{
			System.out.println("Assessment "+ (i+1));
			System.out.println(assessments[i]);
			System.out.println("- - - - - - - - - - - - - - - -");
		}

		// Show output of the howLongUntil methods
		System.out.println(assessments[exam].howLongUntil());
		System.out.println(assessments[quizz].howLongUntil());

	}
}