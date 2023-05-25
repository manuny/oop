package OOP_HomeWork_07_1;

import java.util.Scanner;

public class inputFromConsole {
         /* private String clientName;
         private String product;
         private Integer qnt;
         private Integer price;
         
         public inputFromConsole(String clientName,String product,Integer qnt, Integer price ) {
            this.clientName = clientName;
            this.product =  product;
            this. qnt =  qnt;
            this.price = price;
         } */
        
         public String getClientName() {
             return prompt("Client name: ");
         }
        public String getProduct() {
            return prompt("Product: ");
         }
        public Integer getQnt() {
            return Integer.parseInt(prompt("Quantity: "));
        }

          public Integer getPrice() {
              return  Integer.parseInt(prompt("Price: "));
          }
        
        /* clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "); */

        private String prompt(String message) {
        Scanner in = new Scanner(System.in);
            System.out.print(message);
            return in.nextLine();
        
    }
}
