package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Logout extends BasePage {

    public Logout(WebDriver driver)  {
        super(driver);}

   /* @FindBy(xpath = "//html[@id='facebook']/body[@class='_6s5d _71pn _-kb segoe']/div[@id='mount_0_0_sB']/div/div[1]/div[@class='rq0escxv l9j0dhe7 du4w35lb']/div[2]/div[@class='ehxjyohh kr520xx4 poy2od1o b3onmgus hv4rvrfc n7fi1qx3']/div[@class='du4w35lb l9j0dhe7 byvelhso rl25f0pe j83agx80 bp9cbjyn']/span[@class='tojvnm2t a6sixzi8 abs2jz4q a8s20v7p t1p8iaqh k5wvi7nf q3lfd5jv pk4s997a bipmatt0 cebpdrjk qowsmv63 owwhemhu dp1hu0rb dhp61c6y iyyx5f41']/div[@class='j83agx80 l9j0dhe7']/div[@class='oajrlxb2 gs1a9yip g5ia77u1 mtkw9kbi tlpljxtp qensuy8j ppp5ayq2 goun2846 ccm00jje s44p3ltw mk2mc5f4 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv nhd2j8a9 pq6dq46d mg4g778l btwxx1t3 pfnyh3mw p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x tgvbjcpo hpfvmrgz jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso l9j0dhe7 i1ao9s8h esuyzwwr f1sip0of du4w35lb lzcic4wl abiwlrkh p8dawk7l']/img[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv']/@src")
    WebElement profileIcon;

    @FindBy (xpath = "//html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")
    WebElement logoutBtn;*/

    public void Userlogout(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);

        WebElement AccSettings = driver.findElement(By.cssSelector("div[aria-label=\"Account\"]"));
        clickButton(AccSettings);

//Click on Log out button
        //WebDriverWait wait = new WebDriverWait(driver, 8);
        Thread.sleep(3000);
       WebElement logout=  (driver.findElement(By.cssSelector("i.hu5pjgll.lzf7d6o1.sp_kqjRoO_XE1A.sx_ef0c4b")));
        clickButton(logout);
    }
}
