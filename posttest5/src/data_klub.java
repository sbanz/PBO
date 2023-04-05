public abstract class data_klub {
    private String clname;
    private String clstadium;
    private String hometown;


    public abstract void done_add();

    public data_klub(String clname, String clstadium, String hometown){
        this.clname = clname;
        this.clstadium = clstadium;
        this.hometown = hometown;
    }

    public String getclname(){
        return clname;
    }
    public void setclname(String clname){
        this.clname = clname;
    }

    public String getclstadium(){
        return clstadium;
    }
    public void setclstadium(String clstadium){
        this.clstadium = clstadium;
    }

    public String gethometown(){
        return hometown;
    }
    public void sethometown(String hometown){
        this.hometown = hometown;
    }
}
