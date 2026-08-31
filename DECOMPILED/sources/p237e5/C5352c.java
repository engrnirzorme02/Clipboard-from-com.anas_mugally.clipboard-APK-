package p237e5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3746a;
import com.google.android.gms.common.util.AbstractC3755j;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C4944d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p193Z4.InterfaceC2157i;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: e5.c */
/* JADX INFO: loaded from: classes.dex */
public class C5352c {

    /* JADX INFO: renamed from: d */
    private static final Pattern f20472d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e */
    private static final Charset f20473e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    private final Context f20474a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2972b f20475b;

    /* JADX INFO: renamed from: c */
    private final C5354e f20476c = new C5354e();

    public C5352c(Context context, InterfaceC2972b interfaceC2972b) {
        this.f20474a = context;
        this.f20475b = interfaceC2972b;
    }

    /* JADX INFO: renamed from: a */
    private static String m24355a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m24356b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m24357c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* JADX INFO: renamed from: f */
    private String m24358f() {
        try {
            Context context = this.f20474a;
            byte[] bArrM18142a = AbstractC3746a.m18142a(context, context.getPackageName());
            if (bArrM18142a != null) {
                return AbstractC3755j.m18184c(bArrM18142a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f20474a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("ContentValues", "No such package: " + this.f20474a.getPackageName(), e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private URL m24359g(String str) throws C4944d {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e7) {
            throw new C4944d(e7.getMessage(), C4944d.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: h */
    private static byte[] m24360h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* JADX INFO: renamed from: i */
    private static boolean m24361i(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    /* JADX INFO: renamed from: j */
    private static void m24362j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* JADX INFO: renamed from: k */
    private static void m24363k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String strM24367o = m24367o(httpURLConnection);
        if (TextUtils.isEmpty(strM24367o)) {
            return;
        }
        Log.w("Firebase-Installations", strM24367o);
        Log.w("Firebase-Installations", m24355a(str, str2, str3));
    }

    /* JADX INFO: renamed from: l */
    private HttpURLConnection m24364l(URL url, String str) throws C4944d {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f20474a.getPackageName());
            InterfaceC2157i interfaceC2157i = (InterfaceC2157i) this.f20475b.get();
            if (interfaceC2157i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(interfaceC2157i.mo8761a()));
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e7);
                } catch (ExecutionException e8) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e8);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m24358f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C4944d("Firebase Installations Service is unavailable. Please try again later.", C4944d.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: m */
    static long m24365m(String str) {
        AbstractC3718s.m18073b(f20472d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: n */
    private AbstractC5353d m24366n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20473e));
        AbstractC5355f.a aVarM24382a = AbstractC5355f.m24382a();
        AbstractC5353d.a aVarM24374a = AbstractC5353d.m24374a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarM24374a.mo24347f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarM24374a.mo24344c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarM24374a.mo24345d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarM24382a.mo24353c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarM24382a.mo24354d(m24365m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarM24374a.mo24343b(aVarM24382a.mo24351a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarM24374a.mo24346e(AbstractC5353d.b.OK).mo24342a();
    }

    /* JADX INFO: renamed from: o */
    private static String m24367o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f20473e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    private AbstractC5355f m24368p(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20473e));
        AbstractC5355f.a aVarM24382a = AbstractC5355f.m24382a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarM24382a.mo24353c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarM24382a.mo24354d(m24365m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarM24382a.mo24352b(AbstractC5355f.b.OK).mo24351a();
    }

    /* JADX INFO: renamed from: q */
    private void m24369q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        m24371s(httpURLConnection, m24360h(m24356b(str, str2)));
    }

    /* JADX INFO: renamed from: r */
    private void m24370r(HttpURLConnection httpURLConnection) throws IOException {
        m24371s(httpURLConnection, m24360h(m24357c()));
    }

    /* JADX INFO: renamed from: s */
    private static void m24371s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public AbstractC5353d m24372d(String str, String str2, String str3, String str4, String str5) {
        AbstractC5353d abstractC5353dM24366n;
        if (!this.f20476c.m24380b()) {
            throw new C4944d("Firebase Installations Service is unavailable. Please try again later.", C4944d.a.UNAVAILABLE);
        }
        URL urlM24359g = m24359g(String.format("projects/%s/installations", str3));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM24364l = m24364l(urlM24359g, str);
            try {
                try {
                    httpURLConnectionM24364l.setRequestMethod("POST");
                    httpURLConnectionM24364l.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionM24364l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m24369q(httpURLConnectionM24364l, str2, str4);
                    int responseCode = httpURLConnectionM24364l.getResponseCode();
                    this.f20476c.m24381f(responseCode);
                    if (m24361i(responseCode)) {
                        abstractC5353dM24366n = m24366n(httpURLConnectionM24364l);
                    } else {
                        m24363k(httpURLConnectionM24364l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new C4944d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C4944d.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            m24362j();
                            abstractC5353dM24366n = AbstractC5353d.m24374a().mo24346e(AbstractC5353d.b.BAD_CONFIG).mo24342a();
                        }
                        httpURLConnectionM24364l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionM24364l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return abstractC5353dM24366n;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionM24364l.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new C4944d("Firebase Installations Service is unavailable. Please try again later.", C4944d.a.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: e */
    public AbstractC5355f m24373e(String str, String str2, String str3, String str4) {
        AbstractC5355f abstractC5355fM24368p;
        if (!this.f20476c.m24380b()) {
            throw new C4944d("Firebase Installations Service is unavailable. Please try again later.", C4944d.a.UNAVAILABLE);
        }
        URL urlM24359g = m24359g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM24364l = m24364l(urlM24359g, str);
            try {
                try {
                    httpURLConnectionM24364l.setRequestMethod("POST");
                    httpURLConnectionM24364l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM24364l.setDoOutput(true);
                    m24370r(httpURLConnectionM24364l);
                    int responseCode = httpURLConnectionM24364l.getResponseCode();
                    this.f20476c.m24381f(responseCode);
                    if (m24361i(responseCode)) {
                        abstractC5355fM24368p = m24368p(httpURLConnectionM24364l);
                    } else {
                        m24363k(httpURLConnectionM24364l, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            abstractC5355fM24368p = AbstractC5355f.m24382a().mo24352b(AbstractC5355f.b.AUTH_ERROR).mo24351a();
                        } else {
                            if (responseCode == 429) {
                                throw new C4944d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C4944d.a.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                m24362j();
                                abstractC5355fM24368p = AbstractC5355f.m24382a().mo24352b(AbstractC5355f.b.BAD_CONFIG).mo24351a();
                            }
                            httpURLConnectionM24364l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionM24364l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return abstractC5355fM24368p;
                } catch (Throwable th) {
                    httpURLConnectionM24364l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new C4944d("Firebase Installations Service is unavailable. Please try again later.", C4944d.a.UNAVAILABLE);
    }
}
