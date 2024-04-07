package tests;
import cute.Cute;

public class DecimalToHexConverter {
    int decimalNumber;
    String hexadecimalEquivalent;
    boolean m_Converted;

    // Constructor to initialize with a decimal number
    public DecimalToHexConverter(int decimalNumber) {
        this.decimalNumber = decimalNumber;
        this.hexadecimalEquivalent = "";
        this.m_Converted = false;
    }

    // Converts decimal to hexadecimal
    public void ConvertToHex() {
        this.hexadecimalEquivalent = Integer.toHexString(decimalNumber).toUpperCase();
        this.m_Converted = true;
    }

    // Returns the hexadecimal equivalent
    public String getHexadecimalEquivalent() {
        return this.hexadecimalEquivalent;
    }

    public static void main(String[] args) {
        DecimalToHexConverter converter = new DecimalToHexConverter(Cute.input.Integer());

        int action;
        for(int i = 0; i < 1; i++) {
            action = Cute.input.Integer();
            switch (action) {
                case 0:
                    converter.ConvertToHex();
                    break;
                case 1:
                    System.out.println("Hexadecimal equivalent: " + converter.getHexadecimalEquivalent());
                    break;
                default:
                    System.out.println("Invalid action.");
                    break;
            }
        }
    }
}
//@The following comments are auto-generated to save options for testing the current file
//@jcute.optionPrintOutput=true
//@jcute.optionLogPath=true
//@jcute.optionLogTraceAndInput=true
//@jcute.optionGenerateJUnit=true
//@jcute.optionExtraOptions=
//@jcute.optionJUnitOutputFolderName=C:\jcute
//@jcute.optionJUnitPkgName=
//@jcute.optionNumberOfPaths=50
//@jcute.optionLogLevel=1
//@jcute.optionDepthForDFS=5
//@jcute.optionSearchStrategy=1
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=true
