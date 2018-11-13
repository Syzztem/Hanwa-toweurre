public class Hanoi
{
    public boolean isNotDone(String tab)
    {
	return (tab.contains('1') || (tab.contains('2') && tab.contains('3')));
    }
    public boolean isValid(String tab, byte i, char c)
    {
	if (tab.indexOf(c) < i)
	    return false;
	return true;
    }
    public int move(String tab, int i)
	{
		switch i
		{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
    }
    public static void main(String... args)
    {
	
    }
}
