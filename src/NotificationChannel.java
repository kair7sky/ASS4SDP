// Интерфейс в котором реализуется в конкретных каналах уведомлении
interface NotificationChannel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String message);

    void publishNews(String s);
}