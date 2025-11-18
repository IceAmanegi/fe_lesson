package exam;

import java.util.Calendar;

public class exam_5 {
    public void output(){
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;

        String monthName = "";

        if(month == 1){
            monthName=("January");
        }
        if(month == 2){
            monthName=("Feburuary");
        }
        if(month == 3){
            monthName=("March");
        }
        if(month == 4){
            monthName=("April");
        }
        if(month == 5){
            monthName=("May");
        }
        if(month == 6){
            monthName=("June");
        }
        if(month == 7){
            monthName=("July");
        }
        if(month == 8){
            monthName=("August");
        }
        if(month == 9){
            monthName=("September");
        }
        if(month == 10){
            monthName=("October");
        }
        if(month == 11){
            monthName=("November");
        }
        if(month == 12){
            monthName=("December");
        }
        System.out.println(monthName);
    }
}