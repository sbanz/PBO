public class pl2 extends data_klub{
    private int total_player;

    public pl2(String clname, String clstadium, String hometown, int total_player) {
        super(clname, clstadium, hometown);
        this.total_player = total_player;
    }

    public int gettotal_player(){
        return total_player;
    }

    public void settotal_player(int total_player){
        this.total_player = total_player;
    }
}