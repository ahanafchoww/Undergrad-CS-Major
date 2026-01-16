public class Cart {
    public int cartNumber;
    public String[] items = new String[3];
    public double[] itemPrice = new double[3];
    public int itemCounter;
    public int discountPercent;
    public double finalPrice;
    public double totalPrice;

    public void create_cart(int cartNumber) {
        this.cartNumber = cartNumber;
    }

    public void addItem(String itemName, double price) {
        if (itemCounter < 3) {
            items[itemCounter] = itemName;
            itemPrice[itemCounter] = price;
            itemCounter++;
            totalPrice += price;
            finalPrice = totalPrice;
            System.out.println(itemName + " added to cart " + cartNumber + ".");
            System.out.println("You have " + itemCounter + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void addItem(double price, String itemName) {
        if (itemCounter < 3) {
            items[itemCounter] = itemName;
            itemPrice[itemCounter] = price;
            itemCounter++;
            totalPrice += price;
            finalPrice = totalPrice;
            System.out.println(itemName + " added to cart " + cartNumber + ".");
            System.out.println("You have " + itemCounter + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void cartDetails() {
        System.out.println("Your cart(c" + cartNumber + ") :");
        for (int i = 0; i < itemCounter; i++) {
            System.out.println(items[i] + " - " + itemPrice[i]);
        }
        System.out.println("Discount Applied: " + (discountPercent * 1.0) + "%");
        System.out.println("Total price: " + finalPrice);
    }

    public void giveDiscount(int discount) {
        discountPercent = discount;
        finalPrice = totalPrice - ((discount * 1.0) * (totalPrice / 100.0));
    }
}
