import java.util.Scanner;

public class MainConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BaseComputer computer = new BaseComputer();
        System.out.print("Введите модель компьютера (по умолчанию Gaming PC): ");
        String model = scanner.nextLine();
        computer.setModel(model.isEmpty() ? "Gaming PC" : model);

        System.out.print("Введите цену компьютера (по умолчанию 150000): ");
        String price = scanner.nextLine();
        computer.setPrice(price.isEmpty() ? 150000 : Double.parseDouble(price));

        System.out.print("Введите объем ОЗУ (по умолчанию 32 ГБ): ");
        String ram = scanner.nextLine();
        computer.addRam(ram.isEmpty() ? 32 : Integer.parseInt(ram));

        System.out.print("Введите разрешение экрана (по умолчанию 1920x1080): ");
        String resolution = scanner.nextLine();
        computer.setResolution(resolution.isEmpty() ? "1920x1080" : resolution);

        System.out.print("Введите процессор (по умолчанию Intel i9): ");
        String processor = scanner.nextLine();
        computer.setProcessor(processor.isEmpty() ? "Intel i9" : processor);

        computer.addComponent("NVIDIA RTX 3080");
        computer.addComponent("500GB SSD");

        System.out.println("Характеристики компьютера:");
        computer.displaySpecifications();

        System.out.println();

        SmartPhone smartphone = new SmartPhone();
        System.out.print("Введите модель смартфона (по умолчанию Galaxy S21): ");
        model = scanner.nextLine();
        smartphone.setModel(model.isEmpty() ? "Galaxy S21" : model);

        System.out.print("Введите цену смартфона (по умолчанию 80000): ");
        price = scanner.nextLine();
        smartphone.setPrice(price.isEmpty() ? 80000 : Double.parseDouble(price));

        System.out.print("Введите объем ОЗУ (по умолчанию 8 ГБ): ");
        ram = scanner.nextLine();
        smartphone.addRam(ram.isEmpty() ? 8 : Integer.parseInt(ram));

        System.out.print("Введите разрешение экрана (по умолчанию 2400x1080): ");
        resolution = scanner.nextLine();
        smartphone.setResolution(resolution.isEmpty() ? "2400x1080" : resolution);

        System.out.print("Введите процессор (по умолчанию Snapdragon 888): ");
        processor = scanner.nextLine();
        smartphone.setProcessor(processor.isEmpty() ? "Snapdragon 888" : processor);

        System.out.print("Поддерживает ли смартфон 5G (да/нет, по умолчанию да): ");
        String has5G = scanner.nextLine();
        if (has5G.isEmpty() || has5G.equalsIgnoreCase("да")) {
            smartphone.enable5G();
        }

        System.out.println("Характеристики смартфона:");
        smartphone.displaySpecifications();

        System.out.println();

        // Создаем планшет
        Pad pad = new Pad();
        System.out.print("Введите модель планшета (по умолчанию iPad Pro): ");
        model = scanner.nextLine();
        pad.setModel(model.isEmpty() ? "iPad Pro" : model);

        System.out.print("Введите цену планшета (по умолчанию 100000): ");
        price = scanner.nextLine();
        pad.setPrice(price.isEmpty() ? 100000 : Double.parseDouble(price));

        System.out.print("Введите объем ОЗУ (по умолчанию 16 ГБ): ");
        ram = scanner.nextLine();
        pad.addRam(ram.isEmpty() ? 16 : Integer.parseInt(ram));

        System.out.print("Введите разрешение экрана (по умолчанию 2732x2048): ");
        resolution = scanner.nextLine();
        pad.setResolution(resolution.isEmpty() ? "2732x2048" : resolution);

        System.out.print("Введите процессор (по умолчанию Apple M1): ");
        processor = scanner.nextLine();
        pad.setProcessor(processor.isEmpty() ? "Apple M1" : processor);

        System.out.print("Поддерживает ли планшет стилус (да/нет, по умолчанию да): ");
        String hasStylus = scanner.nextLine();
        if (hasStylus.isEmpty() || hasStylus.equalsIgnoreCase("да")) {
            pad.enableStylusSupport();
        }

        System.out.println("Характеристики планшета:");
        pad.displaySpecifications();

        scanner.close();
    }
}
