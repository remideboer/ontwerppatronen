package ontwerppatronen.builder;

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
