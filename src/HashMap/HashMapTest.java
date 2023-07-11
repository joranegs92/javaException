package HashMap;


import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	static Map<String, Integer> hm = new HashMap<>();
	static Map<String, Integer> hm2 = new HashMap<>();


	public static class Book {
		private String title;
		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}

			if (obj == null || getClass() != obj.getClass()) {
				return false;
			}

			Book book = (Book) obj;
			return title.equals(book.title) &&
					author.equals(book.author);
		}

		@Override
		public int hashCode() {
			int result = title != null ? title.hashCode() : 0;
			result = 31 * result + (author != null ? author.hashCode() : 0);
			return result;
		}
	}

	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter", "J.K. Rowling");
		Book book2 = new Book("Harry Potter", "J.K. Rowling");

		HashMap<Book, String> library = new HashMap<>();
		library.put(book1, "Fantasy");

		String genre = library.get(book2);
		System.out.println(genre);


/*		hm.put("test",1);
		hm.put("test",1);
		hm2.put("test",1);
		System.out.println(hm.hashCode());
		System.out.println(hm2.hashCode());

		System.out.println(hm.equals(hm2));*/
	}

}

