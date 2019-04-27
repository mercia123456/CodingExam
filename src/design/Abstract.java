package design;

public abstract class Abstract implements Employee {
    public final String owner = "Victor Mondal";
    static String addressHeadOffice = "37-25, 61st Apt# 4G. WoodSide NY 11377";

    public void describeCompany() {
        System.out.println(owner+" is the owner of the company located at : " + addressHeadOffice + ".");
    }

    public abstract void describeCompany(String Mission);


}
