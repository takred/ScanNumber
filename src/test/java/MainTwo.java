import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainTwo {
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<>();
//        8, 61, 52, 65, 22, 21, 32, 14, 75, 94, 94, 78, 40, 68, 78, 7, 75, 81, 90, 96, 35, 57, 63, 69, 57, 64, 3, 76, 19, 6, 16, 38, 1, 94, 64, 17, 29, 64, 22, 30, 85, 23, 49, 29, 80, 50, 15, 20, 14, 61, 73, 76, 23, 93, 26, 34, 38, 30, 11, 53, 56, 17, 88, 66, 14, 73, 79, 15, 29, 22, 22, 27, 64, 18, 10, 94, 68, 55, 46, 3, 61, 21, 82, 87, 55, 27, 57, 10, 53, 42, 87, 64, 67, 51, 80, 34, 0, 66, 49, 45
//        allNumbers.add(61);
//        allNumbers.add(52);
//        allNumbers.add(65);
//        allNumbers.add(22);
//        allNumbers.add(21);
//        allNumbers.add(32);
//        allNumbers.add(14);
//        allNumbers.add(75);
//        allNumbers.add(94);
//        allNumbers.add(94);
//        allNumbers.add(78);
//        allNumbers.add(40);
//        allNumbers.add(68);
//        allNumbers.add(78);
//        allNumbers.add(7);
//        allNumbers.add(75);
//        allNumbers.add(81);
//        allNumbers.add(90);
//        allNumbers.add(96);
//        allNumbers.add(35);
//        allNumbers.add(57);
//        allNumbers.add(63);
//        allNumbers.add(69);
//        allNumbers.add(57);
//        allNumbers.add(64);
//        allNumbers.add(3);
//        allNumbers.add(76);
//        allNumbers.add(19);
//        allNumbers.add(6);
//        allNumbers.add(16);
//        allNumbers.add(38);
//        allNumbers.add(1);
//        allNumbers.add(94);
//        allNumbers.add(64);
//        allNumbers.add(17);
//        allNumbers.add(29);
//        allNumbers.add(64);
//        allNumbers.add(22);
//        allNumbers.add(30);
//        allNumbers.add(85);
//        allNumbers.add(23);
//        allNumbers.add(49);
//        allNumbers.add(29);
//        allNumbers.add(80);
//        allNumbers.add(50);
//        allNumbers.add(15);
//        allNumbers.add(20);
//        allNumbers.add(14);
//        allNumbers.add(61);
//        allNumbers.add(73);
//        allNumbers.add(76);
//        allNumbers.add(23);
//        allNumbers.add(93);
//        allNumbers.add(26);
//        allNumbers.add(34);
//        allNumbers.add(38);
//        allNumbers.add(30);
//        allNumbers.add(11);
//        allNumbers.add(53);
//        allNumbers.add(56);
//        allNumbers.add(17);
//        allNumbers.add(88);
//        allNumbers.add(66);
//        allNumbers.add(14);
//        allNumbers.add(73);
//        allNumbers.add(79);
//        allNumbers.add(15);
//        allNumbers.add(29);
//        allNumbers.add(22);
//        allNumbers.add(22);
//        allNumbers.add(27);
//        allNumbers.add(64);
//        allNumbers.add(18);
//        allNumbers.add(10);
//        allNumbers.add(94);
//        allNumbers.add(68);
//        allNumbers.add(55);
//        allNumbers.add(46);
//        allNumbers.add(3);
//        allNumbers.add(61);
//        allNumbers.add(21);
//        allNumbers.add(82);
//        allNumbers.add(87);
//        allNumbers.add(55);
//        allNumbers.add(27);
//        allNumbers.add(57);
//        allNumbers.add(10);
//        allNumbers.add(53);
//        allNumbers.add(42);
//        allNumbers.add(87);
//        allNumbers.add(64);
//        allNumbers.add(67);
//        allNumbers.add(51);
//        allNumbers.add(80);
//        allNumbers.add(34);
//        allNumbers.add(0);
//        allNumbers.add(66);
//        allNumbers.add(49);
//        allNumbers.add(45);
        for (int i = 0; i < 100; i++) {
            allNumbers.add(ThreadLocalRandom.current().nextInt(0, 100));
        }
        List<Integer> sortNumbers = new ArrayList<>();
        int minNumber;
        int maxNumber = 0;
        int countInSort = 0;
        int countInAll = 0;
        ScanOnCopy scanOnCopy = new ScanOnCopy();
        for (int i = 0; i < allNumbers.size(); i++) {
            if (allNumbers.get(i) > maxNumber){
                maxNumber = allNumbers.get(i);
            }
        }
        for (int i = 0; i < allNumbers.size(); i++) {
            minNumber = maxNumber;
            System.out.println(i);
            for (int j = 0; j < allNumbers.size(); j++) {
                if (sortNumbers.size() > 0 && sortNumbers.get(sortNumbers.size() - 1) < allNumbers.get(j) && minNumber > allNumbers.get(j)){
                    System.out.println("зашло!");
                    minNumber = allNumbers.get(j);
                } else if (sortNumbers.size() == 0 && minNumber > allNumbers.get(j)){
                    minNumber = allNumbers.get(j);
                }
            }
            countInAll = scanOnCopy.scan(allNumbers, minNumber);
            countInSort = scanOnCopy.scan(sortNumbers, minNumber);
            if (countInSort == 0){
                for (int j = 0; j < countInAll - countInSort; j++) {
                    sortNumbers.add(minNumber);
                }
            }
        }
//        allNumbers.sort(Comparator.naturalOrder());
        System.out.println(allNumbers);
        System.out.println(allNumbers.size());
        System.out.println(sortNumbers);
        System.out.println(sortNumbers.size());
        A a = new A();
        System.out.println("1 / 2 = " + 1/ 2);
        System.out.println(a.sort(allNumbers, 1));
        System.out.println(a.sortBisection(allNumbers, 1));
    }
}
