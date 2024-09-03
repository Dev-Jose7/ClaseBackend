package exercises;

import java.util.Random;

public class Baloto {

    public static void main(String[] args) {
        Random random = new Random();
        int num1 = 30;
        int num2 = 15;
        int num3 = 17;
        int num4 = 43;
        int num5 = 76;
        int num6 = 92;
        int win1 = random.nextInt(100);
        int win2 = random.nextInt(100);
        int win3 = random.nextInt(100);
        int win4 = random.nextInt(100);
        int win5 = random.nextInt(100);
        int win6 = random.nextInt(100);

        int acierto = 0;

        if(num1 == win1){
            acierto++;
        }else if (num2 == win2){
            acierto++;
        }else if (num3 == win3){
            acierto++;
        }else if (num4 == win4){
            acierto++;
        }else if (num5 == win5){
            acierto++;
        }else if (num6 == win6){
            acierto++;
        }

        switch (acierto){
            case 1:{
                System.out.println("No gana");
                break;
            }

            case 2:{
                System.out.println("No gano");
                break;
            }

            case 3:{
                System.out.println("Libra billete");
                break;
            }

            case 4:{
                System.out.println("Gana 1'000.000");
                break;
            }

            case 5:{
                System.out.println("Gana 15'000.000");
                break;
            }

            case 6:{
                System.out.println("Gana 1'000.000.000");
                break;
            }

            default: {

                System.out.println("No acierto");

            }
        }


    }
}
