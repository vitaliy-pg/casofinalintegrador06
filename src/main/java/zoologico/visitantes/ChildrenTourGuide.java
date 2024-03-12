package zoologico.visitantes;

// Subclase de TourGuide para los niños
class ChildrenTourGuide extends TourGuide {
    void provideTour ( String interest ) {
        System.out.println ( "¡Bienvenidos niños al zoológico!" );
        System.out.println ( "Vamos a ver a los animales más divertidos." );
        // Lógica específica para un tour de niños
    }
}
