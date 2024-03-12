package zoologico.visitantes;

// Subclase de TourGuide para los amantes de las aves
class BirdLoversTourGuide extends TourGuide {
    void provideTour ( String interest ) {
        System.out.println ( "¡Bienvenidos amantes de las aves al zoológico!" );
        System.out.println ( "Vamos a observar a las aves más exóticas." );
        // Lógica específica para un tour de amantes de las aves
    }
}
