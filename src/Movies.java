public class Movies {
    private String title;
    private int releasedyear;
    private String nameofthedirector;
    private String nameoftheleadingrole;

    public Movies(){
        this("YOU WILL INCLUDE TITLE",2000,"YOU WILL ADD NAME","YOU WILL ADD LEADING ROLE");
    }


    public Movies(String title, int year, String director, String lRole){
        this.title = title;
        this.releasedyear = year;
        this.nameofthedirector = director;
        this.nameoftheleadingrole = lRole;
    }
    public String getTitle() {return title;}

    public void setTitle(String StarWars){this.title = StarWars;}

    public int getReleasedyear(){
        return releasedyear;
    }

    public String getNameofthedirector(){
        return nameofthedirector;
    }

    public String getNameoftheleadingrole(){
        return nameoftheleadingrole;
    }



    public String toString(){

        //complete here

        return "";
    }


}