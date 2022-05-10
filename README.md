   In cadrul acestei teme am implementat design patternul Factory, am efectuat testari unitare, am generat javadocul, am facut diagrma uml si cea de baze
de date si am finalizat endpoint-urile.
   Pentru Factory Pattern mi-am creat initial 2 enum-uri(EventType si UserType) pe care le-am folosit pentru a identifica tipul clasei pe care vrem sa o cream.
Astfel, mi-am creat 2 clase(EventFactory si UserFactory) in cadrul carora imi creez instante de diferite obiecte mostenite dintr-o clasa abstracta. Aceste
obiecte create si returnate in cadrul claselor Factory vor fi folosite in clasele Controller pentru a fi inserate in baza de date.
   Am facut testare unitara pentru a verifica daca s-au inserat cu succes obiectele salvate in baza de date. Verificam acest aspect prin compararea user-ului
sau a evenimentului aflat la un id la care ar trebui sa se afle in urma inserarii(ultimul introdus in baza de date) cu un user sau un eveniment pe care ne 
asteptam sa il avem(cel pe care l-am creat prin intermediul design pattern-ului Factory).
