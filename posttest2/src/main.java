import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<data_klub> dataklub = new ArrayList<data_klub>();

    public static void cls(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void confirm() throws IOException {
        System.out.print("Enter to continue.");
        br.readLine();
    }

    public static void main(String[] args) throws IOException{
        Scanner inp = new Scanner(System.in);

        int pilih;
        do{
            cls();
            System.out.println("===== ENGLAND NOT SO PREMIER LEAGUE CLUB DATA =====");
            System.out.println("\n");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.println("Choose : ");
            pilih = inp.nextInt();
            cls();

            switch(pilih){
                case 1 :
                    System.out.println("===== INPUT CLUB DATA =====");
                    System.out.print("\n");
                    System.out.println("Input Club Name : ");
                    String cl_name = br.readLine();
                    System.out.println("Input Home Stadium : ");
                    String cl_stad = br.readLine();
                    System.out.println("Input Total Player : ");
                    int ttl_ply = Integer.parseInt(br.readLine());
                    dataklub.add(new data_klub(cl_name, cl_stad, ttl_ply));
                    System.out.println("Data added.");
                    confirm();
                    cls();
                break;
                case 2 :
                    System.out.println("===== CLUB DATA =====");
                    System.out.println("\n");
                    for(int idx = 0; idx < dataklub.size(); idx++){
                        System.out.println("Index : "+(idx+1));
                        System.out.println("Club Name : "+dataklub.get(idx).getclname());
                        System.out.println("Home Stadium : "+dataklub.get(idx).getclstadium());
                        System.out.println("Total Player : "+dataklub.get(idx).getplayerttl());
                        System.out.print("\n");
                    }
                    confirm();
                    cls();
                break;
                case 3 :
                    for(int idx = 0; idx < dataklub.size(); idx++){
                        System.out.println("Index : "+(idx+1));
                        System.out.println("Club Name : "+dataklub.get(idx).getclname());
                        System.out.println("Home Stadium : "+dataklub.get(idx).getclstadium());
                        System.out.println("Total Player : "+dataklub.get(idx).getplayerttl());
                        System.out.print("\n");
                    }
                    System.out.println("===== UPDATE CLUB DATA =====");
                    System.out.print("\n");
                    System.out.println("Club Index = ");
                    int idxx = Integer.parseInt(br.readLine());

                    if(idxx > 0 && idxx <= dataklub.size()){
                        idxx -= 1;
                        System.out.println("===== INPUT NEW CLUB DATA =====");
                        System.out.println("Input Club Name : ");
                        dataklub.get(idxx).setclname(br.readLine());
                        System.out.println("Input Home Stadium : ");
                        dataklub.get(idxx).setclstadium(br.readLine());
                        System.out.println("Input Total Player : ");
                        dataklub.get(idxx).setplayerttl(Integer.parseInt(br.readLine()));
                        System.out.println("Update completed.");
                    }
                    else{
                        System.out.println("No Data Found.");
                    }
                    confirm();
                    cls();
                break;
                case 4:
                    for(int idx = 0; idx < dataklub.size(); idx++){
                        System.out.println("Index : "+(idx+1));
                        System.out.println("Club Name : "+dataklub.get(idx).getclname());
                        System.out.println("Home Stadium : "+dataklub.get(idx).getclstadium());
                        System.out.println("Total Player : "+dataklub.get(idx).getplayerttl());
                        System.out.print("\n");
                    }
                    System.out.println("===== DELETE CLUB DATA =====");
                    System.out.println("\n");
                    System.out.println("Club Index = ");
                    int idxxx = Integer.parseInt(br.readLine());
                    
                    if(idxxx > 0 && idxxx <= dataklub.size()){
                        dataklub.remove(idxxx - 1);
                        System.out.println("Data removed.");
                    }
                    else{
                        System.out.println("No Data Found.");
                    }
                    confirm();
                    cls();
                break;
            }
        }while(pilih != 0);
    }
}