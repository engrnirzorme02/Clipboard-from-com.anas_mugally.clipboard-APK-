package p396y2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcfa;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcwf;
import com.google.android.gms.internal.ads.zzddz;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzeda;
import com.google.android.gms.internal.ads.zzeds;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzghs;
import java.util.Collections;
import p111O.AbstractC1061m0;
import p364u2.AbstractC7155a;
import p380w2.C7343l;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: renamed from: y2.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7534v extends zzbsv implements InterfaceC7520h {

    /* JADX INFO: renamed from: H */
    static final int f30149H = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: A */
    private boolean f30150A;

    /* JADX INFO: renamed from: B */
    private boolean f30151B;

    /* JADX INFO: renamed from: F */
    private Toolbar f30155F;

    /* JADX INFO: renamed from: a */
    protected final Activity f30157a;

    /* JADX INFO: renamed from: b */
    AdOverlayInfoParcel f30158b;

    /* JADX INFO: renamed from: c */
    zzcek f30159c;

    /* JADX INFO: renamed from: d */
    C7530r f30160d;

    /* JADX INFO: renamed from: e */
    ViewOnClickListenerC7506A f30161e;

    /* JADX INFO: renamed from: r */
    FrameLayout f30163r;

    /* JADX INFO: renamed from: s */
    WebChromeClient.CustomViewCallback f30164s;

    /* JADX INFO: renamed from: v */
    C7529q f30167v;

    /* JADX INFO: renamed from: z */
    private Runnable f30171z;

    /* JADX INFO: renamed from: f */
    boolean f30162f = false;

    /* JADX INFO: renamed from: t */
    boolean f30165t = false;

    /* JADX INFO: renamed from: u */
    boolean f30166u = false;

    /* JADX INFO: renamed from: w */
    boolean f30168w = false;

    /* JADX INFO: renamed from: G */
    int f30156G = 1;

    /* JADX INFO: renamed from: x */
    private final Object f30169x = new Object();

    /* JADX INFO: renamed from: y */
    private final View.OnClickListener f30170y = new ViewOnClickListenerC7525m(this);

    /* JADX INFO: renamed from: C */
    private boolean f30152C = false;

    /* JADX INFO: renamed from: D */
    private boolean f30153D = false;

    /* JADX INFO: renamed from: E */
    private boolean f30154E = true;

    public AbstractBinderC7534v(Activity activity) {
        this.f30157a = activity;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX INFO: renamed from: P0 */
    private final void m33156P0(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z7;
        boolean z8;
        C7343l c7343l;
        boolean z9;
        int i7;
        int i8;
        C7343l c7343l2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f30158b;
        boolean z10 = (adOverlayInfoParcel2 == null || (c7343l2 = adOverlayInfoParcel2.f14157z) == null || !c7343l2.f29221b) ? false : true;
        Activity activity = this.f30157a;
        boolean zMo17458d = C7351t.m32352j().mo17458d(activity, configuration);
        if (!this.f30166u || z10) {
            if (zMo17458d) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaU)).booleanValue()) {
                    z7 = false;
                }
                z8 = z7;
            }
            adOverlayInfoParcel = this.f30158b;
            if (adOverlayInfoParcel == null && (c7343l = adOverlayInfoParcel.f14157z) != null && c7343l.f29226r) {
                z7 = true;
                z8 = z7;
            } else {
                z7 = true;
                z8 = false;
            }
        } else if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaV)).booleanValue()) {
            if (zMo17458d) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaU)).booleanValue()) {
                    z7 = false;
                }
                z8 = z7;
            }
            adOverlayInfoParcel = this.f30158b;
            if (adOverlayInfoParcel == null) {
            }
            z7 = true;
            z8 = false;
        } else {
            z7 = false;
            z8 = z7;
        }
        Window window = activity.getWindow();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbs)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z7) {
                i8 = z8 ? 5894 : 5380;
                z9 = true;
            } else {
                i8 = 256;
                z9 = false;
            }
            decorView.setSystemUiVisibility(i8);
        } else if (z7) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z8) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
            z9 = true;
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
            z9 = false;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzof)).booleanValue() || (i7 = Build.VERSION.SDK_INT) > 34 || i7 < 28 || !z9) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        AbstractC1061m0.m4703b(window, false);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m33157Q0(View view) {
        zzedu zzeduVarZzU;
        zzeds zzedsVarZzV;
        zzcek zzcekVar = this.f30159c;
        if (zzcekVar == null) {
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && (zzedsVarZzV = zzcekVar.zzV()) != null) {
            zzedsVarZzV.zzf(view);
        } else if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfL)).booleanValue() && (zzeduVarZzU = zzcekVar.zzU()) != null && zzeduVarZzU.zzb()) {
            C7351t.m32367y().zzg(zzeduVarZzU.zza(), view);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private static final void m33158R0(zzedu zzeduVar, View view) {
        if (zzeduVar == null || view == null) {
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfL)).booleanValue() && zzeduVar.zzb()) {
            return;
        }
        C7351t.m32367y().zzh(zzeduVar.zza(), view);
    }

    /* JADX INFO: renamed from: L0 */
    protected final void m33159L0() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        InterfaceC7536x interfaceC7536x;
        if (!this.f30157a.isFinishing() || this.f30152C) {
            return;
        }
        this.f30152C = true;
        zzcek zzcekVar = this.f30159c;
        if (zzcekVar != null) {
            zzcekVar.zzH(this.f30156G - 1);
            synchronized (this.f30169x) {
                try {
                    if (!this.f30150A && this.f30159c.zzaa()) {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfx)).booleanValue() && !this.f30153D && (adOverlayInfoParcel = this.f30158b) != null && (interfaceC7536x = adOverlayInfoParcel.f14145c) != null) {
                            interfaceC7536x.zzdX();
                        }
                        Runnable runnable = new Runnable() { // from class: y2.n
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f30138a.m33160M0();
                            }
                        };
                        this.f30171z = runnable;
                        C3431F0.f14180l.postDelayed(runnable, ((Long) C3250D.m17200c().zzd(zzbci.zzbl)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m33160M0();
    }

    /* JADX INFO: renamed from: M0 */
    final void m33160M0() {
        zzcek zzcekVar;
        InterfaceC7536x interfaceC7536x;
        if (this.f30153D) {
            return;
        }
        this.f30153D = true;
        zzcek zzcekVar2 = this.f30159c;
        if (zzcekVar2 != null) {
            this.f30167v.removeView(zzcekVar2.zzE());
            C7530r c7530r = this.f30160d;
            if (c7530r != null) {
                this.f30159c.zzai(c7530r.f30145d);
                this.f30159c.zzag(false);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zznx)).booleanValue() && this.f30159c.getParent() != null) {
                    ((ViewGroup) this.f30159c.getParent()).removeView(this.f30159c.zzE());
                }
                ViewGroup viewGroup = this.f30160d.f30144c;
                View viewZzE = this.f30159c.zzE();
                C7530r c7530r2 = this.f30160d;
                viewGroup.addView(viewZzE, c7530r2.f30142a, c7530r2.f30143b);
                this.f30160d = null;
            } else {
                Activity activity = this.f30157a;
                if (activity.getApplicationContext() != null) {
                    this.f30159c.zzai(activity.getApplicationContext());
                }
            }
            this.f30159c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel != null && (interfaceC7536x = adOverlayInfoParcel.f14145c) != null) {
            interfaceC7536x.zzdY(this.f30156G);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f30158b;
        if (adOverlayInfoParcel2 == null || (zzcekVar = adOverlayInfoParcel2.f14146d) == null) {
            return;
        }
        m33158R0(zzcekVar.zzU(), this.f30158b.f14146d.zzE());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m33161N0() {
        synchronized (this.f30169x) {
            try {
                this.f30150A = true;
                Runnable runnable = this.f30171z;
                if (runnable != null) {
                    zzfro zzfroVar = C3431F0.f14180l;
                    zzfroVar.removeCallbacks(runnable);
                    zzfroVar.post(this.f30171z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m33162O0(zzeda zzedaVar) throws C7528p {
        zzbsp zzbspVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel == null || (zzbspVar = adOverlayInfoParcel.f14140G) == null) {
            throw new C7528p("noioou");
        }
        zzbspVar.zzh(BinderC3773b.m18221N0(zzedaVar));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m33163S0(boolean z7, boolean z8) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C7343l c7343l;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        C7343l c7343l2;
        boolean z9 = true;
        boolean z10 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzbm)).booleanValue() && (adOverlayInfoParcel2 = this.f30158b) != null && (c7343l2 = adOverlayInfoParcel2.f14157z) != null && c7343l2.f29227s;
        boolean z11 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzbn)).booleanValue() && (adOverlayInfoParcel = this.f30158b) != null && (c7343l = adOverlayInfoParcel.f14157z) != null && c7343l.f29228t;
        if (z7 && z8 && z10 && !z11) {
            new zzbsb(this.f30159c, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        ViewOnClickListenerC7506A viewOnClickListenerC7506A = this.f30161e;
        if (viewOnClickListenerC7506A != null) {
            if (!z11 && (!z8 || z10)) {
                z9 = false;
            }
            viewOnClickListenerC7506A.m33137a(z9);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m33164T0(int i7) {
        Activity activity = this.f30157a;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) C3250D.m17200c().zzd(zzbci.zzgu)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) C3250D.m17200c().zzd(zzbci.zzgv)).intValue()) {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= ((Integer) C3250D.m17200c().zzd(zzbci.zzgw)).intValue()) {
                    if (i8 <= ((Integer) C3250D.m17200c().zzd(zzbci.zzgx)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i7);
        } catch (Throwable th) {
            C7351t.m32354l().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m33165U0(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.f30157a;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f30163r = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f30163r.addView(view, -1, -1);
        activity.setContentView(this.f30163r);
        this.f30151B = true;
        this.f30164s = customViewCallback;
        this.f30162f = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX INFO: renamed from: V0 */
    protected final void m33166V0(boolean z7) throws C7528p {
        boolean z8;
        Resources.Theme theme;
        ?? r7;
        if (!this.f30151B) {
            this.f30157a.requestWindowFeature(1);
        }
        Activity activity = this.f30157a;
        Window window = activity.getWindow();
        if (window == null) {
            throw new C7528p("Invalid activity, no window available.");
        }
        zzcek zzcekVar = this.f30158b.f14146d;
        zzcgi zzcgiVarZzP = zzcekVar != null ? zzcekVar.zzP() : null;
        boolean z9 = zzcgiVarZzP != null && zzcgiVarZzP.zzk();
        this.f30168w = false;
        if (z9) {
            int i7 = this.f30158b.f14152u;
            if (i7 == 6) {
                z8 = activity.getResources().getConfiguration().orientation == 1;
                this.f30168w = z8;
            } else if (i7 == 7) {
                z8 = activity.getResources().getConfiguration().orientation == 2;
                this.f30168w = z8;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(z8).length() + 41);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z8);
        String string = sb.toString();
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a(string);
        m33164T0(this.f30158b.f14152u);
        window.setFlags(16777216, 16777216);
        AbstractC7599p.m33326a("Hardware acceleration on the AdActivity window enabled.");
        if (this.f30166u) {
            this.f30167v.setBackgroundColor(f30149H);
        } else {
            this.f30167v.setBackgroundColor(-16777216);
        }
        activity.setContentView(this.f30167v);
        this.f30151B = true;
        if (z7) {
            try {
                C7351t.m32350h();
                zzcek zzcekVar2 = this.f30158b.f14146d;
                zzcgt zzcgtVarZzN = zzcekVar2 != null ? zzcekVar2.zzN() : null;
                zzcek zzcekVar3 = this.f30158b.f14146d;
                String strZzO = zzcekVar3 != null ? zzcekVar3.zzO() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
                C7584a c7584a = adOverlayInfoParcel.f14155x;
                zzcek zzcekVar4 = adOverlayInfoParcel.f14146d;
                String str = strZzO;
                theme = null;
                boolean z10 = false;
                zzcek zzcekVarZza = zzcfa.zza(activity, zzcgtVarZzN, str, true, z9, null, null, c7584a, null, null, zzcekVar4 != null ? zzcekVar4.zzk() : null, zzbbh.zza(), null, null, null, null, null);
                this.f30159c = zzcekVarZza;
                zzcgi zzcgiVarZzP2 = zzcekVarZza.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f30158b;
                zzbib zzbibVar = adOverlayInfoParcel2.f14134A;
                zzbid zzbidVar = adOverlayInfoParcel2.f14147e;
                InterfaceC7516d interfaceC7516d = adOverlayInfoParcel2.f14151t;
                zzcek zzcekVar5 = adOverlayInfoParcel2.f14146d;
                zzcgiVarZzP2.zzZ(null, zzbibVar, null, zzbidVar, interfaceC7516d, true, null, zzcekVar5 != null ? zzcekVar5.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.f30159c.zzP().zzG(new zzcgg() { // from class: y2.o
                    @Override // com.google.android.gms.internal.ads.zzcgg
                    public final /* synthetic */ void zza(boolean z11, int i9, String str2, String str3) {
                        zzcek zzcekVar6 = this.f30139a.f30159c;
                        if (zzcekVar6 != null) {
                            zzcekVar6.zzI();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f30158b;
                String str2 = adOverlayInfoParcel3.f14154w;
                if (str2 != null) {
                    this.f30159c.loadUrl(str2);
                } else {
                    String str3 = adOverlayInfoParcel3.f14150s;
                    if (str3 == null) {
                        throw new C7528p("No URL or HTML to display in ad overlay.");
                    }
                    this.f30159c.loadDataWithBaseURL(adOverlayInfoParcel3.f14148f, str3, "text/html", "UTF-8", null);
                }
                zzcek zzcekVar6 = this.f30158b.f14146d;
                r7 = z10;
                if (zzcekVar6 != null) {
                    zzcekVar6.zzan(this);
                    r7 = z10;
                }
            } catch (Exception e7) {
                AbstractC7599p.m33329d("Error obtaining webview.", e7);
                throw new C7528p("Could not obtain webview for the overlay.", e7);
            }
        } else {
            theme = null;
            r7 = 0;
            zzcek zzcekVar7 = this.f30158b.f14146d;
            this.f30159c = zzcekVar7;
            zzcekVar7.zzai(this.f30157a);
        }
        if (this.f30158b.f14141H) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f30159c.zzD(), r7);
        }
        this.f30159c.zzae(this);
        zzcek zzcekVar8 = this.f30158b.f14146d;
        if (zzcekVar8 != null) {
            m33158R0(zzcekVar8.zzU(), this.f30167v);
        }
        if (this.f30158b.f14153v != 5) {
            ViewParent parent = this.f30159c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f30159c.zzE());
            }
            if (this.f30166u) {
                this.f30159c.zzat();
            }
            if (this.f30158b.f14141H) {
                Toolbar toolbar = new Toolbar(this.f30157a);
                this.f30155F = toolbar;
                toolbar.setId(View.generateViewId());
                this.f30159c.zzE().setId(View.generateViewId());
                this.f30155F.setBackgroundColor(-12303292);
                this.f30155F.setVisibility(r7);
                try {
                    this.f30155F.setNavigationIcon(C7351t.m32354l().zzf().getDrawable(AbstractC7155a.f28582c, theme));
                } catch (Resources.NotFoundException | NullPointerException e8) {
                    AbstractC3490o0.m17546l("Error obtaining close icon.", e8);
                }
                this.f30155F.setNavigationOnClickListener(this.f30170y);
                this.f30155F.setTitleMarginStart(r7);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f30167v.addView(this.f30155F, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f30155F.getId());
                layoutParams2.addRule(12);
                this.f30167v.addView(this.f30159c.zzE(), layoutParams2);
                m33157Q0(this.f30155F);
            } else {
                this.f30167v.addView(this.f30159c.zzE(), -1, -1);
            }
        }
        if (!z7 && !this.f30168w) {
            zzD();
        }
        if (this.f30158b.f14153v != 5) {
            zzr(z9);
            if (this.f30159c.zzR()) {
                m33163S0(z9, true);
                return;
            }
            return;
        }
        Activity activity2 = this.f30157a;
        zzecz zzeczVarZze = zzeda.zze();
        zzeczVarZze.zza(activity2);
        zzeczVarZze.zzb(this);
        zzeczVarZze.zzc(this.f30158b.f14135B);
        zzeczVarZze.zzd(this.f30158b.f14136C);
        try {
            m33162O0(zzeczVarZze.zze());
        } catch (RemoteException | C7528p e9) {
            throw new C7528p(e9.getMessage(), e9);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m33167W0(String str) {
        Toolbar toolbar = this.f30155F;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void zzC() {
        if (this.f30168w) {
            this.f30168w = false;
            zzD();
        }
    }

    protected final void zzD() {
        this.f30159c.zzI();
    }

    public final void zzE() {
        this.f30167v.f30141b = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i7, String[] strArr, int[] iArr) {
        if (i7 == 12345) {
            Activity activity = this.f30157a;
            zzecz zzeczVarZze = zzeda.zze();
            zzeczVarZze.zza(activity);
            zzeczVarZze.zzb(this.f30158b.f14153v == 5 ? this : null);
            try {
                this.f30158b.f14140G.zzi(strArr, iArr, BinderC3773b.m18221N0(zzeczVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.f30156G = 3;
        Activity activity = this.f30157a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f14153v != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcek zzcekVar = this.f30159c;
        if (zzcekVar != null) {
            zzcekVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel != null && this.f30162f) {
            m33164T0(adOverlayInfoParcel.f14152u);
        }
        if (this.f30163r != null) {
            this.f30157a.setContentView(this.f30167v);
            this.f30151B = true;
            this.f30163r.removeAllViews();
            this.f30163r = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f30164s;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f30164s = null;
        }
        this.f30162f = false;
    }

    @Override // p396y2.InterfaceC7520h
    public final void zzd() {
        this.f30156G = 2;
        this.f30157a.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() {
        this.f30156G = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() {
        InterfaceC7536x interfaceC7536x;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel == null || (interfaceC7536x = adOverlayInfoParcel.f14145c) == null) {
            return;
        }
        interfaceC7536x.zzdA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() {
        this.f30156G = 1;
        if (this.f30159c == null) {
            return true;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && this.f30159c.canGoBack()) {
            this.f30159c.goBack();
            return false;
        }
        boolean zZzZ = this.f30159c.zzZ();
        if (!zZzZ) {
            this.f30159c.zze("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzZ;
    }

    public void zzh(Bundle bundle) {
        InterfaceC7536x interfaceC7536x;
        if (!this.f30151B) {
            this.f30157a.requestWindowFeature(1);
        }
        this.f30165t = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.f30157a;
            AdOverlayInfoParcel adOverlayInfoParcelM17364T = AdOverlayInfoParcel.m17364T(activity.getIntent());
            this.f30158b = adOverlayInfoParcelM17364T;
            if (adOverlayInfoParcelM17364T == null) {
                throw new C7528p("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelM17364T.f14141H) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f30158b.f14155x.f30228c > 7500000) {
                this.f30156G = 4;
            }
            if (activity.getIntent() != null) {
                this.f30154E = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
            C7343l c7343l = adOverlayInfoParcel.f14157z;
            if (c7343l != null) {
                boolean z7 = c7343l.f29220a;
                this.f30166u = z7;
                if (z7) {
                    if (adOverlayInfoParcel.f14153v != 5 && c7343l.f29225f != -1) {
                        new C7532t(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.f14153v == 5) {
                this.f30166u = true;
                if (adOverlayInfoParcel.f14153v != 5) {
                    new C7532t(this, null).zzb();
                }
            } else {
                this.f30166u = false;
            }
            if (bundle == null) {
                if (this.f30154E) {
                    zzcwf zzcwfVar = this.f30158b.f14138E;
                    if (zzcwfVar != null) {
                        zzcwfVar.zza();
                    }
                    InterfaceC7536x interfaceC7536x2 = this.f30158b.f14145c;
                    if (interfaceC7536x2 != null) {
                        interfaceC7536x2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f30158b;
                if (adOverlayInfoParcel2.f14153v != 1) {
                    InterfaceC3318a interfaceC3318a = adOverlayInfoParcel2.f14144b;
                    if (interfaceC3318a != null) {
                        interfaceC3318a.onAdClicked();
                    }
                    zzddz zzddzVar = this.f30158b.f14139F;
                    if (zzddzVar != null) {
                        zzddzVar.zzdz();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f30158b;
            if (adOverlayInfoParcel3 != null && (interfaceC7536x = adOverlayInfoParcel3.f14145c) != null) {
                interfaceC7536x.zzdt();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f30158b;
            C7529q c7529q = new C7529q(activity, adOverlayInfoParcel4.f14156y, adOverlayInfoParcel4.f14155x.f30226a, adOverlayInfoParcel4.f14137D);
            this.f30167v = c7529q;
            c7529q.setId(zzbbn.zzq.zzf);
            C7351t.m32352j().mo17471i(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.f30158b;
            int i7 = adOverlayInfoParcel5.f14153v;
            if (i7 == 1) {
                m33166V0(false);
                return;
            }
            if (i7 == 2) {
                this.f30160d = new C7530r(adOverlayInfoParcel5.f14146d);
                m33166V0(false);
            } else if (i7 == 3) {
                m33166V0(true);
            } else {
                if (i7 != 5) {
                    throw new C7528p("Could not determine ad overlay type.");
                }
                m33166V0(false);
            }
        } catch (C7528p e7) {
            String message = e7.getMessage();
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(message);
            this.f30156G = 4;
            this.f30157a.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() {
        InterfaceC7536x interfaceC7536x;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel == null || (interfaceC7536x = adOverlayInfoParcel.f14145c) == null) {
            return;
        }
        interfaceC7536x.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        InterfaceC7536x interfaceC7536x;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfz)).booleanValue()) {
            zzcek zzcekVar = this.f30159c;
            if (zzcekVar == null || zzcekVar.zzX()) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("The webview does not exist. Ignoring action.");
            } else {
                this.f30159c.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel == null || (interfaceC7536x = adOverlayInfoParcel.f14145c) == null) {
            return;
        }
        interfaceC7536x.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() {
        InterfaceC7536x interfaceC7536x;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel != null && (interfaceC7536x = adOverlayInfoParcel.f14145c) != null) {
            interfaceC7536x.zzdC();
        }
        m33156P0(this.f30157a.getResources().getConfiguration());
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfz)).booleanValue()) {
            return;
        }
        zzcek zzcekVar = this.f30159c;
        if (zzcekVar != null && !zzcekVar.zzX()) {
            this.f30159c.onResume();
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() {
        InterfaceC7536x interfaceC7536x;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel != null && (interfaceC7536x = adOverlayInfoParcel.f14145c) != null) {
            interfaceC7536x.zzdB();
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfz)).booleanValue() && this.f30159c != null && (!this.f30157a.isFinishing() || this.f30160d == null)) {
            this.f30159c.onPause();
        }
        m33159L0();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i7, int i8, Intent intent) {
        zzdsm zzdsmVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i7 == 236) {
            zzbbz zzbbzVar = zzbci.zznV;
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i8);
                AbstractC3490o0.m17545k(sb.toString());
                zzcek zzcekVar = this.f30159c;
                if (zzcekVar == null || zzcekVar.zzP() == null || (zzdsmVarZzI = zzcekVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.f30158b) == null || !((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                    return;
                }
                zzdsl zzdslVarZza = zzdsmVarZzI.zza();
                zzdslVarZza.zzc("action", "hilca");
                zzdslVarZza.zzc("gqi", zzghs.zza(adOverlayInfoParcel.f14135B));
                StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length());
                sb2.append(i8);
                zzdslVarZza.zzc("hilr", sb2.toString());
                if (i8 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdslVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdslVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdslVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(InterfaceC3772a interfaceC3772a) {
        m33156P0((Configuration) BinderC3773b.m18220M0(interfaceC3772a));
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f30165t);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() {
        InterfaceC7536x interfaceC7536x;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel != null && (interfaceC7536x = adOverlayInfoParcel.f14145c) != null) {
            interfaceC7536x.zzdD();
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfz)).booleanValue() && this.f30159c != null && (!this.f30157a.isFinishing() || this.f30160d == null)) {
            this.f30159c.onPause();
        }
        m33159L0();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() {
        InterfaceC7536x interfaceC7536x;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30158b;
        if (adOverlayInfoParcel != null && (interfaceC7536x = adOverlayInfoParcel.f14145c) != null) {
            interfaceC7536x.zzdE();
        }
        zzcek zzcekVar = this.f30159c;
        if (zzcekVar != null) {
            try {
                this.f30167v.removeView(zzcekVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        m33159L0();
    }

    public final void zzr(boolean z7) {
        if (this.f30158b.f14141H) {
            return;
        }
        int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzfC)).intValue();
        boolean z8 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzbo)).booleanValue() || z7;
        C7538z c7538z = new C7538z();
        c7538z.f30176d = 50;
        c7538z.f30173a = true != z8 ? 0 : iIntValue;
        c7538z.f30174b = true != z8 ? iIntValue : 0;
        c7538z.f30175c = iIntValue;
        this.f30161e = new ViewOnClickListenerC7506A(this.f30157a, c7538z, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z8 ? 9 : 11);
        m33163S0(z7, this.f30158b.f14149r);
        this.f30167v.addView(this.f30161e, layoutParams);
        m33157Q0(this.f30161e);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() {
        this.f30151B = true;
    }

    public final void zzu(boolean z7) {
        if (z7) {
            this.f30167v.setBackgroundColor(0);
        } else {
            this.f30167v.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() {
        this.f30167v.removeView(this.f30161e);
        zzr(true);
    }
}
