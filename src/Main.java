/**
 * Created by bruhanda on 17.12.16.
 */
public class Main {
    public static void main(String[] args) {
//        String[][] kicks = {
//                {"Удар головой в нос", String.valueOf(-20)},
//                {"Удар по ногам", String.valueOf(-10)},
//                {"Удар рукой в харю", String.valueOf(-15)},
//                {"Удар рукой в дых", String.valueOf(-5)},
//                {"Удар по яйцам", String.valueOf(-35)}
//        };
//
//        //System.out.print(kicks[0][1]);
//
//        for (int i=0; i<=kicks.length; i++){
//            //System.out.println(kicks[i]);
//
//        }
        Robot one = new Robot("R2D2");
        Robot two = new Robot("С-3PO");

        Fight fight = new Fight(one, two);
    }
}
