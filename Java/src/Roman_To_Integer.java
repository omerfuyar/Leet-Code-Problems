public class Roman_To_Integer {

    // --------------------------------------------------------------------------------------

    // Runtime : ~6000 NanoSecods
    static int romanToInt_1(String s) {
        char[] RomanCharacters = s.toCharArray();
        int SumOfValues = 0;

        for (int i = 0; i < RomanCharacters.length; i++) {
            switch (RomanCharacters[i]) {
                case 'I':
                    if (i < RomanCharacters.length - 1
                            && (RomanCharacters[i + 1] == 'V' || RomanCharacters[i + 1] == 'X'))
                        SumOfValues -= 1;
                    else
                        SumOfValues += 1;
                    break;
                case 'V':
                    SumOfValues += 5;
                    break;
                case 'X':
                    if (i < RomanCharacters.length - 1
                            && (RomanCharacters[i + 1] == 'L' || RomanCharacters[i + 1] == 'C'))
                        SumOfValues -= 10;
                    else
                        SumOfValues += 10;
                    break;
                case 'L':
                    SumOfValues += 50;
                    break;
                case 'C':
                    if (i < RomanCharacters.length - 1
                            && (RomanCharacters[i + 1] == 'D' || RomanCharacters[i + 1] == 'M'))
                        SumOfValues -= 100;
                    else
                        SumOfValues += 100;
                    break;
                case 'D':
                    SumOfValues += 500;
                    break;
                case 'M':
                    SumOfValues += 1000;
                    break;
            }
        }

        return SumOfValues;
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int Result = romanToInt_1("XI");

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("Result : " + Result);
    }
}