package com.database.webview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private WebView mwebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();//Hide action bar

        mwebview=findViewById(R.id.webview);//linking web view to my java file of the activity

        WebSettings webSettings=mwebview.getSettings();//initialising web view object

        webSettings.setJavaScriptEnabled(true);//enabling site to be displayed in the app. The site needs to be built using javascript for this to happen

        mwebview.loadUrl("http://www.premediccare.rf.gd/?i=1#");//specifying url of the site to be displayed

        mwebview.setWebViewClient(new WebViewClient());//This line of code makes sure that all the pages will only open their links in the app itself.
    }
// the code to make the go back functionality possible in the app
    @Override
    public void onBackPressed() {
        if(mwebview.canGoBack()){
            mwebview.goBack();
        }
      else
          {
        super.onBackPressed();
    }
    }
}
