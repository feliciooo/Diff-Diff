import java.util.*;

public class Rentura_ChatBot {

    public static void main(String[] args) throws InterruptedException {
        
      //Utilities and for storing variables such as Product's Name and Price. 
        Scanner jlr = new Scanner (System.in);
        Random rand = new Random();
        
        ArrayList helpDesk = new ArrayList();
        Collections.addAll(helpDesk, "Compute your Items", "Product Information","Product Recommendation", "Shopping Feedbacks/Rating" );
        
        String[] wordsToBeAware = {"bad", "awful", "atrocious", "poor", "unsatisfactory",
        "unpleasant", "abysmal", "terrible", "low-quality", "low quality", "negative", "bad quality", "bad-quality"};
        
        String[]wordsToBeSorryFor = {"bad", "unhealthy", "harmful", "toxic", "adverse", "dangerous", 
        "detrimental"};
        
        String[] wordsGoodExp = {"good", "satisying", "excellent", "wonderful", "pleasant", "fulfilling", "happy", 
        "gratifying", "great"};
        
        Map <String, Double> productsListPrice = new HashMap <>();
        productsListPrice.put("Coke 1.5", 65.25);
        productsListPrice.put("Coke Can", 40.26);
        productsListPrice.put("Royal Can", 36.85);
        productsListPrice.put("Royal 1.5", 60.69);
        productsListPrice.put("Sprite Can", 38.98);
        productsListPrice.put("Sprite 1.5", 60.115);
        productsListPrice.put("Mineral 1.5", 40.26);
        productsListPrice.put("Mineral 500", 20.15);
        
        Map<String, String> productDescriptions = new HashMap<>();
        productDescriptions.put("Coke 1.5","The original great taste.");
        productDescriptions.put("Coke Can","The original great taste.");
        productDescriptions.put("Royal 1.5", "Royal is your playful fruity indulgence in a bottle. It’s time to give in and entertain your taste buds with its unapologetically fruity taste");
        productDescriptions.put("Royal Can","Royal is your playful fruity indulgence in a bottle. It’s time to give in and entertain your taste buds with its unapologetically fruity taste that leaves you feeling lively.");
        productDescriptions.put("Sprite 1.5", "Sprite is your ultimate antidote to heat, whether physical, mental, or even the heat in your mouth with delicious spicy food! Its crisp and honest lemon and lime natural taste will surely hit the spot.");
        productDescriptions.put("Sprite Can","Crisp and clear lemon-lime refreshment with 100% natural flavors and no caffeine.");
        productDescriptions.put("Mineral 1.5 ", "Natural Drinking Water that contains the right amount of minerals to boost hydration and keep the body going through the day.");
        productDescriptions.put("Mineral 500","Natural Drinking Water that contains the right amount of minerals to boost hydration and keep the body going through the day.");
        
        boolean continueLoop = true;
        
      //Syntax(es) for our ChatBot
      
        System.out.println("Good Day our Dear Customer! " + "\n");
        Thread.sleep(1000);
        
        System.out.println("I'm Felicio. Here to guide you anytime!");
        Thread.sleep(1000);
        
        System.out.println("How can I help you?" + "\n");
        Thread.sleep(500);
        
        while (continueLoop){
        for(int i = 0; i < helpDesk.size(); i++){
            
            System.out.println((i + 1) + ". " + helpDesk.get(i) + "\n");
            Thread.sleep(300);
        }
        
            
        System.out.println("Please press the Corresponding Number of your Concern: " + "\n");
        int customerChoice = jlr.nextInt();
        jlr.nextLine();
        
        if(customerChoice == 1){
            
            System.out.println("Here's our product list for reference: " + "\n");
            
            for (Map.Entry e : productsListPrice.entrySet()){ 
            System.out.println(e.getKey() + "  :  " + e.getValue() + "\n");
            Thread.sleep(500);
            
            }
            
            Thread.sleep(1000);
            
            System.out.println("Enter the product that you buy: ");
            String productChoice = jlr.nextLine();
            
                if(productsListPrice.containsKey(productChoice)){
                    
                    System.out.println("Enter the number of items: ");
                    int productQuantity = jlr.nextInt();
                    double productPrice = productsListPrice.get(productChoice);
            
                    Thread.sleep(1000);
                    
                    System.out.println("Here is the total amount: P" + (productQuantity * productPrice) );
                    
                    Thread.sleep(500);
            
            System.out.println("Hope that is helpful. Enjoy shopping!");
                } else if (!productsListPrice.containsKey(productChoice)) {
                    
                    System.out.println("Invalid input. There's no such product here.");
                    
                }
        
    }
        
        if (customerChoice == 2){
            
            System.out.println("Here's our product list for reference: ");
            
            Thread.sleep(500);
            
            for (Map.Entry e : productsListPrice.entrySet()){ 
            System.out.println(e.getKey());
            Thread.sleep(500);
            
            }
            
            Thread.sleep(500);
            
            System.out.println("Enter the product name: " );
            String proName = jlr.nextLine();
            
             if(productDescriptions.containsKey(proName)){
                 
                 String prodDes = productDescriptions.get(proName);
                 
                 Thread.sleep(500);
                 System.out.println("Product Name: " + proName + "\n");
                 
                 Thread.sleep(500);
                 System.out.println("Description: " + prodDes + "\n");
                 
             }
            Thread.sleep(500);
            
            System.out.println("Hope that is helpful. Enjoy shopping!");
        }
        
        if(customerChoice == 3){
        
            List<String> productReco = new ArrayList<>(productsListPrice.keySet());
            System.out.println("Sure! We would gladly help you with that. \n");
            
            Thread.sleep(3000);
            
            String randomProduct = productReco.get(rand.nextInt(productReco.size()));
            
            System.out.println("I think this Product would be suitable for you is " + randomProduct + "\n");
            
            Thread.sleep(1000);
            
            System.out.println("Hope that is helpful. Enjoy shopping");
        }
        
        if(customerChoice == 4){
           
            System.out.println("Feedback: " + "\n");
            String userFeedBack = jlr.nextLine().toLowerCase();
            
            if(containsAnyWord(userFeedBack, wordsToBeAware)){
            
                Thread.sleep(1000);
                System.out.println("\n" + "We're sorry to hear that from you. We appreciate the feedback and will thrive for a better experience for our dear customers" + "\n");
            
                Thread.sleep(500);
            
                System.out.println("Thank you for the feedback. We appreciate it our dear customer");
                
            }else if(containsAnyWord(userFeedBack, wordsToBeSorryFor)){
                
                Thread.sleep(1000);
                System.out.println("We're sorry to hear that from you. We are working hard to give importance on our customer's health and well-being.\n This feedback is a great way for us to always look for better and healthier alternatives for our dear customers.");
            
                Thread.sleep(500);
            
                System.out.println("Thank you for the feedback. We appreciate it our dear customer");
                
            }else if(containsAnyWord(userFeedBack, wordsGoodExp)){
                
                Thread.sleep(1000);
                System.out.println("""
                                   We're please to hear that from you! It's such a great feeling to satisfy our customer.\n 
                                   We will always try to give you the best and wonderful experience. Happy Shopping!""");
            
                Thread.sleep(1000);
            
                System.out.println("Thank you for the feedback. We appreciate it our dear customer");
            }
            
            else{
            
                Thread.sleep(1000);
                System.out.println("Thank you for your feedback our dear customer. We will keep this in mind to improve.    ");
            }
            
            }
        
        System.out.println("\n");
        System.out.println("Is there anything I can help you of? " + "\n");
        Thread.sleep(500);
        
        System.out.println("If yes press Y and if no press N: ");
        String userResponse = jlr.nextLine();
        
        if("N".equals(userResponse) || "n".equals(userResponse)){
            
            System.out.println("\n");
            Thread.sleep(500);
            
            System.out.println("I hope that helped you! \n");
            Thread.sleep(500);
            
            System.out.println("Enjoy shopping!");
            continueLoop = false;
            
            
        }
        
        
        }
        
    }
    
    private static boolean containsAnyWord(String input, String[] words) {
        return Arrays.stream(words).anyMatch(input::contains);
    }
}


