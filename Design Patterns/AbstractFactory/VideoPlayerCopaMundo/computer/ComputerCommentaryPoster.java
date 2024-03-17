package computer;

import interfaces.CommentaryPoster;

public class ComputerCommentaryPoster implements CommentaryPoster {

	@Override
	public void post(String commentary) {
		// TODO Auto-generated method stub
		System.out.println("Postando o comentário: " + commentary);
	}

}
