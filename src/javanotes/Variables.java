package javanotes;
//Tipo de variables: primitivas y clases envoltorio
//Garbage collection
public class Variables {

    public static void main(String[] args) {
        //Casting
        //Se castea la varible para cambiar su tipo de varible y así almacenar más datos en memoria manteniendo los valores que cuenta la varible
        byte moveLeft; //declarando variable
        moveLeft = 127;
        short moveLeft2 = (short) moveLeft;
        System.out.print(moveLeft2);


        //Parse de variables
        //Recibe dos valores numericos pero uno de  ellos es de tipo String;
        int num1 = 19;
        String num2 = "23";

        int newNum2 = Integer.parseInt(num2);

        float promedio = (num1 + newNum2) / 2;

        System.out.println(promedio);

    }
}
