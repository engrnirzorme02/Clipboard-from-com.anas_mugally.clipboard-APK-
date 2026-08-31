package com.google.android.gms.measurement.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p227d3.AbstractC5226b;
import p283k3.AbstractC6025H;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4233g2 extends AbstractC4225f2 {

    /* JADX INFO: renamed from: c */
    private String f15761c;

    /* JADX INFO: renamed from: d */
    private String f15762d;

    /* JADX INFO: renamed from: e */
    private int f15763e;

    /* JADX INFO: renamed from: f */
    private String f15764f;

    /* JADX INFO: renamed from: g */
    private String f15765g;

    /* JADX INFO: renamed from: h */
    private long f15766h;

    /* JADX INFO: renamed from: i */
    private final long f15767i;

    /* JADX INFO: renamed from: j */
    private final long f15768j;

    /* JADX INFO: renamed from: k */
    private List f15769k;

    /* JADX INFO: renamed from: l */
    private String f15770l;

    /* JADX INFO: renamed from: m */
    private int f15771m;

    /* JADX INFO: renamed from: n */
    private String f15772n;

    /* JADX INFO: renamed from: o */
    private String f15773o;

    /* JADX INFO: renamed from: p */
    private long f15774p;

    /* JADX INFO: renamed from: q */
    private String f15775q;

    C4233g2(C4164X2 c4164x2, long j7, long j8) {
        super(c4164x2);
        this.f15774p = 0L;
        this.f15775q = null;
        this.f15767i = j7;
        this.f15768j = j8;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: m */
    protected final boolean mo18463m() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0181  */
    /* JADX WARN: Code duplicated, block: B:52:0x0182  */
    /* JADX WARN: Code duplicated, block: B:55:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:49:0x016d, B:53:0x0183, B:55:0x0187), top: B:81:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f3 A[EDGE_INSN: B:71:0x01f3->B:72:0x01f5 BREAK  A[LOOP:0: B:66:0x01da->B:87:?]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3 A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: n */
    protected final void mo18464n() {
        String str;
        String string;
        int iM18676h;
        C4164X2 c4164x2;
        C4164X2 c4164x3;
        List listM18803K;
        Iterator it;
        String strM27045a;
        C4164X2 c4164x4 = this.f15066a;
        c4164x4.mo18421a().m18859w().m18836c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.f15768j), Long.valueOf(this.f15767i));
        String packageName = c4164x4.mo18424e().getPackageName();
        PackageManager packageManager = c4164x4.mo18424e().getPackageManager();
        String str2 = "";
        int i7 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.f15066a.mo18421a().m18851o().m18835b("Error retrieving app installer package name. appId", C4313q2.m18846x(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.f15066a.mo18424e().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i7 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.f15066a.mo18421a().m18851o().m18836c("Error retrieving package info. appId, appName", C4313q2.m18846x(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.f15761c = packageName;
                this.f15764f = installerPackageName;
                this.f15762d = str3;
                this.f15763e = i7;
                this.f15765g = string;
                this.f15766h = 0L;
                C4164X2 c4164x5 = this.f15066a;
                iM18676h = c4164x5.m18676h();
                if (iM18676h != 0) {
                    this.f15066a.mo18421a().m18859w().m18834a("App measurement collection enabled");
                } else if (iM18676h != 1) {
                    this.f15066a.mo18421a().m18857u().m18834a("App measurement deactivated via the manifest");
                } else if (iM18676h != 3) {
                    this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iM18676h != 4) {
                    this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled via the manifest");
                } else if (iM18676h != 6) {
                    this.f15066a.mo18421a().m18856t().m18834a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iM18676h != 7) {
                    this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled via the global data collection setting");
                } else if (iM18676h != 8) {
                    C4164X2 c4164x6 = this.f15066a;
                    c4164x6.mo18421a().m18857u().m18834a("App measurement disabled");
                    c4164x6.mo18421a().m18852p().m18834a("Invalid scion state in identity");
                } else {
                    this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled due to denied storage consent");
                }
                this.f15772n = "";
                c4164x2 = this.f15066a;
                c4164x2.mo18423c();
                strM27045a = AbstractC6025H.m27045a(c4164x2.mo18424e(), "google_app_id", c4164x5.m18666H());
                if (TextUtils.isEmpty(strM27045a)) {
                    str2 = strM27045a;
                }
                this.f15772n = str2;
                if (iM18676h == 0) {
                    c4164x2.mo18421a().m18859w().m18836c("App measurement enabled for app package, google app id", this.f15761c, this.f15772n);
                }
                this.f15769k = null;
                c4164x3 = this.f15066a;
                c4164x3.mo18423c();
                listM18803K = c4164x3.m18686w().m18803K("analytics.safelisted_events");
                if (listM18803K != null) {
                    this.f15769k = listM18803K;
                    break;
                } else if (listM18803K.isEmpty()) {
                    it = listM18803K.iterator();
                    do {
                        if (it.hasNext()) {
                            this.f15769k = listM18803K;
                            break;
                        }
                    } while (c4164x3.m18661C().m19410u0("safelisted event", (String) it.next()));
                } else {
                    c4164x3.mo18421a().m18856t().m18834a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.f15771m = AbstractC5226b.m24146a(c4164x3.mo18424e()) ? 1 : 0;
                } else {
                    this.f15771m = 0;
                }
            }
            c4164x4.mo18421a().m18851o().m18835b("PackageManager is null, app identity information might be inaccurate. appId", C4313q2.m18846x(packageName));
            strM27045a = AbstractC6025H.m27045a(c4164x2.mo18424e(), "google_app_id", c4164x5.m18666H());
            if (TextUtils.isEmpty(strM27045a)) {
                str2 = strM27045a;
            }
            this.f15772n = str2;
            if (iM18676h == 0) {
                c4164x2.mo18421a().m18859w().m18836c("App measurement enabled for app package, google app id", this.f15761c, this.f15772n);
            }
        } catch (IllegalStateException e7) {
            this.f15066a.mo18421a().m18851o().m18836c("Fetching Google App Id failed with exception. appId", C4313q2.m18846x(packageName), e7);
        }
        string = "Unknown";
        this.f15761c = packageName;
        this.f15764f = installerPackageName;
        this.f15762d = str3;
        this.f15763e = i7;
        this.f15765g = string;
        this.f15766h = 0L;
        C4164X2 c4164x7 = this.f15066a;
        iM18676h = c4164x7.m18676h();
        if (iM18676h != 0) {
            this.f15066a.mo18421a().m18859w().m18834a("App measurement collection enabled");
        } else if (iM18676h != 1) {
            this.f15066a.mo18421a().m18857u().m18834a("App measurement deactivated via the manifest");
        } else if (iM18676h != 3) {
            this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iM18676h != 4) {
            this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled via the manifest");
        } else if (iM18676h != 6) {
            this.f15066a.mo18421a().m18856t().m18834a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iM18676h != 7) {
            this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled via the global data collection setting");
        } else if (iM18676h != 8) {
            C4164X2 c4164x8 = this.f15066a;
            c4164x8.mo18421a().m18857u().m18834a("App measurement disabled");
            c4164x8.mo18421a().m18852p().m18834a("Invalid scion state in identity");
        } else {
            this.f15066a.mo18421a().m18857u().m18834a("App measurement disabled due to denied storage consent");
        }
        this.f15772n = "";
        c4164x2 = this.f15066a;
        c4164x2.mo18423c();
        this.f15769k = null;
        c4164x3 = this.f15066a;
        c4164x3.mo18423c();
        listM18803K = c4164x3.m18686w().m18803K("analytics.safelisted_events");
        if (listM18803K != null) {
            this.f15769k = listM18803K;
            break;
        } else if (listM18803K.isEmpty()) {
            it = listM18803K.iterator();
            do {
                if (it.hasNext()) {
                    this.f15769k = listM18803K;
                    break;
                }
            } while (c4164x3.m18661C().m19410u0("safelisted event", (String) it.next()));
        } else {
            c4164x3.mo18421a().m18856t().m18834a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.f15771m = AbstractC5226b.m24146a(c4164x3.mo18424e()) ? 1 : 0;
        } else {
            this.f15771m = 0;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.B6, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.B6) from 0x0184: MOVE (r21v0 com.google.android.gms.measurement.internal.B6) = (r2v0 com.google.android.gms.measurement.internal.B6)
          (r2v0 com.google.android.gms.measurement.internal.B6) from 0x0172: MOVE (r21v2 com.google.android.gms.measurement.internal.B6) = (r2v0 com.google.android.gms.measurement.internal.B6)
          (r2v0 com.google.android.gms.measurement.internal.B6) from 0x014d: MOVE (r21v3 com.google.android.gms.measurement.internal.B6) = (r2v0 com.google.android.gms.measurement.internal.B6)
          (r2v0 com.google.android.gms.measurement.internal.B6) from 0x00f9: MOVE (r21v6 com.google.android.gms.measurement.internal.B6) = (r2v0 com.google.android.gms.measurement.internal.B6)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: o */
    final com.google.android.gms.measurement.internal.C4006B6 m18752o(java.lang.String r45) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4233g2.m18752o(java.lang.String):com.google.android.gms.measurement.internal.B6");
    }

    /* JADX INFO: renamed from: p */
    final void m18753p() {
        String str;
        mo18427h();
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.m18687x().m18495w().m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            c4164x2.m18661C().m19403q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            c4164x2.mo18421a().m18858v().m18834a("Analytics Storage consent is not granted");
            str = null;
        }
        c4164x2.mo18421a().m18858v().m18834a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f15773o = str;
        this.f15774p = c4164x2.mo18425f().mo18159a();
    }

    /* JADX INFO: renamed from: q */
    final String m18754q() {
        m18748j();
        AbstractC3718s.m18083l(this.f15761c);
        return this.f15761c;
    }

    /* JADX INFO: renamed from: r */
    final String m18755r() {
        mo18427h();
        m18748j();
        AbstractC3718s.m18083l(this.f15772n);
        return this.f15772n;
    }

    /* JADX INFO: renamed from: s */
    final String m18756s() {
        m18748j();
        AbstractC3718s.m18083l(this.f15765g);
        return this.f15765g;
    }

    /* JADX INFO: renamed from: t */
    final int m18757t() {
        m18748j();
        return this.f15763e;
    }

    /* JADX INFO: renamed from: u */
    final long m18758u() {
        return this.f15768j;
    }

    /* JADX INFO: renamed from: v */
    final int m18759v() {
        m18748j();
        return this.f15771m;
    }

    /* JADX INFO: renamed from: w */
    final List m18760w() {
        return this.f15769k;
    }

    /* JADX INFO: renamed from: x */
    final boolean m18761x(String str) {
        String str2 = this.f15775q;
        boolean z7 = false;
        if (str2 != null && !str2.equals(str)) {
            z7 = true;
        }
        this.f15775q = str;
        return z7;
    }
}
