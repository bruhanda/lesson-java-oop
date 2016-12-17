import java.util.Random;

/**
 * Created by bruhanda on 17.12.16.
 */
public class Fight {

    public Fight(Robot one, Robot two) {
        String[][] kicks = {
                {"Удар головой в нос", String.valueOf(-20)},
                {"Удар по ногам", String.valueOf(-4)},
                {"Удар рукой в харю", String.valueOf(-8)},
                {"Удар рукой в дых", String.valueOf(-5)},
                {"Удар пальцем в глаз", String.valueOf(-4)},
                {"Удар по яйцам", String.valueOf(-35)},
                {"Удар с вертухи ", String.valueOf(-10)},
                {"Подсечка", String.valueOf(-5)},
                {"Удар в шею", String.valueOf(-6)}
        };



        Random generator = new Random();

        System.out.println("Судья выходит на арену и дает отмашку, бой начинается !!! ");
        System.out.println();

        while (true) {
            //рандомно выбираем кто будет давать по харе
            int randRobot = generator.nextInt(2);
            //рандомно генерируем удар
            int kick=generator.nextInt(kicks.length);
            //переводим повреждение из строки в int
            int demage=Integer.valueOf(kicks[kick][1]).intValue();

            if (randRobot == 1) {
                System.out.println("Робот "+two.getName()+ ": "+kicks[kick][0]);

                one.setHealth(one.getHealth()+demage);
                if(one.getHealth()<=0){
                    System.out.println();
                    System.out.println("-------------------------------------");
                    System.out.println("Победил робот "+two.getName());
                    System.out.println("-------------------------------------");
                    return;
                }
                System.out.println("У робота "+one.getName()+ " осталось здоровья: "+one.getHealth());
                System.out.println();
                System.out.println();

            } else {
                System.out.println("Робот "+one.getName()+ ": "+kicks[kick][0]);
                two.setHealth(two.getHealth()+demage);
                if(two.getHealth()<=0){
                    System.out.println();
                    System.out.println("-------------------------------------");
                    System.out.println("Победил робот "+one.getName());
                    System.out.println("-------------------------------------");
                    return;
                }
                System.out.println("У робота "+two.getName()+ " осталось здоровья: "+two.getHealth());
                System.out.println();
                System.out.println();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
