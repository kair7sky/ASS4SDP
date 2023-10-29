import java.util.ArrayList;
import java.util.List;

// реализация новостного канала интерфейсом с уведомлением
class NewsChannel implements NotificationChannel {
    private List<Subscriber> subscribers = new ArrayList<>();

    // метод подписки на канал уведомлений
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    // метод отписки от уведомлений
    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    // оповещения подписчиков о новом сообщении
    @Override
    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
    //публикации новостей на канале уведомлений
    public void publishNews(String news) {
        notifySubscribers(news);
    }
}