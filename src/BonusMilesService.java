class Main {
    public static void main(String[] args) {
        bonusMilesService service = new bonusMilesService();
        int price = 10_000; // Цена билета
        int miles = service.calculate(price); // рассчитываем мили, должно получиться 500
        System.out.println(miles); // выводим на экран рассчитанные мили
    }
}