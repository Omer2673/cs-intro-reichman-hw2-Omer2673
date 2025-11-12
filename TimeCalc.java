<<<<<<< HEAD
public class TimeCalc {

    public static void main(String[] args) {
        String[] parts = args[0].split(":");

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        
        int minutestoadd = Integer.parseInt(args[1]);

        int totalminutes = hours*60+minutes+minutestoadd;

        int almost_final_hours = totalminutes/60;
        int final_hours = (totalminutes / 60) % 24;

        int almost_final_minutes = 60*almost_final_hours;
        int final_minutes = totalminutes % 60;

        if (final_hours < 10) {
            System.out.print("0" + final_hours);
        } else {
            System.out.print(final_hours);
        }

        if (final_minutes < 10) {
            System.out.print(":0" + final_minutes);
        } else {
            System.out.print(":" + final_minutes);
        }

    }
}
=======
public class TimeCalc {

    public static void main(String[] args) {
        String[] parts = args[0].split(":");

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        
        int minutestoadd = Integer.parseInt(args[1]);

        int totalminutes = hours*60+minutes+minutestoadd;

        int almost_final_hours = totalminutes/60;
        int final_hours = (totalminutes / 60) % 24;

        int almost_final_minutes = 60*almost_final_hours;
        int final_minutes = totalminutes % 60;

        if (final_hours < 10) {
            System.out.print("0" + final_hours);
        } else {
            System.out.print(final_hours);
        }

        if (final_minutes < 10) {
            System.out.print(":0" + final_minutes);
        } else {
            System.out.print(":" + final_minutes);
        }

    }
}
>>>>>>> 09c0dfe (TimeCalc)
