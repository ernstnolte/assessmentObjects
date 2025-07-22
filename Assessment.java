/* @author Ernst Nolte - 43769780
 * @version 1.0
 */

public class Assessment implements HowLongUntil
{
	private String assessment_name;
	private String module_code;
	
	public Assessment()
	{
		this("","");
	}
	
	public Assessment(String assessment_name, String module_code)
	{
		setAssessmentName(assessment_name);
		setModuleCode(module_code);
	}
	
	public void setAssessmentName(String assessment_name)
	{
		this.assessment_name = assessment_name;
	}
	
	public void setModuleCode(String module_code)
	{
		this.module_code = module_code;
	}

	public String getAssessmentName()
	{
		return assessment_name;
	}

	public String getModuleCode()
	{
		return module_code;
	}
	
	@Override
	public String toString()
	{
		return String.format("Assessment Name:\t%s\nModule Name:\t%s", getAssessmentName(), getModuleCode());
	}

	public String howLongUntil()
	{
		return String.format("No method implementation in this class for %s", getAssessmentName());
	}
}
