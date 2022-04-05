package week3.day2.assignment2;

public class Automation extends MultipleLanguage implements Language,TestTool {
public static void main(String[] args) {
	Automation automate=new Automation();
	automate.Java();
	automate.Selenium();
	automate.Python();
	automate.ruby();
	
}

public void Selenium() {
	// TODO Auto-generated method stub
	System.out.println("Selenium Method");
}

public void Java() {
	// TODO Auto-generated method stub
	System.out.println("Java Method");
}

@Override
public void ruby() {
	// TODO Auto-generated method stub
	System.out.println("Ruby Method");
}
}
