import java.util.Scanner;
public class NokiaPhone{
    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);
System.out.println("Nokia Menu");
    System.out.println("1: Phone book: ");
    System.out.println("2: Messages: ");
    System.out.println("3: Chat: ");
    System.out.println("4: Call register: ");
    System.out.println("5: Tones: ");
    System.out.println("6: Settings: ");
    System.out.println("7: Call divert: ");
    System.out.println("8: Games: ");
    System.out.println("9: Calculator: ");
    System.out.println("10: Reminders: ");
    System.out.println("11: Clock: ");
    System.out.println("12: Profiles: ");dd
    System.out.println("13: SIM services: ");

System.out.print("\nEnter options 1 to 13: ");
  int option = inputCollector.nextInt();

switch (option) {

  case 1:System.out.println("\nPhone book");            
 System.out.println("1: Search");
 System.out.println("2: Service Nos");
 System.out.println("3: Add name");
 System.out.println("4: Erase");
 System.out.println("5: Edit");
 System.out.println("6: Assign tone");
 System.out.println("7: Send b'card");
 System.out.println("8: Options");
 System.out.println("9: Speed dials");
 System.out.println("10: Voice tags");

   System.out.print("\nPhonebook options 1 to 10: ");
    int Phonebook = inputCollector.nextInt();

switch (Phonebook) {
    case 1: System.out.println("\n> Search");
break;
    case 2: System.out.println("\n> Se2rvice Nos");
break;
    case 3: System.out.println("\n> Add name");
break;
    case 4: System.out.println("\n> Erase");
break;
    case 5: System.out.println("\n> Edit");
break;
    case 6: System.out.println("\n> Assign tone");
break;
    case 7: System.out.println("\n> Send b'card");
break;
    case 8: System.out.println("\n> Options");
            System.out.println("1: Type of view");
            System.out.println("2: Memory status");

             System.out.print("\nChoose options: ");
             int type = inputCollector.nextInt();
switch (type) {
    case 1: System.out.println("\n> Type of view");
break;
    case 2: System.out.println("\n> Memory status");
break;
    default: System.out.println("\n> invalid choice");
    }
break;

    case 9: System.out.println("\n> Speed dials");
break;
    case 10: System.out.println("\n> Voice tags");
break;
    default: System.out.println("\n> Invalid choice");
    } 
break;                                                             


    case 2:System.out.println("\nMessages: ");                     
         System.out.println("1: Write messages");
         System.out.println("2: Inbox");
         System.out.println("3: Outbox");
         System.out.println("4: Picture messages");
         System.out.println("5: Template");
         System.out.println("6: Smileys");
         System.out.println("7: Message Settings");
         System.out.println("8: Info service");
         System.out.println("9: Voice mailbox number");
         System.out.println("10: Service command editor");

           System.out.print("\nMessages options 1 to 10: ");
            int message = inputCollector.nextInt();

         switch (message) {
    case 1: System.out.println("\n> Write messages");
break;
    case 2: System.out.println("\n> Inbox");
break;
    case 3: System.out.println("\n> Outbox");
break;
    case 4: System.out.println("\n> Picture messages");
break;
    case 5: System.out.println("\n> Template");
break;
    case 6: System.out.println("\n> Smileys");
break;
    case 7: System.out.println("\n> Message Settings");
            System.out.println("1: Set");
            System.out.println("2: Common");

             System.out.print("Choose options: ");
             int setting = inputCollector.nextInt();
switch (setting) {
    case 1: System.out.println("\n> Set");
            System.out.print(">> Message center number");
            System.out.print("\n>> Messages sent as");
            System.out.println("\n>> Message validity");

             System.out.print("Select: ");
             int set = inputCollector.nextInt();
switch (set) {
    case 1: System.out.println("\n> > Message center number");
break;
    case 2: System.out.println("\n> > Messages sent as");
break;
    case 3: System.out.println("\n> > Message validity");
break;
    default: System.out.println("\n> > Invalid choice");
    }


    case 2: System.out.println("\n> Common");
            System.out.print(">> Delivery reports");
            System.out.print("\n>> Reply via same centre");
            System.out.print("\n>> Character support");

             System.out.print("\nSelect: ");
             int common = inputCollector.nextInt();
switch (common) {
    case 1: System.out.println("\n> > Delivery reports");
break;
    case 2: System.out.println("\n> > Reply via same center");
break;
    case 3: System.out.println("\n> > Character support");
break;
    default: System.out.println("\n> > Invalid choice");
    }
break;
    }
break;

    case 8: System.out.println("\n> Info service");
break;
    case 9: System.out.println("\n> Voice mailbox number");
break;
    case 10: System.out.println("\n> Service command editor");
break;
    default: System.out.println("\n> Invalid choice");
    } 
 break;                                                                    


    case 3:System.out.println("3: Chat");              
break;                                                     


   case 4:System.out.println("\nCall register");       
    System.out.println("1: Missed calls");
    System.out.println("2: Recieve calls");
    System.out.println("3: Dialled numbers");
    System.out.println("4: Erase recent call lists");
    System.out.println("5: Show call duration");
    System.out.println("6: Show call costs");
    System.out.println("7: Call cost Settings");
    System.out.println("8: Prepaid credit");

           System.out.print("\nCall register 1 to 8: ");
            int call = inputCollector.nextInt();

         switch (call) {
    case 1: System.out.println("\n> Missed calls");
break;
    case 2: System.out.println("\n> Recieve calls");
break;
    case 3: System.out.println("\n> Dialled numbers");
break;
    case 4: System.out.println("\n> Erase recent call lists");
break;
    case 5: System.out.println("\n> Show call duration");
            System.out.println("1: Last call duration");
            System.out.println("2: All calls duration");
            System.out.println("3: Recieved calls duration");
            System.out.println("4: Dialled calls duration");
            System.out.println("5: Clear timers");

    System.out.println("Options: ");
     int durations = inputCollector.nextInt();

switch (durations) {
    case 1: System.out.println("\n> > Last call duration");
break;
    case 2: System.out.println("\n> > All calls duration");
break;
    case 3: System.out.println("\n> > Recieved calls duration");
break;
    case 4: System.out.println("\n> > Dialled calls duration");
break;
    case 5: System.out.println("\n> > Clear timers");
break;
    default: System.out.println("\n> > Invalid choice");
}
break;

    case 6: System.out.println("\n> Show call costs");
            System.out.println("1: Last call cost");
            System.out.println("2: All call's cost");
            System.out.println("3: Clear counters");

    System.out.print("Options: ");
     int costs = inputCollector.nextInt();

switch (costs) {
    case 1: System.out.println("\n> > Last call cost ");
break;
    case 2: System.out.println("\n> > All call's cost");
break;
    case 3: System.out.println("\n> > Clear counters");
break;
    default: System.out.println("\n> > Invalid choice");
}
break;

    case 7: System.out.println("\n> Call cost Settings");
            System.out.println("1: Call cost limit");
            System.out.println("2: Show cost in");

     System.out.print("Choose options: ");
      int cost = inputCollector.nextInt();

switch (cost) {
    case 1: System.out.println("\n> > Call cost limit");
break;
    case 2: System.out.println("\n> > Show costs in");
break;
    default: System.out.println("\n> > Invalid choice");
break;
    }
break;

    case 8: System.out.println("\n> Prepaid credit");
break;
    default:System.out.println("\n>Invalid choice");
break;
  }
break;


    case 5:System.out.println("5: Tones: ");
    System.out.println("1: Ringing tone");
    System.out.println("2: Ringing volume");
    System.out.println("3: Incoming call alert");
    System.out.println("4: Composer");
    System.out.println("5: Message alert tone");
    System.out.println("6: Keypad tones");
    System.out.println("7: Warning and games tone");
    System.out.println("8: Vibrating alert");
    System.out.println("9: Screen saver");

    System.out.print("\n> Tones 1 to 9: ");
     int tones = inputCollector.nextInt();

switch (tones) {
    case 1: System.out.println("Ringing tone");
break;
    case 2: System.out.println("Ringing volume");
break; 
    case 3: System.out.println("Incoming call alert");
break;
    case 4: System.out.println("Composer");
break;
    case 5: System.out.println("Message alert tone");
break;
    case 6: System.out.println("Keypad tones");
break;
    case 7: System.out.println("Warning and games tone");
break;
    case 8: System.out.println("Vibrating alert");
break;
    case 9: System.out.println("Screen saver");
break;
    default: System.out.println("Invalid choice");
break;
}
break;


    case 6:System.out.println("Settings: ");
    System.out.println("1: Call settings");
    System.out.println("2: Phone settings");
    System.out.println("3: Security settings");
    System.out.println("4: Restore factory settings");

    System.out.println("\n> Sit 1 to 4: ");
     int sit = inputCollector.nextInt();
 
switch (sit) {
    case 1: System.out.println("\n> >Call settings");
        System.out.println("1: Automatci redail");
        System.out.println("2: Speed dailing");
        System.out.println("3: Call waiting options");
        System.out.println("4: Own number sending");
        System.out.println("5: Phone line in use");
        System.out.println("6: Automatic answer");

    System.out.println("options");
     int redail = inputCollector.nextInt();

switch (redail) {
    case 1: System.out.println("\n>>> Automatic redail");
break;
    case 2: System.out.println("\n>>> Speed dialing");
break;
    case 3: System.out.println("\n>>> Call waiting options");
break;
    case 4: System.out.println("\n>>> Own number sending");
break;
    case 5: System.out.println("\n>>> Phone line in use");
break;
    case 6: System.out.println("\n>>> Automatic answer");
break;
    default: System.out.println("\n>>> Invalid choice");
break;
}
break;


    case 2: System.out.println("\n> >Phone settings");
            System.out.println("1: Language");
            System.out.println("2: Cell info display");
            System.out.println("3: Welcome note");
            System.out.println("4: Network selection");
            System.out.println("5: Lights");
            System.out.println("5: Confirm SIM service actions");

    System.out.println("options");
     int phone = inputCollector.nextInt();

switch (phone) {
    case 1: System.out.println("\n>>> Language");
break;
    case 2: System.out.println("\n>>> Cell info display");
break;
    case 3: System.out.println("\n>>> Welcome note");
break;
    case 4: System.out.println("\n>>> Network selection");
break;
    case 5: System.out.println("\n>>> Lights");
break;
    case 6: System.out.println("\n>>> Confirm SIM service actions");
break;
    default: System.out.println("\n>>> Invalid choice");
break;
}
break;


    case 3: System.out.println("\n> >Security settings");
            System.out.println("1: PIN code request");
            System.out.println("2: Call barring services");
            System.out.println("3: Fixed dialling");
            System.out.println("4: Closed user group");
            System.out.println("5: Phone security");
            System.out.println("6: Change access codes");

    System.out.println("options");
     int security = inputCollector.nextInt();

switch (security) {
    case 1: System.out.println("\n>>> PIN code request");
break;
    case 2: System.out.println("\n>>> Call barring services");
break;
    case 3: System.out.println("\n>>> Fixed dialling");
break;
    case 4: System.out.println("\n>>> Closed user group");
break;
    case 5: System.out.println("\n>>> Phone security");
break;
    case 6: System.out.println("\n>>> Change access codes");
break;
    default: System.out.println("\n>>> Invalid choice");
break;
}
break;


    case 4: System.out.println("\n> >Restore factory settings");
break;
    default: System.out.println("\n> >Invalid choice");
break;
}
break;

    case 7:System.out.println("\n>Call divert: ");
break;
    case 8:System.out.println("\n>Games: ");
break;
    case 9:System.out.println("\n>Calculator: ");
break;
    case 10:System.out.println("\n>Reminders: ");
break;
    case 11:System.out.println("Clock: ");
            System.out.println("1: Alarm clock settings");
            System.out.println("2: Clock settings");
            System.out.println("3: Date setting");
            System.out.println("4: Stopwatch");
            System.out.println("5: Countdown timer");
            System.out.println("6: Auto update of date and time");

    System.out.println("options");
     int clock = inputCollector.nextInt();

switch (clock) {
    case 1: System.out.println("\n> > Alarm clock settings");
break;
    case 2: System.out.println("\n> > Clock settings");
break;
    case 3: System.out.println("\n> > Date setting");
break;
    case 4: System.out.println("\n> > Stopwatch");
break;
    case 5: System.out.println("\n> > Countdown timer");
break;
    case 6: System.out.println("\n> > Auto update of date and time");
break;
    default: System.out.println("\n> > Invalid choice");
break;
}
break;


    case 12:System.out.println("\n>Profiles: ");
break;
    case 13:System.out.println("\n>SIM services: ");
break;
    default: System.out.println("\n>Invalid choice");
break; 
}   

    }

}
