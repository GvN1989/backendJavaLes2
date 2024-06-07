public class ApplePieRecipe {

    Ingredients butter = new Ingredients(200, "gram", "ongezouten boter");
    Ingredients casterSugar = new Ingredients(200, "gram", "witte bastard suiker");
    Ingredients flour = new Ingredients(400, "gram", "zelfrijzend bakmeel");
    Ingredients egg = new Ingredients(1, "stuk(s)", "ei");
    Ingredients vanillaSugar = new Ingredients(8, "gram", "vanillesuiker");
    Ingredients salt = new Ingredients(1, "snuf", "zout");
    Ingredients apple = new Ingredients(1.5, "kilo", "zoetzure appels");
    Ingredients granulatedSugar= new Ingredients(75, "gram", "kristal suiker");
    Ingredients cinnamon = new Ingredients(3, "theelepels", "kaneel");
    Ingredients breadCrumbs= new Ingredients(15, "gram", "paneermeel");

    public void printIngredients () {
        System.out.println("Ingrediënten benodigd voor dit recept:");
        System.out.println(butter.getAmount()+ " " + butter.getUnit()+ " " + butter.getName());
        System.out.println(casterSugar.getAmount() + " " + casterSugar.getAmount()+ " " + casterSugar.getName());
        System.out.println(flour.getAmount()+ " " + flour.getAmount()+" " + flour.getName());
        System.out.println(egg.getAmount()+" "+ egg.getUnit()+" "+ egg.getName());
        System.out.println(vanillaSugar.getAmount()+" "+ vanillaSugar.getUnit()+" "+ vanillaSugar.getName());
        System.out.println(salt.getAmount()+" "+ salt.getUnit()+" "+ salt.getName());
        System.out.println(apple.getAmount()+ " "+ apple.getUnit()+ " "+ apple.getName());
        System.out.println(granulatedSugar.getAmount() + " " + granulatedSugar.getUnit()+ " "+ granulatedSugar.getName());
        System.out.println(cinnamon.getAmount() + " "+ cinnamon.getUnit()+" "+ cinnamon.getName());
        System.out.println(breadCrumbs.getAmount()+ " " + breadCrumbs.getUnit() +" " + breadCrumbs.getName());
    }

    public void printRecipe() {
        System.out.println("Doorloop de volgende stappen een voor een:");
        preHeatOven();
        prepareEgg();
        prepareDough();
        prepareAppleMix();
        greaseSpringformPan();
        clotheSpringformPan();
        fillSpringformPan();
        createRibbonsPie();
        addRibbonsOnTopPie();
        placePieInOven();

    }

    public void preHeatOven () {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void prepareEgg () {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void prepareDough (){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void prepareAppleMix () {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greaseSpringformPan () {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void clotheSpringformPan (){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void fillSpringformPan () {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void createRibbonsPie (){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void addRibbonsOnTopPie () {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void placePieInOven () {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


}





