public class persone {

    String name;
    String Firstname;
    int journaiss;
    int moishnaiss;
    int annenaiss;

    void setname(String name){
        this.name=name;
    }
    void setFirstName(String Firstname){
        this.Firstname=Firstname;
    }
    void datenaiss(int dd , int mm , int yy){
        this.journaiss=dd;
        this.moishnaiss=mm;
        this.annenaiss=yy;

    }
    int Age2023(){
        return (2023-annenaiss);

    }
    public static void main(String[] args){
        persone p1=new persone();
        p1.setname("alaeddine");
        p1.setFirstName("souayah");
        p1.datenaiss(5,1,2004);

        System.out.println("name : "+p1.name);
        System.out.println("name : "+p1.Firstname);
        System.out.println("date de naissance : "+p1.journaiss+"/"+p1.moishnaiss+"/"+p1.annenaiss);
        System.out.println("age : "+p1.Age2023());
    }

}