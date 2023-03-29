class data_klub {
    private String clname;
    private String clstadium;
    private String hometown;

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

    public void done_add(){
        System.out.println("Data has been added");
    }

    public void done_add(String clname){
        System.out.println("You just added "+clname+ " data");
    }

}
