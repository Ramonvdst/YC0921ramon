package Miniopdachten;

public class Mini2_ADVANCED {

	public static void main(String[] args) {
		
		//String string1 = "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		//String string2 = "regenen";
		String string3 = 
				"Do you like Cheese Whiz? Spray tan? Fake eyelashes? That's what is Lorem Ipsum to many�it rubs them the wrong way, all the way. It's unreal, uncanny, makes you wonder if something is wrong, it seems to seek your attention for all the wrong reasons. Usually, we prefer the real thing, wine without sulfur based preservatives, real butter, not margarine, and so we'd like our layouts and designs to be filled with real words, with thoughts that count, information that has value.\r\n"
				+ "The toppings you may chose for that TV dinner pizza slice when you forgot to shop for foods, the paint you may slap on your face to impress the new boss is your business. But what about your daily bread? Design comps, layouts, wireframes�will your clients accept that you go about things the facile way? Authorities in our business will tell in no uncertain terms that Lorem Ipsum is that huge, huge no no to forswear forever. Not so fast, I'd say, there are some redeeming factors in favor of greeking text, as its use is merely the symptom of a worse problem to take into consideration.\r\n"
				+ "\r\n"
				+ "You begin with a text, you sculpt information, you chisel away what's not needed, you come to the point, make things clear, add value, you're a content person, you like words. Design is no afterthought, far from it, but it comes in a deserved second. Anyway, you still use Lorem Ipsum and rightly so, as it will always have a place in the web workers toolbox, as things happen, not always the way you like it, not always in the preferred order. Even if your less into design and more into content strategy you may find some redeeming value with, wait for it, dummy copy, no less.\r\n"
				+ "\r\n"
				+ "Consider this: You made all the required mock ups for commissioned layout, got all the approvals, built a tested code base or had them built, you decided on a content management system, got a license for it or adapted open source software for your client's needs. Then the question arises: where's the content? Not there yet? That's not so bad, there's dummy copy to the rescue. But worse, what if the fish doesn't fit in the can, the foot's to big for the boot? Or to small? To short sentences, to many headings, images too large for the proposed design, or too small, or they fit in but it looks iffy for reasons the folks in the meeting can't quite tell right now, but they're unhappy, somehow. A client that's unhappy for a reason is a problem, a client that's unhappy though he or her can't quite put a finger on it is worse.\r\n"
				+ "\r\n"
				+ "But. A big but: Lorem Ipsum is not t the root of the problem, it just shows what's going wrong. Chances are there wasn't collaboration, communication, and checkpoints, there wasn't a process agreed upon or specified with the granularity required. It's content strategy gone awry right from the start. Forswearing the use of Lorem Ipsum wouldn't have helped, won't help now. It's like saying you're a bad designer, use less bold text, don't use italics in every other paragraph. True enough, but that's not all that it takes to get things back on track.";
		
//		char ch1 = string2.charAt(0);
//		System.out.println(ch1);
//		
//		int length = string2.length();
//		System.out.println(length);
		int counter = 0;
		
		
		//String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String testvar = string3;

		
		for(int i =0; i < letters.length; i++) {		
			for(int j=0; j < testvar.length(); j++)
			{
				if (testvar.charAt(j) == letters[i]) {
				counter = counter+1;
				}
			}
			System.out.println("The number of: " + letters[i] + "'s in the string being: " +counter);
			counter = 0;
		}
		
		
		
		
		
		
		
		
		
	}

}
