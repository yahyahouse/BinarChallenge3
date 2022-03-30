import java.util.InputMismatchException;

public class ExeptionsClass {
    MenuShow menu = new MenuShow();
    public void MenuExc(){
        try {
            menu.Menu();
        }catch (Exception e){
            System.out.println("Masukan Angka atau Huruf" +e.getMessage());
            menu.Menu();
        }
    }
}
