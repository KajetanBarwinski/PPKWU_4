# API do analizy stringów (PPKWU zadanie 2) - dokumentacja
Z API możemy skorzystać poprzez wysłanie zapytania GET, domyślnie pod adres localhost:8080.
# Analiza stringa bez kombinacji
Struktura zapytania powinna wyglądać następująco: http://localhost:8080/count_string/tekst_ktory_chcemy_poddac_analizie

API liczy występowanie dużych i małych liter, cyfr, białych znaków oraz znaków specjalnych. Wyniki liczenia zwracane są jako odpowiedź HTTP w formie mapy przekonwertowanej na tekst.

Przykładowe użycie:
![alt text](https://i.imgur.com/3smKiM2.png)

# Analiza stringa z kombinacjami
Struktura zapytania powinna wyglądać następująco: http://localhost:8080/count_string/tekst_ktory_chcemy_poddac_analizie/kombinacja_ktora_chcemy_zliczac

Funkcja ta działa identycznie do tej analizującej stringa bez kombinacji, lecz jest jedna różnica. Mapa zwracana w odpowiedzi posiada dodatkowy klucz "Combinations", którego wartością jest ilość zliczonych substringów w stringu

Przykładowe użycie:
![alt text](https://i.imgur.com/TPdFByN.jpg)
