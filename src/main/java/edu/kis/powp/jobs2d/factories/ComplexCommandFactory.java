package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;

public class ComplexCommandFactory {
    public static ComplexCommand getFigureComplexCommand(FigureType figureType){
        switch (figureType) {
            case RECTANGLE:
                return new RectangleFigureComplexCommand().createComplexCommand();
            case TRIANGLE:
                return new TriangleFigureComplexCommand().createComplexCommand();
            default:
                return null;
        }
    }
}