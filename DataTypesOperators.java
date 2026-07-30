public class DataTypesOperators {

    static int totalBillsGenerated = 0;

    public static void main(String[] args) {

        byte byteValue = 10;
        short b = 25;
        int itemCount = 4;
        double pricePerItem = 250.50;
        float taxRate = 0.05f;
        long billId = 1009823456L;
        char currencySymbol = '$';
        boolean isMember = true;

        System.out.println("----- Primitive Types & Literals -----");
        System.out.println("Byte Value = " + byteValue);
        System.out.println("Bill ID = " + billId);
        System.out.println("Currency = " + currencySymbol);

        {
            int discountFlag = 1;
            System.out.println("Inside Block -> Discount Flag = " + discountFlag);
        }

        double subTotal = itemCount * pricePerItem;
        int remainder = itemCount % 3;

        System.out.println("\n----- Arithmetic Operators -----");
        System.out.println("SubTotal = " + subTotal);
        System.out.println("Remainder = " + remainder);

        System.out.println("\n----- Relational Operators -----");
        System.out.println("SubTotal > 500 : " + (subTotal > 500));
        System.out.println("ItemCount == 4 : " + (itemCount == 4));

        boolean eligibleForDiscount = isMember && (subTotal > 500);
        boolean needsApproval = !isMember || (subTotal > 5000);

        System.out.println("\n----- Logical Operators -----");
        System.out.println("Eligible For Discount = " + eligibleForDiscount);
        System.out.println("Needs Approval = " + needsApproval);

        int x = 6;
        int y = 3;

        System.out.println("\n----- Bitwise Operators -----");
        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("x << 1 = " + (x << 1));

        double total = subTotal;
        total += subTotal * taxRate;

        if (eligibleForDiscount) {
            total -= 50;
        }

        System.out.println("\n----- Assignment Operators -----");
        System.out.println("Final Total = " + total);

        int wholeUnits = 10;
        double widenedUnits = wholeUnits;

        System.out.println("\n----- Implicit Type Conversion -----");
        System.out.println("Whole Units = " + wholeUnits);
        System.out.println("Widened Units = " + widenedUnits);

        int roundedTotal = (int) total;

        System.out.println("\n----- Explicit Casting -----");
        System.out.println("Total = " + total);
        System.out.println("Rounded Total = " + roundedTotal);

        int precedenceResult = 5 + 3 * 2 - (4 / 2);

        System.out.println("\n----- Operator Precedence -----");
        System.out.println("5 + 3 * 2 - (4 / 2) = " + precedenceResult);

        totalBillsGenerated++;
        System.out.println("\nTotal Bills Generated So Far = " + totalBillsGenerated);
    }
}