package com.trek;

import com.trek.constant.AddressTypes;
import com.trek.constant.PolicyType;
import com.trek.entity.FrequentlyAskedQuestions;
import com.trek.entity.Policy;
import com.trek.entity.TourDetail;
import com.trek.entity.TourOverview;
import com.trek.entity.TrekAddress;
import com.trek.enumerations.TourType;
import com.trek.repository.TourDetailsRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Trekking web API Specification."))
public class TrekApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrekApplication.class, args);
    }

    @Autowired
    private TourDetailsRepository tourDetailsRepository;

    @PostConstruct
    public void init() {

        // ----------------------------------------------------------
/*        ToursEntity tours1 = new ToursEntity();
        tours1.setId(1L);
        tours1.setToursType("Sahyadri Treks Pune");
        Set<TripEntity> trip1 = new HashSet<>();
        trip1.add(new TripEntity(1L, "Kalsubai Peak", "2 Days", 3000, "https://en.wikipedia.org/wiki/Kalavantin_Durg#/media/File:Kalavantinicha_Durga.jpg", "https://wa.link/oq8yge", tours1));
        trip1.add(new TripEntity(2L, "Tamhini Trek", "2 Days", 2000, "https://www.tripoto.com/maharashtra/trips/amboli-ghat-5f156e1894582/media/9d8d10536f19bd182b8fafbc85c36509", "https://wa.link/oq8yge", tours1));
        trip1.add(new TripEntity(3L, "Andharban Jungle Trek", "1 Day", 2500, "https://en.wikipedia.org/wiki/Rainforest#/media/File:Borneo_rainforest.jpg", "https://wa.link/oq8yge", tours1));
        trip1.add(new TripEntity(4L, "Lonavala Explore", "1.5 Days", 1200, "https://en.wikipedia.org/wiki/Lonavala#/media/File:Lonavalamh.jpg", "https://wa.link/oq8yge", tours1));
        trip1.add(new TripEntity(5L, "Kalavantin Durg Trek", "2.5 Days", 1550, "https://en.wikipedia.org/wiki/Kalavantin_Durg#/media/File:Kalavantinicha_Durga.jpg", "https://wa.link/oq8yge", tours1));
        trip1.add(new TripEntity(6L, "Tamhini Waterfall", "3.5 Days", 3150, "https://www.tripoto.com/maharashtra/trips/amboli-ghat-5f156e1894582/media/9d8d10536f19bd182b8fafbc85c36509", "https://wa.link/oq8yge", tours1));
        trip1.add(new TripEntity(7L, "Andharban Dark Forest Night Trek", "5 Day", 25000, "https://en.wikipedia.org/wiki/Rainforest#/media/File:Borneo_rainforest.jpg", "https://wa.link/oq8yge", tours1));

        tours1.setTrips(trip1);
        toursRepository.saveAndFlush(tours1);

        ToursEntity tours2 = new ToursEntity();
        tours2.setId(2L);
        tours2.setToursType("Konkan Sea Treks Mumbai");
        Set<TripEntity> trip2 = new HashSet<>();
        trip2.add(new TripEntity(8L, "Konkan Backpacking", "3 Days", 4500, "https://drive.google.com/file/d/12iYiUmADd1sIg5Qm0wlzFjzhRMm8a6PP/view?usp=share_link", "https://wa.link/oq8yge", tours2));
        trip2.add(new TripEntity(9L, "Dapoli Beach Explore", "9 Days", 7000, "https://drive.google.com/file/d/1d47g0fNc4znwJVEfP7rtU7d8gvvWP9NH/view?usp=share_link", "https://wa.link/oq8yge", tours2));
        trip2.add(new TripEntity(10L, "Ratnagiri Site Seeing", "7 Days", 15000, "https://drive.google.com/file/d/1VeqK91LrLJdMw2o3r3sdsCt5xJzrpECb/view?usp=share_link", "https://wa.link/oq8yge", tours2));
        trip2.add(new TripEntity(11L, "Kashid Sea Trek", "12 Days", 5000, "https://drive.google.com/file/d/1U68kCJROcruhZGsQ3IoXWdVDXL6MkiNA/view?usp=share_link", "https://wa.link/oq8yge", tours2));
        trip2.add(new TripEntity(12L, "Ganpatipule Clean Sea Trek", "22 Days", 4000, "https://drive.google.com/file/d/1812HcKZRVhUOx7tSw0VYPlJfijQEuvje/view?usp=share_link", "https://wa.link/oq8yge", tours2));
        tours2.setTrips(trip2);
        toursRepository.saveAndFlush(tours2);*/

        //-------------------------------Adding tours details------------------------------------------------------
     /*   TourDetail detail = new TourDetail();

        // images
        List<String> images = new ArrayList<>();
        images.add("https://mybackendimage.s3.ap-south-1.amazonaws.com/Kalsubai+Trek/Kalsubai+Trek_1.jpeg");
        images.add("https://mybackendimage.s3.ap-south-1.amazonaws.com/Kalsubai+Trek/Kalsubai+Trek_2.jpeg");
        images.add("https://mybackendimage.s3.ap-south-1.amazonaws.com/Kalsubai+Trek/Kalsubai+Trek_3.jpeg");
        images.add("https://mybackendimage.s3.ap-south-1.amazonaws.com/Kalsubai+Trek/Kalsubai+Trek_4.jpeg");
        images.add("https://mybackendimage.s3.ap-south-1.amazonaws.com/Kalsubai+Trek/Kalsubai+Trek_5.jpeg");
        detail.setImages(images);

        // name
        detail.setName("Kalsubai Trek - Sunrise");

        //whatappConnectUrl
        detail.setWhatsappConnectUrl("https://wa.link/oq8yge");

        //tourType
        detail.setType(TourType.SAHYADRI_TREKS_PUNE.name());

        //price
        detail.setPrice(1250);

        // location
        detail.setLocation("Igatpuri");

        // highlights
        List<String> highlights = new ArrayList<>();
        highlights.add("Traverse through the beautiful landscapes and pass by multiple waterfalls during this 6.6 km long trek");
        highlights.add("Set off on a hike to the 1,646 meters Kalsubai Peak, also known as the Everest of Maharashtra");
        highlights.add("Ascend to the summit, take a time to unwind and enjoy the views of the sunrise from the well-known Kalsubai temple");
        highlights.add("Admire the breathtaking views of peaks including Alang, Madangad, Kulang, Ratangad, and Harishchandragad from the crest");
        detail.setHighlights(highlights);

        //FAQ
        List<FrequentlyAskedQuestions> faqs = new ArrayList<>();

        FrequentlyAskedQuestions faq1 = new FrequentlyAskedQuestions();
        faq1.setQuestion("What is the height of Kalsubai?");
        List<String> ans1 = new ArrayList<>();
        ans1.add("Kalsubai is a mountain in the Western Ghats and is the highest peak of Maharashtra.");
        ans1.add("The summit height of the Sahyadri mountain ranges in the north where the Kalsubai trek height is 1646 meters, is also known as Everest of Maharashtra. This peak is now one of the most preferred trekking spots in India.");
        faq1.setAns(ans1);
        faqs.add(faq1);
        faq1.setTours(detail);

        FrequentlyAskedQuestions faq2 = new FrequentlyAskedQuestions();
        faq2.setQuestion("What is the altitude of Kalsubai Trek?");
        List<String> ans2 = new ArrayList<>();
        ans2.add("The Kalsubai trek takes you at an elevation of 5400 feet to the summit of the Kalsubai mountain peak. Further, the 6.6 km long trek trail passes through lush paddy fields, jungles, small streams, highlands and rocky terrains.");
        faq2.setAns(ans2);
        faqs.add(faq2);
        faq2.setTours(detail);

        FrequentlyAskedQuestions faq3 = new FrequentlyAskedQuestions();
        faq3.setQuestion("Can beginners experience the Kalsubai trek?");
        List<String> ans3 = new ArrayList<>();
        ans3.add("Yes. The Kalsubai trek has easy to moderate difficulty level. A 6.6 km long trudge, the initial climb is easy which gets arduous nearing the peak.");
        ans3.add("First time trekkers with good fitness can easily complete the trek and if you are not regular with your workouts, then consider basic exercises before joining the trek. Moreover, seasoned trekkers would find the trail comfortable to ascend.");
        faq3.setAns(ans3);
        faqs.add(faq3);
        detail.setFaqs(faqs);
        faq3.setTours(detail);

        // Polices
        List<Policy> polices = new ArrayList<>();

        Policy policy1 = new Policy();
        policy1.setPolicyType(PolicyType.CONFIRMATION);
        List<String> value1 = new ArrayList<>();
        value1.add("The customer receives a confirmation voucher via email within 12 hours of successful booking");
        value1.add("In case the preferred slots are unavailable, an alternate schedule of the customer’s preference will be arranged and a new confirmation voucher will be sent via email.");
        value1.add("Alternatively, the customer may choose to cancel their booking before confirmation and a full refund will be processed.");
        policy1.setValues(value1);
        policy1.setTours(detail);

        Policy policy2 = new Policy();
        policy2.setPolicyType(PolicyType.REFUND);
        List<String> value2 = new ArrayList<>();
        value2.add("The applicable refund amount will be processed within 10 business days.");
        value2.add("All applicable refunds will be done in the traveler's Thrillophilia wallet as Thrillcash.");
        policy2.setValues(value2);
        policy2.setTours(detail);

        Policy policy3 = new Policy();
        policy3.setPolicyType(PolicyType.BOOKING);
        List<String> value3 = new ArrayList<>();
        //		value3.add("In case of unforeseen weather conditions or government restrictions, certain trips or activities may get canceled. In such cases, the operator will try their best to provide an alternate feasible. However, a cash refund will not be applicable for the same. Thrillcash+ will be allocated in your Thrillophilia wallet which can be used anytime in the future.");
        value3.add("Cancellations are strictly subjected to cancellation policies mentioned on the website & are irrespective of the date of booking.");
        policy3.setValues(value3);
        policy3.setTours(detail);

        Policy policy4 = new Policy();
        policy4.setPolicyType(PolicyType.CANCELLATION);
        List<String> value4 = new ArrayList<>();
        value4.add("If cancellation are made 15 days before the date of travel then 50.0% of total tour cost will be charged as cancellation fees");
        value4.add("If cancellation are made 7 days to 15 days before the date of travel then 75.0% of total tour cost will be charged as cancellation fees");
        value4.add("If cancellation are made 0 days to 7 days before the date of travel then 100.0% of total tour cost will be charged as cancellation fees");
        policy4.setValues(value4);
        policy4.setTours(detail);

        Policy policy5 = new Policy();
        policy5.setPolicyType(PolicyType.PAYMENT_TERMS_CONFIDATION);
        List<String> value5 = new ArrayList<>();
        value5.add("100.0% of total tour cost will have to be paid 0 days before the date of booking");
        policy5.setValues(value5);
        policy5.setTours(detail);

        polices.add(policy1);
        polices.add(policy2);
        polices.add(policy3);
        polices.add(policy4);
        polices.add(policy5);
        detail.setPolices(polices);

        // Map
        List<TrekAddress> trekAddress = new ArrayList<>();

        TrekAddress trekAddress1 = new TrekAddress();

        trekAddress1.setPlace("Bari Village");
        trekAddress1.setUrl("https://www.google.com/maps?cid=4203087319144325031");
        trekAddress1.setLocation("Bari");
        trekAddress1.setAddressType(AddressTypes.STARTING);
        trekAddress1.setPincode(422604);
        trekAddress1.setState("Maharashtra");
        trekAddress1.setCountry("India");
        trekAddress1.setLandmark("");
        trekAddress1.setTours(detail);
        trekAddress.add(trekAddress1);

        TrekAddress trekAddress2 = new TrekAddress();
        trekAddress2.setPlace("Nashik Phata");
        trekAddress2.setUrl("https://www.google.com/maps?q=Nashik+Phata&ftid=0x3bc2b8927729fc61:0x30f3c6d623e5a24a");
        trekAddress2.setLocation("Nashik Phata, Kasarwadi, Pimpri-Chinchwad");
        trekAddress2.setAddressType(AddressTypes.PICKUP);
        trekAddress2.setPincode(411034);
        trekAddress2.setState("Maharashtra");
        trekAddress2.setCountry("India");
        trekAddress2.setLandmark("");
        trekAddress2.setTours(detail);
        trekAddress.add(trekAddress2);

        TrekAddress trekAddress3 = new TrekAddress();
        trekAddress3.setPlace("Fergusson College");
        trekAddress3.setUrl("https://www.google.com/maps?cid=13414993580171952778");
        trekAddress3.setLocation("Fergusson College Rd, Shivajinagar, Pune");
        trekAddress3.setAddressType(AddressTypes.PICKUP);
        trekAddress3.setPincode(411004);
        trekAddress3.setState("Maharashtra");
        trekAddress3.setCountry("India");
        trekAddress3.setLandmark("In front of FC college gate");
        trekAddress3.setTours(detail);
        trekAddress.add(trekAddress3);

        TrekAddress trekAddress4 = new TrekAddress();
        trekAddress4.setPlace("Kasara Railway Station");
        trekAddress4.setUrl("https://www.google.com/maps?cid=5834326748450803366");
        trekAddress4.setLocation("JFXF+867, Kasara");
        trekAddress4.setAddressType(AddressTypes.PICKUP);
        trekAddress4.setPincode(421602);
        trekAddress4.setState("Maharashtra");
        trekAddress4.setCountry("India");
        trekAddress4.setLandmark("");
        trekAddress4.setTours(detail);
        trekAddress.add(trekAddress4);

        TrekAddress trekAddress5 = new TrekAddress();
        trekAddress5.setPlace("Nashik Phata");
        trekAddress5.setUrl("https://www.google.com/maps?q=Nashik+Phata&ftid=0x3bc2b8927729fc61:0x30f3c6d623e5a24a");
        trekAddress5.setLocation("Nashik Phata, Kasarwadi, Pimpri-Chinchwad");
        trekAddress5.setAddressType(AddressTypes.DROP);
        trekAddress5.setPincode(411034);
        trekAddress5.setState("Maharashtra");
        trekAddress5.setCountry("India");
        trekAddress5.setLandmark("");
        trekAddress5.setTours(detail);
        trekAddress.add(trekAddress5);

        TrekAddress trekAddress6 = new TrekAddress();
        trekAddress6.setPlace("Fergusson College");
        trekAddress6.setUrl("https://www.google.com/maps?cid=13414993580171952778");
        trekAddress6.setLocation("Fergusson College Rd, Shivajinagar, Pune");
        trekAddress6.setAddressType(AddressTypes.DROP);
        trekAddress6.setPincode(411004);
        trekAddress6.setState("Maharashtra");
        trekAddress6.setCountry("India");
        trekAddress6.setLandmark("");
        trekAddress6.setTours(detail);
        trekAddress.add(trekAddress6);

        TrekAddress trekAddress7 = new TrekAddress();
        trekAddress7.setPlace("Kasara Railway Station");
        trekAddress7.setUrl("https://www.google.com/maps?cid=5834326748450803366");
        trekAddress7.setLocation("JFXF+867, Kasara");
        trekAddress7.setAddressType(AddressTypes.DROP);
        trekAddress7.setPincode(421602);
        trekAddress7.setState("Maharashtra");
        trekAddress7.setCountry("India");
        trekAddress7.setLandmark("");
        trekAddress7.setTours(detail);
        trekAddress.add(trekAddress7);

        detail.setTrekAddress(trekAddress);

        // Overview details
        TourOverview tourOverview = new TourOverview();
        tourOverview.setActivityLocation("Bari Village, Igatpuri, Kalsubai Harishchandragad Wildlife Sanctuary, Maharashtra.");
        tourOverview.setTrekRegion("Igatpuri, Maharashtra");
        tourOverview.setStartingPoint("Bari Village (Base village)");
        tourOverview.setTours(detail);

        List<String> pickupLoc = new ArrayList<>();
        pickupLoc.add("Kasara Railway Station, Mumbai");
        pickupLoc.add("Fergusson College Main Gate ,FC Road (Near Starbucks), Pune.");
        tourOverview.setPickUpLocations(pickupLoc);

        tourOverview.setTotalDuration("1 Day 1 Night");
        tourOverview.setTrekDuration("3 hours (one way)");
        tourOverview.setSummitHeight("1,646 meters (Approx.)");
        tourOverview.setTrekDistance("6.6 km (One way)");
        tourOverview.setTrekDifficultyLevel("Moderate to High");
        tourOverview.setAttractionsDuringTrek("Kalsubai Temple, Lush Green Grassland, Panoramic Views of Alang-Madangad-Kulang, Ratangad and Pabhargad, Ghanchakkar & Harishchandragad.");

        List<String> activities = new ArrayList<>();
        activities.add("Go on an adventurous Kalsubai Trek of 6.6 km and enjoy views from a height of 1,646 meters.");
        activities.add("Choose your preferred package depending on the different pick-up locations in Mumbai (Kasara & Boriwali), and get picked up in comfortable private vehicles.");
        activities.add("An experienced guide will accompany you during this exhilarating Kalsubai night trek.");
        activities.add("Admire the serene views of peaks like Alang, Madangad, Kulang, Ratangad, Pabhargad, Ghanchakkar, and Harishchandragad from the highest point.");
        activities.add("Once you reach the summit, take some time to relax and soak in the tranquillity of the place as the sun rises.");
        activities.add("Feel the cold breeze that will refresh your mind as you explore the Sahyadri Mountains.");
        activities.add("Additionally, the package offers delectable meals (breakfast and lunch) to sate your palate and enhance your hiking experience.");
        tourOverview.setActivities(activities);

        detail.setTourOverview(tourOverview);

        tourDetailsRepository.save(detail);

        //Second record

        TourDetail detail2 = new TourDetail();
        detail2.setName("Devkund Waterfall Trek");
        detail2.setPrice(2000);
        detail2.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail2.setType(TourType.SAHYADRI_TREKS_PUNE.name());

        TourOverview tourOverview2 = new TourOverview();
        tourOverview2.setTotalDuration("2 Days");
        tourOverview2.setTours(detail2);
        detail2.setTourOverview(tourOverview2);

        detail2.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/Devkund+Waterfall+Trek/Devkund+Waterfall+Trek_1.jpeg", "https://mybackendimage.s3.ap-south-1.amazonaws.com/Devkund+Waterfall+Trek/Devkund+Waterfall+Trek_3.jpeg"));

        tourDetailsRepository.save(detail2);

        //Third record

        TourDetail detail3 = new TourDetail();
        detail3.setName("Andharban Jungle Trek");
        detail3.setPrice(2550);
        detail3.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail3.setType(TourType.SAHYADRI_TREKS_PUNE.name());

        TourOverview tourOverview3 = new TourOverview();
        tourOverview3.setTotalDuration("1 Day 2 Nights");
        tourOverview3.setTours(detail3);
        detail3.setTourOverview(tourOverview3);

        detail3.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/Andharban+Dark+Forest+Trek/Andarban+Dark+Forest+Trek_1.jpeg", "https://mybackendimage.s3.ap-south-1.amazonaws.com/Andharban+Dark+Forest+Trek/Andarban+Dark+Forest+Trek_6.jpeg"));

        tourDetailsRepository.save(detail3);

        //Fourth record

        TourDetail detail4 = new TourDetail();
        detail4.setName("Harishchandragarh-Kokankada");
        detail4.setPrice(1400);
        detail4.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail4.setType(TourType.SAHYADRI_TREKS_PUNE.name());

        TourOverview tourOverview4 = new TourOverview();
        tourOverview4.setTotalDuration("1 Day 1 Night");
        tourOverview4.setTours(detail4);
        detail4.setTourOverview(tourOverview4);

        detail4.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/HarishchandraGadh+Fort+Trek/HarishchandraGadh+Fort+Trek_2.jpg", "https://mybackendimage.s3.ap-south-1.amazonaws.com/HarishchandraGadh+Fort+Trek/HarishchandraGadh+Fort+Trek_7.jpg"));

        tourDetailsRepository.save(detail4);

        //Fifth record

        TourDetail detail5 = new TourDetail();
        detail5.setName("Konkan Backpacking");
        detail5.setPrice(4500);
        detail5.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail5.setType(TourType.KOKAN_SEA_BACKPACKING_TOURS.name());

        TourOverview tourOverview5 = new TourOverview();
        tourOverview5.setTotalDuration("4 Days 4 Nights");
        tourOverview5.setTours(detail5);
        detail5.setTourOverview(tourOverview5);

        detail5.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/KokanTrip/Kokan+Trip_2.jpeg", "https://mybackendimage.s3.ap-south-1.amazonaws.com/Goa+Trip/Goa+Trip_5.jpeg"));

        tourDetailsRepository.save(detail5);

        //Sixth record

        TourDetail detail6 = new TourDetail();
        detail6.setName("Ganpatipule Clean Sea Trek");
        detail6.setPrice(3500);
        detail6.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail6.setType(TourType.KOKAN_SEA_BACKPACKING_TOURS.name());

        TourOverview tourOverview6 = new TourOverview();
        tourOverview6.setTotalDuration("2 Days 2 Night");
        tourOverview6.setTours(detail6);
        detail6.setTourOverview(tourOverview6);

        detail6.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/Ganpatipule+Trip/Ganpatipule+Trip_1.jpeg", "https://mybackendimage.s3.ap-south-1.amazonaws.com/Ganpatipule+Trip/Ganpatipule+Trip_2.jpeg"));

        tourDetailsRepository.save(detail6);

        //Seventh record

        TourDetail detail7 = new TourDetail();
        detail7.setName("Shimala the Queen Of Hills");
        detail7.setPrice(15500);
        detail7.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail7.setType(TourType.HIMALAYAN_TREKS.name());

        TourOverview tourOverview7 = new TourOverview();
        tourOverview7.setTotalDuration("9 Days 8 Nights");
        tourOverview7.setTours(detail7);
        detail7.setTourOverview(tourOverview7);

        detail7.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/ManaliShimla+Trip/Shimla+Manali+trip_3.jpeg","https://mybackendimage.s3.ap-south-1.amazonaws.com/ManaliShimla+Trip/Shimla+Manali+trip_8.jpeg"));

        tourDetailsRepository.save(detail7);

        //Eightth record

        TourDetail detail8 = new TourDetail();
        detail8.setName("Kedarnath the Gods Land");
        detail8.setPrice(17700);
        detail8.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail8.setType(TourType.HIMALAYAN_TREKS.name());

        TourOverview tourOverview8 = new TourOverview();
        tourOverview8.setTotalDuration("10 Days 9 Nights");
        tourOverview8.setTours(detail8);
        detail8.setTourOverview(tourOverview8);

        detail8.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/KedarnathTrek/Kedarnath+Trek_1.jpeg","https://mybackendimage.s3.ap-south-1.amazonaws.com/KedarnathTrek/Kedarnath+Trek_6.jpeg"));
        tourDetailsRepository.save(detail8);

        //Ninth record

        TourDetail detail9 = new TourDetail();
        detail9.setName("Tungnath-Worlds Highest Shiva Temple");
        detail9.setPrice(13700);
        detail9.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail9.setType(TourType.HIMALAYAN_TREKS.name());

        TourOverview tourOverview9 = new TourOverview();
        tourOverview9.setTotalDuration("9 Days 8 Nights");
        tourOverview9.setTours(detail9);
        detail9.setTourOverview(tourOverview9);

        detail9.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/TungnathTrek/Tunganth+Trek_7.jpeg","https://mybackendimage.s3.ap-south-1.amazonaws.com/TungnathTrek/Tunganth+Trek_5.jpeg"));

        tourDetailsRepository.save(detail9);

        //Tenth record

        TourDetail detail10 = new TourDetail();
        detail10.setName("Goa beaches explore");
        detail10.setPrice(8700);
        detail10.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail10.setType(TourType.KOKAN_SEA_BACKPACKING_TOURS.name());

        TourOverview tourOverview10 = new TourOverview();
        tourOverview10.setTotalDuration("3 Days 4 Nights");
        tourOverview10.setTours(detail10);
        detail10.setTourOverview(tourOverview10);

        detail10.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/Goa+Trip/Goa+Trip_6.jpeg","https://mybackendimage.s3.ap-south-1.amazonaws.com/Goa+Trip/Goa+Trip_4.jpeg"));

        tourDetailsRepository.save(detail10);

        //Eleventh record

        TourDetail detail11 = new TourDetail();
        detail11.setName("Ratangarh Trek -The Flowers Festival");
        detail11.setPrice(4999.99);
        detail11.setWhatsappConnectUrl("https://wa.link/oq8yge");
        detail11.setType(TourType.SAHYADRI_TREKS_PUNE.name());

        TourOverview tourOverview11 = new TourOverview();
        tourOverview11.setTotalDuration("2 Days 3 Nights");
        tourOverview11.setTours(detail11);
        detail11.setTourOverview(tourOverview11);

        detail11.setImages(Arrays.asList("https://mybackendimage.s3.ap-south-1.amazonaws.com/Ratangadh+Fort+Trek/Ratangadh+Fort+Trek_3.jpeg","https://mybackendimage.s3.ap-south-1.amazonaws.com/Ratangadh+Fort+Trek/Ratangadh+Fort+Trek_2.jpeg"));

        tourDetailsRepository.save(detail11);  */
    }
}
