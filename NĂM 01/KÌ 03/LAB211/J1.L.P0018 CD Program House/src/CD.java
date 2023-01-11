
import java.util.Scanner;
import javax.swing.text.html.HTMLEditorKit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class CD {

    private final String regEx_String = "^[a-zA-Z]$";
    private String collectionName, type, title, id;
    private int unitPrice, publishingYear;

    public CD() {
        collectionName = "";
        type = "";
        title = "";
        unitPrice = 0;
        id = "";
        publishingYear = 0;
    }

    public CD(String collectionName, String type, String title, int unitPrice, String id, int publishingYear) {
        this.collectionName = collectionName;
        this.type = type;
        this.title = title;
        this.unitPrice = unitPrice;
        this.id = id;
        this.publishingYear = publishingYear;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void inputCdInfo() {
        Scanner sc = new Scanner(System.in);
        collectionName = Tool.input("Input Collection name [game/movie/music)]: ", "(GAME|MOVIE|MUSIC)", "Invalid collection name");
        type = Tool.input("Input Collection type (audio/video): ", "(AUDIO|VIDEO)", "Invalid collection type");
        title = Tool.input("Input Collection title: ", "^[a-zA-Z]+$", "Invalid collection title");
        unitPrice = Tool.inpputNumber("Input Unit price: ", "[0-9]+", "Invalid collection title");
        id = Tool.input("Input CD id: ", "^[a-zA-Z]+$", "Invalid CD id");
        publishingYear = Tool.inpputNumber("Input publishing year: ", "^\\d{4}$", "Invalid publishing year");
    }

    public void updateInfo() {
        Scanner sc = new Scanner(System.in);
        String collectionName, type, title, id, unitPrice, publishingYear;
        while (true) {
            try {
                System.out.print("Input Collection name [game/movie/music)]: ");
                collectionName = sc.nextLine().toUpperCase();
                if (collectionName.isEmpty()) {
                    this.collectionName = this.collectionName;
                } else {
                    if (!collectionName.matches("(GAME|MOVIE|MUSIC)")) {
                        throw new Exception();
                    }
                    this.collectionName = collectionName;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid collection name");
            }
        }

        while (true) {
            try {
                System.out.print("Input Collection type (audio/video): ");
                type = sc.nextLine().toUpperCase();
                if (type.isEmpty()) {
                    this.type = this.type;
                } else {
                    if (!type.matches("(AUDIO|VIDEO)")) {
                        throw new Exception();
                    }
                    this.type = type;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid collection type");
            }
        }
        while (true) {
            try {
                System.out.print("Input Collection title: ");
                title = sc.nextLine().toUpperCase();
                if (title.isEmpty()) {
                    this.title = this.title;
                } else {
                    if (!title.matches("^[a-zA-Z]+$")) {
                        throw new Exception();
                    }
                    this.title = title;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid title");
            }
        }
        while (true) {
            try {
                System.out.print("Input Unit price: ");
                unitPrice = sc.nextLine();
                if (unitPrice.isEmpty()) {
                    this.unitPrice = this.unitPrice;
                } else {
                    if (!unitPrice.matches("[0-9]+")) {
                        throw new Exception();
                    }
                    this.unitPrice = Integer.parseInt(unitPrice);
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }

        while (true) {
            try {
                System.out.print("Input CD id: ");
                id = sc.nextLine().toUpperCase();
                if (id.isEmpty()) {
                    this.id = this.id;
                } else {
                    if (!id.matches("^[a-zA-Z]+$")) {
                        throw new Exception();
                    }
                    this.id = id;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid id");
            }
        }
        while (true) {
            try {
                System.out.print("Input publishing year: ");
                publishingYear = sc.nextLine();
                if (publishingYear.isEmpty()) {
                    this.publishingYear = this.publishingYear;
                } else {
                    if (!unitPrice.matches("^\\d{4}$")) {
                        throw new Exception();
                    }
                    this.publishingYear = Integer.parseInt(publishingYear);
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid year");
            }
        }

    }

    public void outputCDInfo() {
        System.out.format("%-20s%-20s%-20s%-20d%-20s%-20d\n", collectionName, type, title, unitPrice, id, publishingYear);
    }

    @Override
    public String toString() {
        return collectionName + ";" + type + ";" +title +";"+ unitPrice + ";" + id + ";" + publishingYear;
    }

}
