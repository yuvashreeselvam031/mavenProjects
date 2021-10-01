import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReports {

	public static void main(String[] args) {
		
		//Common for all the testcases
		//step 1 : Set up the Physical reports
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/results.html");
		// to keep the report history
		
		reporter.setAppendExisting(true);
		
		

	}

}
