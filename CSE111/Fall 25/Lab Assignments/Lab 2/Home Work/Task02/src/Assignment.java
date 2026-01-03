public class Assignment {
    //printDetails() = void method
    //tasks = int variable
    //difficulty = String Variable
    //submission = boolean Variable
    //makeOptional() = returning method (String)


    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails(){
        System.out.print("Number of tasks: " + tasks + "\n" +
                "Difficulty level: " + difficulty + "\n" +
                "Submission required: " + submission + "\n");
    }

    public String makeOptional(){
        if (submission){
            submission = false;
            return "Assignment will not require submission" ;
        }
        else {
            return "Submission is already not required";
        }
    }
}
