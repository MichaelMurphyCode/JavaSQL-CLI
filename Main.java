import java.util.Scanner;

public class Main {

    static void createTable(Scanner scanner) {
        System.out.print("Table name: ");
        String tableName = scanner.next();
        System.out.print("Column name: ");
        String column = scanner.next();
        System.out.print("Do you want to create VARCHAR? [y/n]: ");
        String yN = scanner.next();
        if (yN.equalsIgnoreCase("y")) {
            System.out.println("Creating SQL Table...");
            System.out.printf(
                    "CREATE TABLE %s (%s VARCHAR(50));%n",
                    tableName,
                    column
            );
        } else {
            System.out.printf(
                    "CREATE TABLE %s (%s);%n",
                    tableName,
                    column
            );
        }
    }

    static void Adddata(Scanner scanner){
        System.out.print("Table Name: ");
        String tableName = scanner.next();
        System.out.print("Column Name: ");
        String column = scanner.next();
        System.out.print("Data: ");
        String data = scanner.next();

        System.out.printf(
                "INSERT INTO %s (%s) VALUES ('%s');%n",
                tableName,
                column,
                data
        );
    }

    static void Getdata(Scanner scanner){
        System.out.print("Table name: ");
        String tableName = scanner.next();

        System.out.printf(
                "SELECT * FROM %s;%n",
                tableName
        );
    }

    static void ChangeData(Scanner scanner){
        System.out.print("Table Name: ");
        String tableName = scanner.next();
        System.out.print("Column to change: ");
        String column = scanner.next();
        System.out.print("new Data: ");
        String data = scanner.next();
        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.printf(
                "UPDATE %s SET %s = '%s' WHERE id = %d;%n",
                tableName,
                column,
                data,
                id
        );
    }

    static void Deletedata(Scanner scanner){
        System.out.print("Table Name: ");
        String tableName = scanner.next();
        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.printf(
                "DELETE FROM %s WHERE id = %d;%n",
                tableName,
                id
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ASCII = """
                
                  ___  ___  _       ___ ___ _   _ ___     ___                       _          \s
                 / __|/ _ \\| |     / __| _ \\ | | |   \\   / __|___ _ _  ___ _ _ __ _| |_ ___ _ _\s
                 \\__ \\ (_) | |__  | (__|   / |_| | |) | | (_ / -_) ' \\/ -_) '_/ _` |  _/ _ \\ '_|
                 |___/\\__\\_\\____|  \\___|_|_\\\\___/|___/   \\___\\___|_||_\\___|_| \\__,_|\\__\\___/_| \s
                
                """;

        System.out.println(ASCII);

        String choice = """
                1. Create Table - CREATE TABBLE
                2. Add Data - INSERT INTO
                3. Get Data - SELECT
                4. Chanage Data - UPDATE
                5. Delete Data - DELETE
                """;
        System.out.println(choice);
        System.out.print("Choose: ");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                createTable(scanner);
                break;
            case 2:
                Adddata(scanner);
                break;
            case 3:
                Getdata(scanner);
                break;
            case 4:
                ChangeData(scanner);
                break;
            case 5:
                Deletedata(scanner);
                break;
        }

        scanner.close();
    }
}