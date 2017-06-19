package ontwerppatronen.builder;

/**
 * Een patroon dat een Builder object gebruikt om een ander gewenst object te maken.
 * Het builder object heeft methoden om attributen van het te bouwen object in te stellen
 * Een builder object heeft een 'build' methode om het te bouwen object te instantiëren
 * 
 * Gebruik dit patroon in het geval van een constructor met veel parameters. 
 * Vooral als er veel verschillende versies van constructoren bij een klasse nodig zijn
 * Het is een oplossing voor het 'Telescoping Constructor' anti-patroon. 
 * En je kunt hiermee een hele reeks opeenvolgende setters voorkomen.
 * Je kunt dit patroon ook gebruiken als je niet alle waarden voor de attributen
 * bij constructie kan weten, maar deze wel nodig zijn indien deze attributen final zijn.
 * Er zijn verschillende varianten die zowel een statische binnenklassen gebruiken of
 * een extern Builder object gebruiken
 * 
 * Naamgeving: Builder wordt gevolgd op de te bouwen soort klasse -> Builder voor klasse X, wordt XBuilder
 * Enkele Voorbeelden:
 * Java API -> StringBuilder: build method is hier toString(), retourneert een String
 * Java API -> Locale.Builder: build method is hier build(), retourneert een Locale 
 * Hibernate -> StandardServiceRegistryBuilder: build method is hier build(), retourneert een StandardServiceRegistry
 */
public class Klant {

    private final String voornaam;
    private final String achternaam;
    private final String bsn;
    private final String geboorteDatum;

    public Klant(KlantBuilder builder) {
        this.voornaam = builder.getVoornaam();
        this.achternaam = builder.getAchternaam();
        this.bsn = builder.getBsn();
        this.geboorteDatum = builder.getGeboorteDatum();
    }

    public static class KlantBuilder {

        private String voornaam;
        private String achternaam;
        private String bsn;
        private String geboorteDatum;

        public KlantBuilder() {
        }

        public String getVoornaam() {
            return processNullOrEmpty(voornaam);
        }
        
        public String getAchternaam() {
            return processNullOrEmpty(achternaam);
        }

        public String getBsn() {
            return processNullOrEmpty(bsn);
        }

        public String getGeboorteDatum() {
            return processNullOrEmpty(geboorteDatum);
        }

        public KlantBuilder voornaam(String voornaam) {
            this.voornaam = voornaam;
            return this;
        }

        public KlantBuilder achternaam(String achternaam) {
            this.achternaam = achternaam;
            return this;
        }

        public KlantBuilder bsn(String bsn) {
            this.bsn = bsn;
            return this;
        }

        public KlantBuilder geboorteDatum(String geboorteDatum) {
            this.geboorteDatum = geboorteDatum;
            return this;
        }

        // build method
        public Klant build() {
            return new Klant(this);
        }

        // check if inpiut string is null or empty, if so insert onbekend
        // otherwise pass back input string
        private String processNullOrEmpty(String param) {
            if (param == null || param.equals("")) {
                return "onbekend";
            } else {
                return param;
            }
        }
    }

    @Override
    public String toString() {
        return "Klant{" + "voornaam=" + voornaam + ", achternaam=" + achternaam + ", bsn=" + bsn + ", geboorteDatum=" + geboorteDatum + '}';
    }
    
}
