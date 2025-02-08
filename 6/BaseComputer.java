import java.util.ArrayList;
import java.util.List;


class BaseComputer implements Computer {
    private String model;
    private double price;
    private int ram;
    private String resolution;
    private String processor;
    private List<String> components;

    public BaseComputer() {
        this.components = new ArrayList<>();
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void addRam(int ramSize) {
        this.ram += ramSize;
    }

    @Override
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void addComponent(String component) {
        this.components.add(component);
    }

    @Override
    public void displaySpecifications() {
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("ОЗУ: " + ram + " ГБ");
        System.out.println("Разрешение: " + resolution);
        System.out.println("Процессор: " + processor);
        System.out.println("Комплектующие: " + components);
    }
}

interface Computer {
    void setModel(String model);
    void setPrice(double price);
    void addRam(int ramSize);
    void setResolution(String resolution);
    void setProcessor(String processor);
    void addComponent(String component);
    void displaySpecifications();
}
