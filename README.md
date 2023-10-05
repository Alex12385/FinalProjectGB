# Итоговая аттестация

### Организуйте систему учёта для питомника, в котором живут домашние и вьючные животные.

1. Используя команду cat в терминале операционной системы Linux, создать два файла 
    Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными
    заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
    ```shell
        $ cat > pets.txt
        $ cat > pack_animals.txt
        $ cat pets.txt pack_animals.txt > all_animals.txt
        $ cat all_animals.txt
        $ mv all_animals.txt human_friends.txt
    ```
    ![Рисунок1.png](img/Рисунок1.png)


2. Создать директорию, переместить файл туда
    ```shell
        $ mkdir animal
        $ mv human_friends.txt animal/
    ```

    ![Рисунок2.png](img/Рисунок2.png)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
    ```shell
        $ sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb
        $ sudo apt update 
    ```
   ![Рисунок3.png](img/Рисунок3.png)
   
   ```shell
      $ sudo apt install mysql-server mysql-client
      $ systemctl status mysql.service
   ```
   ![Рисунок4.png](img/Рисунок4.png)

4. Установить и удалить deb-пакет с помощью dpkg.

   ```shell
      $ sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb
      $ sudo dpkg -r mysql-apt-config
      $ sudo dpkg --purge mysql-apt-config
   ```
   ![Рисунок5.png](img/Рисунок5.png)
