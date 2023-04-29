import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Péntek este van
        // Start pont: Schönherz Kollégium
        // Borároson öreglány helyátadás - extra
        // Minden megállóban 2 lehetőség: leszállsz vagy továbbmész
        // Mester utcánál fedél nélkül árus -
        // Corvin tér és a Rákóczi között lehányhat egy csöves
        // Blahánál egy BossFight - ha nyer irány a spanokhoz
        // Nehézségi szint - Wesselényi, Király, Oktogon
        // Nyugatinál egy parfüm árús - ha megveszed a parfümöt nem tudsz becsajozni
        // Jászainál színvallatás
        // Pozitív kimenetel: Hazaérünk egyben az értékeinkkel
        // Negatív kimenetel: A detoxon kelt Zacher Gábor
        // Blahán Gyrosozik a brigád

        System.out.println("Üdvözlünk Kedves játékos, ezen hosszú hét pénteki napján a kalandod kezdetét veszi," +
                "utad a 4-6 felé vezet a bajtársaid a valahol városban várnak Téged, feladatod elhárítani az akadályokat és" +
                "állomásról állomásra megtalálni őket!");
        System.out.println("A villamos elindult");
        System.out.println("Hirtelen egy jellegzetes buké csapja meg az orrod," +
                " ahhoz hogy elkerüld friss levegőre van szükséged");
        int life = 100;
        System.out.println("A következő állomás: Boráros tér");
        int choice;
        boolean vomit = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("A horizonton feltűnik egy idős hölgy, és tekintetét rád szefezi");
        System.out.println("Mit teszel most?");
        System.out.println("1. Felhangosítod a zenét");
        System.out.println("2. Felkérdezed, hogy van-e valami az arcodon.");
        System.out.println("3. Átadod az ülőhelyet.");
        choice = scan.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Szidni kezdi a fiatalságot és tovább áll");
            case 2 -> {
                System.out.println("Bokánrugott");
                life -= 5;
            }
            case 3 -> {
                System.out.println("Amikor leült rádkacsit ;-)!");
                life += 50;
            }
        }
        System.out.println("A következő állomás: Mester utca");
        System.out.println("Mit teszel most?");
        System.out.println("1. Femtmaradsz a villamoson");
        System.out.println("2. Leszállsz a villamosról");
        choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Egy jólszituált bátyja 'Fedélnélkülle' kínál");
                System.out.println("Mit teszel most?");
                System.out.println("1. Adsz neki pénzt");
                System.out.println("2. Azt mondod csak kártya van nálad");
                int subchoice = scan.nextInt();
                switch (subchoice) {
                    case 1 -> {
                        System.out.println("Bátyja szája mosolyra görbül és továbbáll");
                        vomit = false;
                    }
                    case 2 -> {
                        System.out.println("Átkozódás közepedte továbbáll");
                        vomit = true;
                    }
                }
            }
            case 2 -> {
                System.out.println("Rádkiabál egy ork és visszaszállsz a szekérre");
                vomit = true;
                life -= 5;
            }
        }
        System.out.println("A következő állomás: Corvin-negyed");
        System.out.println("Mit teszel most?");
        System.out.println("1. Femtmaradsz a villamoson");
        System.out.println("2. Leszállsz a villamosról");
        choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Egy illuminált társaság érkezik 2 ajtóval odébb");
                vomit = true;
                life -= 5;
            }
            case 2 -> System.out.println("Leszállsz körülnézni, rágyújtasz de nem találod a társaid. Visszaszállsz!");
        }
        System.out.println("A következő állomás: Harminckettesek-tere");
        System.out.println("Mit teszel most?");
        System.out.println("1. Femtmaradsz a villamoson");
        System.out.println("2. Leszállsz a villamosról");
        choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Az illuminált társaság 1 ajtóval közelebb lopakodik");
                life -= 5;
            }
            case 2 -> System.out.println("Leszállsz körülnézni, rágyújtasz de nem találod a társaid. Visszaszállsz!");
        }
        System.out.println("A következő állomás: Rákóczi tér");
        System.out.println("Mit teszel most?");
        System.out.println("1. Femtmaradsz a villamoson");
        System.out.println("2. Leszállsz a villamosról");
        choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Az illuminált társaság melléd érkezik");
                if (vomit == true) {
                    System.out.println("A társaság egyik tagja rád üríti gyomra tartalmát");
                    life -= 20;
                }
            }
            case 2 -> {
                System.out.println("Leszállsz körülnézni, rágyújtasz de nem találod a társaid. Visszaszállsz!" +
                        " Egy illuminált társaság melléd érkezik");
                if (vomit == true) {
                    System.out.println("A társaság egyik tagja rád üríti gyomra tartalmát");
                    life -= 20;
                }
            }

        }
        System.out.println("A következő állomás: -> BLAHA LUJZA TÉR <-");
        System.out.println("Mit teszel most?");
        System.out.println("1. Femtmaradsz a villamoson");
        System.out.println("2. Leszállsz a villamosról");
        choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Egy ogre árnyéka vetül rád, hirtelen megragad és a villamoson kívül találod magad.");
            }
            case 2 -> {
                System.out.println("Leszállsz és amikor rágyújtanál, egy Ogre tekintetét észleled a cigiden!");

            }

            //Importált kódrész
        }
        System.out.println("Harckedv: " + life);
        int attackPower = 20;
        int enemyHealth = 50;
        int enemyAttackPower = 10;
        int turn = 1;
        while (life > 0 && enemyHealth > 0) {
            System.out.println("Turn " + turn);
            System.out.println("Te következel");
            System.out.println("What do you want to do?");
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            int choice = scanner.nextInt();
            if (choice == 1) {
                int damageDealt = attackPower;
                System.out.println("You attack the enemy and deal " + damageDealt + " damage.");
                enemyHealth -= damageDealt;
            } else if (choice == 2) {
                System.out.println("You defend yourself.");
            } else {
                System.out.println("Invalid choice. You lose your turn.");
            }
            if (enemyHealth <= 0) {
                System.out.println("Congratulations, you have won the game!");
                break;
            }
            System.out.println("Enemy's turn:");
            int enemyChoice = (int) (Math.random() * 2) + 1;
            if (enemyChoice == 1) {
                int damageDealt = enemyAttackPower;
                System.out.println("The enemy attacks you and deals " + damageDealt + " damage.");
                life -= damageDealt;
            } else {
                System.out.println("The enemy defends itself.");
            }
            if (life <= 0) {
                System.out.println("Game over. You have lost.");
                break;
            }
            turn++;
        }
        scanner.close();
    }
}
    }
}