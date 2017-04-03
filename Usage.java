import java.util.*;

public class Usage{
	
	public static void main(String[] arg) {
		//Data insertion
		InsertFunction insertData = new InsertFunction("http://localhost:4215/addNewGame", "title", "sales", "platform");
		System.out.println(insertData.insert("Kingdom%20Hearts%20:%20Final%20Mix", 25000, "PS4"));
	
		//Data removal
		DeleteFunction deleteData = new DeleteFunction("http://localhost:4215/deleteAGame", "title");
		System.out.println(deleteData.delete("Kingdom%20heart"));
	}
}



/*
Results:

[krisliiv@greeny t07liides]$ java Usage
Added a new game Kingdom Hearts : Final Mix

[krisliiv@greeny t07liides]$ java Usage
Nioh has been removed from the database


*/