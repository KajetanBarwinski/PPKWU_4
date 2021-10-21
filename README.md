# API do analizy stringów (PPKWU zadanie 2) - dokumentacja
Z API możemy skorzystać poprzez wysłanie zapytania GET, domyślnie pod adres localhost:8080.
Struktura zapytania powinna wyglądać następująco: http://localhost:8080/count_string/tekst_ktory_chcemy_poddac_analizie

API liczy występowanie dużych i małych liter, cyfr, białych znaków oraz znaków specjalnych. Wyniki liczenia zwracane są jako odpowiedź HTTP w formie mapy przekonwertowanej na tekst.

Przykładowe użycie API:
![alt text](https://i.imgur.com/3smKiM2.png)
(Special characters- znaki specjalne, Whitespaces- białe znaki, Digits- cyfry, Lowercase letters- małe litery, Uppercase letters- duże litery)
