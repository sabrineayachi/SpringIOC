package spring;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Client client =  (Client) beanfactory.getBean("clientBean");
        List listpays = client.getPays().getPaysvoisins();
        for(int i=0; i<listpays.size(); i++)
        {
        	System.out.println(i + "pays voisin : " + listpays.get(i));
        }
        
        //to test scope
        /*Pays p1 = (Pays) beanfactory.getBean("paysBean");
        System.out.println("message1 : " + p1.getPaysvoisins() + p1.getIdpays());
        
        Pays p2 = (Pays) beanfactory.getBean("paysBean");
        System.out.println("message2 : " + p2.getPaysvoisins() + p2.getIdpays());*/
        
        
        
	}

}
