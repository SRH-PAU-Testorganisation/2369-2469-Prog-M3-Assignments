/// Diese "Start"-Klasse heißt normalerweise nur "Main"
public class Main_DemoOop
{
    // Startmethode unserer Applikation
    public static void main(String[] args)
    {
        // Ein Objekt der Klasse Fridge *instanziieren*
        // myFridge ist eine "Instanz" der Klasse Fridge
        Fridge myFridge   = new Fridge();
        myFridge.doorOpen = true; // *Attribut* doorOpen auf dem Objekt festlegen
        myFridge.temp     = 120000;

        // Ein zweites Objekt instanziieren
        Fridge yourFridge       = new Fridge();
        yourFridge.manufacturer = "Mannheim"; // "Frankfurt" wird überschrieben
        yourFridge.temp         = -23.4;

        // "Attribute" auf dem Objekt auslesen
        IO.println("Meiner kommt aus: " + myFridge.manufacturer);
        IO.println("Deiner kommt aus: " + yourFridge.manufacturer);

        // "Methoden" auf den Objekten aufrufen
        myFridge.printCurrentTemperature();
        yourFridge.printCurrentTemperature();
    }
}
