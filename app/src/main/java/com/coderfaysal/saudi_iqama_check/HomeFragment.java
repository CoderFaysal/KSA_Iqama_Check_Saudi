package com.coderfaysal.saudi_iqama_check;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements View.OnClickListener{


    ImageSlider imageSlider;
    LinearLayout iqama_check, fake_kafala, driving_licence, contract_agreement, all_violation, khuroob_matloob, tourism_e_visa, visa_status,
            exit_entry, red_green_status, medical_visa, iqama_profession_test, health_insurance, visa_insurance, extent_visa_insurance, qiwa_accept_req,
            riyal_price, more_apps;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        imageSlider = v.findViewById(R.id.image_slider);

        iqama_check = v.findViewById(R.id.iqama_check);
        fake_kafala = v.findViewById(R.id.fake_kafala);
        driving_licence = v.findViewById(R.id.driving_licence);
        contract_agreement = v.findViewById(R.id.contract_agreement);
        all_violation = v.findViewById(R.id.all_violation);
        khuroob_matloob = v.findViewById(R.id.khuroob_matloob);
        tourism_e_visa = v.findViewById(R.id.tourism_e_visa);
        visa_status = v.findViewById(R.id.visa_status);
        exit_entry = v.findViewById(R.id.exit_entry);
        red_green_status = v.findViewById(R.id.red_green_status);
        medical_visa = v.findViewById(R.id.medical_visa);
        iqama_profession_test = v.findViewById(R.id.iqama_profession_test);
        health_insurance = v.findViewById(R.id.health_insurance);
        visa_insurance = v.findViewById(R.id.visa_insurance);
        extent_visa_insurance = v.findViewById(R.id.extent_visa_insurance);
        qiwa_accept_req = v.findViewById(R.id.qiwa_accept_req);
        riyal_price = v.findViewById(R.id.riyal_price);



        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.slider_1, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slider_2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slider_3, ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList);


        iqama_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://www.mol.gov.sa/CIW/PrivacyAgreement.aspx";
            }
        });

        fake_kafala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://mol.gov.sa/services/inquiry/laborofficeservicesinquiry.aspx";
            }
        });

        driving_licence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "";
            }
        });

        contract_agreement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://www.gosi.gov.sa/GOSIOnline/Login&locale=en_US";
            }
        });

        all_violation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://efaa.sa/Home.aspx";
            }
        });

        khuroob_matloob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://www.mol.gov.sa/services/inquiry/nonsaudiempinquiry.aspx";
            }
        });

        tourism_e_visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://visa.visitsaudi.com/?gclid=CjwKCAiA7t3yBRADEiwA4GFlI8brTywaxQHE64HLJ4mOXesPm3UETGRv9ypa7AG0Emo9dxT70oddWBoCqGMQAvD_Bw";
            }
        });

        visa_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://enjazit.com.sa/VisaPerson/GetApplicantData";
            }
        });

        exit_entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://muqeem.sa/#/visa-validity/check";
            }
        });

        red_green_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://www.mol.gov.sa/services/inquiry/nonsaudiempinquiry.aspx";
            }
        });

        medical_visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://v2.gcchmc.org/medical-status-search/";
            }
        });

        iqama_profession_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://svp.qiwa.sa/en/test_taker/search";
            }
        });

        health_insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://eservices.chi.gov.sa/Pages/ClientSystem/CheckInsurance.aspx?lang=en";
            }
        });

        visa_insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://eservices.chi.gov.sa/Pages/ClientSystem/CheckInsurance.aspx?lang=en";
            }
        });

        extent_visa_insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://www.alrajhitakaful.com/en/Pages/VisitorVisa.aspx";
            }
        });

        qiwa_accept_req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://auth.qiwa.sa/en/sign-in";
            }
        });

        riyal_price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IqamaCheck.class);
                startActivity(intent);
                IqamaCheck.WEBSITE_LINK = "https://fx-rate.net/currency-transfer/?c_input=SAR&cp_input=BDT";
            }
        });






        return v;
    }


    @Override
    public void onClick(View v) {
        // Create new fragment and transaction
        Fragment newFragment = new HomeFragment();
        // consider using Java coding conventions (upper first char class names!!!)
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.nav_host_fragment_content_main, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }
}