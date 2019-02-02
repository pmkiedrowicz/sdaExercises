# Ex1
- utwórz zmienną static int nrLini
- utwórz zmienną tablicową z nazwami tygodnia
- utwórz metodę która będzie wypisywać na konsole kolejny nr lini oraz tekst (w jednej linii)
  * nagłówek metody powinien być taki: static void wypisz (String tekst){...}
- utwórz metodę public static void main która w pętli wypisze wszystkie dni tygodnia używając wcześniej utworzonej metody wypisz()
- uruchom program i sprawdź wynik działania,
program powinien wypisać coś takiego:
1: niedziela
2: poniedziałek
3: wtorek
itd.
  
# Ex2
- utwórz metodę która obliczy i zwróci wynik  działania x*x + 3; nagłówek metody powinien być taki: static double funkcja (double x){...}
- utwórz metodę wypisz(double x, double y) która wypisze x oraz y na konsoli np. "Dala X = 1.0 y = 4.0"
- utwórz metodę public static void main która w pętli najpierw obliczy a następnie wypisze wyniki funkcji dla liczb od 1 do 20 (wykorzystaj wcześniej napisane metody)
program powinien wypisać coś takiego:
Dala X = 1.0 y = 4.0
Dala X = 2.0 y = 7.0
Dala X = 3.0 y = 12.0
Dala X = 4.0 y = 19.0
itd.

# Ex3
Zmodyfikuj program z zadania #2 tak aby wypisywał wyniki tylko dla liczb parzystych


# Ex4
 Zmodyfikuj program z zadania #2 tak aby wypisywał wyniki od 0  do 10 co 0.5
 
# Ex5
Napisz program, który za pomocą dwóch pętli (pętla w pętli) wyświetli na konsoli poniższy wzór n x n (dla n=4)
Pisząc program spróbój wydzielić fragment kodu do metody (np utworzyć metodę która będzie wypisywać pojedynczy znak #)

# Ex6
Napisz program, który  wypisze kolejne cyfry z liczby w odwrotnej kolejności.
Na przykład dla liczby int n = 18762 wypisze "2 6 7 8 1"

# Ex7
wykorzystując pętle w pętli napisz program który wyświetli tabliczkę mnożenia

# Ex8
Utwórz klasę punkt, posiadającą pola publiczne: double x, double y. Utwórz dwa obiekty tej klasy w funkcji main i wyświetl ich zawartość.

# Ex9
Dodaj do klasy punkt gettery (accessor) i settery (mutuator) oraz metodę double distance(Point other), obliczającą odległość euklidesową. Wzór: sqrt((x1-x2)^2 + (y1-y2)^2)

# Ex10
Przygotuj program, który pobiera od użytkownika 3 liczby, a następnie wskazuje największą oraz najmniejszą z nich. Dodatkowo program oblicza sumę podanych liczb.

# Ex11
Zaktualizuj poprzedni program, aby umożliwiał użytkownikowi przekazanie dowolnej liczby parametrów.

# Ex12
Przygotuj program losujący 20 liczb całkowitych. Program musi pamiętać wylosowane liczby i jeśli liczba wylosowana się powtórzyła następuje ponowne losowanie, aż do wylosowania liczby unikalnej.

# Ex13
Przygotuj klasę osoba z polami imię, nazwisko, PESEL oraz nadpisz (@override) metodę .toString() tak aby wyświetlała dane osoby w formacie "Imie: %s, Nazwisko: %s, PESEL: %s". Utwórz instancję klasy osoba, wypełnij przykładowymi danymi oraz wyświetl dane osoby korzystając z przygotowanej metody toString()

# Ex14
Przygotuj program, który losuje 100 wartości z przedziału 0-200 korzystając z klasy Random. Program po losowaniu zlicza powtórzenia każdej z liczb i wyświetla 5 liczb które najczęściej się powtarzają w kolejności malejącej..

# Ex15
Wylosuj 1000 liczb z zakresu 1000-2000 i zapisz je do listy. Skorzystaj z stream() w liście do wyszukania najmniejszej i największej wartości.
