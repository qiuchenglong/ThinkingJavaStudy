import net.qiucl.util.*;

public class ChocolateChip extends Cookie{
	public ChocolateChip() {
		System.out.println("ChocolateChip contructor");
	}
	public void chomp() {
		bite();
	}
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();

	}

}
