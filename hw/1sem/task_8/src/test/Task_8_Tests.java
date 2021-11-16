package test;

import task.*;
import service_project.test.ProtocolBuilder;

import java.util.function.Supplier;


public class Task_8_Tests {
    private static Task_8 task_8;
    private static String[] subtaskNames;
    private static String[] classNames;
    private static Supplier[] tasks;
    private static Supplier[] testers;
    private static ClassValidatorBuilder classValidatorBuilder;
    private static StringBuilder protocol;

    public static void test(Task_8 task, String name) {
        task_8 = task;
        double[] scores_per_task = {
                1, 1, 1, 1, 1, 3
        };
        double score = 0;
        protocol = new StringBuilder();
        subtaskNames = getSubtasks();
        classNames = getClassNames();
        tasks = getTasks();
        testers = getTesters();
        classValidatorBuilder = new ClassValidatorBuilder("descriptors");

        for(int i = 0; i < subtaskNames.length; ++i) {
            if(testSubtask(i))
                score += scores_per_task[i];
        }
        protocol.append("Ваш балл: ");
        protocol.append((int)(score + .0001));
        System.out.println(protocol);

        ProtocolBuilder pb = new ProtocolBuilder();
        pb.BuildProtocol(name, protocol.toString());
    }

    private static String[] getSubtasks() {
        return new String[] {
            "subtask_1_DynamicPolymorphismProgramming",
            "subtask_2_DynamicPolymorphismProgramming",
            "subtask_3_DynamicPolymorphismProgramming",
            "subtask_4_DynamicPolymorphismProgramming",
            "subtask_5_DynamicPolymorphismProgramming",
            "subtask_6_DynamicPolymorphismProgramming"
        };
    }
    private static String[] getClassNames() {
        return new String[] {
            "BattleUnit",
            "BattleUnitBase",
            "Infantryman",
            "ArmorDestroyer",
            "Alchemist",
            "GameSimulation"
        };
    }

    private static Supplier[] getTasks() {
        return new Supplier[] {
            () -> task_8.subtask_1_DynamicPolymorphismProgramming(),
            () -> task_8.subtask_2_DynamicPolymorphismProgramming(),
            () -> task_8.subtask_3_DynamicPolymorphismProgramming(),
            () -> task_8.subtask_4_DynamicPolymorphismProgramming(),
            () -> task_8.subtask_5_DynamicPolymorphismProgramming(),
            () -> task_8.subtask_6_DynamicPolymorphismProgramming(),
        };
    }
    private static Supplier[] getTesters() {
        return new Supplier[] {
            Task_8_Tests::testTask1Functionality,
            Task_8_Tests::testTask2Functionality,
            Task_8_Tests::testTask3Functionality,
            Task_8_Tests::testTask4Functionality,
            Task_8_Tests::testTask5Functionality,
            Task_8_Tests::testTask6Functionality,
        };
    }

    private static boolean testSubtask(int number) {
        protocol.append("Тестирование подзадачи ").append(number).append("...\n");
        var res = testTask(tasks[number], testers[number], number);
        if (res)
            protocol.append("OK\n");
        else
            protocol.append("Ошибка\n");
        protocol.append("\n");
        return res;
    }

    private static boolean testTask(
        Supplier<Class<?>> task,
        Supplier<Boolean> testFunctionality,
        int taskNum) {
        var validator = classValidatorBuilder.build(classNames[taskNum]);
        var type = task.get();
        boolean cTests = true;
        if(!validator.validateAbstractMethods(type)) {
            protocol.append("Ошибка в списке абстрактных методов\n");
            cTests = false;
        }
        if(!validator.validateExtendedClass(type)) {
            protocol.append("Ошибочный базовый класс\n");
            cTests = false;
        }
        if(!validator.validatePublicStaticMethods(type)) {
            protocol.append("Ошибка в списке публичных статических методов\n");
            cTests = false;
        }
        if(!validator.validatePublicInstanceMethods(type)) {
            protocol.append("Ошибка в списке публичных методов экземпляра\n");
            cTests = false;
        }
        if(!validator.validateImplementedInterfaces(type)) {
            protocol.append("Ошибка в списке реализованных интерфейсов\n");
            cTests = false;
        }
        if(!validator.validatePublicConstructorArguments(type)) {
            protocol.append("Ошибка в конструкторах\n");
            cTests = false;
        }
        boolean rTests = testFunctionality.get();

        return cTests && rTests;
    }

    private static boolean testTask1Functionality() {
        return true;
    }
    private static boolean testTask2Functionality() {
        return true;
    }
    private static boolean testTask3Functionality() {
        return true;
    }
    private static boolean testTask4Functionality() {
        return true;
    }
    private static boolean testTask5Functionality() {
        return true;
    }
    private static boolean testTask6Functionality() {
        return true;
    }

}
