public enum Colors {
    Red("Красный") {
        public void printInfo() {
            System.out.println("Красный цвет");
        }
    },
    Green("Зеленый") {
        public void printInfo() {
            System.out.println("Зеленый цвет");
        }
    },
    Blue("Синий") {
        public void printInfo() {
            System.out.println("Синий цвет");
        }
    },
    Yellow("Желтый") {
        public void printInfo() {
            System.out.println("Желтый цвет");
        }
    },
    Gray("Серый") {
        public void printInfo() {
            System.out.println("Серый цвет");
        }
    },
    Brown("Коричневый") {
        public void printInfo() {
            System.out.println("Коричневый цвет");
        }
    };

    private String russianName;
    Colors(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public abstract void printInfo();
}
