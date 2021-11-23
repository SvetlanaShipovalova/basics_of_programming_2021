package task;

public class Task_8 {
    public Class<?> subtask_1_DynamicPolymorphismProgramming() {
        /*
        *   Создать в пакете task интерфейс согласно описанию:
        * -------------------------------------------------------------------------------------------
        *   Название: BattleUnit
        *   Смысл: Боец в компьютерной игре
        *   Методы:
        *       String name()                   - возвращает имя персонажа
        *       int health()                    - возвращает текущее здоровье
        *       int maxHealth()                 - возвращает максимальное здоровье
        *       void setMaxHealth(int value)    - делает значение максимального здоровья равным value
        *       void heal(int value)            - восстанавливает value единиц здоровья
        *       void takeDamage(int value)      - наносит value единиц урона
        *       int strength()                  - возвращает текущую силу атаки
        *       void setStrength(int value)     - делает текущее значение силы равным value
        *       int baseStrength()              - возвращает базовую силу атаки (без учета бонусов)
        *       int armor()                     - возвращает текущее значение брони
        *       void restoreArmor(int value)    - восстанавливает value едуниц брони
        *       void damageArmor(int value)     - сбивает value едуниц брони
        *       int maxArmor()                  - возвращает максимальное значение брони
        *       void setMaxArmor(int value)     - делает значение максимальной брони равным value
        *
        *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
        *           - применяет спец-способность к некоторым объектам ownTeam, enemyTeam
        *       void attack(BattleUnit other)           - применяет атаку к объекту other
        * ------------------------------------------------------------------------------------------
        */

        try {
            return Class.forName("task.BattleUnit");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public Class<?> subtask_2_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task абстрактный класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: BattleUnitBase
         *   Смысл: Базовая реализация бойца
         *   Реализует: BattleUnit
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню.
         *   Абстрактные методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *       void attack(BattleUnit other)
         *   Дополнительно:
         *       - все остальные методы должны быть реализованы
         *       - минимальный уровень здоровья - 0
         *       - минимальный уровень брони - 0
         *       - здоровье и броня ни в какой момент не могут быть больше
         *         максимального уровня
         * ---------------------------------------------------------------------
         */

        try {
            return Class.forName("task.BattleUnitBase");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    public Class<?> subtask_3_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: Infantryman
         *   Смысл: Обыкновенный пехотинец
         *   Наследует: BattleUnitBase
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню. Перенаправляет параметры в базовый
         *         конструктор
         *   Методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *              - ничего не делает
         *       void attack(BattleUnit other)         - если противник в броне,
         *              наносит повреждения по здоровью, равные половине силы,
         *              и повреждения по броне равные четверти силы, иначе
         *              наносит повреждения здоровью, равные силе.
         *   Дополнительно:
         *       - минимальные повреждения любого типа - 1
         * ---------------------------------------------------------------------
         */
        try {
            return Class.forName("task.Infantryman");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    public Class<?> subtask_4_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: ArmorDestroyer
         *   Смысл: Боец, специализирующийся на расколе брони противника
         *   Наследует: BattleUnitBase
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню. Перенаправляет параметры в базовый
         *         конструктор
         *   Методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *          - выбирает живого противника с максимальной броней.
         *          Если противник в броне, наносит урон броне, равный удвоенной силе.
         *          Иначе наносит урон здоровью, равный четверти силы.
         *       void attack(BattleUnit other)         - если противник в броне,
         *              наносит повреждения по здоровью, равные четверти силы,
         *              и повреждения по броне равные силе, иначе
         *              наносит повреждения здоровью, равные половине силы.
         *   Дополнительно:
         *       - минимальные повреждения любого типа - 1
         * ---------------------------------------------------------------------
         */

        try {
            return Class.forName("task.ArmorDestroyer");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    public Class<?> subtask_5_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: Alchemist
         *   Смысл: Алхимик, исцеляющий союзников и дебафающий врагов
         *   Наследует: BattleUnitBase
         *   Конструктор:
         *       - принимающий в качестве параметров имя, макс. здоровье, базо-
         *         вую силу, макс. броню. Перенаправляет параметры в базовый
         *         конструктор
         *   Методы:
         *       void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam)
         *            - восстанавливает 10
         *              единиц здоровья живому сокоманднику с минимальным здоровьем
         *              увеличивает силу сокомандника с максимальным здоровьем на 1
         *       void attack(BattleUnit other)         - уменьшает показатель
         *              силы на 2 и максимального здоровья на 4 объекта other.
         * ---------------------------------------------------------------------
         */

        try {
            return Class.forName("task.Alchemist");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    public Class<?> subtask_6_DynamicPolymorphismProgramming() {
        /*
         *   Создать в пакете task класс согласно описанию:
         * ---------------------------------------------------------------------
         *   Название: GameSimulation
         *   Смысл: Симулятор сражения двух отрядов
         *   Конструктор:
         *       - принимающий в качестве параметров два массива бойцов
         *         (красная и синяя команды)
         *   Методы:
         *      String runSimulation(int maxStages, int specialAbilityTimer) -
         *      запускает симуляцию с заданным максимальным временем и таймером
         *      специальных способностей. В качестве результата возвращает про-
         *      токол сражения.
         *      Значение таймера - это количество полных раундов (когда сходили
         *      все бойцы обоих команд), которое должно пройти между использо-
         *      ванием спец-способности.
         *   Правила симуляции:
         *      - симуляция представляет из себя последовательность раундов.
         *        В каждом раунде бойцы действуют по очереди в порядке их
         *        расположения в массивах. Первым действует перывый живой
         *        боец красной команды, затем первый живой боец синей команды,
         *        далее - второй живой боец красной и второй живой боец синей.
         *        И так далее, пока не сходят все бойцы.
         *      - действовать не могут бойцы, здоровье которых равно 0 (мертвые).
         *      - мертвый боец не может воскреснуть.
         *      - симуляция завершается, когда в одной из команд не осталось
         *        живых бойцов или когда прошло maxStages раундов
         *      - побеждает команда, в которой осталось больше живых бойцов
         *   Правила действий бойцов
         *      - в качестве цели боец выбирает ближайшего живого противника
         *       (того, чей номер в команде минимально отличается от номера
         *       бойца). Выбранный противник атакуется.
         *      - если боец по таймеру может применить спец-способность, он ее
         *        применяет вместо атаки.
         *   Правила построения протокола
         *      - Если боец атакует противника, в протокол добавляется две строки
         *        вида:
         *        "<имя бойца> атакует <имя цели>."
         *        "<имя цели> получает <урон броне> урона броне и <урон здоровью> урона здоровью."
         *      - Если после атаки противник погибает, в протокол добавляется строка
         *        вида:
         *       "<имя цели> погибает."
         *      - Если боец применяет спецспособность, то в протокол добавляется строка вида:
         *       "<имя бойца> использует спецспособность"
         *      - Если спецспособность наносит урон броне, то в протокол добавляется строка:
         *        "<имя цели> получает <урон броне> урона броне"
         *      - Если спецспособность наносит урон здоровью, то в протокол добавляется строка:
         *        "<имя цели> получает <урон здоровью> урона здоровью"
         *      - Если спецспособность наносит урон максимальному здоровью, то в протокол добавляется строка:
         *        "<имя цели> получает <урон макс. здоровью> урона максимальному здоровью"
         *      - Если спецспособность наносит урон силе, то в протокол добавляется строка:
         *        "<имя цели> получает <урон силе> урона силе"
         *      - Если спецспособность исцеляет, то в протокол добавляется строка:
         *        "<имя цели> исцелил <величина исцеления> единиц здоровья"
         *      - Если спецспособность увеличивает силу, то в протокол добавляется строка:
         *        "<имя цели> увеличил свою силу на <размер бонуса силе>"
         *      - В конце добавляется строка с цветом победившей команды (с большой буквы),
         *        либо строка "Ничья", если никто не победил.
         * ---------------------------------------------------------------------
         */

        try {
            return Class.forName("task.GameSimulation");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }


}
