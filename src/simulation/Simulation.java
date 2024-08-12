package simulation;

public class Simulation {
    public void nextTurn(){//просимулировать и отрендерить один ход

    }
    public void startSimulation(){

    } // запустить бесконечный цикл симуляции и рендеринг
    public void pauseSimulation(){//приостановить бесконечный цикл симуляции и рендеринга

    }
    public static void main(String[] args) {
       Map map = new Map();
       map.setupDefaultEntitiesPositions();
       MapConsoleRenderer renderer = new MapConsoleRenderer();
       renderer.render(map);
       // System.out.println();
        int a = 123;
    }
}


