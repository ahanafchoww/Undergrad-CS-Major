public class CodingTaskQues1 {
    public static void main(String[] args) {

        // (a) LEGAL
        int hungry;
        // A simple name consisting only of lowercase letters.


        // (b) ILLEGAL
        // int 2AB;
        // Explanation: Java identifiers can contain numbers, but they cannot START with a number.


        // (c) ILLEGAL
        // int 312.2;
        // Explanation: It starts with a number, which is illegal. Furthermore, it contains a
        // period (.), which Java uses as an operator to access methods and variables, not as a name character.


        // (d) LEGAL
        String MOBILE;
        // Consists entirely of upper-case letters, which are perfectly valid characters.


        // (e) ILLEGAL
        // int "Ans";
        // Explanation: It contains double quotation marks. In Java, anything in double quotes
        // is treated as literal String data, not a variable name.


        // (f) LEGAL
        String $30;
        // The dollar sign ($) is one of the few special characters completely allowed anywhere in a Java name.


        // (g) ILLEGAL
        // int Yes/No;
        // Explanation: It contains a forward slash (/). Java views this as the division operator,
        // so the compiler thinks you are trying to divide a variable named 'Yes' by a variable named 'No'.


        // (h) ILLEGAL
        // int student-id;
        // Explanation: It contains a hyphen (-). Java views this as the subtraction operator,
        // so the compiler thinks you are trying to subtract 'id' from 'student'.


        // (i) ILLEGAL
        // double A+3;
        // Explanation: It contains a plus sign (+). Java views this as the addition operator,
        // so the compiler thinks you are trying to add 3 to a variable named 'A'.


        // (j) ILLEGAL
        // int 'X';
        // Explanation: It contains single quotation marks. In Java, single quotes are used
        // exclusively to define a character literal (char), not a variable name.


        // (k) ILLEGAL
        // int public;
        // Explanation: 'public' is a reserved keyword in Java. These keywords have predefined
        // meanings built into the language, so you cannot use them as your own variable names.


        // (l) LEGAL
        int student_id;
        // Letters and underscores (_) are completely legal characters.

    }
}