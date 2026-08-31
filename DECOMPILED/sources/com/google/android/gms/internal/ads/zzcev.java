package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.InterfaceC3761p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p111O.AbstractC1030Z;
import p380w2.C7333b;
import p380w2.C7351t;
import p396y2.AbstractBinderC7534v;
import p396y2.C7524l;
import p396y2.C7535w;
import p396y2.InterfaceC7516d;
import p396y2.InterfaceC7536x;
import p404z2.AbstractC7599p;
import p404z2.C7584a;
import p404z2.C7596m;

/* JADX INFO: loaded from: classes2.dex */
public class zzcev extends WebViewClient implements zzcgi {
    public static final /* synthetic */ int zzc = 0;
    private zzdsm zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzecy zzG;
    private View.OnAttachStateChangeListener zzH;
    protected final zzcek zza;
    protected zzbxf zzb;
    private final zzbbh zzd;
    private InterfaceC3318a zzg;
    private InterfaceC7536x zzh;
    private zzcgg zzi;
    private zzcgh zzj;
    private zzbib zzk;
    private zzbid zzl;
    private zzddz zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private InterfaceC7516d zzw;
    private zzbsa zzx;
    private C7333b zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrv zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzgg)).split(",")));

    public zzcev(zzcek zzcekVar, zzbbh zzbbhVar, boolean z7, zzbsa zzbsaVar, zzbrv zzbrvVar, zzecy zzecyVar) {
        this.zzd = zzbbhVar;
        this.zza = zzcekVar;
        this.zzs = z7;
        this.zzx = zzbsaVar;
        this.zzG = zzecyVar;
    }

    private final void zzaa(final View view, final zzbxf zzbxfVar, final int i7) {
        if (!zzbxfVar.zzc() || i7 <= 0) {
            return;
        }
        zzbxfVar.zzd(view);
        if (zzbxfVar.zzc()) {
            C3431F0.f14180l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzS(view, zzbxfVar, i7);
                }
            }, 100L);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzac() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaZ)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzad(String str, Map map) throws Throwable {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i7 = 0;
            while (true) {
                i7++;
                if (i7 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                int i8 = zzfqt.zzb;
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                C3431F0 c3431f0M32349g = C7351t.m32349g();
                try {
                    zzcek zzcekVar = this.zza;
                    c3431f0M32349g.m17436L(zzcekVar.getContext(), zzcekVar.zzs().f30226a, false, httpURLConnection, false, 60000);
                    WebResourceResponse webResourceResponseMo17453c = null;
                    C7596m c7596m = new C7596m(null);
                    c7596m.m33313a(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    c7596m.m33315c(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        C7351t.m32349g();
                        C7351t.m32349g();
                        String contentType = httpURLConnection.getContentType();
                        String strTrim = "";
                        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                        C7351t.m32349g();
                        String contentType2 = httpURLConnection.getContentType();
                        if (!TextUtils.isEmpty(contentType2)) {
                            String[] strArrSplit = contentType2.split(";");
                            if (strArrSplit.length != 1) {
                                for (int i9 = 1; i9 < strArrSplit.length; i9++) {
                                    if (strArrSplit[i9].trim().startsWith("charset")) {
                                        String[] strArrSplit2 = strArrSplit[i9].trim().split("=");
                                        if (strArrSplit2.length > 1) {
                                            strTrim = strArrSplit2[1].trim();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        String str2 = strTrim;
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        HashMap map2 = new HashMap(headerFields.size());
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                                map2.put(entry2.getKey(), entry2.getValue().get(0));
                            }
                        }
                        webResourceResponseMo17453c = C7351t.m32352j().mo17453c(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        }
                        if (!headerField.startsWith("tel:")) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                int i10 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33331f("Protocol is null");
                                webResourceResponseMo17453c = zzac();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                StringBuilder sb = new StringBuilder(headerField.length() + 15);
                                sb.append("Redirecting to ");
                                sb.append(headerField);
                                String string = sb.toString();
                                int i11 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33326a(string);
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                StringBuilder sb2 = new StringBuilder(protocol.length() + 20);
                                sb2.append("Unsupported scheme: ");
                                sb2.append(protocol);
                                String string2 = sb2.toString();
                                int i12 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33331f(string2);
                                webResourceResponseMo17453c = zzac();
                            }
                        }
                    }
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseMo17453c;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzY(Map map, List list, String str) {
        if (AbstractC3490o0.m17547m()) {
            AbstractC3490o0.m17545k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                AbstractC3490o0.m17545k(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjl) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzW(boolean z7, long j7) {
        this.zza.zzu(z7, j7);
    }

    private static final boolean zzag(zzcek zzcekVar) {
        return zzcekVar.zzC() != null && zzcekVar.zzC().zzb();
    }

    private static final boolean zzah(boolean z7, zzcek zzcekVar) {
        return (!z7 || zzcekVar.zzN().zzg() || zzcekVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi, com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        InterfaceC3318a interfaceC3318a = this.zzg;
        if (interfaceC3318a != null) {
            interfaceC3318a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        AbstractC3490o0.m17545k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzO(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcek zzcekVar = this.zza;
                if (zzcekVar.zzX()) {
                    AbstractC3490o0.m17545k("Blank page loaded, 1...");
                    zzcekVar.zzY();
                    return;
                }
                this.zzB = true;
                zzcgh zzcghVar = this.zzj;
                if (zzcghVar != null) {
                    zzcghVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzcek zzcekVar2 = this.zza;
                if (zzcekVar2.zzL() != null) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmJ)).booleanValue()) {
                        zzcekVar2.zzL().m33167W0(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.zzo = true;
        this.zzp = i7;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzJ(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC3490o0.m17545k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZzd = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzO(uriZzd);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    InterfaceC3318a interfaceC3318a = this.zzg;
                    if (interfaceC3318a != null) {
                        interfaceC3318a.onAdClicked();
                        zzbxf zzbxfVar = this.zzb;
                        if (zzbxfVar != null) {
                            zzbxfVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzddz zzddzVar = this.zzm;
                    if (zzddzVar != null) {
                        zzddzVar.zzdz();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcek zzcekVar = this.zza;
            if (zzcekVar.zzD().willNotDraw()) {
                AbstractC7599p.m33331f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzauu zzauuVarZzS = zzcekVar.zzS();
                    zzfdg zzfdgVarZzT = zzcekVar.zzT();
                    if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmN)).booleanValue() || zzfdgVarZzT == null) {
                        if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                            uriZzd = zzauuVarZzS.zzd(uriZzd, zzcekVar.getContext(), (View) zzcekVar, zzcekVar.zzj());
                        }
                    } else if (zzauuVarZzS != null && zzauuVarZzS.zza(uriZzd)) {
                        uriZzd = zzfdgVarZzT.zza(uriZzd, zzcekVar.getContext(), (View) zzcekVar, zzcekVar.zzj());
                    }
                } catch (zzauv unused) {
                    AbstractC7599p.m33331f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                C7333b c7333b = this.zzy;
                if (c7333b == null || c7333b.m32306b()) {
                    C7524l c7524l = new C7524l("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzcek zzcekVar2 = this.zza;
                    zzv(c7524l, true, false, zzcekVar2 != null ? zzcekVar2.zzn() : "");
                } else {
                    c7333b.m32307c(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        C7524l c7524l;
        zzbrv zzbrvVar = this.zzz;
        boolean zZzd = zzbrvVar != null ? zzbrvVar.zzd() : false;
        C7351t.m32348f();
        C7535w.m33168a(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            String str = adOverlayInfoParcel.f14154w;
            if (str == null && (c7524l = adOverlayInfoParcel.f14143a) != null) {
                str = c7524l.f30128b;
            }
            zzbxfVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbjl zzbjlVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbjlVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(String str, zzbjl zzbjlVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbjlVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(String str, InterfaceC3761p interfaceC3761p) {
        synchronized (this.zzf) {
            try {
                List<zzbjl> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbjl zzbjlVar : list) {
                    if (interfaceC3761p.apply(zzbjlVar)) {
                        arrayList.add(zzbjlVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzbxfVar.zzf();
            this.zzb = null;
        }
        zzab();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbrv zzbrvVar = this.zzz;
                if (zzbrvVar != null) {
                    zzbrvVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzG(zzcgg zzcggVar) {
        this.zzi = zzcggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzH(zzcgh zzcghVar) {
        this.zzj = zzcghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final zzdsm zzI() {
        return this.zzA;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:83:0x020e A[Catch: all -> 0x01bb, TryCatch #12 {all -> 0x01bb, blocks: (B:71:0x01a0, B:73:0x01b2, B:77:0x01be, B:81:0x01fc, B:83:0x020e, B:84:0x0215), top: B:111:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02cd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzJ(String str, Map map) throws Throwable {
        WebResourceResponse webResourceResponse;
        int i7;
        InputStream inputStream;
        InputStream inputStreamZzb;
        Long l7;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        String string;
        try {
            Map map2 = new HashMap();
            zzcek zzcekVar = this.zza;
            if (zzcekVar.zzC() != null) {
                map2 = zzcekVar.zzC().zzaw;
            }
            String strZza = zzbxt.zza(str, zzcekVar.getContext(), this.zzE, map2);
            if (!strZza.equals(str)) {
                return zzad(strZza, map);
            }
            Parcelable.Creator<zzbat> creator = zzbat.CREATOR;
            zzbat zzbatVarZza = zzbat.zza(Uri.parse(str));
            if (zzbatVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put("Access-Control-Allow-Origin", "*");
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZze = zzghq.zza(zzggo.zzc('-')).zze(uri.getQueryParameter("range"));
                    if (listZze.size() == 2) {
                        int i8 = Integer.parseInt((String) listZze.get(0));
                        int i9 = Integer.parseInt((String) listZze.get(1)) + 1;
                        if (i8 > 0) {
                            zzbatVarZza.zzh = i8;
                        }
                        i7 = i9 - i8;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                String str2 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeN)).booleanValue()) {
                    zzbatVarZza.zzi = zzghs.zza(zzcekVar.zzn());
                    zzbatVarZza.zzj = zzcekVar.zzp();
                    if (zzbatVarZza.zzg) {
                        l7 = (Long) C3250D.m17200c().zzd(zzbci.zzeP);
                    } else {
                        l7 = (Long) C3250D.m17200c().zzd(zzbci.zzeO);
                    }
                    try {
                        long jLongValue = l7.longValue();
                        long jMo18161c = C7351t.m32357o().mo18161c();
                        C7351t.m32342D();
                        Future futureZza = zzbbe.zza(zzcekVar.getContext(), zzbatVarZza);
                        try {
                            zzbbf zzbbfVar = (zzbbf) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbbfVar.zzc()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbbfVar.zzd()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbbfVar.zzf()));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbbfVar.zze()));
                                    inputStreamZzb = zzbbfVar.zzb();
                                    if (i7 != -1) {
                                        try {
                                            inputStreamZzb = zzgmo.zzb(inputStreamZzb, i7);
                                        } catch (InterruptedException e7) {
                                            e = e7;
                                            z9 = true;
                                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeS)).booleanValue()) {
                                                C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long jMo18161c2 = C7351t.m32357o().mo18161c() - jMo18161c;
                                            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcep
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzV(z9, jMo18161c2);
                                                }
                                            });
                                            StringBuilder sb = new StringBuilder(String.valueOf(jMo18161c2).length() + 24);
                                            sb.append("Cache connection took ");
                                            sb.append(jMo18161c2);
                                            sb.append("ms");
                                            string = sb.toString();
                                        } catch (ExecutionException e8) {
                                            e = e8;
                                            z8 = true;
                                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeS)).booleanValue()) {
                                                C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jMo18161c3 = C7351t.m32357o().mo18161c() - jMo18161c;
                                            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzU(z8, jMo18161c3);
                                                }
                                            });
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(jMo18161c3).length() + 24);
                                            sb2.append("Cache connection took ");
                                            sb2.append(jMo18161c3);
                                            sb2.append("ms");
                                            string = sb2.toString();
                                        } catch (TimeoutException e9) {
                                            e = e9;
                                            z8 = true;
                                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeS)).booleanValue()) {
                                                C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jMo18161c4 = C7351t.m32357o().mo18161c() - jMo18161c;
                                            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzU(z8, jMo18161c4);
                                                }
                                            });
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(jMo18161c4).length() + 24);
                                            sb3.append("Cache connection took ");
                                            sb3.append(jMo18161c4);
                                            sb3.append("ms");
                                            string = sb3.toString();
                                        }
                                    }
                                    final long jMo18161c5 = C7351t.m32357o().mo18161c() - jMo18161c;
                                    final boolean z10 = true;
                                    C3431F0.f14180l.post(new Runnable(z10, jMo18161c5) { // from class: com.google.android.gms.internal.ads.zzcen
                                        private final /* synthetic */ long zzb;

                                        {
                                            this.zzb = jMo18161c5;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzT(true, this.zzb);
                                        }
                                    });
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(jMo18161c5).length() + 24);
                                    sb4.append("Cache connection took ");
                                    sb4.append(jMo18161c5);
                                    sb4.append("ms");
                                    string = sb4.toString();
                                } catch (Throwable th) {
                                    th = th;
                                    z7 = 1;
                                    final long jMo18161c6 = C7351t.m32357o().mo18161c() - jMo18161c;
                                    C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzW(z7, jMo18161c6);
                                        }
                                    });
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(jMo18161c6).length() + 24);
                                    sb5.append("Cache connection took ");
                                    sb5.append(jMo18161c6);
                                    sb5.append("ms");
                                    AbstractC3490o0.m17545k(sb5.toString());
                                    throw th;
                                }
                            } catch (InterruptedException e10) {
                                e = e10;
                                inputStreamZzb = null;
                            } catch (ExecutionException e11) {
                                e = e11;
                                inputStreamZzb = null;
                                z8 = true;
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeS)).booleanValue()) {
                                    C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                final long jMo18161c7 = C7351t.m32357o().mo18161c() - jMo18161c;
                                C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzU(z8, jMo18161c7);
                                    }
                                });
                                StringBuilder sb6 = new StringBuilder(String.valueOf(jMo18161c7).length() + 24);
                                sb6.append("Cache connection took ");
                                sb6.append(jMo18161c7);
                                sb6.append("ms");
                                string = sb6.toString();
                                AbstractC3490o0.m17545k(string);
                                inputStream = inputStreamZzb;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                }
                                if (C7596m.m33304j()) {
                                }
                            } catch (TimeoutException e12) {
                                e = e12;
                                inputStreamZzb = null;
                                z8 = true;
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeS)).booleanValue()) {
                                    C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                final long jMo18161c8 = C7351t.m32357o().mo18161c() - jMo18161c;
                                C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzU(z8, jMo18161c8);
                                    }
                                });
                                StringBuilder sb7 = new StringBuilder(String.valueOf(jMo18161c8).length() + 24);
                                sb7.append("Cache connection took ");
                                sb7.append(jMo18161c8);
                                sb7.append("ms");
                                string = sb7.toString();
                                AbstractC3490o0.m17545k(string);
                                inputStream = inputStreamZzb;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                }
                                if (C7596m.m33304j()) {
                                }
                            }
                        } catch (InterruptedException e13) {
                            e = e13;
                            inputStreamZzb = null;
                            z9 = false;
                        } catch (ExecutionException e14) {
                            e = e14;
                            inputStreamZzb = null;
                            z8 = false;
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeS)).booleanValue()) {
                                C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jMo18161c9 = C7351t.m32357o().mo18161c() - jMo18161c;
                            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzU(z8, jMo18161c9);
                                }
                            });
                            StringBuilder sb8 = new StringBuilder(String.valueOf(jMo18161c9).length() + 24);
                            sb8.append("Cache connection took ");
                            sb8.append(jMo18161c9);
                            sb8.append("ms");
                            string = sb8.toString();
                            AbstractC3490o0.m17545k(string);
                            inputStream = inputStreamZzb;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (C7596m.m33304j()) {
                            }
                        } catch (TimeoutException e15) {
                            e = e15;
                            inputStreamZzb = null;
                            z8 = false;
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeS)).booleanValue()) {
                                C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jMo18161c10 = C7351t.m32357o().mo18161c() - jMo18161c;
                            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzU(z8, jMo18161c10);
                                }
                            });
                            StringBuilder sb9 = new StringBuilder(String.valueOf(jMo18161c10).length() + 24);
                            sb9.append("Cache connection took ");
                            sb9.append(jMo18161c10);
                            sb9.append("ms");
                            string = sb9.toString();
                            AbstractC3490o0.m17545k(string);
                            inputStream = inputStreamZzb;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (C7596m.m33304j()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z7 = 0;
                        }
                        AbstractC3490o0.m17545k(string);
                    } catch (Throwable th3) {
                        th = th3;
                        z7 = str2;
                    }
                } else {
                    zzbaq zzbaqVarZzc = C7351t.m32356n().zzc(zzbatVarZza);
                    if (zzbaqVarZzc == null || !zzbaqVarZzc.zza()) {
                        inputStream = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbaqVarZzc.zzd()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbaqVarZzc.zzg()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbaqVarZzc.zze()));
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbaqVarZzc.zzf()));
                        inputStreamZzb = zzbaqVarZzc.zzb();
                        if (i7 != -1) {
                            inputStreamZzb = zzgmo.zzb(inputStreamZzb, i7);
                        }
                    }
                    if (inputStream != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                    }
                }
                inputStream = inputStreamZzb;
                if (inputStream != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                }
            } else {
                webResourceResponse = null;
            }
            return (C7596m.m33304j() || !((Boolean) zzbee.zzb.zze()).booleanValue()) ? webResourceResponse : zzad(str, map);
        } catch (Exception e16) {
            e = e16;
            C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest");
            return zzac();
        } catch (NoClassDefFoundError e17) {
            e = e17;
            C7351t.m32354l().zzg(e, "AdWebViewClient.interceptRequest");
            return zzac();
        }
    }

    public final void zzK(boolean z7) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzL() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcek zzcekVar = this.zza.zza;
                    zzcekVar.zzah();
                    AbstractBinderC7534v abstractBinderC7534vZzL = zzcekVar.zzL();
                    if (abstractBinderC7534vZzL != null) {
                        abstractBinderC7534vZzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzM(boolean z7) {
        this.zzE = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzN(int i7, int i8) {
        zzbrv zzbrvVar = this.zzz;
        if (zzbrvVar != null) {
            zzbrvVar.zze(i7, i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzO(Uri uri) {
        AbstractC3490o0.m17545k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            AbstractC3490o0.m17545k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzhf)).booleanValue() || C7351t.m32354l().zza() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i7 = zzcev.zzc;
                    C7351t.m32354l().zza().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgf)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) C3250D.m17200c().zzd(zzbci.zzgh)).intValue()) {
                AbstractC3490o0.m17545k("Parsing gmsg query params on BG thread: ".concat(path));
                zzgot.zzq(C7351t.m32349g().m17440P(uri), new zzcem(this, list, path, uri), zzbzh.zzf);
                return;
            }
        }
        C7351t.m32349g();
        zzY(C3431F0.m17430u(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzP(boolean z7) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzQ(boolean z7) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzR(boolean z7) {
        synchronized (this.zzf) {
            this.zzv = z7;
        }
    }

    final /* synthetic */ void zzS(View view, zzbxf zzbxfVar, int i7) {
        zzaa(view, zzbxfVar, i7 - 1);
    }

    final /* synthetic */ void zzT(boolean z7, long j7) {
        zzW(true, j7);
    }

    final /* synthetic */ void zzX(View view, zzbxf zzbxfVar, int i7) {
        zzaa(view, zzbxfVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzZ(InterfaceC3318a interfaceC3318a, zzbib zzbibVar, InterfaceC7536x interfaceC7536x, zzbid zzbidVar, InterfaceC7516d interfaceC7516d, boolean z7, zzbjo zzbjoVar, C7333b c7333b, zzbsc zzbscVar, zzbxf zzbxfVar, zzecn zzecnVar, zzfjv zzfjvVar, zzdsm zzdsmVar, zzbkg zzbkgVar, zzddz zzddzVar, zzbkf zzbkfVar, zzbjz zzbjzVar, zzbjm zzbjmVar, zzcmi zzcmiVar, zzdtp zzdtpVar, zzcur zzcurVar) {
        C7333b c7333b2 = c7333b == null ? new C7333b(this.zza.getContext(), zzbxfVar, null) : c7333b;
        zzcek zzcekVar = this.zza;
        this.zzz = new zzbrv(zzcekVar, zzbscVar);
        this.zzb = zzbxfVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbg)).booleanValue()) {
            zzB("/adMetadata", new zzbia(zzbibVar));
        }
        if (zzbidVar != null) {
            zzB("/appEvent", new zzbic(zzbidVar));
        }
        zzB("/backButton", zzbjk.zzj);
        zzB("/refresh", zzbjk.zzk);
        zzB("/canOpenApp", zzbjk.zzb);
        zzB("/canOpenURLs", zzbjk.zza);
        zzB("/canOpenIntents", zzbjk.zzc);
        zzB("/close", zzbjk.zzd);
        zzB("/customClose", zzbjk.zze);
        zzB("/instrument", zzbjk.zzn);
        zzB("/delayPageLoaded", zzbjk.zzp);
        zzB("/delayPageClosed", zzbjk.zzq);
        zzB("/getLocationInfo", zzbjk.zzr);
        zzB("/log", zzbjk.zzg);
        zzB("/mraid", new zzbjs(c7333b2, this.zzz, zzbscVar));
        zzbsa zzbsaVar = this.zzx;
        if (zzbsaVar != null) {
            zzB("/mraidLoaded", zzbsaVar);
        }
        C7333b c7333b3 = c7333b2;
        zzB("/open", new zzbjy(c7333b3, this.zzz, zzecnVar, zzdsmVar, zzcmiVar, zzcurVar));
        zzB("/precache", new zzccr());
        zzB("/touch", zzbjk.zzi);
        zzB("/video", zzbjk.zzl);
        zzB("/videoMeta", zzbjk.zzm);
        if (zzecnVar == null || zzfjvVar == null) {
            zzB("/click", zzbjk.zzb(zzddzVar, zzcmiVar));
            zzB("/httpTrack", zzbjk.zzf);
        } else {
            zzB("/click", zzfdn.zza(zzecnVar, zzfjvVar, zzcmiVar, zzddzVar));
            zzB("/httpTrack", zzfdn.zzb(zzecnVar, zzfjvVar));
        }
        if (C7351t.m32346d().zza(zzcekVar.getContext())) {
            Map map = new HashMap();
            if (zzcekVar.zzC() != null) {
                map = zzcekVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbjr(zzcekVar.getContext(), map));
        }
        if (zzbjoVar != null) {
            zzB("/setInterstitialProperties", new zzbjn(zzbjoVar));
        }
        if (zzbkgVar != null) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbkgVar);
            }
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkb)).booleanValue() && zzbkfVar != null) {
            zzB("/shareSheet", zzbkfVar);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzio)).booleanValue() && zzdtpVar != null) {
            zzB("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkg)).booleanValue() && zzbjzVar != null) {
            zzB("/inspectorOutOfContextTest", zzbjzVar);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkl)).booleanValue() && zzbjmVar != null) {
            zzB("/inspectorStorage", zzbjmVar);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmo)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbjk.zzu);
            zzB("/presentPlayStoreOverlay", zzbjk.zzv);
            zzB("/expandPlayStoreOverlay", zzbjk.zzw);
            zzB("/collapsePlayStoreOverlay", zzbjk.zzx);
            zzB("/closePlayStoreOverlay", zzbjk.zzy);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdI)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbjk.zzA);
            zzB("/resetPAID", zzbjk.zzz);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmI)).booleanValue() && zzcekVar.zzC() != null && zzcekVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbjk.zzB);
            zzB("/clearLocalStorageKeys", zzbjk.zzC);
        }
        this.zzg = interfaceC3318a;
        this.zzh = interfaceC7536x;
        this.zzk = zzbibVar;
        this.zzl = zzbidVar;
        this.zzw = interfaceC7516d;
        this.zzy = c7333b3;
        this.zzm = zzddzVar;
        this.zzA = zzdsmVar;
        this.zzn = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zza(int i7, int i8, boolean z7) {
        zzbsa zzbsaVar = this.zzx;
        if (zzbsaVar != null) {
            zzbsaVar.zzb(i7, i8);
        }
        zzbrv zzbrvVar = this.zzz;
        if (zzbrvVar != null) {
            zzbrvVar.zzc(i7, i8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzb(zzfcj zzfcjVar) {
        zzcek zzcekVar = this.zza;
        if (C7351t.m32346d().zza(zzcekVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbjr(zzcekVar.getContext(), zzfcjVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzc(zzcmi zzcmiVar) {
        zzD("/click");
        zzB("/click", zzbjk.zzb(this.zzm, zzcmiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzd(zzcmi zzcmiVar, zzecn zzecnVar, zzfjv zzfjvVar) {
        zzD("/click");
        if (zzecnVar == null || zzfjvVar == null) {
            zzB("/click", zzbjk.zzb(this.zzm, zzcmiVar));
        } else {
            zzB("/click", zzfdn.zza(zzecnVar, zzfjvVar, zzcmiVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzddz zzddzVar = this.zzm;
        if (zzddzVar != null) {
            zzddzVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzddz zzddzVar = this.zzm;
        if (zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zze(zzcmi zzcmiVar, zzecn zzecnVar, zzdsm zzdsmVar) {
        zzD("/open");
        zzB("/open", new zzbjy(this.zzy, this.zzz, zzecnVar, zzdsmVar, zzcmiVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final C7333b zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzi(C7333b c7333b) {
        this.zzy = c7333b;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzj(zzbxf zzbxfVar) {
        this.zzb = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final boolean zzk() {
        boolean z7;
        synchronized (this.zzf) {
            z7 = this.zzs;
        }
        return z7;
    }

    public final boolean zzl() {
        boolean z7;
        synchronized (this.zzf) {
            z7 = this.zzt;
        }
        return z7;
    }

    public final boolean zzm() {
        boolean z7;
        synchronized (this.zzf) {
            z7 = this.zzu;
        }
        return z7;
    }

    public final boolean zzn() {
        boolean z7;
        synchronized (this.zzf) {
            z7 = this.zzv;
        }
        return z7;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzq() {
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzcek zzcekVar = this.zza;
            WebView webViewZzD = zzcekVar.zzD();
            if (AbstractC1030Z.m4443O(webViewZzD)) {
                zzaa(webViewZzD, zzbxfVar, 10);
                return;
            }
            zzab();
            zzcel zzcelVar = new zzcel(this, zzbxfVar);
            this.zzH = zzcelVar;
            ((View) zzcekVar).addOnAttachStateChangeListener(zzcelVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzs() {
        this.zzD--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzt() {
        zzbbh zzbbhVar = this.zzd;
        if (zzbbhVar != null) {
            zzbbhVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue()) {
                zzcek zzcekVar = this.zza;
                if (zzcekVar.zzq() != null) {
                    zzbcp.zza(zzcekVar.zzq().zzc(), zzcekVar.zzi(), "awfllc");
                }
            }
            zzcgg zzcggVar = this.zzi;
            boolean z7 = false;
            if (!this.zzC && !this.zzo) {
                z7 = true;
            }
            zzcggVar.zza(z7, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(C7524l c7524l, boolean z7, boolean z8, String str) {
        zzcek zzcekVar = this.zza;
        boolean zZzW = zzcekVar.zzW();
        boolean z9 = false;
        boolean z10 = zzah(zZzW, zzcekVar) || z8;
        if (z10 || !z7) {
            z9 = true;
        }
        zzA(new AdOverlayInfoParcel(c7524l, z10 ? null : this.zzg, zZzW ? null : this.zzh, this.zzw, zzcekVar.zzs(), zzcekVar, z9 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i7) {
        zzecy zzecyVar = this.zzG;
        zzcek zzcekVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcekVar, zzcekVar.zzs(), str, str2, 14, zzecyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbsp] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z7, int i7, boolean z8) {
        InterfaceC3318a interfaceC3318a;
        zzddz zzddzVar;
        zzcek zzcekVar = this.zza;
        boolean zZzah = zzah(zzcekVar.zzW(), zzcekVar);
        boolean z9 = true;
        if (!zZzah && z8) {
            z9 = false;
        }
        if (zZzah) {
            interfaceC3318a = null;
            zzddzVar = null;
        } else {
            interfaceC3318a = this.zzg;
            zzddzVar = null;
        }
        zzddz zzddzVar2 = zzddzVar;
        zzA(new AdOverlayInfoParcel(interfaceC3318a, this.zzh, this.zzw, zzcekVar, z7, i7, zzcekVar.zzs(), z9 ? zzddzVar2 : this.zzm, zzag(zzcekVar) ? this.zzG : zzddzVar2));
    }

    public final void zzy(boolean z7, int i7, String str, boolean z8, boolean z9) {
        zzcek zzcekVar = this.zza;
        boolean zZzW = zzcekVar.zzW();
        boolean zZzah = zzah(zZzW, zzcekVar);
        boolean z10 = true;
        if (!zZzah && z8) {
            z10 = false;
        }
        InterfaceC3318a interfaceC3318a = zZzah ? null : this.zzg;
        zzceu zzceuVar = zZzW ? null : new zzceu(zzcekVar, this.zzh);
        zzbib zzbibVar = this.zzk;
        zzecy zzecyVar = null;
        zzbid zzbidVar = this.zzl;
        boolean z11 = z10;
        zzceu zzceuVar2 = zzceuVar;
        InterfaceC7516d interfaceC7516d = this.zzw;
        C7584a c7584aZzs = zzcekVar.zzs();
        zzddz zzddzVar = z11 ? null : this.zzm;
        if (zzag(zzcekVar)) {
            zzecyVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(interfaceC3318a, zzceuVar2, zzbibVar, zzbidVar, interfaceC7516d, zzcekVar, z7, i7, str, c7584aZzs, zzddzVar, zzecyVar, z9));
    }

    public final void zzz(boolean z7, int i7, String str, String str2, boolean z8) {
        zzcek zzcekVar = this.zza;
        boolean zZzW = zzcekVar.zzW();
        boolean zZzah = zzah(zZzW, zzcekVar);
        boolean z9 = true;
        if (!zZzah && z8) {
            z9 = false;
        }
        InterfaceC3318a interfaceC3318a = zZzah ? null : this.zzg;
        zzceu zzceuVar = zZzW ? null : new zzceu(zzcekVar, this.zzh);
        zzbib zzbibVar = this.zzk;
        zzecy zzecyVar = null;
        zzbid zzbidVar = this.zzl;
        boolean z10 = z9;
        zzceu zzceuVar2 = zzceuVar;
        InterfaceC7516d interfaceC7516d = this.zzw;
        C7584a c7584aZzs = zzcekVar.zzs();
        zzddz zzddzVar = z10 ? null : this.zzm;
        if (zzag(zzcekVar)) {
            zzecyVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(interfaceC3318a, zzceuVar2, zzbibVar, zzbidVar, interfaceC7516d, zzcekVar, z7, i7, str, str2, c7584aZzs, zzddzVar, zzecyVar));
    }
}
