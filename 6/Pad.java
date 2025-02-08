class Pad extends BaseComputer {
    private boolean hasStylus;

    public void enableStylusSupport() {
        this.hasStylus = true;
    }

    public void disableStylusSupport() {
        this.hasStylus = false;
    }

    @Override
    public void displaySpecifications() {
        super.displaySpecifications();
        System.out.println("Поддержка стилуса: " + (hasStylus ? "Да" : "Нет"));
    }
}
