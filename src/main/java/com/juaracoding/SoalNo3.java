package com.juaracoding;

public class SoalNo3 {
    public static void main(String[] args) {
        String[] questionData = {
                ":T1:202112SOAL3",
                ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT",
                ":T1:202111SOAL3",
                ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT",
                ":T1:202110SOAL3",
                ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAT .DT"
        };

        for (int i = 0; i < questionData.length; i += 2) {
            String firstLine = questionData[i];
            String secondLine = questionData[i + 1];

            System.out.println(firstLine);

            String[] secondLinePart = secondLine.split(":T2:");
            if (secondLinePart.length == 2) {
                String secondLineTag = secondLinePart[0];
                String secondLineContent = secondLinePart[1];
                int totalChar = secondLineContent.length();
                int charPerVar = 18;
                int numOfVar = totalChar / charPerVar;

                if (totalChar % charPerVar != 0 || numOfVar != 5) {
                    System.out.println("something wrong with the question data!");
                } else {
                    String[] vars = new String[numOfVar];

                    for (int j = 0; j < numOfVar; j++) {
                        int startIndex = j * charPerVar;
                        int endIndex = startIndex + charPerVar;
                        vars[j] = secondLineContent.substring(startIndex, endIndex);
                    }

                    String[] newOrderVar = new String[numOfVar];
                    for (int j = 0; j < numOfVar; j++) {
                        newOrderVar[j] = vars[(j + 2) % numOfVar];
                    }

                    StringBuilder resultData = new StringBuilder();
                    for (String var : newOrderVar) {
                        resultData.append(var);
                    }
                    System.out.println(secondLineTag + ":T2:" + resultData.toString() + "\n");
                }
            }
        }
    }
}


