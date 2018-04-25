package net.vastsum.weifactory.payapis.common;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

/**
 * 用于解析和编码Xml的工具类
 */
public class XmlUtils {
    /**
     * 将请求的xml字符串转成HashMap
     * @param body xml字符串
     * @return HashMap对象
     */
    public static HashMap<String,String> getMap(String body){
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(body.getBytes()));
            Node node = doc.getFirstChild().getFirstChild();
            HashMap<String,String> hashMap = new HashMap<>();
            while(node != null){
                hashMap.put(node.getNodeName(),node.getTextContent());
                node = node.getNextSibling();
            }
            return hashMap;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
