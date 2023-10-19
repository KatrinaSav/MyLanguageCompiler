package pack;
import java.util.ArrayList;

public class Nod {
    public ArrayList<Nod> nodChildren;
    public ArrayList<Attribute> attributes;
    public String inText;
    public String name;

    public Nod(String n, String in)
    {
        name = n;
        inText = in;
        nodChildren = new ArrayList<>();
        attributes = new ArrayList<>();
    }
    public Nod find(String tag)
    {
        for(Nod n: nodChildren)
        {
            if(n.name.equals(tag))
                return n;
        }
        return new Nod("", "");
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Nod)) {
            return false;
        }

        Nod example = (Nod) o;
        if(example.inText.equals(inText) & example.name.equals(name) & example.nodChildren.size() == nodChildren.size() &
                attributes.size() == example.attributes.size())
        {
            for(int i = 0; i< nodChildren.size(); i++)
            {
                if(!nodChildren.get(i).equals(example.nodChildren.get(i)))
                    return false;

            }
            for(int i = 0; i< attributes.size(); i++)
            {
                if(!attributes.get(i).equals(example.attributes.get(i)))
                    return false;
            }
            return true;
        }
        else
            return false;
    }
    public Nod addChild(Nod child)
    {
        Nod result = new Nod(name, inText);
        result.nodChildren = new ArrayList<>(nodChildren);
        result.attributes = new ArrayList<>(attributes);
        result.nodChildren.add(child);
        return result;
    }

    public Nod delChild(Nod child)
    {
        Nod result = new Nod(name, inText);
        result.nodChildren = new ArrayList<>(nodChildren);
        result.attributes = new ArrayList<>(attributes);
        if(nodChildren.contains(child))
            result.nodChildren.remove(nodChildren.indexOf(child));
        return result;
    }

    public Nod delAttr(Attribute attr)
    {
        Nod result = new Nod(name, inText);
        result.nodChildren = new ArrayList<>(nodChildren);
        result.attributes = new ArrayList<>(attributes);
        if(attributes.contains(attr))
            attributes.remove(attributes.indexOf(attr));
        return this;
    }

    public Nod setAttribute(Attribute attr)
    {
        Nod result = new Nod(name, inText);
        result.nodChildren = new ArrayList<>(nodChildren);
        result.attributes = new ArrayList<>(attributes);
        result.attributes.add(attr);
        return result;
    }

}
