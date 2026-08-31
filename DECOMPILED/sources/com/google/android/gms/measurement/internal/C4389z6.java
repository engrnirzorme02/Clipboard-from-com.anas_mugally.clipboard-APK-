package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3751f;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.measurement.zzcu;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p170W2.C1841f;
import p227d3.C5228d;
import p283k3.AbstractC6049t;
import p283k3.AbstractC6052w;
import p283k3.AbstractC6053x;
import p283k3.AbstractC6054y;
import p362u0.AbstractC7153a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4389z6 extends AbstractC4003B3 {

    /* JADX INFO: renamed from: i */
    private static final String[] f16273i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j */
    private static final String[] f16274j = {"_err"};

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f16275k = 0;

    /* JADX INFO: renamed from: c */
    private SecureRandom f16276c;

    /* JADX INFO: renamed from: d */
    private final AtomicLong f16277d;

    /* JADX INFO: renamed from: e */
    private int f16278e;

    /* JADX INFO: renamed from: f */
    private AbstractC7153a f16279f;

    /* JADX INFO: renamed from: g */
    private Boolean f16280g;

    /* JADX INFO: renamed from: h */
    private Integer f16281h;

    C4389z6(C4164X2 c4164x2) {
        super(c4164x2);
        this.f16281h = null;
        this.f16277d = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: C */
    static MessageDigest m19353C() {
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    static long m19354D(byte[] bArr) {
        AbstractC3718s.m18083l(bArr);
        int length = bArr.length;
        int i7 = 0;
        AbstractC3718s.m18086o(length > 0);
        long j7 = 0;
        for (int i8 = length - 1; i8 >= 0 && i8 >= bArr.length - 8; i8--) {
            j7 += (((long) bArr[i8]) & 255) << i7;
            i7 += 8;
        }
        return j7;
    }

    /* JADX INFO: renamed from: E */
    static boolean m19355E(Context context, boolean z7) {
        AbstractC3718s.m18083l(context);
        return m19356F(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* JADX INFO: renamed from: F */
    static boolean m19356F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: N */
    static boolean m19357N(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: O */
    private static boolean m19358O(String str, String[] strArr) {
        AbstractC3718s.m18083l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m19359U(String str) {
        return !f16274j[0].equals(str);
    }

    /* JADX INFO: renamed from: h0 */
    public static ArrayList m19360h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4246i c4246i = (C4246i) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c4246i.f15806a);
            bundle.putString("origin", c4246i.f15807b);
            bundle.putLong("creation_timestamp", c4246i.f15809d);
            bundle.putString("name", c4246i.f15808c.f16124b);
            AbstractC6049t.m27057a(bundle, AbstractC3718s.m18083l(c4246i.f15808c.zza()));
            bundle.putBoolean("active", c4246i.f15810e);
            String str = c4246i.f15811f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C4039G c4039g = c4246i.f15812r;
            if (c4039g != null) {
                bundle.putString("timed_out_event_name", c4039g.f15219a);
                C4023E c4023e = c4039g.f15220b;
                if (c4023e != null) {
                    bundle.putBundle("timed_out_event_params", c4023e.m18484Y());
                }
            }
            bundle.putLong("trigger_timeout", c4246i.f15813s);
            C4039G c4039g2 = c4246i.f15814t;
            if (c4039g2 != null) {
                bundle.putString("triggered_event_name", c4039g2.f15219a);
                C4023E c4023e2 = c4039g2.f15220b;
                if (c4023e2 != null) {
                    bundle.putBundle("triggered_event_params", c4023e2.m18484Y());
                }
            }
            bundle.putLong("triggered_timestamp", c4246i.f15808c.f16125c);
            bundle.putLong("time_to_live", c4246i.f15815u);
            C4039G c4039g3 = c4246i.f15816v;
            if (c4039g3 != null) {
                bundle.putString("expired_event_name", c4039g3.f15219a);
                C4023E c4023e3 = c4039g3.f15220b;
                if (c4023e3 != null) {
                    bundle.putBundle("expired_event_params", c4023e3.m18484Y());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    static boolean m19361j0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC3718s.m18083l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m19362k0(C4028E4 c4028e4, Bundle bundle, boolean z7) {
        if (bundle != null && c4028e4 != null) {
            if (!bundle.containsKey("_sc") || z7) {
                String str = c4028e4.f15196a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c4028e4.f15197b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c4028e4.f15198c);
                return;
            }
            z7 = false;
        }
        if (bundle != null && c4028e4 == null && z7) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: m0 */
    static final boolean m19363m0(Bundle bundle, int i7) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    private final Object m19364n0(int i7, Object obj, boolean z7, boolean z8, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m19402q(obj.toString(), i7, z7);
        }
        if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM19381Q = m19381Q((Bundle) parcelable, null);
                if (!bundleM19381Q.isEmpty()) {
                    arrayList.add(bundleM19381Q);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: o0 */
    private final int m19365o0(String str) {
        if ("_ldl".equals(str)) {
            this.f15066a.m18686w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f15066a.m18686w();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f15066a.m18686w();
            return 100;
        }
        this.f15066a.m18686w();
        return 36;
    }

    /* JADX INFO: renamed from: r0 */
    static boolean m19366r0(String str) {
        AbstractC3718s.m18077f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: A */
    final void m19367A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.mo18421a().m18856t().m18836c("Not putting event parameter. Invalid value type. name, type", c4164x2.m18662D().m18776b(str), simpleName);
        }
    }

    /* JADX INFO: renamed from: A0 */
    final int m19368A0(String str) {
        if (!m19410u0("event param", str)) {
            return 3;
        }
        if (!m19412v0("event param", null, null, str)) {
            return 14;
        }
        this.f15066a.m18686w();
        return !m19414w0("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: B */
    final void m19369B(InterfaceC4381y6 interfaceC4381y6, String str, int i7, String str2, String str3, int i8) {
        Bundle bundle = new Bundle();
        m19363m0(bundle, i7);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i8);
        }
        interfaceC4381y6.mo18694a(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: B0 */
    final boolean m19370B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: C0 */
    final boolean m19371C0(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i7) {
                this.f15066a.mo18421a().m18856t().m18837d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    final void m19372D0(String str, String str2, String str3, Bundle bundle, List list, boolean z7) {
        int iM19420z0;
        String str4;
        int iM19404r;
        list = list;
        if (bundle == null) {
            return;
        }
        C4164X2 c4164x2 = this.f15066a;
        int i7 = true != c4164x2.m18686w().f15066a.m18661C().m19385V(231100000, true) ? 0 : 35;
        int i8 = 0;
        boolean z8 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iM19420z0 = !z7 ? m19420z0(str5) : 0;
                if (iM19420z0 == 0) {
                    iM19420z0 = m19368A0(str5);
                }
            } else {
                iM19420z0 = 0;
            }
            if (iM19420z0 != 0) {
                m19415x(bundle, iM19420z0, str5, iM19420z0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (m19370B0(bundle.get(str5))) {
                    c4164x2.mo18421a().m18856t().m18837d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iM19404r = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iM19404r = m19404r(str, str2, str5, bundle.get(str5), bundle, list, z7, false);
                }
                if (iM19404r != 0 && !"_ev".equals(str5)) {
                    m19415x(bundle, iM19404r, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (m19366r0(str5) && !m19358O(str5, AbstractC6053x.f23832d)) {
                    i8++;
                    if (!m19385V(231100000, true)) {
                        c4164x2.mo18421a().m18853q().m18836c("Item array not supported on client's version of Google Play Services (Android Only)", c4164x2.m18662D().m18775a(str2), c4164x2.m18662D().m18779e(bundle));
                        m19363m0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i8 > i7) {
                        if (!c4164x2.m18686w().m18800H(str4, AbstractC4209d2.f15665f1) || !z8) {
                            C4297o2 c4297o2M18853q = c4164x2.mo18421a().m18853q();
                            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i7);
                            sb.append(" item-scoped custom params");
                            c4297o2M18853q.m18836c(sb.toString(), c4164x2.m18662D().m18775a(str2), c4164x2.m18662D().m18779e(bundle));
                        }
                        m19363m0(bundle, 28);
                        bundle.remove(str5);
                        z8 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    final boolean m19373G() {
        mo18427h();
        return m19376J() == 1;
    }

    /* JADX INFO: renamed from: H */
    final AbstractC7153a m19374H() {
        if (this.f16279f == null) {
            this.f16279f = AbstractC7153a.m31621a(this.f15066a.mo18424e());
        }
        return this.f16279f;
    }

    /* JADX INFO: renamed from: I */
    final int m19375I() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* JADX INFO: renamed from: J */
    final long m19376J() {
        long j7;
        mo18427h();
        if (!m19378L(this.f15066a.m18670L().m18754q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j7 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j7 = 8;
        } else {
            C4164X2 c4164x2 = this.f15066a;
            int iM19375I = m19375I();
            c4164x2.m18686w();
            j7 = iM19375I < ((Integer) AbstractC4209d2.f15685m0.m18706b(null)).intValue() ? 16L : 0L;
        }
        if (!m19379M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j7 |= 2;
        }
        if (j7 == 0 && !m19377K()) {
            j7 = 64;
        }
        if (j7 == 0) {
            return 1L;
        }
        return j7;
    }

    /* JADX INFO: renamed from: K */
    final boolean m19377K() {
        Object e7;
        Integer num;
        if (this.f16280g == null) {
            AbstractC7153a abstractC7153aM19374H = m19374H();
            boolean z7 = false;
            if (abstractC7153aM19374H == null) {
                return false;
            }
            try {
                num = (Integer) abstractC7153aM19374H.mo31622b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z7 = true;
                        }
                    } catch (InterruptedException e8) {
                        e7 = e8;
                        this.f15066a.mo18421a().m18854r().m18835b("Measurement manager api exception", e7);
                        this.f16280g = Boolean.FALSE;
                    } catch (CancellationException e9) {
                        e7 = e9;
                        this.f15066a.mo18421a().m18854r().m18835b("Measurement manager api exception", e7);
                        this.f16280g = Boolean.FALSE;
                    } catch (ExecutionException e10) {
                        e7 = e10;
                        this.f15066a.mo18421a().m18854r().m18835b("Measurement manager api exception", e7);
                        this.f16280g = Boolean.FALSE;
                    } catch (TimeoutException e11) {
                        e7 = e11;
                        this.f15066a.mo18421a().m18854r().m18835b("Measurement manager api exception", e7);
                        this.f16280g = Boolean.FALSE;
                    }
                }
                this.f16280g = Boolean.valueOf(z7);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e12) {
                e7 = e12;
                num = null;
            }
            this.f15066a.mo18421a().m18859w().m18835b("Measurement manager api status result", num);
        }
        return this.f16280g.booleanValue();
    }

    /* JADX INFO: renamed from: L */
    final boolean m19378L(String str) {
        String str2 = (String) AbstractC4209d2.f15697s0.m18706b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    /* JADX INFO: renamed from: M */
    final boolean m19379M(String str) {
        mo18427h();
        C4164X2 c4164x2 = this.f15066a;
        if (C5228d.m24155a(c4164x2.mo18424e()).m24147a(str) == 0) {
            return true;
        }
        c4164x2.mo18421a().m18858v().m18835b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: renamed from: P */
    final boolean m19380P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C4164X2 c4164x2 = this.f15066a;
        String strM18811i = c4164x2.m18686w().m18811i();
        c4164x2.mo18423c();
        return strM18811i.equals(str);
    }

    /* JADX INFO: renamed from: Q */
    final Bundle m19381Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objM19405s = m19405s(str2, bundle.get(str2));
                if (objM19405s == null) {
                    C4164X2 c4164x2 = this.f15066a;
                    c4164x2.mo18421a().m18856t().m18835b("Param value can't be null", c4164x2.m18662D().m18776b(str2));
                } else {
                    m19367A(bundle2, str2, objM19405s);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: R */
    final C4039G m19382R(String str, String str2, Bundle bundle, String str3, long j7, boolean z7, boolean z8) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m19416x0(str2) != 0) {
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.mo18421a().m18851o().m18835b("Invalid conditional property event name", c4164x2.m18662D().m18777c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleM19407t = m19407t(str, str2, bundle2, AbstractC3751f.m18162a("_o"), true);
        if (z7) {
            bundleM19407t = m19381Q(bundleM19407t, str);
        }
        AbstractC3718s.m18083l(bundleM19407t);
        return new C4039G(str2, new C4023E(bundleM19407t), str3, j7);
    }

    /* JADX INFO: renamed from: S */
    final boolean m19383S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM24152f = C5228d.m24155a(context).m24152f(str, 64);
            if (packageInfoM24152f == null || (signatureArr = packageInfoM24152f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Package name not found", e7);
            return true;
        } catch (CertificateException e8) {
            this.f15066a.mo18421a().m18851o().m18835b("Error obtaining certificate", e8);
            return true;
        }
    }

    /* JADX INFO: renamed from: T */
    final byte[] m19384T(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m19385V(int i7, boolean z7) {
        Boolean boolM19244x = this.f15066a.m18668J().m19244x();
        if (m19386W() < i7 / zzbbn.zzq.zzf) {
            return (boolM19244x == null || boolM19244x.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final int m19386W() {
        if (this.f16281h == null) {
            this.f16281h = Integer.valueOf(C1841f.m7623f().m7624a(this.f15066a.mo18424e()) / zzbbn.zzq.zzf);
        }
        return this.f16281h.intValue();
    }

    /* JADX INFO: renamed from: X */
    public final int m19387X(int i7) {
        return C1841f.m7623f().mo7609h(this.f15066a.mo18424e(), 12451000);
    }

    /* JADX INFO: renamed from: Y */
    public final long m19388Y(long j7, long j8) {
        return (j7 + (j8 * 60000)) / 86400000;
    }

    /* JADX INFO: renamed from: Z */
    final void m19389Z(Bundle bundle, long j7) {
        long j8 = bundle.getLong("_et");
        if (j8 != 0) {
            this.f15066a.mo18421a().m18854r().m18835b("Params already contained engagement", Long.valueOf(j8));
        } else {
            j8 = 0;
        }
        bundle.putLong("_et", j7 + j8);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m19390a0(zzcu zzcuVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error returning string value to wrapper", e7);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m19391b0(zzcu zzcuVar, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j7);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error returning long value to wrapper", e7);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m19392c0(zzcu zzcuVar, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error returning int value to wrapper", e7);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m19393d0(zzcu zzcuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error returning byte array to wrapper", e7);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m19394e0(zzcu zzcuVar, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error returning boolean value to wrapper", e7);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m19395f0(zzcu zzcuVar, Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error returning bundle value to wrapper", e7);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m19396g0(zzcu zzcuVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Error returning bundle list to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4003B3
    /* JADX INFO: renamed from: i */
    protected final boolean mo18416i() {
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public final URL m19397i0(long j7, String str, String str2, long j8, String str3) {
        try {
            AbstractC3718s.m18077f(str2);
            AbstractC3718s.m18077f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(m19386W())), str2, str, Long.valueOf(j8));
            if (str.equals(this.f15066a.m18686w().m18812j())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e7) {
            e = e7;
            this.f15066a.mo18421a().m18851o().m18835b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e8) {
            e = e8;
            this.f15066a.mo18421a().m18851o().m18835b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4003B3
    /* JADX INFO: renamed from: j */
    protected final void mo18435j() {
        mo18427h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f15066a.mo18421a().m18854r().m18834a("Utils falling back to Random for random id");
            }
        }
        this.f16277d.set(jNextLong);
    }

    /* JADX INFO: renamed from: l0 */
    final String m19398l0() {
        byte[] bArr = new byte[16];
        m19403q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: o */
    final boolean m19399o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f15066a.mo18421a().m18853q().m18834a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC3718s.m18083l(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.f15066a.mo18421a().m18853q().m18835b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C4313q2.m18846x(str));
        return false;
    }

    /* JADX INFO: renamed from: p */
    final boolean m19400p(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC3718s.m18083l(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public final long m19401p0() {
        long andIncrement;
        long j7;
        AtomicLong atomicLong = this.f16277d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f16277d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.f15066a.mo18425f().mo18159a()).nextLong();
            int i7 = this.f16278e + 1;
            this.f16278e = i7;
            j7 = jNextLong + ((long) i7);
        }
        return j7;
    }

    /* JADX INFO: renamed from: q */
    public final String m19402q(String str, int i7, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i7) {
            return str;
        }
        if (z7) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i7))).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    final SecureRandom m19403q0() {
        mo18427h();
        if (this.f16276c == null) {
            this.f16276c = new SecureRandom();
        }
        return this.f16276c;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX INFO: renamed from: r */
    final int m19404r(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z7, boolean z8) {
        int i7;
        int size;
        mo18427h();
        if (!m19370B0(obj)) {
            i7 = 0;
        } else {
            if (!z8) {
                return 21;
            }
            if (!m19358O(str3, AbstractC6053x.f23831c)) {
                return 20;
            }
            C4364w5 c4364w5M18668J = this.f15066a.m18668J();
            c4364w5M18668J.mo18427h();
            c4364w5M18668J.m18748j();
            if (c4364w5M18668J.m19245y() && c4364w5M18668J.f15066a.m18661C().m19386W() < 200900) {
                return 25;
            }
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.m18686w();
            boolean z9 = obj instanceof Parcelable[];
            if (z9) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i7 = 0;
            }
            if (size > 200) {
                c4164x2.mo18421a().m18856t().m18837d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                c4164x2.m18686w();
                if (z9) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i7 = 17;
            } else {
                i7 = 0;
            }
        }
        if (!m19371C0("param", str3, (m19357N(str2) || m19357N(str3)) ? this.f15066a.m18686w().m18821y(null, false) : this.f15066a.m18686w().m18820x(null, false), obj)) {
            if (!z8) {
                return 4;
            }
            if (obj instanceof Bundle) {
                m19372D0(str, str2, str3, (Bundle) obj, list, z7);
                return i7;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        this.f15066a.mo18421a().m18856t().m18836c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        return 4;
                    }
                    m19372D0(str, str2, str3, (Bundle) parcelable, list, z7);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    Object obj2 = arrayList2.get(i8);
                    if (!(obj2 instanceof Bundle)) {
                        this.f15066a.mo18421a().m18856t().m18836c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                        return 4;
                    }
                    m19372D0(str, str2, str3, (Bundle) obj2, list, z7);
                }
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: s */
    final Object m19405s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m19364n0(this.f15066a.m18686w().m18821y(null, false), obj, true, true, null);
        }
        return m19364n0(m19357N(str) ? this.f15066a.m18686w().m18821y(null, false) : this.f15066a.m18686w().m18820x(null, false), obj, false, true, null);
    }

    /* JADX INFO: renamed from: s0 */
    final Bundle m19406s0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            for (String str : uri.getQueryParameterNames()) {
                if (str.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e7) {
            this.f15066a.mo18421a().m18854r().m18835b("Install referrer url isn't a hierarchical URI", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    final Bundle m19407t(String str, String str2, Bundle bundle, List list, boolean z7) {
        int iM19420z0;
        boolean zM19358O = m19358O(str2, AbstractC6052w.f23828d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C4164X2 c4164x2 = this.f15066a;
        int iM18818v = c4164x2.m18686w().m18818v();
        int i7 = 0;
        boolean z8 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iM19420z0 = !z7 ? m19420z0(str3) : 0;
                if (iM19420z0 == 0) {
                    iM19420z0 = m19368A0(str3);
                }
            } else {
                iM19420z0 = 0;
            }
            if (iM19420z0 != 0) {
                m19415x(bundle2, iM19420z0, str3, iM19420z0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iM19404r = m19404r(str, str2, str3, bundle.get(str3), bundle2, list, z7, zM19358O);
                if (iM19404r == 17) {
                    m19415x(bundle2, 17, str3, Boolean.FALSE);
                } else if (iM19404r != 0 && !"_ev".equals(str3)) {
                    m19415x(bundle2, iM19404r, iM19404r == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m19366r0(str3) && (i7 = i7 + 1) > iM18818v) {
                    if (!c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15665f1) || !z8) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iM18818v).length() + 37);
                        sb.append("Event can't contain more than ");
                        sb.append(iM18818v);
                        sb.append(" params");
                        c4164x2.mo18421a().m18853q().m18836c(sb.toString(), c4164x2.m18662D().m18775a(str2), c4164x2.m18662D().m18779e(bundle));
                    }
                    m19363m0(bundle2, 5);
                    bundle2.remove(str3);
                    z8 = true;
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: t0 */
    final boolean m19408t0(String str, String str2) {
        if (str2 == null) {
            this.f15066a.mo18421a().m18853q().m18835b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f15066a.mo18421a().m18853q().m18835b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f15066a.mo18421a().m18853q().m18836c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f15066a.mo18421a().m18853q().m18836c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    final void m19409u(C4321r2 c4321r2, int i7) {
        Bundle bundle = c4321r2.f16028d;
        int i8 = 0;
        boolean z7 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m19366r0(str) && (i8 = i8 + 1) > i7) {
                C4164X2 c4164x2 = this.f15066a;
                if (!c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15665f1) || !z7) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i7);
                    sb.append(" params");
                    c4164x2.mo18421a().m18853q().m18836c(sb.toString(), c4164x2.m18662D().m18775a(c4321r2.f16025a), c4164x2.m18662D().m18779e(bundle));
                    m19363m0(bundle, 5);
                }
                bundle.remove(str);
                z7 = true;
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    final boolean m19410u0(String str, String str2) {
        if (str2 == null) {
            this.f15066a.mo18421a().m18853q().m18835b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f15066a.mo18421a().m18853q().m18835b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f15066a.mo18421a().m18853q().m18836c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f15066a.mo18421a().m18853q().m18836c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    final void m19411v(Parcelable[] parcelableArr, int i7) {
        AbstractC3718s.m18083l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i8 = 0;
            boolean z7 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m19366r0(str) && !m19358O(str, AbstractC6053x.f23832d) && (i8 = i8 + 1) > i7) {
                    C4164X2 c4164x2 = this.f15066a;
                    if (!c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15665f1) || !z7) {
                        C4297o2 c4297o2M18853q = c4164x2.mo18421a().m18853q();
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i7);
                        sb.append(" item-scoped custom parameters");
                        c4297o2M18853q.m18836c(sb.toString(), c4164x2.m18662D().m18776b(str), c4164x2.m18662D().m18779e(bundle));
                    }
                    m19363m0(bundle, 28);
                    bundle.remove(str);
                    z7 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    final boolean m19412v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f15066a.mo18421a().m18853q().m18835b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC3718s.m18083l(str2);
        String[] strArr3 = f16273i;
        for (int i7 = 0; i7 < 3; i7++) {
            if (str2.startsWith(strArr3[i7])) {
                this.f15066a.mo18421a().m18853q().m18836c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m19358O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m19358O(str2, strArr2)) {
            return true;
        }
        this.f15066a.mo18421a().m18853q().m18836c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: renamed from: w */
    final void m19413w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f15066a.m18661C().m19367A(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    final boolean m19414w0(String str, int i7, String str2) {
        if (str2 == null) {
            this.f15066a.mo18421a().m18853q().m18835b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i7) {
            return true;
        }
        this.f15066a.mo18421a().m18853q().m18837d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
        return false;
    }

    /* JADX INFO: renamed from: x */
    final void m19415x(Bundle bundle, int i7, String str, Object obj) {
        if (m19363m0(bundle, i7)) {
            this.f15066a.m18686w();
            bundle.putString("_ev", m19402q(str, 40, true));
            if (obj != null) {
                AbstractC3718s.m18083l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    final int m19416x0(String str) {
        if (!m19410u0("event", str)) {
            return 2;
        }
        if (!m19412v0("event", AbstractC6052w.f23825a, AbstractC6052w.f23826b, str)) {
            return 13;
        }
        this.f15066a.m18686w();
        return !m19414w0("event", 40, str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: y */
    final int m19417y(String str, Object obj) {
        return "_ldl".equals(str) ? m19371C0("user property referrer", str, m19365o0(str), obj) : m19371C0("user property", str, m19365o0(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: y0 */
    final int m19418y0(String str) {
        if (!m19410u0("user property", str)) {
            return 6;
        }
        if (!m19412v0("user property", AbstractC6054y.f23833a, null, str)) {
            return 15;
        }
        this.f15066a.m18686w();
        return !m19414w0("user property", 24, str) ? 6 : 0;
    }

    /* JADX INFO: renamed from: z */
    final Object m19419z(String str, Object obj) {
        return "_ldl".equals(str) ? m19364n0(m19365o0(str), obj, true, false, null) : m19364n0(m19365o0(str), obj, false, false, null);
    }

    /* JADX INFO: renamed from: z0 */
    final int m19420z0(String str) {
        if (!m19408t0("event param", str)) {
            return 3;
        }
        if (!m19412v0("event param", null, null, str)) {
            return 14;
        }
        this.f15066a.m18686w();
        return !m19414w0("event param", 40, str) ? 3 : 0;
    }
}
