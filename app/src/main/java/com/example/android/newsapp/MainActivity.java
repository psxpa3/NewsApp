package com.example.android.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

/**
 * This class creates arrayLists of various category (ex, Science, Entertainment etc).
 */
public class MainActivity extends AppCompatActivity {

    //Creation of ArrayList for different categories
    ArrayList<String> nationalString = new ArrayList<>();
    ArrayList<String> internationalString= new ArrayList<>();
    ArrayList<String> statesString= new ArrayList<>();
    ArrayList<String> sportsString= new ArrayList<>();
    ArrayList<String> scienceString= new ArrayList<>();
    ArrayList<String> businessString= new ArrayList<>();
    ArrayList<String> entertainmentString= new ArrayList<>();

    //Creation of ArrayList for links of respective categories
    ArrayList<String> nationalStringLink = new ArrayList<>();
    ArrayList<String> internationalStringLink= new ArrayList<>();
    ArrayList<String> statesStringLink = new ArrayList<>();
    ArrayList<String> sportsStringLink = new ArrayList<>();
    ArrayList<String> scienceStringLink = new ArrayList<>();
    ArrayList<String> businessStringLink = new ArrayList<>();
    ArrayList<String> entertainmentStringLink = new ArrayList<>();

    //Creation of objects for consolidation of links, string arraylist, and image to display on the next activity
    DataClass nationalObject ;
    DataClass internationalObject;
    DataClass sportsObject;
    DataClass scienceObject;
    DataClass statesObject;
    DataClass businessObject;
    DataClass entertainmentObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Storing string data in a national arraylist, national stringlink arraylist, and creation of object for this national category
        nationalString.add("Supreme Court declines to put NEET Ordinance on hold.");
        nationalString.add("BJP has delievered on decisive government:Amit Shah.");
        nationalString.add("Attack on Nigerian student:Sushma seeks report from KCR.");
        nationalString.add("Agusta Westland documents in CBI custody, cannot be disclosed:CIC.");
        nationalString.add("Pranab stresses people centric partnership between India and China.");

        nationalStringLink.add("http://www.thehindu.com/news/national/neet-ordinance-supreme-court-refuses-urgent-hearing-of-plea-to-stay-presidents-neet-ordinance/article8655568.ece");
        nationalStringLink.add("http://www.thehindu.com/news/national/bjp-has-given-a-decisive-government-amit-shah/article8654944.ece");
        nationalStringLink.add("http://www.thehindu.com/news/national/attack-on-nigerian-student-sushma-seeks-report-from-kcr/article8657404.ece");
        nationalStringLink.add("http://www.thehindu.com/news/national/agustawestland-documents-in-cbi-custody-cannot-be-disclosed-cic/article8650159.ece");
        nationalStringLink.add("http://www.thehindu.com/news/national/pranab-at-peking-university/article8649237.ece");

        nationalObject = new DataClass(R.drawable.national,nationalString, nationalStringLink);

        //Storing string data in a international arraylist, international stringlink arraylist, and creation of object for this international category
        internationalString.add("Donald Trump promises to cancel Paris climate agreement.");
        internationalString.add("Obama offers tribute but no apology at Hiroshima.");
        internationalString.add("Pakistan should completely stop support to terror to boost ties, PM.");
        internationalString.add("France: Day of strikes, protests, fuel blockades over labour bill.");
        internationalString.add("Sri Lanka panel gives approval fro pre-fabricated steel houses.");

        internationalStringLink.add("http://www.thehindu.com/todays-paper/tp-international/trump-promises-to-cancel-paris-climate-agreement/article8657453.ece");
        internationalStringLink.add("http://www.thehindu.com/news/international/obama-becomes-first-us-president-to-visit-hiroshima-bomb-site/article8654908.ece");
        internationalStringLink.add("http://www.thehindu.com/news/international/pakistan-should-completely-stop-support-to-terror-to-boost-ties-modi/article8654855.ece");
        internationalStringLink.add("http://www.thehindu.com/news/international/france-day-of-strikes-protests-fuel-blockades-over-labour/article8649478.ece");
        internationalStringLink.add("http://www.thehindu.com/news/international/sri-lanka-panel-gives-approval-for-prefabricated-steel-houses/article8657414.ece");

        internationalObject = new DataClass(R.drawable.international,internationalString, internationalStringLink);

        //Storing string data in a states arraylist, states stringlink arraylist, and creation of object for this states category
        statesString.add("No state-quota medical seats for in COMEDK colleges.");
        statesString.add("RS polls: Congress to field third candidate, hopes to benefit from JD(s) infighting.");
        statesString.add("e-evaluation: change in criterion for awarding revised marks for PCB.");
        statesString.add("Income Tax officer gets bail in bribery case.");
        statesString.add("Proposal for anti-sea erosion wall to be sent to government.");

        statesStringLink.add("http://www.thehindu.com/news/cities/bangalore/no-statequota-medical-seats-in-comedk-colleges/article8657719.ece");
        statesStringLink.add("http://www.thehindu.com/news/cities/bangalore/rs-polls-congress-to-field-third-candidate-hopes-to-benefit-from-jds-infighting/article8657750.ece");
        statesStringLink.add("http://www.thehindu.com/news/cities/bangalore/reevaluation-change-in-criterion-for-awarding-revised-marks-for-pcb/article8652380.ece?css=print");
        statesStringLink.add("http://www.thehindu.com/news/cities/bangalore/income-tax-officer-gets-bail-in-bribery-case/article8657746.ece");
        statesStringLink.add("http://www.thehindu.com/news/national/tamil-nadu/proposal-for-antisea-erosion-wall-to-be-sent-to-government/article8652579.ece");

        statesObject = new DataClass(R.drawable.states,statesString, statesStringLink);

        //Storing string data in a sports arraylist, sports stringlink arraylist, and creation of object for this sports category
        sportsString.add("Rafael Nadal pulls out of French Open with wrist injury.");
        sportsString.add("England wins toss, bats in second test against Sri Lanks.");
        sportsString.add("Hafeez likely to be sent to England for treatement:PCB.");
        sportsString.add("Stepped down because I could not see the board being destroyed, says Shashank Manohar.");
        sportsString.add("Raghunath, Dharamveer, Ritu nominated for Arjuna Award.");

        sportsStringLink.add("http://www.thehindu.com/sport/tennis/rafael-nadal-pulls-out-of-french-open-with-wrist-injury/article8656361.ece");
        sportsStringLink.add("http://www.thehindu.com/sport/cricket/england-wins-toss-bats-in-second-test-against-sri-lanka/article8655180.ece");
        sportsStringLink.add("http://www.thehindu.com/sport/cricket/hafeez-likely-to-be-sent-to-england-for-treatment-pcb/article8653660.ece");
        sportsStringLink.add("http://www.thehindu.com/sport/cricket/stepped-down-because-i-couldnt-see-the-board-being-destroyed-says-shashank-manohar/article8631030.ece");
        sportsStringLink.add("http://www.thehindu.com/sport/hockey/raghunath-dharamvir-and-ritu-nominated-for-arjuna/article8586427.ece");

        sportsObject = new DataClass(R.drawable.sports,sportsString, sportsStringLink);

        //Storing string data in a science arraylist, science stringlink arraylist, and creation of object for this science category
        scienceString.add("Microsoft, Facebook to jointly build subsea cable for faster internet.");
        scienceString.add("Third-gen Formula E-car that zips to 220 kmph, unveiled in Berlin.");
        scienceString.add("We are in India for the next thousand years, says Apple boss Tim Cook.");
        scienceString.add("One Plus 3 to be launched on a virtual space station with a new loop VR headset.");
        scienceString.add("Apple announces iOS App Design and development accelerator in Bangaluru.");

        scienceStringLink.add("http://www.thehindu.com/sci-tech/technology/microsoft-facebook-to-jointly-build-subsea-cable-for-faster-internet/article8654052.ece");
        scienceStringLink.add("http://www.thehindu.com/features/metroplus/Motoring/thirdgen-formula-ecar-unveiled-in-berlin/article8650864.ece");
        scienceStringLink.add("http://www.thehindu.com/business/Industry/exclusive-interview-with-apple-ceo-tim-cook/article8621739.ece");
        scienceStringLink.add("https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&ved=0ahUKEwiJ0u-bo__MAhUFn5QKHbl7ACQQFggbMAA&url=http%3A%2F%2Fwww.thehindu.com%2Fsci-tech%2Ftechnology%2Fgadgets%2Foneplus-vr-experience%2Farticle8646175.ece&usg=AFQjCNEyiaF38uITKTTD9voJkLu645w9qw&sig2=lcXa075QpUqjJ_rFyYA3pA&cad=rja");
        scienceStringLink.add("http://www.thehindu.com/business/apple-announces-ios-app-design-and-development-accelerator-in-bengaluru/article8614518.ece");

        scienceObject = new DataClass(R.drawable.science,scienceString, scienceStringLink);

        //Storing string data in a business arraylist, business stringlink arraylist, and creation of object for this business category
        businessString.add("Foreign investors reduce holdings in top 200 companies in March quarter.");
        businessString.add("Centre may approve import of unshredded metal scrap in Raipur.");
        businessString.add("Norms soon to weed out fraud in staffing industry.");
        businessString.add("Jaitley to meet key investors during 6-day Japan visit.");
        businessString.add("Wipro CEO got $1.8 million as salary in last fiscal year.");

        businessStringLink.add("http://www.thehindu.com/business/Industry/foreign-investors-reduce-holdings-in-top-200-companies-in-march-quarter/article8651108.ece");
        businessStringLink.add("http://www.thehindu.com/business/centre-may-approve-import-of-unshredded-metal-scrap-in-raipur/article8654416.ece");
        businessStringLink.add("http://www.thehindu.com/todays-paper/tp-business/norms-soon-to-weed-out-fraud-in-staffing-industry/article8657429.ece");
        businessStringLink.add("http://www.thehindu.com/business/Economy/arun-jaitley-to-meet-key-investors-during-6day-japan-visit/article8656332.ece?css=print");
        businessStringLink.add("http://www.thehindu.com/business/Industry/wipro-ceo-got-18-million-as-salary-in-last-fiscal-year/article8656524.ece");

        businessObject = new DataClass(R.drawable.business,businessString, businessStringLink);

        //Storing string data in a entertainment arraylist, entertainment stringlink arraylist, and creation of object for this entertainment category
        entertainmentString.add("As long as music touches one soul, musicians are secure.");
        entertainmentString.add("Shashank Subramaniyam talks of his music influences.");
        entertainmentString.add("Veerappan: The film life belongs to Muthulakshmi.");
        entertainmentString.add("I am a psycho-thriller loyalist, says Pawan Kriplani.");
        entertainmentString.add("Devotional vibes on Annamayya birth anniversary.");

        entertainmentStringLink.add("http://www.thehindu.com/features/cinema/as-long-as-the-music-touches-ones-soul-musicians-are-secure-shahid-mallya/article8656404.ece");
        entertainmentStringLink.add("http://www.thehindu.com/features/friday-review/shashank-subramanyam-talks-of-his-music-influences/article8649947.ece");
        entertainmentStringLink.add("http://www.thehindu.com/features/cinema/veerappan-the-films-life-belongs-to-muthulakshmi/article8655023.ece");
        entertainmentStringLink.add("http://www.thehindu.com/features/friday-review/im-a-psychothriller-loyalist-pawan-kriplani/article8651082.ece");
        entertainmentStringLink.add("http://www.thehindu.com/features/friday-review/music/shobha-raju-leads-a-devotional-procession-on-annamayyas-608th-birth-anniversary/article8649963.ece");

        entertainmentObject = new DataClass(R.drawable.entertainment,entertainmentString, entertainmentStringLink);
    }

    /**
     * Sends the corresponding created object to sendData() on clicking of respective category button.
     */

    public void OnClickButton(View view) {
        Button btn = (Button) view;
        int id = btn.getId();
        switch (id) {
            case R.id.national:
                sendData(nationalObject);
                break;
            case R.id.international:
                sendData(internationalObject);
                break;
            case R.id.sports:
                sendData(sportsObject);
                break;
            case R.id.states:
                sendData(statesObject);
                break;
            case R.id.business:
                sendData(businessObject);
                break;
            case R.id.entertainment:
                sendData(entertainmentObject);
                break;
            case R.id.science:
                sendData(scienceObject);
                break;
        }
    }

    /**
     * This function is responsible for sending data to the next activity.
     * @param dataObject retrieves the category object whose button is clicked on main launch.
     */
    private void sendData(DataClass dataObject) {
        Intent intent = new Intent(MainActivity.this,Common.class);
        intent.putExtra("sendingArray",dataObject);
        this.startActivity(intent);
    }
}

