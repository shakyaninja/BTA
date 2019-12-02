package com.example.bta.activities;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bta.R;

public class ViewWeb extends AppCompatActivity {
protected WebView webView;
protected int flag;
protected VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_web);

        int key = 24;
        flag =1;
        if (flag==0){
            webView = findViewById(R.id.viewWeb);
            webView.setWebChromeClient(new WebChromeClient());
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            switch (key){
                case 1:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Nyatapola_Temple");
                    break;
                case 2:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Dattatreya");
                    break;
                case 3:
                    webView.loadUrl("https://www.thelongestwayhome.com/blog/nepal/pottery-square-in-bhaktapur/");
                    break;
                case 4:
                case 10:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Bhaktapur_Durbar_Square");
                    break;
                case 11:
                case 22:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Changu_Narayan_Temple");
                    break;

                case 12:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Gai_Jatra");
                    break;
                case 13:
                    webView.loadUrl("https://gramho.com/explore-hashtag/Tahamacha");
                    break;
                case 14:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Yomari");
                    break;
                case 15:
                    webView.loadUrl("http://www.weallnepali.com/blogs/Bijaya-Ghimire/gathe-mangal--ghantakarna-chaturdasi");
                    break;
                case 16:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Bisket_Jatra");
                    break;
                case 17:
                    webView.loadUrl("https://www.youtube.com/watch?v=R0DHH1uZeJI");
                    break;
                case 18:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Nagarkot");
                    break;
                case 19:
                    webView.loadUrl("https://www.nepalsanctuarytreks.com/package/suryabinayak-pilot-baba-ashram-hiking/");
                    break;
                case 20:
                    webView.loadUrl("https://www.youtube.com/watch?v=u1tzN6K_520");
                    break;
                case 21:
                    webView.loadUrl("https://www.youtube.com/watch?v=TlGKciHku4c");
                    break;
                case 23:
                    webView.loadUrl("https://www.youtube.com/watch?v=AOSSSUL7LMQ");
                    break;
                case 24:
                    webView.loadUrl("https://www.youtube.com/watch?v=C_3d-p3OhOU");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + key);
            }
        }else if(flag==1){
            videoView = findViewById(R.id.viewVideo);


            switch (key){
                case 1:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Nyatapola_Temple");
                    break;
                case 2:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Dattatreya");
                    break;
                case 3:
                    webView.loadUrl("https://www.thelongestwayhome.com/blog/nepal/pottery-square-in-bhaktapur/");
                    break;
                case 4:
                case 10:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Bhaktapur_Durbar_Square");
                    break;
                case 11:
                case 22:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Changu_Narayan_Temple");
                    break;

                case 12:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Gai_Jatra");
                    break;
                case 13:
                    webView.loadUrl("https://gramho.com/explore-hashtag/Tahamacha");
                    break;
                case 14:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Yomari");
                    break;
                case 15:
                    webView.loadUrl("http://www.weallnepali.com/blogs/Bijaya-Ghimire/gathe-mangal--ghantakarna-chaturdasi");
                    break;
                case 16:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Bisket_Jatra");
                    break;
                case 17:
                    webView.loadUrl("https://www.youtube.com/watch?v=R0DHH1uZeJI");
                    break;
                case 18:
                    webView.loadUrl("https://en.wikipedia.org/wiki/Nagarkot");
                    break;
                case 19:
                    webView.loadUrl("https://www.nepalsanctuarytreks.com/package/suryabinayak-pilot-baba-ashram-hiking/");
                    break;
                case 20:
                    webView.loadUrl("https://www.youtube.com/watch?v=u1tzN6K_520");
                    break;
                case 21:
                    webView.loadUrl("https://www.youtube.com/watch?v=TlGKciHku4c");
                    break;
                case 23:
                    webView.loadUrl("https://www.youtube.com/watch?v=AOSSSUL7LMQ");
                    break;
                case 24:

                    Uri uri = Uri.parse("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/bSMZknDI6bg\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
                    videoView.setVideoURI(uri);
                    videoView.setMediaController(new MediaController(this));
                    videoView.requestFocus();
                    videoView.start();
//                    webView.loadUrl("https://www.youtube.com/watch?v=C_3d-p3OhOU");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + key);
            }
        }


    }
}
