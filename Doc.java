package pack;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Doc {

    public String nameRoot;
    public Nod root;

    public void writeDoc(String fileName) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document d = builder.newDocument();
        Element rootEl = d.createElement(this.nameRoot);
        rootEl = create(root, d);
        d.appendChild(rootEl);
        DOMSource source = new DOMSource(d);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult file = new StreamResult(new File(fileName));
        transformer.transform(source, file);

    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Doc)) {
            return false;
        }

        Doc example = (Doc) o;
        if(example.root.equals(root) & nameRoot.equals(example.nameRoot))
            return true;
        else
            return false;
    }

    private Element create(Nod node, Document d)
    {
        Element el = d.createElement(node.name);
        el.setTextContent(node.inText);
        for(int i = 0; i<node.nodChildren.size(); i++)
        {
            el.appendChild(create(node.nodChildren.get(i), d));
        }
        for(int i = 0; i<node.attributes.size(); i++)
        {
            el.setAttribute(node.attributes.get(i).name, node.attributes.get(i).value);
        }
        return el;
    }
    public Doc(String name)
    {
        nameRoot = name;
        root = null;
    }
    private static Nod travers(Node parent) throws ParserConfigurationException {
        Nod result = new Nod(parent.getNodeName(),parent.getTextContent());
        for(int i =0; i<parent.getAttributes().getLength(); i++)
        {
            result.attributes.add(new Attribute(parent.getAttributes().item(i).getNodeName(), parent.getAttributes().item(i).getTextContent()));
        }
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document d = builder.newDocument();
        for(int i =1; i<parent.getChildNodes().getLength(); i = i+2)
        {
            result.nodChildren.add(travers((Element) parent.getChildNodes().item(i)));
        }
        if(result.nodChildren.size() != 0)
            result.inText = "";
        return result;
    }
    public static Doc readDoc(String fileName) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(new File(fileName));
        Element r = doc.getDocumentElement();
        Nod new_root = travers(r);
        Doc my_doc = new Doc(r.getNodeName());
        my_doc.root = new_root;

        return my_doc;
    }
}
