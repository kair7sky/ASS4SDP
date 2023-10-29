public class Main {
    public static void main(String[] args) {
        // Создаем новостной канал с использованием фабрики
        NotificationChannel newsChannel = NotificationFactory.createChannel();

        // Создаем подписчиков с использованием фабрики
        Subscriber user1 = NotificationFactory.createSubscriber("Абылай");
        Subscriber user2 = NotificationFactory.createSubscriber("Арман");

        // Подписываем пользователей на новостной канал
        newsChannel.subscribe(user1);
        newsChannel.subscribe(user2);

        // Публикуем новости для подписчиков
        newsChannel.publishNews("Новости, в программе новые обновление!");

        // Отписываем пользователя1
        newsChannel.unsubscribe(user1);

        // Публикуем еще новости
        newsChannel.publishNews("Другие новости, еще обновление посмотреть");

        // Первый пользователь User1 не получит вторую новость
    }
}