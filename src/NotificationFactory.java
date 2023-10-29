// Фабрика уведомлений для создания объектов каналов уведомлений и подписчиков
class NotificationFactory {
    public static NotificationChannel createChannel() {
        return new NewsChannel();
    }

    public static Subscriber createSubscriber(String name) {
        return new User(name);
    }
}