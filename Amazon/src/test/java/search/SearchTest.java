package search;

import base.CommonAPI;
import org.junit.Test;



public class SearchTest extends CommonAPI{



    @Test
    public void testac() throws InterruptedException {
        clickByCss(".nav-line-2");
        Thread.sleep(2500);

    }


    @Test
    public void testSearch() throws InterruptedException{
        //sendKeyByCss("twotabsearchtextbox");
        typeByCssEnter("#twotabsearchtextbox", "Let us C");
        Thread.sleep(2500);
        clickByxpath("//*[@id=\"result_0\"]/div/div/div/div[1]/div/div/a/img");
        Thread.sleep(1000);
        selectDropdown("quantity","10" );
        Thread.sleep(1500);
        clickByxpath("//*[@id=\"add-to-cart-button\"]");
        Thread.sleep(2000);
        clickByxpath("//*[@id=\"hlb-ptc-btn-native\"]");
        Thread.sleep(2000);
        typeByCssEnter("#ap_email", "pawan.jambhule@gmail.com");
        typeByCssEnter("#ap_password","p@ssw0rd");
        Thread.sleep(3500);

    }



}



