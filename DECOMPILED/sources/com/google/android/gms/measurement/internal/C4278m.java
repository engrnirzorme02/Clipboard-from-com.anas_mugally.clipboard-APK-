package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3763r;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p227d3.C5228d;
import p283k3.EnumC6050u;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C4278m extends AbstractC3995A3 {

    /* JADX INFO: renamed from: b */
    private Boolean f15874b;

    /* JADX INFO: renamed from: c */
    private String f15875c;

    /* JADX INFO: renamed from: d */
    private InterfaceC4270l f15876d;

    /* JADX INFO: renamed from: e */
    private Boolean f15877e;

    C4278m(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15876d = C4262k.f15848a;
    }

    /* JADX INFO: renamed from: n */
    public static final long m18787n() {
        return ((Long) AbstractC4209d2.f15660e.m18706b(null)).longValue();
    }

    /* JADX INFO: renamed from: o */
    public static final int m18788o() {
        return Math.max(0, ((Integer) AbstractC4209d2.f15675j.m18706b(null)).intValue());
    }

    /* JADX INFO: renamed from: p */
    public static final long m18789p() {
        return ((Integer) AbstractC4209d2.f15681l.m18706b(null)).intValue();
    }

    /* JADX INFO: renamed from: q */
    public static final long m18790q() {
        return ((Long) AbstractC4209d2.f15632S.m18706b(null)).longValue();
    }

    /* JADX INFO: renamed from: r */
    public static final long m18791r() {
        return ((Long) AbstractC4209d2.f15622N.m18706b(null)).longValue();
    }

    /* JADX INFO: renamed from: s */
    private final String m18792s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC3718s.m18083l(str3);
            return str3;
        } catch (ClassNotFoundException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Could not find SystemProperties class", e7);
            return "";
        } catch (IllegalAccessException e8) {
            this.f15066a.mo18421a().m18851o().m18835b("Could not access SystemProperties.get()", e8);
            return "";
        } catch (NoSuchMethodException e9) {
            this.f15066a.mo18421a().m18851o().m18835b("Could not find SystemProperties.get() method", e9);
            return "";
        } catch (InvocationTargetException e10) {
            this.f15066a.mo18421a().m18851o().m18835b("SystemProperties.get() threw an exception", e10);
            return "";
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m18793A() {
        this.f15066a.mo18423c();
        return 133005L;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m18794B() {
        if (this.f15877e == null) {
            synchronized (this) {
                try {
                    if (this.f15877e == null) {
                        C4164X2 c4164x2 = this.f15066a;
                        ApplicationInfo applicationInfo = c4164x2.mo18424e().getApplicationInfo();
                        String strM18205a = AbstractC3763r.m18205a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z7 = false;
                            if (str != null && str.equals(strM18205a)) {
                                z7 = true;
                            }
                            this.f15877e = Boolean.valueOf(z7);
                        }
                        if (this.f15877e == null) {
                            this.f15877e = Boolean.TRUE;
                            c4164x2.mo18421a().m18851o().m18834a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f15877e.booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public final String m18795C(String str, C4201c2 c4201c2) {
        return TextUtils.isEmpty(str) ? (String) c4201c2.m18706b(null) : (String) c4201c2.m18706b(this.f15876d.mo18603d(str, c4201c2.m18705a()));
    }

    /* JADX INFO: renamed from: D */
    public final long m18796D(String str, C4201c2 c4201c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c4201c2.m18706b(null)).longValue();
        }
        String strMo18603d = this.f15876d.mo18603d(str, c4201c2.m18705a());
        if (TextUtils.isEmpty(strMo18603d)) {
            return ((Long) c4201c2.m18706b(null)).longValue();
        }
        try {
            return ((Long) c4201c2.m18706b(Long.valueOf(Long.parseLong(strMo18603d)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c4201c2.m18706b(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m18797E(String str, C4201c2 c4201c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c4201c2.m18706b(null)).intValue();
        }
        String strMo18603d = this.f15876d.mo18603d(str, c4201c2.m18705a());
        if (TextUtils.isEmpty(strMo18603d)) {
            return ((Integer) c4201c2.m18706b(null)).intValue();
        }
        try {
            return ((Integer) c4201c2.m18706b(Integer.valueOf(Integer.parseInt(strMo18603d)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c4201c2.m18706b(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public final int m18798F(String str, C4201c2 c4201c2, int i7, int i8) {
        return Math.max(Math.min(m18797E(str, c4201c2), i8), i7);
    }

    /* JADX INFO: renamed from: G */
    public final double m18799G(String str, C4201c2 c4201c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c4201c2.m18706b(null)).doubleValue();
        }
        String strMo18603d = this.f15876d.mo18603d(str, c4201c2.m18705a());
        if (TextUtils.isEmpty(strMo18603d)) {
            return ((Double) c4201c2.m18706b(null)).doubleValue();
        }
        try {
            return ((Double) c4201c2.m18706b(Double.valueOf(Double.parseDouble(strMo18603d)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c4201c2.m18706b(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m18800H(String str, C4201c2 c4201c2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c4201c2.m18706b(null)).booleanValue();
        }
        String strMo18603d = this.f15876d.mo18603d(str, c4201c2.m18705a());
        return TextUtils.isEmpty(strMo18603d) ? ((Boolean) c4201c2.m18706b(null)).booleanValue() : ((Boolean) c4201c2.m18706b(Boolean.valueOf("1".equals(strMo18603d)))).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    final Bundle m18801I() {
        try {
            C4164X2 c4164x2 = this.f15066a;
            if (c4164x2.mo18424e().getPackageManager() == null) {
                c4164x2.mo18421a().m18851o().m18834a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM24149c = C5228d.m24155a(c4164x2.mo18424e()).m24149c(c4164x2.mo18424e().getPackageName(), 128);
            if (applicationInfoM24149c != null) {
                return applicationInfoM24149c.metaData;
            }
            c4164x2.mo18421a().m18851o().m18834a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to load metadata: Package name not found", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    final Boolean m18802J(String str) {
        AbstractC3718s.m18077f(str);
        Bundle bundleM18801I = m18801I();
        if (bundleM18801I == null) {
            this.f15066a.mo18421a().m18851o().m18834a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM18801I.containsKey(str)) {
            return Boolean.valueOf(bundleM18801I.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: NotFoundException -> 0x0048, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0048, blocks: (B:11:0x002e, B:14:0x0043), top: B:19:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    final List m18803K(String str) {
        Integer numValueOf;
        String[] stringArray;
        AbstractC3718s.m18077f("analytics.safelisted_events");
        Bundle bundleM18801I = m18801I();
        if (bundleM18801I != null) {
            if (bundleM18801I.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM18801I.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.f15066a.mo18424e().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e7) {
                    this.f15066a.mo18421a().m18851o().m18835b("Failed to load string array from metadata: resource not found", e7);
                }
            }
            return null;
        }
        this.f15066a.mo18421a().m18851o().m18834a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.f15066a.mo18424e().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m18804L() {
        this.f15066a.mo18423c();
        Boolean boolM18802J = m18802J("firebase_analytics_collection_deactivated");
        return boolM18802J != null && boolM18802J.booleanValue();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m18805M() {
        Boolean boolM18802J = m18802J("google_analytics_adid_collection_enabled");
        return boolM18802J == null || boolM18802J.booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m18806N() {
        Boolean boolM18802J = m18802J("google_analytics_automatic_screen_reporting_enabled");
        return boolM18802J == null || boolM18802J.booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public final EnumC6050u m18807O(String str, boolean z7) {
        Object obj;
        AbstractC3718s.m18077f(str);
        C4164X2 c4164x2 = this.f15066a;
        Bundle bundleM18801I = m18801I();
        if (bundleM18801I == null) {
            c4164x2.mo18421a().m18851o().m18834a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM18801I.get(str);
        }
        if (obj == null) {
            return EnumC6050u.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC6050u.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC6050u.DENIED;
        }
        if (z7 && "eu_consent_policy".equals(obj)) {
            return EnumC6050u.POLICY;
        }
        c4164x2.mo18421a().m18854r().m18835b("Invalid manifest metadata for", str);
        return EnumC6050u.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m18808P() {
        Boolean boolM18802J = m18802J("google_analytics_sgtm_upload_enabled");
        if (boolM18802J == null) {
            return false;
        }
        return boolM18802J.booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final void m18809Q(String str) {
        this.f15875c = str;
    }

    /* JADX INFO: renamed from: R */
    public final String m18810R() {
        return this.f15875c;
    }

    /* JADX INFO: renamed from: i */
    public final String m18811i() {
        return m18792s("debug.firebase.analytics.app", "");
    }

    /* JADX INFO: renamed from: j */
    public final String m18812j() {
        return m18792s("debug.deferred.deeplink", "");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m18813k(String str) {
        return "1".equals(this.f15876d.mo18603d(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m18814l(String str) {
        return "1".equals(this.f15876d.mo18603d(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: m */
    final boolean m18815m() {
        if (this.f15874b == null) {
            Boolean boolM18802J = m18802J("app_measurement_lite");
            this.f15874b = boolM18802J;
            if (boolM18802J == null) {
                this.f15874b = Boolean.FALSE;
            }
        }
        return this.f15874b.booleanValue() || !this.f15066a.m18665G();
    }

    /* JADX INFO: renamed from: t */
    final void m18816t(InterfaceC4270l interfaceC4270l) {
        this.f15876d = interfaceC4270l;
    }

    /* JADX INFO: renamed from: u */
    final String m18817u() {
        this.f15066a.mo18423c();
        return "FA";
    }

    /* JADX INFO: renamed from: v */
    public final int m18818v() {
        return this.f15066a.m18661C().m19385V(201500000, true) ? 100 : 25;
    }

    /* JADX INFO: renamed from: w */
    public final int m18819w(String str) {
        return m18798F(str, AbstractC4209d2.f15644Y, 25, 100);
    }

    /* JADX INFO: renamed from: x */
    final int m18820x(String str, boolean z7) {
        if (z7) {
            return m18798F(str, AbstractC4209d2.f15673i0, 100, 500);
        }
        return 500;
    }

    /* JADX INFO: renamed from: y */
    final int m18821y(String str, boolean z7) {
        return Math.max(m18820x(str, z7), 256);
    }

    /* JADX INFO: renamed from: z */
    final int m18822z(String str) {
        return m18798F(str, AbstractC4209d2.f15642X, 500, 2000);
    }
}
