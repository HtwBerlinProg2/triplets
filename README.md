# Triplets vergleichen

Ein Triplet wird repräsentiert durch eine Liste mit 3 Elementen vom Typ Integer.

Beispiel:
- Triplet A = (17, 28, 30)
- Triplet B = (99, 16, 8)
- Werden beide Triplets miteinander verglichen, erhält das erste Triplet zwei Punkte und das zweite Triplet einen Punkt.

Erklärung:
- 28 > 16 und 30 > 8, daher zwei Punkte für Triplet A
- 17 < 99, daher einen Punkt für Triplet B

Bei Gleichheit werden keine Punkte verteilt.

1. Schreiben Sie eine Klasse mit einer Instanz-Methode, welche zwei Triplets miteinander vergleicht und die Punkte für das jeweilige Triplet zurückgibt. Überlegen Sie, welcher Typ hier als Rückgabe geeignet sein könnte. Rufen Sie diese Methode in der main-Methode auf.
1. Schreiben Sie mind. zwei Unit-Tests für Ihre Methode.
1. Erweitern Sie Ihre Methode dergestalt, das vorab geprüft wird, ob es sich tatsächlich um ein Triplet handelt. Werfen Sie eine Exception oder geben Sie `null` zurück, wenn es sich nicht um ein Triplet handelt. Sichern Sie diese Erweiterung durch einen Unit-Test ab.
