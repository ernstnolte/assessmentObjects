/* @author Ernst Nolte - 43769780
 * @version 1.0
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exam extends Assessment 
{
    private String exam_venue;
    private LocalDateTime start_time;

    public Exam()
    {
        this("","","", LocalDateTime.of(1995,1,1,0,0));
    }

    public Exam(String assessment_name, String module_code, String exam_venue, LocalDateTime start_time)
    {
        super(assessment_name, module_code);
        setExamVenue(exam_venue);
        setStartTime(start_time);
    }

    public void setExamVenue(String exam_venue)
    {
        this.exam_venue = exam_venue;
    }

    public void setStartTime(LocalDateTime start_time)
    {
        this.start_time = start_time;
    }

    public String getExamVenue()
    {
        return exam_venue;
    }
    
    public LocalDateTime getStartTime()
    {
        return start_time;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format("\nExam Venue:\t%s\nDate and Time:\t%s", getExamVenue(), getStartTime().toString());
    }

    public String howLongUntil()
    {
        LocalDate today = LocalDate.now();
        LocalDate exam_date = getStartTime().toLocalDate();
        long days_until = ChronoUnit.DAYS.between(today, exam_date);

        return String.format("'%s' is %s days away from today (%s)", getAssessmentName(), days_until, today.toString());
    }
}