#  Kairkhanov Abylaikhan SE - 2221
Assignment 4 for subject Software Design Pattern 

Этот проект представляет собой систему уведомлений, реализованную с использованием паттернов "Observer" и "Factory" на языке программирования Java. 

**Основная цель проекта** - продемонстрировать, как эти паттерны могут быть применены для создания системы уведомлений, в которой пользователи могут подписываться на различные каналы уведомлений, и затем получать уведомления от этих каналов.

В данной системе есть следующие ключевые компоненты:

Каналы уведомлений (Notification Channels): Представляют собой источники уведомлений. Пользователи могут подписываться на эти каналы, чтобы получать уведомления о событиях или обновлениях.

Подписчики (Subscribers): Пользователи, которые интересуются определенными каналами уведомлений. Они могут подписываться, отписываться и получать уведомления о событиях с выбранных каналов.

Фабрика уведомлений (Notification Factory): Для создания экземпляров каналов уведомлений и подписчиков используется фабричный метод.

Принципы проектирования

SOLID: Паттерн "Адаптер" обеспечивает принцип единственной ответственности (Single Responsibility Principle), разделяя функциональность старой и новой систем.

"Clean Code" - это концепция и набор практик в разработке программного обеспечения, которые направлены на создание кода, который легко читать, понимать и поддерживать.
