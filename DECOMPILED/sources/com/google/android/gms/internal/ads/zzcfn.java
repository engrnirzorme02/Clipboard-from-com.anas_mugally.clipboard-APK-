package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.C3463b;
import com.google.android.gms.ads.internal.util.C3478i0;
import com.google.android.gms.ads.internal.util.C3486m0;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.common.util.InterfaceC3761p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p098M0.AbstractC0880j;
import p098M0.AbstractC0881k;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7332a;
import p380w2.C7351t;
import p380w2.InterfaceC7345n;
import p396y2.AbstractBinderC7534v;
import p396y2.C7524l;
import p404z2.AbstractC7599p;
import p404z2.C7584a;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfn extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcek {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcfq zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfj zzE;
    private zzbfg zzF;
    private zzazv zzG;
    private int zzH;
    private int zzI;
    private zzbcu zzJ;
    private final zzbcu zzK;
    private zzbcu zzL;
    private final zzbcv zzM;
    private int zzN;
    private AbstractBinderC7534v zzO;
    private boolean zzP;
    private final C3486m0 zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbbh zzY;
    private boolean zzZ;
    private final zzcgl zzb;
    private final zzauu zzc;
    private final zzfdg zzd;
    private final zzbdp zze;
    private final C7584a zzf;
    private InterfaceC7345n zzg;
    private final C7332a zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfcj zzk;
    private zzfcm zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcev zzo;
    private AbstractBinderC7534v zzp;
    private zzedu zzq;
    private zzeds zzr;
    private zzcgt zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    protected zzcfn(zzcgl zzcglVar, zzcgt zzcgtVar, String str, boolean z7, boolean z8, zzauu zzauuVar, zzbdp zzbdpVar, C7584a c7584a, zzbcx zzbcxVar, InterfaceC7345n interfaceC7345n, C7332a c7332a, zzbbh zzbbhVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzfdg zzfdgVar) {
        zzfcm zzfcmVar2;
        super(zzcglVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcglVar;
        this.zzs = zzcgtVar;
        this.zzt = str;
        this.zzw = z7;
        this.zzc = zzauuVar;
        this.zzd = zzfdgVar;
        this.zze = zzbdpVar;
        this.zzf = c7584a;
        this.zzg = interfaceC7345n;
        this.zzh = c7332a;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        C7351t.m32349g();
        DisplayMetrics displayMetricsM17415h0 = C3431F0.m17415h0(windowManager);
        this.zzi = displayMetricsM17415h0;
        this.zzj = displayMetricsM17415h0.density;
        this.zzY = zzbbhVar;
        this.zzk = zzfcjVar;
        this.zzl = zzfcmVar;
        this.zzQ = new C3486m0(zzcglVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzms)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Unable to enable Javascript.", e7);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmr)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznY)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(C7351t.m32349g().m17439O(zzcglVar, c7584a.f30226a));
        C7351t.m32349g();
        C3431F0.m17403b0(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzcfv(this, new zzcfu() { // from class: com.google.android.gms.internal.ads.zzcft
            @Override // com.google.android.gms.internal.ads.zzcfu
            public final /* synthetic */ void zza(Uri uri) {
                zzcev zzcevVarZzaS = ((zzcfn) this).zzaS();
                if (zzcevVarZzaS != null) {
                    zzcevVarZzaS.zzO(uri);
                } else {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33328c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbcv zzbcvVar = new zzbcv(new zzbcx(true, "make_wv", this.zzt));
        this.zzM = zzbcvVar;
        zzbcvVar.zzc().zza(null);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue() && (zzfcmVar2 = this.zzl) != null && zzfcmVar2.zzb != null) {
            zzbcvVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbcvVar.zzc();
        zzbcu zzbcuVarZzf = zzbcx.zzf();
        this.zzK = zzbcuVarZzf;
        zzbcvVar.zza("native:view_create", zzbcuVarZzf);
        this.zzL = null;
        this.zzJ = null;
        C3478i0.m17527a().m17528b(zzcglVar);
        C7351t.m32354l().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            C3431F0.f14180l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfk
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            C7351t.m32354l().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean boolZzc = C7351t.m32354l().zzc();
        this.zzy = boolZzc;
        if (boolZzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbcp.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfcj zzfcjVar = this.zzk;
        if (zzfcjVar != null && zzfcjVar.zzam) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i9 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        C7351t.m32354l().zzk();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzccq) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbh() {
        zzbcv zzbcvVar = this.zzM;
        if (zzbcvVar == null) {
            return;
        }
        zzbcx zzbcxVarZzc = zzbcvVar.zzc();
        zzbcn zzbcnVarZza = C7351t.m32354l().zza();
        if (zzbcnVarZza != null) {
            zzbcnVarZza.zzb(zzbcxVarZzc);
        }
    }

    private final void zzbi(boolean z7) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z7 ? "0" : "1");
        zze("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.m17541c();
            AbstractBinderC7534v abstractBinderC7534v = this.zzp;
            if (abstractBinderC7534v != null) {
                abstractBinderC7534v.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            C7351t.m32344b().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlC)).booleanValue()) {
                AbstractC3490o0.m17545k("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb != null && activityZzb.isDestroyed()) {
                AbstractC3490o0.m17545k("Destroying the WebView immediately...");
                zzY();
            } else {
                AbstractC3490o0.m17545k("Initiating WebView self destruct sequence in 3...");
                AbstractC3490o0.m17545k("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlD)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzbzh.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        C7351t.m32344b().zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzX()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th) {
            C7351t.m32354l().zzg(th, "AdWebViewImpl.loadUrl");
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.m17542d();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z7 = this.zzC;
            zzcev zzcevVar = this.zzo;
            if (zzcevVar != null && zzcevVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z7 = true;
            }
            zzbi(z7);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcev zzcevVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.m17543e();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcevVar = this.zzo) != null && zzcevVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlR)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            C7351t.m32349g();
            C3431F0.m17434y(getContext(), intent);
        } catch (ActivityNotFoundException e7) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            String string = sb.toString();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a(string);
            C7351t.m32354l().zzg(e7, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaM = zzaM();
        AbstractBinderC7534v abstractBinderC7534vZzL = zzL();
        if (abstractBinderC7534vZzL == null || !zZzaM) {
            return;
        }
        abstractBinderC7534vZzL.zzC();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:17:0x0024, B:19:0x002c, B:22:0x0031, B:24:0x0039, B:26:0x004b, B:29:0x0050, B:31:0x0057, B:35:0x0061, B:38:0x0066, B:41:0x0077, B:49:0x008f, B:43:0x007e, B:46:0x0083, B:52:0x009c, B:54:0x00a4, B:56:0x00b6, B:59:0x00bb, B:61:0x00d7, B:63:0x00df, B:62:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:80:0x011b, B:82:0x0122, B:86:0x0129, B:88:0x013b, B:90:0x0149, B:94:0x0156, B:97:0x015b, B:99:0x01d0, B:100:0x01d3, B:102:0x01da, B:107:0x01e7, B:109:0x01ed, B:110:0x01f0, B:112:0x01f4, B:113:0x01fd, B:116:0x0208), top: B:121:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final synchronized void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i7, i8);
                return;
            }
            if (this.zzs.zzi()) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzen)).booleanValue()) {
                    super.onMeasure(i7, i8);
                    return;
                }
                zzcfq zzcfqVarZzh = zzh();
                float fZzm = zzcfqVarZzh != null ? zzcfqVarZzh.zzm() : 0.0f;
                if (fZzm == 0.0f) {
                    super.onMeasure(i7, i8);
                    return;
                }
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i8);
                float f7 = size2 * fZzm;
                int i13 = (int) (size / fZzm);
                if (size2 != 0) {
                    i9 = (int) f7;
                    if (size == 0) {
                        i12 = size;
                    } else if (i9 != 0) {
                        i13 = (int) (i9 / fZzm);
                        i10 = size2;
                        i11 = i9;
                        i12 = i11;
                    }
                    i10 = size2;
                    i11 = i9;
                } else if (i13 != 0) {
                    i11 = (int) (i13 * fZzm);
                    i12 = size;
                    i10 = i13;
                } else {
                    size2 = 0;
                    i9 = (int) f7;
                    if (size == 0) {
                        i12 = size;
                    } else if (i9 != 0) {
                        i13 = (int) (i9 / fZzm);
                        i10 = size2;
                        i11 = i9;
                        i12 = i11;
                    }
                    i10 = size2;
                    i11 = i9;
                }
                setMeasuredDimension(Math.min(i11, i12), Math.min(i13, i10));
                return;
            }
            if (this.zzs.zzf()) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzev)).booleanValue()) {
                    super.onMeasure(i7, i8);
                    return;
                }
                zzab("/contentHeight", new zzcfh(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f8 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i7);
                int i14 = this.zzI;
                setMeasuredDimension(size3, i14 != -1 ? (int) (i14 * f8) : View.MeasureSpec.getSize(i8));
                return;
            }
            if (this.zzs.zzg()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i7);
            int size4 = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size5 = View.MeasureSpec.getSize(i8);
            int i15 = C3553a.e.API_PRIORITY_OTHER;
            int i16 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i15 = size5;
            }
            zzcgt zzcgtVar = this.zzs;
            boolean z7 = zzcgtVar.zzb > i16 || zzcgtVar.zza > i15;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfW)).booleanValue()) {
                zzcgt zzcgtVar2 = this.zzs;
                float f9 = zzcgtVar2.zzb;
                float f10 = this.zzj;
                z7 &= f9 / f10 <= ((float) i16) / f10 && ((float) zzcgtVar2.zza) / f10 <= ((float) i15) / f10;
            }
            if (!z7) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzn) {
                    this.zzY.zzc(10002);
                    this.zzn = true;
                }
                zzcgt zzcgtVar3 = this.zzs;
                setMeasuredDimension(zzcgtVar3.zzb, zzcgtVar3.zza);
                return;
            }
            zzcgt zzcgtVar4 = this.zzs;
            float f11 = zzcgtVar4.zzb;
            float f12 = this.zzj;
            int i17 = (int) (f11 / f12);
            int i18 = (int) (zzcgtVar4.zza / f12);
            int i19 = (int) (size4 / f12);
            int i20 = (int) (size5 / f12);
            StringBuilder sb = new StringBuilder(String.valueOf(i17).length() + 36 + String.valueOf(i18).length() + 18 + String.valueOf(i19).length() + 1 + String.valueOf(i20).length() + 4);
            sb.append("Not enough space to show ad. Needs ");
            sb.append(i17);
            sb.append("x");
            sb.append(i18);
            sb.append(" dp, but only has ");
            sb.append(i19);
            sb.append("x");
            sb.append(i20);
            sb.append(" dp.");
            String string = sb.toString();
            int i21 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(string);
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzm) {
                return;
            }
            this.zzY.zzc(10001);
            this.zzm = true;
            return;
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzns)).booleanValue() && AbstractC0881k.m4035a("MUTE_AUDIO")) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Muting webview");
                AbstractC0880j.m4032n(this, true);
            }
        } catch (Exception e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Could not pause webview.", e7);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zznv)).booleanValue()) {
                C7351t.m32354l().zzg(e7, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzns)).booleanValue() && AbstractC0881k.m4035a("MUTE_AUDIO")) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Unmuting webview");
                AbstractC0880j.m4032n(this, false);
            }
        } catch (Exception e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Could not resume webview.", e7);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zznv)).booleanValue()) {
                C7351t.m32354l().zzg(e7, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzdV)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z7) {
            zzauu zzauuVar = this.zzc;
            if (zzauuVar != null) {
                zzauuVar.zzc(motionEvent);
            }
            zzbdp zzbdpVar = this.zze;
            if (zzbdpVar != null) {
                zzbdpVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbfj zzbfjVar = this.zzE;
                    if (zzbfjVar != null) {
                        zzbfjVar.zzb(motionEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcev) {
            this.zzo = (zzcev) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Could not stop loading webview.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzA(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzB(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzceb
    public final zzfcj zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgf
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzG() {
        zzbb();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f30226a);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzH(int i7) {
        if (i7 == 0) {
            zzbcv zzbcvVar = this.zzM;
            zzbcp.zza(zzbcvVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbcv zzbcvVar2 = this.zzM;
        zzbcvVar2.zzc();
        zzbcvVar2.zzc().zzd("close_type", String.valueOf(i7));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i7));
        map.put("version", this.zzf.f30226a);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzI() {
        if (this.zzJ == null) {
            zzbcv zzbcvVar = this.zzM;
            zzbcp.zza(zzbcvVar.zzc(), this.zzK, "aes2");
            zzbcvVar.zzc();
            zzbcu zzbcuVarZzf = zzbcx.zzf();
            this.zzJ = zzbcuVarZzf;
            zzbcvVar.zza("native:view_show", zzbcuVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f30226a);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzJ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(C7351t.m32355m().m17516d()));
        map.put("app_volume", String.valueOf(C7351t.m32355m().m17514b()));
        map.put("device_volume", String.valueOf(C3463b.m17510e(getContext())));
        zze("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized AbstractBinderC7534v zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized AbstractBinderC7534v zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgc
    public final synchronized zzcgt zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final /* synthetic */ zzcgi zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgd
    public final zzauu zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzfdg zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzedu zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzeds zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzY() {
        AbstractC3490o0.m17545k("Destroying WebView!");
        zzbf();
        C3431F0.f14180l.post(new zzcfi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaA(final boolean z7, final int i7) {
        destroy();
        zzbbg zzbbgVar = new zzbbg() { // from class: com.google.android.gms.internal.ads.zzcfl
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                int i8 = zzcfn.zza;
                zzbbn.zzbl.zza zzaVarZzq = zzbbn.zzbl.zzq();
                boolean zZzb = zzaVarZzq.zzb();
                boolean z8 = z7;
                if (zZzb != z8) {
                    zzaVarZzq.zzc(z8);
                }
                zzaVarZzq.zzg(i7);
                zzaVar.zzal(zzaVarZzq.zzbu());
            }
        };
        zzbbh zzbbhVar = this.zzY;
        zzbbhVar.zzb(zzbbgVar);
        zzbbhVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfr
    public final zzfcm zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaD(zzfcj zzfcjVar, zzfcm zzfcmVar) {
        this.zzk = zzfcjVar;
        this.zzl = zzfcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaE(boolean z7) {
        if (z7) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractBinderC7534v abstractBinderC7534v = this.zzp;
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.zzu(z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final InterfaceFutureC1673e zzaF() {
        zzbdp zzbdpVar = this.zze;
        return zzbdpVar == null ? zzgot.zza(null) : zzbdpVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaG(boolean z7) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaH(C7524l c7524l, boolean z7, boolean z8, String str) {
        this.zzo.zzv(c7524l, z7, z8, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaI(boolean z7, int i7, boolean z8) {
        this.zzo.zzx(z7, i7, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaJ(boolean z7, int i7, String str, boolean z8, boolean z9) {
        this.zzo.zzy(z7, i7, str, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaK(boolean z7, int i7, String str, String str2, boolean z8) {
        this.zzo.zzz(z7, i7, str, str2, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaL(String str, String str2, int i7) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaM() {
        int iM33274a;
        int iM33274a2;
        boolean z7 = false;
        if (this.zzo.zzk() || this.zzo.zzl()) {
            C3244B.m17190a();
            DisplayMetrics displayMetrics = this.zzi;
            int iM33274a3 = C7590g.m33274a(displayMetrics, displayMetrics.widthPixels);
            C3244B.m17190a();
            int iM33274a4 = C7590g.m33274a(displayMetrics, displayMetrics.heightPixels);
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb == null || activityZzb.getWindow() == null) {
                iM33274a = iM33274a3;
                iM33274a2 = iM33274a4;
            } else {
                C7351t.m32349g();
                int[] iArrM17431v = C3431F0.m17431v(activityZzb);
                C3244B.m17190a();
                iM33274a = C7590g.m33274a(displayMetrics, iArrM17431v[0]);
                C3244B.m17190a();
                iM33274a2 = C7590g.m33274a(displayMetrics, iArrM17431v[1]);
            }
            C7351t.m32349g();
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == iM33274a3 && this.zzR == iM33274a4 && this.zzT == iM33274a && this.zzU == iM33274a2) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzak)).booleanValue()) {
                }
            }
            if (this.zzS == iM33274a3 && this.zzR == iM33274a4) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzak)).booleanValue() && this.zzV != rotation) {
                    z7 = true;
                }
            } else {
                z7 = true;
            }
            this.zzS = iM33274a3;
            this.zzR = iM33274a4;
            this.zzT = iM33274a;
            this.zzU = iM33274a2;
            this.zzV = rotation;
            new zzbsb(this, "").zzl(iM33274a3, iM33274a4, iM33274a, iM33274a2, displayMetrics.density, rotation);
            return z7;
        }
        return false;
    }

    protected final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaP(String str) {
        if (!AbstractC3760o.m18194b()) {
            zzaN("javascript:".concat(str));
            return;
        }
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        C7351t.m32354l().zzb(bool);
    }

    final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcev zzaS() {
        return this.zzo;
    }

    final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    final /* synthetic */ void zzaY(int i7) {
        this.zzI = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzab(String str, zzbjl zzbjlVar) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzB(str, zzbjlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzac(String str, zzbjl zzbjlVar) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzC(str, zzbjlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzad(String str, InterfaceC3761p interfaceC3761p) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzE(str, interfaceC3761p);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzae(AbstractBinderC7534v abstractBinderC7534v) {
        this.zzp = abstractBinderC7534v;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaf(zzcgt zzcgtVar) {
        this.zzs = zzcgtVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzag(boolean z7) {
        try {
            boolean z8 = this.zzw;
            this.zzw = z7;
            zzbc();
            if (z7 != z8) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzai)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbsb(this, "").zzk(true != z7 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzah() {
        this.zzQ.m17540b();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzai(Context context) {
        zzcgl zzcglVar = this.zzb;
        zzcglVar.setBaseContext(context);
        this.zzQ.m17539a(zzcglVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaj(boolean z7) {
        AbstractBinderC7534v abstractBinderC7534v = this.zzp;
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.m33163S0(this.zzo.zzk(), z7);
        } else {
            this.zzu = z7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzak(zzedu zzeduVar) {
        this.zzq = zzeduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzal(zzeds zzedsVar) {
        this.zzr = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzam(int i7) {
        AbstractBinderC7534v abstractBinderC7534v = this.zzp;
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.m33164T0(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzan(AbstractBinderC7534v abstractBinderC7534v) {
        this.zzO = abstractBinderC7534v;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzao(boolean z7) {
        this.zzz = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzap() {
        if (this.zzL == null) {
            zzbcv zzbcvVar = this.zzM;
            zzbcvVar.zzc();
            zzbcu zzbcuVarZzf = zzbcx.zzf();
            this.zzL = zzbcuVarZzf;
            zzbcvVar.zza("native:view_load", zzbcuVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaq(zzbfj zzbfjVar) {
        this.zzE = zzbfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzbfj zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzas(boolean z7) {
        AbstractBinderC7534v abstractBinderC7534v;
        int i7 = this.zzH + (true != z7 ? -1 : 1);
        this.zzH = i7;
        if (i7 > 0 || (abstractBinderC7534v = this.zzp) == null) {
            return;
        }
        abstractBinderC7534v.m33161N0();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzau(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) C3250D.m17200c().zzd(zzbci.zzah);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e7) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33332g("Unable to build MRAID_ENV", e7);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, zzcgb.zza(str2, str4), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzav() {
        AbstractC3490o0.m17545k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaw(boolean z7) {
        this.zzo.zzM(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzax(zzbfg zzbfgVar) {
        this.zzF = zzbfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzay(zzazv zzazvVar) {
        this.zzG = zzazvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzazv zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Dispatching AFMA event: ".concat(string2));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        boolean z7;
        synchronized (this) {
            z7 = zzayhVar.zzj;
            this.zzC = z7;
        }
        zzbi(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, p380w2.InterfaceC7345n
    public final synchronized void zzdp() {
        InterfaceC7345n interfaceC7345n = this.zzg;
        if (interfaceC7345n != null) {
            interfaceC7345n.zzdp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek, p380w2.InterfaceC7345n
    public final synchronized void zzdq() {
        InterfaceC7345n interfaceC7345n = this.zzg;
        if (interfaceC7345n != null) {
            interfaceC7345n.zzdq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzcas zzdr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzds(boolean z7) {
        this.zzo.zzK(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(String str, Map map) {
        try {
            zzd(str, C3244B.m17190a().m33296s(map));
        } catch (JSONException unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized zzcfq zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzbcu zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final C7332a zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzl() {
        AbstractBinderC7534v abstractBinderC7534vZzL = zzL();
        if (abstractBinderC7534vZzL != null) {
            abstractBinderC7534vZzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized String zzn() {
        zzfcm zzfcmVar = this.zzl;
        if (zzfcmVar == null) {
            return null;
        }
        return zzfcmVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzo(int i7) {
        this.zzN = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final zzbcv zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized zzccq zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzccq) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbd
    public final C7584a zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzt(String str, zzccq zzccqVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzccqVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzu(boolean z7, long j7) {
        HashMap map = new HashMap(2);
        map.put("success", true != z7 ? "0" : "1");
        map.put("duration", Long.toString(j7));
        zze("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzv(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzw(zzcfq zzcfqVar) {
        if (this.zzB == null) {
            this.zzB = zzcfqVar;
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzz() {
        zzbfg zzbfgVar = this.zzF;
        if (zzbfgVar != null) {
            zzbfgVar.zza();
        }
    }
}
