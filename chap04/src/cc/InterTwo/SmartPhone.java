package cc.InterTwo;

public class SmartPhone extends SuperCellPhone implements UpDate{

  public String game;

  public SmartPhone(String model, String color, String gameName) {
    super(model, color);
    this.game = gameName;
  }

  public void playGame() {
    System.out.println(game + " 을 실행합니다");
  }

  @Override
  public void UpDateCharacter() {

  }
}
