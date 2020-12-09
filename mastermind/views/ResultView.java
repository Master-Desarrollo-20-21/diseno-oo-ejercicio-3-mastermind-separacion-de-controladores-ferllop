package mastermind.views;

import mastermind.models.Result;

public class ResultView {
	
	private ProposedCombinationView proposedCombinationView;
	
	public ResultView() {
		proposedCombinationView = new ProposedCombinationView();
	}
	
	public String render(Result result) {
		return proposedCombinationView.renderCombinationInitials(result.getProposedCombination()) + " --> " 
				+ result.getBlacks() + " blacks and " 
				+ result.getWhites() + " whites";
	}	
}
