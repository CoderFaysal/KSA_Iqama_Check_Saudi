package com.coderfaysal.saudi_iqama_check;



import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.coderfaysal.saudi_iqama_check.databinding.ActivityMainBinding;
import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {
    private static final String ONESIGNAL_APP_ID = "61f15c35-873a-4cab-b96d-459f494f6b11";

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    FloatingActionButton fab_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_video, R.id.nav_question, R.id.nav_info, R.id.nav_home)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

        // promptForPushNotifications will show the native Android notification permission prompt.
        // We recommend removing the following code and instead using an In-App Message to prompt for notification permission (See step 7)
        OneSignal.promptForPushNotifications();


        fab_share = findViewById(R.id.fab_share);

        fab_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share_intent = new Intent();
                        share_intent.setAction(Intent.ACTION_SEND);
                        share_intent.putExtra(Intent.EXTRA_TEXT, "Cheak this app via\n" + "https://play.google.com/store/apps/details?id=com.coderfaysal.saudi_iqama_check");
                        share_intent.setType("text/plain");
                        startActivity(Intent.createChooser(share_intent, "share app via"));
            }
        });
//
//        navigation_view = findViewById(R.id.nav_view);
//
//        navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//
//                switch (item.getItemId()){
//
//                    case R.id.share:
//                        Intent share_intent = new Intent();
//                        share_intent.setAction(Intent.ACTION_SEND);
//                        share_intent.putExtra(Intent.EXTRA_TEXT, "Cheak this app via\n" + "https://play.google.com/store/apps/details?id=com.coderfaysal.saudi_iqama_check");
//                        share_intent.setType("text/plain");
//                        startActivity(Intent.createChooser(share_intent, "share app via"));
//                        break;
//
//                    case R.id.more_app:
//                        try {
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Innovative Programmer")));
//                        } catch (android.content.ActivityNotFoundException anfe) {
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=5338546810958790262")));
//                        } break;
//
//                    case R.id.rating:
//                        final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
//                        try {
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
//                        } catch (android.content.ActivityNotFoundException anfe) {
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
//                        } break;
//
//                    case R.id.contact_me:
//                        try {
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01892837253")));
//                        } catch (android.content.ActivityNotFoundException anfe) {
//                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/coderfaysal")));
//                        } break;
//
//
//                }
//
//                return true;
//            }
//        });
//




    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }





}