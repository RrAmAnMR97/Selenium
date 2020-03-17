package page;

import org.testng.annotations.Test;

import tests.KohlsFirstPage;
import tests.KohlsSecondPage;
import tests.KohlsThirdPage;

public class KohlsMain extends KohlsBase{
  @Test
  public void f() throws InterruptedException {
	  KohlsFirstPage fp=new KohlsFirstPage(driver);
	  KohlsSecondPage sp=new KohlsSecondPage(driver);
	  KohlsThirdPage tp=new KohlsThirdPage(driver);
	  fp.srch();
	  Thread.sleep(3000l);
	  sp.item();
	  Thread.sleep(3000l);
	  tp.sizesel();
  }
}
