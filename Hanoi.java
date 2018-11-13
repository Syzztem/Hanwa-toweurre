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
	    switch tab.charAt(i)
		{
			case '1':
			    if (tab.indexOf('2') < i)
				return 3;
			    else
				return 2;
				break;
			case '2':
			    if (tab.indexOf('3') < i)
				return 1;
			    else
				return 3;
				break;
			case '3':
			    if (tab.indexOf('1') < i)
				return 2;
			    else
				return 1;
				break;
		}
    }
    public static void main(String... args)
    {
	
    }
}
