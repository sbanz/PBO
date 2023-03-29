public class first_team extends data_klub{
    private int total_player;

    public first_team(String clname, String clstadium, String hometown, int total_player) {
        super(clname, clstadium, hometown);
        this.total_player = total_player;
    }

    public int gettotal_player(){
        return total_player;
    }

    public void settotal_player(int total_player){
        this.total_player = total_player;
    }

    @Override
    public void done_add(){
        System.out.println("First Team data has been added, with total player of : "+ this.total_player);
    }

    @Override
    public void done_add(String clname){
        System.out.println("You just added "+clname+ " data");
    }
}