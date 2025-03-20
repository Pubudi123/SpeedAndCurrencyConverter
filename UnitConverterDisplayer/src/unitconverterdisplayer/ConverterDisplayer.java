package unitconverterdisplayer;


public class ConverterDisplayer implements ConverterDisplayerService{

	UnitConverterMenu unitConverterMenu;
	
	@Override
	public void startService() {
		unitConverterMenu = new UnitConverterMenu();
		unitConverterMenu.setVisible(true);
	}

	@Override
	public void stopService() {
		unitConverterMenu.dispose();
	}	

}
