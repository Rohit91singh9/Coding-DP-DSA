//Using Priority Queues

class Product {
    Integer price;
    String name;

    Product(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
}

public class EconomyMart {
    public static void main(String[] args) {
        String[][] test = {{"INSERT", "milk ", "4"},
                {"INSERT", "coffee ", "3"},
                {"VIEW","-","-"},
                {"INSERT", "pizza  ", "5"},
                {"INSERT", "gum ", "1"},
                {"VIEW","-","-"}
        };
        for (String s : getCheapestProducts(test))
            System.out.println(s);
    }

    private static String[] getCheapestProducts(String[][] commands) {
        List<String> result = new ArrayList<>();
        PriorityQueue<Product> min = new PriorityQueue<Product>((a,b) -> {
            if (a.price == b.price) {
                return a.name.compareTo(b.name);
            } else {
                return a.price.compareTo(b.price);
            }
        });
        PriorityQueue<Product> max = new PriorityQueue<Product>((a,b) -> {
            if (b.price == a.price) {
                return b.name.compareTo(a.name);
            } else {
                return b.price.compareTo(a.price);
            }
        });

        for (String[] command : commands) {
            if (command[0] == "VIEW") {
                if(!min.isEmpty()) {
                    result.add(min.peek().name);
                    max.add(min.poll());
                } else {
                    // error?;
                }
            } else if (command[0] == "INSERT"){
                if (!max.isEmpty() && (max.peek().price > Integer.parseInt(command[2])
                        || (max.peek().price == Integer.parseInt(command[2]) && max.peek().name.compareTo(command[1]) < 1))) {
                    min.add(max.poll());
                    max.add(new Product(Integer.parseInt(command[2]), command[1]));
                } else {
                    min.add(new Product(Integer.parseInt(command[2]), command[1]));
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
}

// This is complete logic of a Program
// Remaining codes are in-built

/*
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem,
    You can share me the code which will help other Candidates. 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
*/