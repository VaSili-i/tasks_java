class SmartPhone extends BaseComputer {
    private boolean has5G;

    public void enable5G() {
        this.has5G = true;
    }

    public void disable5G() {
        this.has5G = false;
    }

    @Override
    public void displaySpecifications() {
        super.displaySpecifications();
        System.out.println("Поддержка 5G: " + (has5G ? "Да" : "Нет"));
    }
}
