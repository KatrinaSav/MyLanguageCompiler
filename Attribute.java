package pack;

public class Attribute {
    public String name;
    public String value;

    public Attribute(String n, String v)
    {
        name = n;
        value = v;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Attribute)) {
            return false;
        }

        Attribute example = (Attribute) o;
        if(example.value.equals(value) & example.name.equals(name))
            return true;
        else
            return false;
    }
}
