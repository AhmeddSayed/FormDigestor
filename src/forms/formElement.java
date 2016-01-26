
package forms;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class formElement{
    
    public formElement(Element form) {
        Elements allElements = form.getAllElements();
        
        for(Element anElement: allElements){
            //System.out.println(anElement.ownText());
        }
    }
    
}
