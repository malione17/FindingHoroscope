import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        boolean isError = false;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth month: ");
        month = input.nextInt();
        System.out.print("Please enter your birthday: ");
        day = input.nextInt();

        switch (month){
            case 1:
                if (day >=1 && day<=31){
                    if (day < 22){
                        burc = "Oğlak";
                    }else {
                        burc = "Kova";
                    }
                }else {
                    isError = true;
                }
                break;

            case 2:
                if (day >=1 && day<=28){
                    if (day < 20){
                        burc = "Kova";
                    }else {
                        burc = "Balık";
                    }
                }else {
                    isError = true;
                }
                break;

            case 3:
                if (day >= 1 && day<=31){
                    if (day < 21){
                        burc = "Balık";
                    }else {
                        burc = "Koç";
                    }
                }
                break;
            case 4:
                if (day >= 1 && day<=30){
                    if (day < 21){
                        burc = "Koç";
                    }else {
                        burc = "Boğa";
                    }
                }else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31){
                    if (day < 22){
                        burc = "Boğa";
                    }else {
                        burc = "İkizler";
                    }
                }else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day<=30){
                    if (day < 23){
                        burc = "İkizler";
                    }else {
                        burc = "Yengeç";
                    }
                }else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <=31){
                    if (day < 23){
                        burc = "Yengeç";
                    }else {
                        burc = "Aslan";
                    }
                }else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day < 31){
                    if (day < 23){
                        burc = "Aslan";
                    }else {
                        burc = "Başak";
                    }
                }else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day < 30){
                    if (day < 23){
                        burc = "Başak";
                    }else {
                        burc = "Terazi";
                    }
                }else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day < 31){
                    if (day < 23){
                        burc = "Terazi";
                    }else {
                        burc = "Akrep";
                    }
                }else {
                    isError = true;
                }
                break;
            case 11:
                if (day >=1 && day < 30){
                    if (day < 22){
                        burc = "Akrep";
                    }else {
                        burc = "Yay";
                    }
                }else {
                    isError = true;
                }
                break;
            case 12:
                if (day >=1 && day < 31){
                    if (day < 22){
                        burc = "Yay";
                    }else {
                        burc = "Oğlak";
                    }
                }else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError){
            System.out.println("You made a mistake.Please try again..");
        }else {
            System.out.println("Your horoscope : "+burc);
        }


    }
}