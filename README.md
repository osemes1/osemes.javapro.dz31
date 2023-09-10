# osemes.javapro.dz31

Виконання ДЗ 31. Spring Core

1. Реалізувати клас Product які складається з: id, назва, ціна
2. Товари зберігаються у класі-біні ProductRepository, у вигляді списку. Цей список ініціалізується даними при старті програми.
3. ProductRepository дозволяє отримати весь список або один товар за ID. 
4. Реалізувати клас-бін Cart для, в який можна додавати та видаляти товари за id.
5. Реалізувати консольну програму для керування кошиком.
5.1 Додавання товару до кошика
5.2 Видалення товару з кошика
6. Щоразу при запиті екземпляра-біна кошика з контексту додатка повинен повертатися новий екземпляр кошика.
ВАЖЛИВО! БД підключати не треба.

Новий maven проект компілюється та запускається без помилок:

C:\Users\User303\.jdks\corretto-16.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=53407:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\osem\Projects\osemes.javapro.dz31\target\classes;C:\Users\User303\.m2\repository\org\springframework\spring-context\5.3.23\spring-context-5.3.23.jar;C:\Users\User303\.m2\repository\org\springframework\spring-aop\5.3.23\spring-aop-5.3.23.jar;C:\Users\User303\.m2\repository\org\springframework\spring-beans\5.3.23\spring-beans-5.3.23.jar;C:\Users\User303\.m2\repository\org\springframework\spring-core\5.3.23\spring-core-5.3.23.jar;C:\Users\User303\.m2\repository\org\springframework\spring-jcl\5.3.23\spring-jcl-5.3.23.jar;C:\Users\User303\.m2\repository\org\springframework\spring-expression\5.3.23\spring-expression-5.3.23.jar osemes.javapro.dz31.ShoppingCartApp
Cart 1 items: [2]
Cart 2 items: [3]
All products: [Product{id=1, name='Product 1', price=10.0}, Product{id=2, name='Product 2', price=15.0}, Product{id=3, name='Product 3', price=20.0}]

Process finished with exit code 0

