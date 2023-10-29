// Класс пользователь представляет подписчика системы уведомлений и реализует интерфейс подписчика
class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил уведомление: " + message);
    }
}