package c346.rp.edu.sg.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import c346.rp.edu.sg.mywebbrowser.R;

public class MainActivity extends AppCompatActivity {

    Button loadBtn;
    WebView webView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadBtn = findViewById(R.id.loadBtn);
        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.grab.com/sg";

                webView.loadUrl(url);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAllowFileAccess(false);
            }
        });

    }
}
