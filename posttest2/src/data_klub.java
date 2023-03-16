class data_klub {
    private String clname;
    private String clstadium;
    private int playerttl;

    public data_klub(String clname, String clstadium, int playerttl){
        this.clname = clname;
        this.clstadium = clstadium;
        this.playerttl = playerttl;
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

    public int getplayerttl(){
        return playerttl;
    }
    public void setplayerttl(int playerttl){
        this.playerttl = playerttl;
    }
}
