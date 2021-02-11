package oxana.belayeva.homework4.task1;

//Ok
//keep the packaging oxana.belayeva.homework...
public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest victimCheck = new LightColorDetectorTest();
        victimCheck.testViolet();
        victimCheck.testBlue();
        victimCheck.testGreen();
        victimCheck.testYellow();
        victimCheck.testOrange();
        victimCheck.testRed();

    }

    public void testViolet(){
        LightColorDetector checkColor = new LightColorDetector();
        String actualResult = checkColor.detect(390);
        String expectedResult = "Violet";
        printResult(actualResult, expectedResult, "Test Violet");
    }

    public void testBlue(){
        LightColorDetector checkColor = new LightColorDetector();
        String actualResult = checkColor.detect(495);
        String expectedResult = "Blue";
        printResult(actualResult, expectedResult, "Test Blue");
    }

    public void testGreen(){
        LightColorDetector checkColor = new LightColorDetector();
        String actualResult = checkColor.detect(10);
        String expectedResult = "Green";
        printResult(actualResult, expectedResult, "Test Green");
    }

    public void testYellow(){
        LightColorDetector checkColor = new LightColorDetector();
        String actualResult = checkColor.detect(580);
        String expectedResult = "Yellow";
        printResult(actualResult, expectedResult, "Test Yellow");
    }

    public void testOrange(){
        LightColorDetector checkColor = new LightColorDetector();
        String actualResult = checkColor.detect(600);
        String expectedResult = "Orange";
        printResult(actualResult, expectedResult, "Test Orange");
    }

    public void testRed(){
        LightColorDetector checkColor = new LightColorDetector();
        String actualResult = checkColor.detect(730);
        String expectedResult = "Red";
        printResult(actualResult, expectedResult, "Test Red");
    }

    public void printResult(String actualResult, String expectedResult, String testName){
        if (actualResult.equals(expectedResult)){
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed! Color is "+ actualResult + ", but must be " + expectedResult + ".");
        }
    }
}
