import java.sql.SQLOutput;

public class Main // Ещё комментарии!!!
{
    public static void main(String[] args)
    {
        int moneyAmount = 18;

        // Сайт находится в разработке!

        int cappucinoPrice = 180;
        int lattePrise = 120;
        int espressoPrice = 80;
        int стоимостьВоды = 20;
        int стоимостьКолы = 100;

        boolean xernya = false;

        boolean canBuyAnything = false;

        Boolean денегДостаточноДляКапучино = moneyAmount >= cappucinoPrice;

        if (денегДостаточноДляКапучино && xernya)

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
            System.out.println("Вы можете купить воду и ничего");
            canBuyAnything = true;
        }

        if (!canBuyAnything) // Ещё комментарий!
        {
            System.out.println("Недостаточно средств!");
        }
    }
}
