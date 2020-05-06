Porównanie szybkosci zapisu baz
- MySQL
- MongoDB

1.Technology backend:
- Java 8
- Spring Boot
- Hibernate


Wczytuję  1000 obiektów, (pobranych 
z https://www.mockaroo.com/ (z formatu CSV))

- Zapis danych do baz, wczytanie wszystko do bazy, kasowanie danych w bazie. 
- Aspekt, nasłuchuje metodę 
i w momencie startu włączy licznik startu, a po zakończeniu 
operacji odczytanie zostanie czas wykonania operacji.


Wynik:
Mongo zapis
37544 ms
SQL zapis
33421 ms
Mongo wczytanie
1483 ms
SQL wczytanie
532 ms
Mongo del
57 ms
SQL del
31 ms
