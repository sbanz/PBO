import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<first_team> ft = new ArrayList<first_team>();
    static ArrayList<pl2> pl2 = new ArrayList<pl2>();
    static ArrayList<u18> u18 = new ArrayList<u18>();

    public static void cls(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void confirm() throws IOException {
        System.out.println("\n");
        System.out.print("Enter to continue.");
        br.readLine();
    }

    public static void main(String[] args) throws IOException{
        int pilih;
        do{
            cls();
            System.out.println("===== ENGLAND FOOTBALL LEAGUE CLUB DATA =====");
            System.out.println("\n");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.println("Choose : ");
            pilih = Integer.parseInt(br.readLine());
            cls();

            switch(pilih){
                case 1 :
                    System.out.println("===== INPUT CLUB DATA =====");
                    System.out.println("\n");
                    System.out.println("1. First Team");
                    System.out.println("2. PL2");
                    System.out.println("3. U18");
                    System.out.println("Choose which team : ");
                    int pilih_create = Integer.parseInt(br.readLine());
                    cls();
                    switch(pilih_create){
                        case 1 :
                            System.out.println("===== INPUT CLUB DATA =====");
                            System.out.print("\n");
                            System.out.println("Input Club Name : ");
                            String cl_name_ft = br.readLine();
                            System.out.println("Input Home Stadium : ");
                            String cl_stad_ft = br.readLine();
                            System.out.println("Input Home Town : ");
                            String hometown_ft = br.readLine();
                            System.out.println("Input Total Player");
                            int ttl_player_ft = Integer.parseInt(br.readLine());
                            first_team data_ft = new first_team(cl_name_ft, cl_stad_ft, hometown_ft, ttl_player_ft);
                            ft.add(data_ft);
                            System.out.println("\n");
                            data_ft.done_add();
                            data_ft.done_add(cl_name_ft);
                            confirm();
                            cls();
                            break;

                        case 2 :
                            System.out.println("===== INPUT CLUB DATA =====");
                            System.out.print("\n");
                            System.out.println("Input Club Name : ");
                            String cl_name_pl2 = br.readLine();
                            System.out.println("Input Home Stadium : ");
                            String cl_stad_pl2 = br.readLine();
                            System.out.println("Input Home Town : ");
                            String hometown_pl2 = br.readLine();
                            System.out.println("Input Total Player");
                            int ttl_player_pl2 = Integer.parseInt(br.readLine());
                            pl2 data_pl2 = new pl2(cl_name_pl2, cl_stad_pl2, hometown_pl2, ttl_player_pl2);
                            pl2.add(data_pl2);
                            System.out.println("\n");
                            data_pl2.done_add();
                            data_pl2.done_add(cl_name_pl2);
                            confirm();
                            cls();
                            break;

                        case 3 :
                            System.out.println("===== INPUT CLUB DATA =====");
                            System.out.print("\n");
                            System.out.println("Input Club Name : ");
                            String cl_name_u18 = br.readLine();
                            System.out.println("Input Home Stadium : ");
                            String cl_stad_u18 = br.readLine();
                            System.out.println("Input Home Town : ");
                            String hometown_u18 = br.readLine();
                            System.out.println("Input Total Player");
                            int ttl_player_u18 = Integer.parseInt(br.readLine());
                            u18 data_u18 = new u18(cl_name_u18, cl_stad_u18, hometown_u18, ttl_player_u18);
                            u18.add(data_u18);
                            System.out.println("\n");
                            data_u18.done_add();
                            data_u18.done_add(cl_name_u18);
                            confirm();
                            cls();
                            break;
                    }
                break;
                case 2 :
                    System.out.println("===== READ CLUB DATA =====");
                    System.out.println("\n");
                    System.out.println("1. First Team");
                    System.out.println("2. PL2");
                    System.out.println("3. U18");
                    System.out.println("Choose which team : ");
                    int pilih_read = Integer.parseInt(br.readLine());
                    cls();
                    switch(pilih_read){
                        case 1 :
                            System.out.println("===== CLUB DATA =====");
                            System.out.println("\n");
                            for(int idx = 0; idx < ft.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+ft.get(idx).getclname());
                                System.out.println("Home Stadium : "+ft.get(idx).getclstadium());
                                System.out.println("Home Town : "+ft.get(idx).gethometown());
                                System.out.println("Total Player : "+ft.get(idx).gettotal_player());
                                System.out.print("\n");
                            }
                            confirm();
                            cls();
                            break;

                        case 2 :
                            System.out.println("===== CLUB DATA =====");
                            System.out.println("\n");
                            for(int idx = 0; idx < pl2.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+pl2.get(idx).getclname());
                                System.out.println("Home Stadium : "+pl2.get(idx).getclstadium());
                                System.out.println("Home Town : "+pl2.get(idx).gethometown());
                                System.out.println("Total Player : "+pl2.get(idx).gettotal_player());
                                System.out.print("\n");
                            }
                            confirm();
                            cls();
                            break;

                        case 3 :
                            System.out.println("===== CLUB DATA =====");
                            System.out.println("\n");
                            for(int idx = 0; idx < u18.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+u18.get(idx).getclname());
                                System.out.println("Home Stadium : "+u18.get(idx).getclstadium());
                                System.out.println("Home Town : "+u18.get(idx).gethometown());
                                System.out.println("Total Player : "+u18.get(idx).gettotal_player());
                                System.out.print("\n");
                            }
                            confirm();
                            cls();
                            break;
                    }
                break;
                case 3 :
                    System.out.println("===== UPDATE CLUB DATA =====");
                    System.out.println("\n");
                    System.out.println("1. First Team");
                    System.out.println("2. PL2");
                    System.out.println("3. U18");
                    System.out.println("Choose which team : ");
                    int pilih_update = Integer.parseInt(br.readLine());
                    cls();
                    switch(pilih_update){
                        case 1 :
                            System.out.println("===== CLUB DATA =====");
                            System.out.println("\n");
                            for(int idx = 0; idx < ft.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+ft.get(idx).getclname());
                                System.out.println("Home Stadium : "+ft.get(idx).getclstadium());
                                System.out.println("Home Town : "+ft.get(idx).gethometown());
                                System.out.println("Total Player : "+ft.get(idx).gettotal_player());
                                System.out.print("\n");
                            }

                            System.out.println("===== UPDATE CLUB DATA =====");
                            System.out.print("\n");
                            System.out.println("Club Index = ");
                            int idxx = Integer.parseInt(br.readLine());
                            if(idxx > 0 && idxx <= ft.size()){
                                idxx -= 1;
                                System.out.println("===== INPUT NEW CLUB DATA =====");
                                System.out.println("Input Club Name : ");
                                ft.get(idxx).setclname(br.readLine());
                                System.out.println("Input Home Stadium : ");
                                ft.get(idxx).setclstadium(br.readLine());
                                System.out.println("Input Home Town : ");
                                ft.get(idxx).sethometown(br.readLine());
                                System.out.println("Input total Player : ");
                                ft.get(idxx).settotal_player(Integer.parseInt(br.readLine()));
                                System.out.println("Update completed.");
                            }
                            else{
                                System.out.println("No Data Found.");
                            }
                            confirm();
                            cls();
                            break;

                        case 2 :
                            System.out.println("===== CLUB DATA =====");
                            System.out.println("\n");
                            for(int idx = 0; idx < pl2.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+pl2.get(idx).getclname());
                                System.out.println("Home Stadium : "+pl2.get(idx).getclstadium());
                                System.out.println("Home Town : "+pl2.get(idx).gethometown());
                                System.out.println("Total Player : "+pl2.get(idx).gettotal_player());
                                System.out.print("\n");
                            }

                            System.out.println("===== UPDATE CLUB DATA =====");
                            System.out.print("\n");
                            System.out.println("Club Index = ");
                            int idxxx = Integer.parseInt(br.readLine());
                            if(idxxx > 0 && idxxx <= pl2.size()){
                                idxxx -= 1;
                                System.out.println("===== INPUT NEW CLUB DATA =====");
                                System.out.println("Input Club Name : ");
                                pl2.get(idxxx).setclname(br.readLine());
                                System.out.println("Input Home Stadium : ");
                                pl2.get(idxxx).setclstadium(br.readLine());
                                System.out.println("Input Home Town : ");
                                pl2.get(idxxx).sethometown(br.readLine());
                                System.out.println("Input total Player : ");
                                pl2.get(idxxx).settotal_player(Integer.parseInt(br.readLine()));
                                System.out.println("Update completed.");
                            }
                            else{
                                System.out.println("No Data Found.");
                            }
                            confirm();
                            cls();
                            break;

                        case 3 :
                            System.out.println("===== CLUB DATA =====");
                            System.out.println("\n");
                            for(int idx = 0; idx < u18.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+u18.get(idx).getclname());
                                System.out.println("Home Stadium : "+u18.get(idx).getclstadium());
                                System.out.println("Home Town : "+u18.get(idx).gethometown());
                                System.out.println("Total Player : "+u18.get(idx).gettotal_player());
                                System.out.print("\n");
                            }

                            System.out.println("===== UPDATE CLUB DATA =====");
                            System.out.print("\n");
                            System.out.println("Club Index = ");
                            int idxxxx = Integer.parseInt(br.readLine());
                            if(idxxxx > 0 && idxxxx <= u18.size()){
                                idxxxx -= 1;
                                System.out.println("===== INPUT NEW CLUB DATA =====");
                                System.out.println("Input Club Name : ");
                                u18.get(idxxxx).setclname(br.readLine());
                                System.out.println("Input Home Stadium : ");
                                u18.get(idxxxx).setclstadium(br.readLine());
                                System.out.println("Input Home Town : ");
                                u18.get(idxxxx).sethometown(br.readLine());
                                System.out.println("Input total Player : ");
                                u18.get(idxxxx).settotal_player(Integer.parseInt(br.readLine()));
                                System.out.println("Update completed.");
                            }
                            else{
                                System.out.println("No Data Found.");
                            }
                            confirm();
                            cls();
                            break;
                    }
                break;
                case 4:
                    System.out.println("===== DELETE CLUB DATA =====");
                    System.out.println("\n");
                    System.out.println("1. First Team");
                    System.out.println("2. PL2");
                    System.out.println("3. U18");
                    System.out.println("Choose which team : ");
                    int pilih_delete = Integer.parseInt(br.readLine());
                    cls();
                    switch(pilih_delete){
                        case 1 : 
                            for(int idx = 0; idx < ft.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+ft.get(idx).getclname());
                                System.out.println("Home Stadium : "+ft.get(idx).getclstadium());
                                System.out.println("Home Town : "+ft.get(idx).gethometown());
                                System.out.print("\n");
                            }
                            System.out.println("===== DELETE CLUB DATA =====");
                            System.out.println("\n");
                            System.out.println("Club Index = ");
                            int idxxx = Integer.parseInt(br.readLine());
                            
                            if(idxxx > 0 && idxxx <= ft.size()){
                                ft.remove(idxxx - 1);
                                System.out.println("Data removed.");
                            }
                            else{
                                System.out.println("No Data Found.");
                            }
                            confirm();
                            cls();
                            break;
                        
                        case 2 :
                            for(int idx = 0; idx < pl2.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+pl2.get(idx).getclname());
                                System.out.println("Home Stadium : "+pl2.get(idx).getclstadium());
                                System.out.println("Home Town : "+pl2.get(idx).gethometown());
                                System.out.print("\n");
                            }
                            System.out.println("===== DELETE CLUB DATA =====");
                            System.out.println("\n");
                            System.out.println("Club Index = ");
                            int idxxxx = Integer.parseInt(br.readLine());
                            
                            if(idxxxx > 0 && idxxxx <= pl2.size()){
                                pl2.remove(idxxxx - 1);
                                System.out.println("Data removed.");
                            }
                            else{
                                System.out.println("No Data Found.");
                            }
                            confirm();
                            cls();
                            break;
                        
                        case 3 :
                            for(int idx = 0; idx < u18.size(); idx++){
                                System.out.println("Index : "+(idx+1));
                                System.out.println("Club Name : "+u18.get(idx).getclname());
                                System.out.println("Home Stadium : "+u18.get(idx).getclstadium());
                                System.out.println("Home Town : "+u18.get(idx).gethometown());
                                System.out.print("\n");
                            }
                            System.out.println("===== DELETE CLUB DATA =====");
                            System.out.println("\n");
                            System.out.println("Club Index = ");
                            int idxxxxx = Integer.parseInt(br.readLine());
                            
                            if(idxxxxx > 0 && idxxxxx <= u18.size()){
                                u18.remove(idxxxxx - 1);
                                System.out.println("Data removed.");
                            }
                            else{
                                System.out.println("No Data Found.");
                            }
                            confirm();
                            cls();
                            break;
                    }
                break;
            }
        }while(pilih != 0);
    }
}