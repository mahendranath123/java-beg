package BasicJava1;

class Bill {

    int bno;
    String name;
    int call;
    double amt;

    Bill() {
       
        bno = 0;
        name = "";
        call = 0;
        amt = 0.0;
    }

    Bill(int billNo, String consumerName, int calls) {
        
        bno = billNo;
        name = consumerName;
        call = calls;
        amt = 0.0;
    }

    void Calculate() {
        double rate;

        if (call <= 100) {
            rate = 0.60;
        } else if (call <= 200) {
            rate = 0.80;
        } else if (call <= 300) {
            rate = 1.20;
        } else {
            rate = 1.50;
        }

      
        amt = (call * rate) + 125;
    }

    
   
    void Display() {
        System.out.println("Bill Number: " + bno);
        System.out.println("Consumer Name: " + name);
        System.out.println("Number of Calls: " + call);
        System.out.println("Bill Amount: ₹" + amt);
    
    
  }
    
    
public static void main(String[] args) {
        
        Bill Bill = new Bill(1, "John Doe", 150);
        Bill.Calculate();
        Bill.Display();
    }
}

