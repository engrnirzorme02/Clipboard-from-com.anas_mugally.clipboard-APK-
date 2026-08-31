package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbbn;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p086K4.C0746b;
import p086K4.InterfaceC0745a;
import p198a2.C2187c;
import p208b2.AbstractC2935a;
import p208b2.AbstractC2948n;
import p208b2.AbstractC2949o;
import p208b2.AbstractC2950p;
import p208b2.AbstractC2951q;
import p208b2.AbstractC2952r;
import p208b2.AbstractC2953s;
import p208b2.AbstractC2954t;
import p208b2.AbstractC2955u;
import p208b2.AbstractC2956v;
import p208b2.AbstractC2957w;
import p208b2.EnumC2958x;
import p216c2.AbstractC2993i;
import p216c2.C2992h;
import p226d2.AbstractC5217f;
import p226d2.AbstractC5218g;
import p226d2.InterfaceC5224m;
import p250g2.AbstractC5459a;
import p258h2.AbstractC5553b;
import p258h2.InterfaceC5552a;
import p258h2.InterfaceC5554c;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.d */
/* JADX INFO: loaded from: classes.dex */
final class C3239d implements InterfaceC5224m {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0745a f13850a;

    /* JADX INFO: renamed from: b */
    private final ConnectivityManager f13851b;

    /* JADX INFO: renamed from: c */
    private final Context f13852c;

    /* JADX INFO: renamed from: d */
    final URL f13853d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6328a f13854e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6328a f13855f;

    /* JADX INFO: renamed from: g */
    private final int f13856g;

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.d$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        final URL f13857a;

        /* JADX INFO: renamed from: b */
        final AbstractC2948n f13858b;

        /* JADX INFO: renamed from: c */
        final String f13859c;

        a(URL url, AbstractC2948n abstractC2948n, String str) {
            this.f13857a = url;
            this.f13858b = abstractC2948n;
            this.f13859c = str;
        }

        /* JADX INFO: renamed from: a */
        a m17162a(URL url) {
            return new a(url, this.f13858b, this.f13859c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.d$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        final int f13860a;

        /* JADX INFO: renamed from: b */
        final URL f13861b;

        /* JADX INFO: renamed from: c */
        final long f13862c;

        b(int i7, URL url, long j7) {
            this.f13860a = i7;
            this.f13861b = url;
            this.f13862c = j7;
        }
    }

    C3239d(Context context, InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, int i7) {
        this.f13850a = AbstractC2948n.m14785b();
        this.f13852c = context;
        this.f13851b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13853d = m17159n(C3236a.f13841c);
        this.f13854e = interfaceC6328a2;
        this.f13855f = interfaceC6328a;
        this.f13856g = i7;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ a m17149d(a aVar, b bVar) {
        URL url = bVar.f13861b;
        if (url == null) {
            return null;
        }
        AbstractC5459a.m24663a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m17162a(bVar.f13861b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public b m17150e(a aVar) throws IOException {
        AbstractC5459a.m24667e("CctTransportBackend", "Making request to: %s", aVar.f13857a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f13857a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f13856g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f13859c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f13850a.mo3506a(aVar.f13858b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC5459a.m24667e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC5459a.m24663a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC5459a.m24663a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM17158m = m17158m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC2956v.m14798b(new BufferedReader(new InputStreamReader(inputStreamM17158m))).mo14778c());
                            if (inputStreamM17158m != null) {
                                inputStreamM17158m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamM17158m != null) {
                                try {
                                    inputStreamM17158m.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (C0746b e7) {
            e = e7;
            AbstractC5459a.m24665c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e8) {
            e = e8;
            AbstractC5459a.m24665c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            AbstractC5459a.m24665c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            AbstractC5459a.m24665c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m17151f(Context context) {
        String simOperator = m17156k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    /* JADX INFO: renamed from: g */
    private static int m17152g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC2957w.b.UNKNOWN_MOBILE_SUBTYPE.m14801d();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC2957w.b.COMBINED.m14801d();
        }
        if (AbstractC2957w.b.m14800c(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    private static int m17153h(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC2957w.c.NONE.m14803d() : networkInfo.getType();
    }

    /* JADX INFO: renamed from: i */
    private static int m17154i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            AbstractC5459a.m24665c("CctTransportBackend", "Unable to find version code for package", e7);
            return -1;
        }
    }

    /* JADX INFO: renamed from: j */
    private AbstractC2948n m17155j(AbstractC5217f abstractC5217f) {
        AbstractC2954t.a aVarM14793l;
        HashMap map = new HashMap();
        for (AbstractC2993i abstractC2993i : abstractC5217f.mo24117b()) {
            String strMo14904n = abstractC2993i.mo14904n();
            if (map.containsKey(strMo14904n)) {
                ((List) map.get(strMo14904n)).add(abstractC2993i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC2993i);
                map.put(strMo14904n, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2993i abstractC2993i2 = (AbstractC2993i) ((List) entry.getValue()).get(0);
            AbstractC2955u.a aVarMo14771b = AbstractC2955u.m14794a().mo14775f(EnumC2958x.DEFAULT).mo14776g(this.f13855f.mo27283a()).mo14777h(this.f13854e.mo27283a()).mo14771b(AbstractC2949o.m14786a().mo14727c(AbstractC2949o.b.ANDROID_FIREBASE).mo14726b(AbstractC2935a.m14686a().mo14711m(Integer.valueOf(abstractC2993i2.m14948i("sdk-version"))).mo14708j(abstractC2993i2.m14947b("model")).mo14704f(abstractC2993i2.m14947b("hardware")).mo14702d(abstractC2993i2.m14947b("device")).mo14710l(abstractC2993i2.m14947b("product")).mo14709k(abstractC2993i2.m14947b("os-uild")).mo14706h(abstractC2993i2.m14947b("manufacturer")).mo14703e(abstractC2993i2.m14947b("fingerprint")).mo14701c(abstractC2993i2.m14947b("country")).mo14705g(abstractC2993i2.m14947b("locale")).mo14707i(abstractC2993i2.m14947b("mcc_mnc")).mo14700b(abstractC2993i2.m14947b("application_build")).mo14699a()).mo14725a());
            try {
                aVarMo14771b.m14795i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarMo14771b.m14796j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC2993i abstractC2993i3 : (List) entry.getValue()) {
                C2992h c2992hMo14898e = abstractC2993i3.mo14898e();
                C2187c c2187cM14945b = c2992hMo14898e.m14945b();
                if (c2187cM14945b.equals(C2187c.m8925b("proto"))) {
                    aVarM14793l = AbstractC2954t.m14793l(c2992hMo14898e.m14944a());
                } else if (c2187cM14945b.equals(C2187c.m8925b("json"))) {
                    aVarM14793l = AbstractC2954t.m14792k(new String(c2992hMo14898e.m14944a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC5459a.m24668f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c2187cM14945b);
                }
                aVarM14793l.mo14756d(abstractC2993i3.mo14899f()).mo14757e(abstractC2993i3.mo14905o()).mo14762j(abstractC2993i3.m14949j("tz-offset")).mo14759g(AbstractC2957w.m14799a().mo14783c(AbstractC2957w.c.m14802c(abstractC2993i3.m14948i("net-type"))).mo14782b(AbstractC2957w.b.m14800c(abstractC2993i3.m14948i("mobile-subtype"))).mo14781a());
                if (abstractC2993i3.mo14897d() != null) {
                    aVarM14793l.mo14755c(abstractC2993i3.mo14897d());
                }
                if (abstractC2993i3.mo14902l() != null) {
                    aVarM14793l.mo14754b(AbstractC2950p.m14787a().mo14731b(AbstractC2953s.m14790a().mo14743b(AbstractC2952r.m14789a().mo14740b(abstractC2993i3.mo14902l()).mo14739a()).mo14742a()).mo14732c(AbstractC2950p.b.EVENT_OVERRIDE).mo14730a());
                }
                if (abstractC2993i3.mo14900g() != null || abstractC2993i3.mo14901h() != null) {
                    AbstractC2951q.a aVarM14788a = AbstractC2951q.m14788a();
                    if (abstractC2993i3.mo14900g() != null) {
                        aVarM14788a.mo14736b(abstractC2993i3.mo14900g());
                    }
                    if (abstractC2993i3.mo14901h() != null) {
                        aVarM14788a.mo14737c(abstractC2993i3.mo14901h());
                    }
                    aVarM14793l.mo14758f(aVarM14788a.mo14735a());
                }
                arrayList3.add(aVarM14793l.mo14753a());
            }
            aVarMo14771b.mo14772c(arrayList3);
            arrayList2.add(aVarMo14771b.mo14770a());
        }
        return AbstractC2948n.m14784a(arrayList2);
    }

    /* JADX INFO: renamed from: k */
    private static TelephonyManager m17156k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: renamed from: l */
    static long m17157l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / zzbbn.zzq.zzf;
    }

    /* JADX INFO: renamed from: m */
    private static InputStream m17158m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* JADX INFO: renamed from: n */
    private static URL m17159n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException("Invalid url: " + str, e7);
        }
    }

    @Override // p226d2.InterfaceC5224m
    /* JADX INFO: renamed from: a */
    public AbstractC2993i mo17160a(AbstractC2993i abstractC2993i) {
        NetworkInfo activeNetworkInfo = this.f13851b.getActiveNetworkInfo();
        return abstractC2993i.m14951p().m14952a("sdk-version", Build.VERSION.SDK_INT).m14954c("model", Build.MODEL).m14954c("hardware", Build.HARDWARE).m14954c("device", Build.DEVICE).m14954c("product", Build.PRODUCT).m14954c("os-uild", Build.ID).m14954c("manufacturer", Build.MANUFACTURER).m14954c("fingerprint", Build.FINGERPRINT).m14953b("tz-offset", m17157l()).m14952a("net-type", m17153h(activeNetworkInfo)).m14952a("mobile-subtype", m17152g(activeNetworkInfo)).m14954c("country", Locale.getDefault().getCountry()).m14954c("locale", Locale.getDefault().getLanguage()).m14954c("mcc_mnc", m17151f(this.f13852c)).m14954c("application_build", Integer.toString(m17154i(this.f13852c))).mo14906d();
    }

    @Override // p226d2.InterfaceC5224m
    /* JADX INFO: renamed from: b */
    public AbstractC5218g mo17161b(AbstractC5217f abstractC5217f) {
        AbstractC2948n abstractC2948nM17155j = m17155j(abstractC5217f);
        URL urlM17159n = this.f13853d;
        String strM17145d = null;
        if (abstractC5217f.mo24118c() != null) {
            try {
                C3236a c3236aM17143c = C3236a.m17143c(abstractC5217f.mo24118c());
                strM17145d = c3236aM17143c.m17145d() != null ? c3236aM17143c.m17145d() : null;
                if (c3236aM17143c.m17146e() != null) {
                    urlM17159n = m17159n(c3236aM17143c.m17146e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC5218g.m24130a();
            }
        }
        try {
            b bVar = (b) AbstractC5553b.m24988a(5, new a(urlM17159n, abstractC2948nM17155j, strM17145d), new InterfaceC5552a() { // from class: com.google.android.datatransport.cct.b
                @Override // p258h2.InterfaceC5552a
                public final Object apply(Object obj) {
                    return this.f13849a.m17150e((C3239d.a) obj);
                }
            }, new InterfaceC5554c() { // from class: com.google.android.datatransport.cct.c
                @Override // p258h2.InterfaceC5554c
                /* JADX INFO: renamed from: a */
                public final Object mo17147a(Object obj, Object obj2) {
                    return C3239d.m17149d((C3239d.a) obj, (C3239d.b) obj2);
                }
            });
            int i7 = bVar.f13860a;
            if (i7 == 200) {
                return AbstractC5218g.m24132e(bVar.f13862c);
            }
            if (i7 < 500 && i7 != 404) {
                return i7 == 400 ? AbstractC5218g.m24131d() : AbstractC5218g.m24130a();
            }
            return AbstractC5218g.m24133f();
        } catch (IOException e7) {
            AbstractC5459a.m24665c("CctTransportBackend", "Could not make request to the backend", e7);
            return AbstractC5218g.m24133f();
        }
    }

    C3239d(Context context, InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2) {
        this(context, interfaceC6328a, interfaceC6328a2, 130000);
    }
}
