package instruments;


import behaviours.IPlay;

public class ClassicalGuitar extends Guitar implements IPlay {

    private GuitarType type;

    public ClassicalGuitar(String colour, String material, int numberOfStrings,GuitarType type) {
        super(colour, material, numberOfStrings);
        this.type = type;
    }

    public GuitarType getType() {
        return type;
    }

    public String play() {
        return "Bourrée in E minor – Bach";
    }

}
