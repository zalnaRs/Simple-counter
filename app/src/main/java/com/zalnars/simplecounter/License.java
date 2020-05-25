package com.zalnars.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class License extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);

        text = findViewById(R.id.license_text);

        text.setText(new StringBuilder().append("MIT License\n").append("\n").append("Copyright (c) 2020 zalnars\n").append("\n").append("Permission is hereby granted, free of charge, to any person obtaining a copy\n").append("of this software and associated documentation files (the \"Software\"), to deal\n").append("in the Software without restriction, including without limitation the rights\n").append("to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n").append("copies of the Software, and to permit persons to whom the Software is\n").append("furnished to do so, subject to the following conditions:\n").append("\n").append("The above copyright notice and this permission notice shall be included in all\n").append("copies or substantial portions of the Software.\n").append("\n").append("THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n").append("IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n").append("FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n").append("AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n").append("LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n").append("OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n").append("SOFTWARE.").toString());

    }
}
