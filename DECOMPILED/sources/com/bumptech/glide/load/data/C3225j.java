package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC3207g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p019C1.C0129e;
import p019C1.EnumC0125a;
import p067I1.C0588h;
import p183Y1.AbstractC2018g;
import p183Y1.C2014c;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.j */
/* JADX INFO: loaded from: classes.dex */
public class C3225j implements InterfaceC3219d {

    /* JADX INFO: renamed from: r */
    static final b f13818r = new a();

    /* JADX INFO: renamed from: a */
    private final C0588h f13819a;

    /* JADX INFO: renamed from: b */
    private final int f13820b;

    /* JADX INFO: renamed from: c */
    private final b f13821c;

    /* JADX INFO: renamed from: d */
    private HttpURLConnection f13822d;

    /* JADX INFO: renamed from: e */
    private InputStream f13823e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f13824f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.j$a */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.C3225j.b
        /* JADX INFO: renamed from: a */
        public HttpURLConnection mo17126a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.j$b */
    interface b {
        /* JADX INFO: renamed from: a */
        HttpURLConnection mo17126a(URL url);
    }

    public C3225j(C0588h c0588h, int i7) {
        this(c0588h, i7, f13818r);
    }

    /* JADX INFO: renamed from: c */
    private HttpURLConnection m17120c(URL url, Map map) throws C0129e {
        try {
            HttpURLConnection httpURLConnectionMo17126a = this.f13821c.mo17126a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionMo17126a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionMo17126a.setConnectTimeout(this.f13820b);
            httpURLConnectionMo17126a.setReadTimeout(this.f13820b);
            httpURLConnectionMo17126a.setUseCaches(false);
            httpURLConnectionMo17126a.setDoInput(true);
            httpURLConnectionMo17126a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo17126a;
        } catch (IOException e7) {
            throw new C0129e("URL.openConnection threw", 0, e7);
        }
    }

    /* JADX INFO: renamed from: f */
    private static int m17121f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e7) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e7);
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    private InputStream m17122g(HttpURLConnection httpURLConnection) throws C0129e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f13823e = C2014c.m8384m(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f13823e = httpURLConnection.getInputStream();
            }
            return this.f13823e;
        } catch (IOException e7) {
            throw new C0129e("Failed to obtain InputStream", m17121f(httpURLConnection), e7);
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m17123h(int i7) {
        return i7 / 100 == 2;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m17124i(int i7) {
        return i7 / 100 == 3;
    }

    /* JADX INFO: renamed from: j */
    private InputStream m17125j(URL url, int i7, URL url2, Map map) throws C0129e {
        if (i7 >= 5) {
            throw new C0129e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C0129e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionM17120c = m17120c(url, map);
        this.f13822d = httpURLConnectionM17120c;
        try {
            httpURLConnectionM17120c.connect();
            this.f13823e = this.f13822d.getInputStream();
            if (this.f13824f) {
                return null;
            }
            int iM17121f = m17121f(this.f13822d);
            if (m17123h(iM17121f)) {
                return m17122g(this.f13822d);
            }
            if (!m17124i(iM17121f)) {
                if (iM17121f == -1) {
                    throw new C0129e(iM17121f);
                }
                try {
                    throw new C0129e(this.f13822d.getResponseMessage(), iM17121f);
                } catch (IOException e7) {
                    throw new C0129e("Failed to get a response message", iM17121f, e7);
                }
            }
            String headerField = this.f13822d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new C0129e("Received empty or null redirect url", iM17121f);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo931b();
                return m17125j(url3, i7 + 1, url, map);
            } catch (MalformedURLException e8) {
                throw new C0129e("Bad redirect url: " + headerField, iM17121f, e8);
            }
        } catch (IOException e9) {
            throw new C0129e("Failed to connect or obtain data", m17121f(this.f13822d), e9);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: a */
    public Class mo930a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: b */
    public void mo931b() {
        InputStream inputStream = this.f13823e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f13822d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f13822d = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    public void cancel() {
        this.f13824f = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: d */
    public EnumC0125a mo932d() {
        return EnumC0125a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: e */
    public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
        long jM8393b = AbstractC2018g.m8393b();
        try {
            aVar.mo1314f(m17125j(this.f13819a.m2600h(), 0, null, this.f13819a.m2599e()));
        } catch (IOException e7) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e7);
            }
            aVar.mo1313c(e7);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC2018g.m8392a(jM8393b));
            }
        }
    }

    C3225j(C0588h c0588h, int i7, b bVar) {
        this.f13819a = c0588h;
        this.f13820b = i7;
        this.f13821c = bVar;
    }
}
