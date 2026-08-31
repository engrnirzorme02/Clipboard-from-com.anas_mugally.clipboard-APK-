package p404z2;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.AbstractC3749d;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzfqt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* JADX INFO: renamed from: z2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7605v implements InterfaceC7589f {

    /* JADX INFO: renamed from: a */
    private final Context f30275a;

    /* JADX INFO: renamed from: b */
    private final String f30276b;

    /* JADX INFO: renamed from: c */
    private String f30277c;

    public C7605v(Context context, String str) {
        this.f30275a = context;
        this.f30276b = str;
    }

    /* JADX INFO: renamed from: b */
    private final URL m33340b(String str) {
        URL urlM33341c = null;
        try {
            urlM33341c = new URI(str).toURL();
        } catch (IllegalArgumentException e7) {
            e = e7;
            m33342d(str, e);
        } catch (MalformedURLException e8) {
            e = e8;
            m33342d(str, e);
        } catch (URISyntaxException e9) {
            m33342d(str, e9);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zze)).booleanValue()) {
                urlM33341c = m33341c(str);
            }
        }
        if (urlM33341c != null) {
            return urlM33341c;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        AbstractC7599p.m33326a(sb.toString());
        return new URL(str);
    }

    /* JADX INFO: renamed from: c */
    private final URL m33341c(String str) {
        URL url;
        try {
            AbstractC7599p.m33326a("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String string = uri.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 114 + string.length());
                sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb.append(str);
                sb.append("\" -> encoded URI: ");
                sb.append(string);
                AbstractC7599p.m33326a(sb.toString());
                return url;
            } catch (IllegalArgumentException e7) {
                e = e7;
                m33342d(str, e);
                return url;
            } catch (MalformedURLException e8) {
                e = e8;
                m33342d(str, e);
                return url;
            } catch (URISyntaxException e9) {
                e = e9;
                m33342d(str, e);
                return url;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e10) {
            e = e10;
            url = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m33342d(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        AbstractC7599p.m33331f(sb.toString());
        zzbtt.zza(this.f30275a).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) C3250D.m17200c().zzd(zzbci.zznA)).intValue() / 100.0f);
    }

    /* JADX INFO: renamed from: a */
    public final String m33343a() {
        return this.f30277c;
    }

    @Override // p404z2.InterfaceC7589f
    public final EnumC7604u zza(String str) {
        EnumC7604u enumC7604u = EnumC7604u.PERMANENT_FAILURE;
        try {
            try {
                if (AbstractC3749d.m18158a()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
                sb.append("Pinging URL: ");
                sb.append(str);
                AbstractC7599p.m33326a(sb.toString());
                URL urlM33340b = m33340b(str);
                int i7 = zzfqt.zzb;
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlM33340b.openConnection();
                try {
                    C3244B.m17190a();
                    String str2 = this.f30276b;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    C7596m c7596m = new C7596m(null);
                    c7596m.m33313a(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    c7596m.m33315c(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + String.valueOf(str).length());
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        AbstractC7599p.m33331f(sb2.toString());
                        if (responseCode == 502) {
                            enumC7604u = EnumC7604u.RETRIABLE_FAILURE;
                        }
                    } else {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziB)).booleanValue()) {
                            this.f30277c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                        }
                        enumC7604u = EnumC7604u.SUCCESS;
                    }
                    httpURLConnection.disconnect();
                    if (!AbstractC3749d.m18158a()) {
                        return enumC7604u;
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Throwable th2) {
                if (AbstractC3749d.m18158a()) {
                    TrafficStats.clearThreadStatsTag();
                }
                throw th2;
            }
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            m33342d(str, e);
            if (AbstractC3749d.m18158a()) {
            }
            return enumC7604u;
        } catch (MalformedURLException e8) {
            e = e8;
            m33342d(str, e);
            if (AbstractC3749d.m18158a()) {
            }
            return enumC7604u;
        } catch (IOException e9) {
            e = e9;
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message);
            AbstractC7599p.m33331f(sb3.toString());
            enumC7604u = EnumC7604u.RETRIABLE_FAILURE;
            if (AbstractC3749d.m18158a()) {
            }
            return enumC7604u;
        } catch (RuntimeException e10) {
            e = e10;
            String message2 = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            AbstractC7599p.m33331f(sb4.toString());
            enumC7604u = EnumC7604u.RETRIABLE_FAILURE;
            if (AbstractC3749d.m18158a()) {
            }
            return enumC7604u;
        }
        TrafficStats.clearThreadStatsTag();
        return enumC7604u;
    }
}
