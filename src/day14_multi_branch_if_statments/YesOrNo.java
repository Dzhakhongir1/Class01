package day14_multi_branch_if_statments;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("are you sure you wan to delete this file?");
        char selection = 'y';
        boolean isYEs;
        String result;
        if (selection=='y'){
            System.out.println("your file will be deleted");
            isYEs = true;
            result = "deleted";


        }else{
            System.out.println("file deletion cancelled");
            isYEs = false;
        }
        System.out.println("DID file get deleted "+isYEs);

    }
}
