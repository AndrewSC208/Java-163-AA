/* Filename LibraryBook.java */
/* Written by Andrew Meiling */
/* Written on April 19th, 2014 */
/* Chapter 9 */
/* Exercise # 3-a */
/* Pg 420 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class LibraryBook
{
	private String title, author;
	private int pageCount;

	// Constructor: Not sure if I will need.
	public LibraryBook(String t, String a, int p)
	{
		title = t;
		author = a;
		pageCount = p;
	}
	
	// set methods:
	public void setTitle(String t)
	{
		title = t;
	}
	public void setAuthor(String a)
	{
		author = a;
	}
	public void setPageCount(int p)
	{
		pageCount = p;
	}

	// get methods:
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getPageCount()
	{
		return pageCount;
	}

}