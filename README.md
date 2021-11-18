# API do pokazywania wyników zadania 2 w różnych formatach (PPKWU zadanie 3) - dokumentacja
Z API możemy skorzystać poprzez wysłanie zapytania GET, domyślnie pod adres localhost:8080.
# Endpoint do konwersji tekstu na podany format
Do skorzystania z endpointa potrzebujemy trzech parametrów- ciągu tekstowego do analizy, określonego formatu docelowego oraz podciągu tekstowego, którego API ma szukać. Format wymaga określenia w zapytaniu GET jednego z 4 parametrów:
txt- prosty plik tekstowy
json- plik formatu JSON
xml-plik formatu XML
csv-plik formatu CSV
Jeżeli format nie zostanie sprecyzowany, API nie wykona zadania i zwróci jedynie komunikat.
# Przykłady zastosowania
Wzór zastosowania http://localhost:8080/show_occurences_new/format/tekst_do_wpisania/podtekst_do_szukania

R: http://localhost:8080/show_occurences_new/txt/aw2k9&MAaw/aw

A:
Special characters:1
Whitespaces:0
Combination:2
Digits:2
Lowercase letters:5
Uppercase letters:2

R: http://localhost:8080/show_occurences_new/xml/aw2k9&MAaw/aw

A:
<code>
	<pre>
	&lt;?xml[Space]version="1.0"[Space]encoding="UTF-8"?&gt;
		&lt;Occurences&gt;
		&lt;Special-characters&gt;1&lt;/Special-characters&gt;
		&lt;Whitespaces&gt;0&lt;/Whitespaces&gt;
		&lt;Combination&gt;2&lt;/Combination&gt;
		&lt;Digits&gt;2&lt;/Digits&gt;
		&lt;Lowercase-letters&gt;5&lt;/Lowercase-letters&gt;
		&lt;Uppercase-letters&gt;2&lt;/Uppercase-letters&gt;
	&lt;/Occurences&gt;
	</pre>
</code>

#Endpoint do konwersji formatów
Do skorzystania z endpointa potrzebujemy trzech parametrów- starego formatu, nowego formatu i ciągu tekstowego do analizy. Formaty muszą nalezeć do któregoś z 4 podanych wyżej tj.txt,csv,json lub xml.

# Przykłady zastosowania
Wzór zastosowania http://localhost:8080/convert_format/stary_format/nowy_format/tekst_do_analizy

R: /convert_format/csv/xml/"Special characters",1 "Whitespaces",0 "Combination",2 "Digits",2 "Lowercase letters",5 "Uppercase letters",2

A:
<code>
	<pre>
	&lt;?xml[Space]version="1.0"[Space]encoding="UTF-8"?&gt;
		&lt;Occurences&gt;
		&lt;Special-characters&gt;1&lt;/Special-characters&gt;
		&lt;Whitespaces&gt;0&lt;/Whitespaces&gt;
		&lt;Combination&gt;2&lt;/Combination&gt;
		&lt;Digits&gt;2&lt;/Digits&gt;
		&lt;Lowercase-letters&gt;5&lt;/Lowercase-letters&gt;
		&lt;Uppercase-letters&gt;2&lt;/Uppercase-letters&gt;
	&lt;/Occurences&gt;
	</pre>
</code>

R: /convert_format/txt/json/Special characters:1 Whitespaces:0 Combination:2 Digits:2 Lowercase letters:5 Uppercase letters:2

A: {"Special characters":1,"Whitespaces":0,"Combination":2,"Digits":2,"Lowercase letters":5,"Uppercase letters":2}
