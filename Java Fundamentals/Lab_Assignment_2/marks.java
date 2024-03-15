package Lab_Assignment_2;

public class marks {

    public static void main(String[] murtaza) {

        int[] phy = new int[50];
        int[] cal = new int[50];
        int[] oop = new int[50];
        int[] total = new int[50];
        int[] per = new int[50];

        int i = 0;

        for (int id = 133002; id <= 1330052; id++) {

            oop[i] = (int) (Math.random() * 50) + 50;

            phy[i] = (int) (Math.random() * 50) + 50;

            cal[i] = (int) (Math.random() * 50) + 50;

            total[i] = oop[i] + cal[i] + phy[i];

             per[i] = (int) (((double) total[i] / 300) * 100);


            i++;
        }

        System.out.println("\n    OOP  CAL  PHY  TOTAL  %");

        i = 0;

        System.out.println();

        for (int id = 133002; id <= 1330052; id++) {
            System.out.println(id + " " + oop[i] + " " + cal[i] + " " + phy[i] + " " + total[i] + " " + per[i]);
            i++;
        }
    }
}
