package OOP_HomeWork_07_1;

import java.io.FileWriter;
import java.io.IOException;

public class saveToJson extends order {
    
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public saveToJson(String clientName, String product, Integer qnt, Integer price, String fileName) {
        super(clientName, product, qnt, price);
        this.fileName = fileName;
            
     try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ getClientName() + "\",\n");
            writer.write("\"product\":\""+ getClientName() +"\",\n");
            writer.write("\"qnt\":"+ getQnt() + ",\n");
            writer.write("\"price\":"+ getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
