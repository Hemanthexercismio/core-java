package Runner;

import dto.KMFDetail;
import sarvices.KMFDetails;
import sarvices.KMFDetailsImpl;

public class KMFRunner {
    public static void main(String[] args) {
        {
            KMFDetails kmfDetails = new KMFDetailsImpl();
            KMFDetail kmfDetail = new KMFDetail("57700t", 789, 67889, "nearxworkzcompany", 400000);
            kmfDetails.validateAndSaveinfo(kmfDetails);

        }
    }
}
