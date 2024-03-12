package zoologico.visitantes;

// Subclase de TourGuide para los amantes de los mamíferos
class MammalLoversTourGuide extends TourGuide {
    void provideTour ( String interest ) {
        System.out.println ( "¡Bienvenidos amantes de los mamíferos al zoológico!" );
        System.out.println ( "Vamos a ver a los mamíferos más impresionantes." );
        // Lógica específica para un tour de amantes de los mamíferos
    }
}
