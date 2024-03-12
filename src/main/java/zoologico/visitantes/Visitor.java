package zoologico.visitantes;

class Visitor {
    String name;
    String interest;

    Visitor ( String name, String interest ) {
        this.name = name;
        this.interest = interest;
    }

    void takeTour ( TourGuide tourGuide ) {
        tourGuide.provideTour ( interest );
    }
}
