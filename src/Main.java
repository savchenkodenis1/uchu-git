import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        int moneyAmount = 18;

        int cappucinoPrice = 180;
        int lattePrise = 120;
        int espressoPrice = 80;
        int стоимостьВоды = 20;

        boolean xernya = false;

        boolean canBuyAnything = false;

        Boolean денегДостаточноДляКапучино = moneyAmount >= cappucinoPrice;

        if (денегДостаточноДляКапучино && xernya)
        {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        if (moneyAmount >= lattePrise && xernya == true)
        {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice)
        {
            System.out.println("Вы можете купить эспрессо");
            canBuyAnything = true;
        }

        if (moneyAmount >= стоимостьВоды)
        {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if (!canBuyAnything)
        {
            System.out.println("Недостаточно средств!");
        }
    }
}
