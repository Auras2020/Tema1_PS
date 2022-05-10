&nbsp;    In cadrul acestui proiect am pachete model, controller, repo, service si test.

&nbsp;    In pachetul de model am clasele care definesc tabelele din baza de date(Angajat, Client, Vanzator, Film, Spectacol), clasele User si Event mostenite de cele din urma, clasa Bilet folosita pentru a salva evenimentul la care participa un client pe baza id-ului evenimentului si al clientului; de asemenea, se va genera un numar al biletului care este reprezentat de numarul evenimentului generat. Avem clase de EventModelFactory si UserModelFactory in cadrul carora ne vom folosi de design patternul Factory pentru as ne crea instante de evenimente si useri, pe acestia din urma inserandu-i in baza de date.

&nbsp;    In pachetul repo avem insiruite interfetele de tip CrudRepository care realizeaza operatiile de tip "CRUD" in baza de date(create, read, update, delete) asupra unor obiecte.

&nbsp;    In pachetul service imi definesc in cadrul unor interfete principalele metode folosite pentru interogarea bazei de date, pe care le voi implementa in cadrul unor clase de Service. In corpul metodelor implementate voi apela metodele existente din interfele de tip "CRUD", iar instanta de interfata CRUD va fi declarata ca un field final pentru a nu putea fi modificata accidental. 

&nbsp;    In cadrul acestei teme am implementat design patternul Factory, am efectuat testari unitare, am generat javadocul, am facut diagrama uml si cea de baze de date si am finalizat endpoint-urile. 
   
&nbsp;      Pentru Factory Pattern mi-am creat initial 2 enum-uri(EventType si UserType) pe care le-am folosit pentru a identifica tipul clasei pe care vrem sa o cream. Astfel, mi-am creat 2 clase(EventFactory si UserFactory) in cadrul carora imi creez instante de diferite obiecte mostenite dintr-o clasa abstracta. Aceste obiecte create si returnate in cadrul claselor Factory vor fi folosite in clasele Controller pentru a fi inserate in baza de date.

&nbsp;      Am facut testare unitara pentru a verifica daca s-au inserat cu succes obiectele salvate in baza de date. Verificam acest aspect prin compararea user-ului sau a evenimentului aflat la un id la care ar trebui sa se afle in urma inserarii(ultimul introdus in baza de date) cu un user sau un eveniment pe care ne asteptam sa il avem(cel pe care l-am creat prin intermediul design pattern-ului Factory). 
