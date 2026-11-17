/// Fridge ist der "Bauplan" für einen Kühlschrank => eine Klasse
public class Fridge
{
    // Folgende "Attribute" hat ein Kühlschrank nach unserem Bauplan
    String manufacturer = "Frankfurt"; // Frankfurt ist der Standardwert
    double temp         = 10.0;        // 10.0 ist die Standardtemperatur
    double maxTemp;
    double minTemp;
    double volume;    // Auch ohne Initialisierung ist der Standardwert jetzt = 0.0
    boolean doorOpen; // Ohne Initialisierung ist dieser Wert standardmäßig = FALSE
    char energyRating;

    /// Das kann unser Kühlschrank tun: Seine aktuelle Temperatur in der Konsole ausgeben
    void printCurrentTemperature()
    {
        // Methoden haben Zugriff auf Ihre Attribute (in diesem Fall "temp")
        IO.println("PIEEP: Aktuelle Temperatur ist " + temp);

        // "temp" muss hier nicht nochmal zwischen den {}-Klammern als Variable
        // oder zwischen den ()-Klammern als Parameter deklariert werden.
    }
}
