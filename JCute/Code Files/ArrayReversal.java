package tests;

import cute.Cute;

public class ArrayReversal {
    public static void main(String[] args) {
        int n = Cute.input.Integer();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Cute.input.Integer();
        }

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
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
//@jcute.optionNumberOfPaths=40
//@jcute.optionLogLevel=2
//@jcute.optionDepthForDFS=0
//@jcute.optionSearchStrategy=1
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=true
