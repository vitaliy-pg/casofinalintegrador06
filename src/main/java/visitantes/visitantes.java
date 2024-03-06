package visitantes;

class Visitor {
    String name;
    String interest;

    Visitor(String name, String interest) {
        this.name = name;
        this.interest = interest;
    }

    void takeTour(TourGuide tourGuide) {
        tourGuide.provideTour(interest);
    }
}

// Clase base para los guías turísticos
abstract class TourGuide {
    abstract void provideTour(String interest);
}

// Subclase de TourGuide para los niños
class ChildrenTourGuide extends TourGuide {
    void provideTour(String interest) {
        System.out.println("¡Bienvenidos niños al zoológico!");
        System.out.println("Vamos a ver a los animales más divertidos.");
        // Lógica específica para un tour de niños
    }
}

// Subclase de TourGuide para los amantes de las aves
class BirdLoversTourGuide extends TourGuide {
    void provideTour(String interest) {
        System.out.println("¡Bienvenidos amantes de las aves al zoológico!");
        System.out.println("Vamos a observar a las aves más exóticas.");
        // Lógica específica para un tour de amantes de las aves
    }
}

// Subclase de TourGuide para los amantes de los mamíferos
class MammalLoversTourGuide extends TourGuide {
    void provideTour(String interest) {
        System.out.println("¡Bienvenidos amantes de los mamíferos al zoológico!");
        System.out.println("Vamos a ver a los mamíferos más impresionantes.");
        // Lógica específica para un tour de amantes de los mamíferos
    }
}

// Clase base para los quioscos interactivos
abstract class InteractiveKiosk {
    abstract void provideInformation();
}

// Subclase de InteractiveKiosk para la información sobre animales
class AnimalInfoKiosk extends InteractiveKiosk {
    void provideInformation() {
        System.out.println("Bienvenidos al quiosco de información sobre animales.");
        System.out.println("Aquí puedes aprender sobre nuestros maravillosos animales y hábitats.");
        // Lógica para proporcionar información sobre animales y hábitats
    }
}

// Subclase de InteractiveKiosk para la información sobre hábitats
class HabitatInfoKiosk extends InteractiveKiosk {
    void provideInformation() {
        System.out.println("Bienvenidos al quiosco de información sobre hábitats.");
        System.out.println("Aquí puedes aprender sobre los diferentes hábitats en el zoológico.");
        // Lógica para proporcionar información sobre hábitats
    }
}

// Clase principal que demuestra el uso de las clases anteriores
class ZooMain {
    public static void main(String[] args) {
        // Crear visitantes
        Visitor childVisitor = new Visitor("Juanito", "Niños");
        Visitor birdLoverVisitor = new Visitor("María", "Aves");
        Visitor mammalLoverVisitor = new Visitor("Pedro", "Mamíferos");

        // Crear guías turísticos
        TourGuide childrenTourGuide = new ChildrenTourGuide();
        TourGuide birdLoversTourGuide = new BirdLoversTourGuide();
        TourGuide mammalLoversTourGuide = new MammalLoversTourGuide();

        // Visitantes toman el tour
        childVisitor.takeTour(childrenTourGuide);
        birdLoverVisitor.takeTour(birdLoversTourGuide);
        mammalLoverVisitor.takeTour(mammalLoversTourGuide);

        // Crear quioscos interactivos
        InteractiveKiosk animalInfoKiosk = new AnimalInfoKiosk();
        InteractiveKiosk habitatInfoKiosk = new HabitatInfoKiosk();

        // Visitantes obtienen información en los quioscos
        animalInfoKiosk.provideInformation();
        habitatInfoKiosk.provideInformation();
    }
}