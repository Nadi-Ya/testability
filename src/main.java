class bonusMilesService {

    public int calculate(int price) {
        // 1 миля за каждые 20 рублей, целые мили
        return price / 20;
    }
}
public class main {
    public static void main(String[] args) {
        bonusMilesService service = new bonusMilesService();

        // Примеры использования
        int price1 = 10_000;  // Ожидаем 500
        int miles1 = service.calculate(price1);
        System.out.println(miles1);  // Должно вывести: 500

        int price2 = 20_000;  // Ожидаем 1000
        int miles2 = service.calculate(price2);
        System.out.println(miles2);  // Должно вывести: 1000

        int price3 = 19;      // Ожидаем 0, так как меньше 20
        int miles3 = service.calculate(price3);
        System.out.println(miles3);  // Должно вывести: 0

        int price4 = 500;     // Ожидаем 25
        int miles4 = service.calculate(price4);
        System.out.println(miles4);  // Должно вывести: 25
    }
}






