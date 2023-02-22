import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Planeta tandanyz");
        System.out.println("1.Earth \n2.Mars \n3.Saturn \n4.Jupiter \n5.Pluton \n6.Neptun \n7.Merkuriy \n8.Uran \n9.Cholpon");
        while (true) {
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println(Planeta.EARTH+": Жерде жашоого болот, Жерде жашоо бар! ");
                    break;
                case 2:
                    System.out.println(Planeta.MARS + ": Марс жер планетасына окшош ! ");
                    break;
                case 3:
                    System.out.println(Planeta.SATURN + ": Сатурн Юпитерден кийинки эн чон планета! ");
                    break;
                case 4:
                    System.out.println(Planeta.JUPITER + ": Юпитер кун системасында колому боюнча эн чон планета! ");
                    break;
                case 5:
                    System.out.println(Planeta.PLUTON + ": Плутондун физикалык муноздомолору толук изделене элек!  ");
                    break;
                case 6:
                    System.out.println(Planeta.NEPTUN+": Нептундун тусу, чондугу, массасы, атмосферасы Уранга окшош!");
                    break;
                case 7:
                    System.out.println(Planeta.MERKURIY+": Меркурий башка планеталарга караганда эн жакын планета! ");
                    break;
                case 8:
                    System.out.println(Planeta.URAN+": Уран эн чон планеталарга кирет, Диаметри боюнча 4 эсе чон!");
                    break;
                case 9:
                    System.out.println(Planeta.CHOLPON+": Чолпондун бетин кою булуттуу атмосфера каптап турат! ");
                    break;
                default:
                    System.out.println("9га чейинки эле сандарды танданыз!!!");
            }
        }
    }
}