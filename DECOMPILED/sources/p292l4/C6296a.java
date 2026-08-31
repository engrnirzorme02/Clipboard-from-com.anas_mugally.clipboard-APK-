package p292l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p228d4.C5235g;
import p260h4.C5653i;

/* JADX INFO: renamed from: l4.a */
/* JADX INFO: loaded from: classes.dex */
public class C6296a {

    /* JADX INFO: renamed from: a */
    private final String f24095a;

    /* JADX INFO: renamed from: b */
    private final Map f24096b;

    /* JADX INFO: renamed from: c */
    private final Map f24097c = new HashMap();

    public C6296a(String str, Map map) {
        this.f24095a = str;
        this.f24096b = map;
    }

    /* JADX INFO: renamed from: a */
    private String m27217a(Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private String m27218b(String str, Map map) {
        String strM27217a = m27217a(map);
        if (strM27217a.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strM27217a;
        }
        if (!str.endsWith("&")) {
            strM27217a = "&" + strM27217a;
        }
        return str + strM27217a;
    }

    /* JADX INFO: renamed from: e */
    private String m27219e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i7 = bufferedReader.read(cArr);
            if (i7 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i7);
        }
    }

    /* JADX INFO: renamed from: c */
    public C6298c m27220c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        C5653i.m25137d();
        InputStream inputStream = null;
        String strM27219e = null;
        inputStream = null;
        try {
            String strM27218b = m27218b(this.f24095a, this.f24096b);
            C5235g.m24179f().m24186i("GET Request URL: " + strM27218b);
            httpsURLConnection = (HttpsURLConnection) new URL(strM27218b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f24097c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strM27219e = m27219e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C6298c(responseCode, strM27219e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public C6296a m27221d(String str, String str2) {
        this.f24097c.put(str, str2);
        return this;
    }
}
