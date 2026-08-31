package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.C2390a;
import androidx.collection.C2399j;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzt;
import com.google.android.gms.internal.measurement.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import p283k3.AbstractC6052w;
import p283k3.EnumC6050u;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.P2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4109P2 extends AbstractC4197b6 implements InterfaceC4270l {

    /* JADX INFO: renamed from: d */
    private final Map f15352d;

    /* JADX INFO: renamed from: e */
    final Map f15353e;

    /* JADX INFO: renamed from: f */
    final Map f15354f;

    /* JADX INFO: renamed from: g */
    final Map f15355g;

    /* JADX INFO: renamed from: h */
    private final Map f15356h;

    /* JADX INFO: renamed from: i */
    private final Map f15357i;

    /* JADX INFO: renamed from: j */
    final C2399j f15358j;

    /* JADX INFO: renamed from: k */
    final zzr f15359k;

    /* JADX INFO: renamed from: l */
    private final Map f15360l;

    /* JADX INFO: renamed from: m */
    private final Map f15361m;

    /* JADX INFO: renamed from: n */
    private final Map f15362n;

    C4109P2(C4317q6 c4317q6) {
        super(c4317q6);
        this.f15352d = new C2390a();
        this.f15353e = new C2390a();
        this.f15354f = new C2390a();
        this.f15355g = new C2390a();
        this.f15356h = new C2390a();
        this.f15360l = new C2390a();
        this.f15361m = new C2390a();
        this.f15362n = new C2390a();
        this.f15357i = new C2390a();
        this.f15358j = new C4058I2(this, 20);
        this.f15359k = new C4066J2(this);
    }

    /* JADX INFO: renamed from: q */
    private final void m18577q(String str) throws Throwable {
        m18696j();
        mo18427h();
        AbstractC3718s.m18077f(str);
        Map map = this.f15356h;
        if (map.get(str) == null) {
            C4302p c4302pM19027N0 = this.f15465b.m18898F0().m19027N0(str);
            if (c4302pM19027N0 != null) {
                zzgk zzgkVar = (zzgk) m18580t(str, c4302pM19027N0.f15940a).zzcl();
                m18578r(str, zzgkVar);
                this.f15352d.put(str, m18581u((zzgl) zzgkVar.zzbc()));
                map.put(str, (zzgl) zzgkVar.zzbc());
                m18579s(str, (zzgl) zzgkVar.zzbc());
                this.f15360l.put(str, zzgkVar.zzh());
                this.f15361m.put(str, c4302pM19027N0.f15941b);
                this.f15362n.put(str, c4302pM19027N0.f15942c);
                return;
            }
            this.f15352d.put(str, null);
            this.f15354f.put(str, null);
            this.f15353e.put(str, null);
            this.f15355g.put(str, null);
            map.put(str, null);
            this.f15360l.put(str, null);
            this.f15361m.put(str, null);
            this.f15362n.put(str, null);
            this.f15357i.put(str, null);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m18578r(String str, zzgk zzgkVar) {
        HashSet hashSet = new HashSet();
        C2390a c2390a = new C2390a();
        C2390a c2390a2 = new C2390a();
        C2390a c2390a3 = new C2390a();
        Iterator it = zzgkVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzgh) it.next()).zza());
        }
        for (int i7 = 0; i7 < zzgkVar.zza(); i7++) {
            zzgi zzgiVar = (zzgi) zzgkVar.zzb(i7).zzcl();
            if (zzgiVar.zza().isEmpty()) {
                this.f15066a.mo18421a().m18854r().m18834a("EventConfig contained null event name");
            } else {
                String strZza = zzgiVar.zza();
                String strM27060b = AbstractC6052w.m27060b(zzgiVar.zza());
                if (!TextUtils.isEmpty(strM27060b)) {
                    zzgiVar.zzb(strM27060b);
                    zzgkVar.zzc(i7, zzgiVar);
                }
                if (zzgiVar.zzc() && zzgiVar.zzd()) {
                    c2390a.put(strZza, Boolean.TRUE);
                }
                if (zzgiVar.zze() && zzgiVar.zzf()) {
                    c2390a2.put(zzgiVar.zza(), Boolean.TRUE);
                }
                if (zzgiVar.zzg()) {
                    if (zzgiVar.zzh() < 2 || zzgiVar.zzh() > 65535) {
                        this.f15066a.mo18421a().m18854r().m18836c("Invalid sampling rate. Event name, sample rate", zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    } else {
                        c2390a3.put(zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    }
                }
            }
        }
        this.f15353e.put(str, hashSet);
        this.f15354f.put(str, c2390a);
        this.f15355g.put(str, c2390a2);
        this.f15357i.put(str, c2390a3);
    }

    /* JADX INFO: renamed from: s */
    private final void m18579s(final String str, zzgl zzglVar) {
        if (zzglVar.zzj() == 0) {
            this.f15358j.remove(str);
            return;
        }
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18421a().m18859w().m18835b("EES programs found", Integer.valueOf(zzglVar.zzj()));
        zzja zzjaVar = (zzja) zzglVar.zzi().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.O2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new zzn("internal.remoteConfig", new C4074K2(this.f15340a, str));
                }
            });
            zzcVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final C4109P2 c4109p2 = this.f15296a;
                    final String str2 = str;
                    return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.N2
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            C4109P2 c4109p3 = c4109p2;
                            C4342u c4342uM18898F0 = c4109p3.f15465b.m18898F0();
                            String str3 = str2;
                            C4361w2 c4361w2M19021J0 = c4342uM18898F0.m19021J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            c4109p3.f15066a.m18686w().m18793A();
                            map.put("gmp_version", 133005L);
                            if (c4361w2M19021J0 != null) {
                                String strM19114D0 = c4361w2M19021J0.m19114D0();
                                if (strM19114D0 != null) {
                                    map.put("app_version", strM19114D0);
                                }
                                map.put("app_version_int", Long.valueOf(c4361w2M19021J0.m19118F0()));
                                map.put("dynamite_version", Long.valueOf(c4361w2M19021J0.m19147b()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.M2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new zzt(this.f15307a.f15359k);
                }
            });
            zzcVar.zzf(zzjaVar);
            this.f15358j.put(str, zzcVar);
            c4164x2.mo18421a().m18859w().m18836c("EES program loaded for appId, activities", str, Integer.valueOf(zzjaVar.zzb().zzb()));
            Iterator it = zzjaVar.zzb().zza().iterator();
            while (it.hasNext()) {
                c4164x2.mo18421a().m18859w().m18835b("EES program activity", ((zziy) it.next()).zza());
            }
        } catch (zzd unused) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to load EES program. appId", str);
        }
    }

    /* JADX INFO: renamed from: t */
    private final zzgl m18580t(String str, byte[] bArr) {
        if (bArr == null) {
            return zzgl.zzs();
        }
        try {
            zzgl zzglVar = (zzgl) ((zzgk) C4349u6.m19071W(zzgl.zzr(), bArr)).zzbc();
            this.f15066a.mo18421a().m18859w().m18836c("Parsed config. version, gmp_app_id", zzglVar.zza() ? Long.valueOf(zzglVar.zzb()) : null, zzglVar.zzc() ? zzglVar.zzd() : null);
            return zzglVar;
        } catch (zzmr e7) {
            this.f15066a.mo18421a().m18854r().m18836c("Unable to merge remote config. appId", C4313q2.m18846x(str), e7);
            return zzgl.zzs();
        } catch (RuntimeException e8) {
            this.f15066a.mo18421a().m18854r().m18836c("Unable to merge remote config. appId", C4313q2.m18846x(str), e8);
            return zzgl.zzs();
        }
    }

    /* JADX INFO: renamed from: u */
    private static final Map m18581u(zzgl zzglVar) {
        C2390a c2390a = new C2390a();
        if (zzglVar != null) {
            for (zzgt zzgtVar : zzglVar.zze()) {
                c2390a.put(zzgtVar.zza(), zzgtVar.zzb());
            }
        }
        return c2390a;
    }

    /* JADX INFO: renamed from: v */
    private static final EnumC6051v m18582v(int i7) {
        int i8 = i7 - 1;
        if (i8 == 1) {
            return EnumC6051v.AD_STORAGE;
        }
        if (i8 == 2) {
            return EnumC6051v.ANALYTICS_STORAGE;
        }
        if (i8 == 3) {
            return EnumC6051v.AD_USER_DATA;
        }
        if (i8 != 4) {
            return null;
        }
        return EnumC6051v.AD_PERSONALIZATION;
    }

    /* JADX INFO: renamed from: A */
    protected final void m18583A(String str) {
        mo18427h();
        this.f15361m.put(str, null);
    }

    /* JADX INFO: renamed from: B */
    final void m18584B(String str) {
        mo18427h();
        this.f15356h.remove(str);
    }

    /* JADX INFO: renamed from: C */
    protected final boolean m18585C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        m18696j();
        mo18427h();
        AbstractC3718s.m18077f(str);
        zzgk zzgkVar = (zzgk) m18580t(str, bArr).zzcl();
        m18578r(str, zzgkVar);
        m18579s(str, (zzgl) zzgkVar.zzbc());
        this.f15356h.put(str, (zzgl) zzgkVar.zzbc());
        this.f15360l.put(str, zzgkVar.zzh());
        this.f15361m.put(str, str2);
        this.f15362n.put(str, str3);
        this.f15352d.put(str, m18581u((zzgl) zzgkVar.zzbc()));
        this.f15465b.m18898F0().m19033Y(str, new ArrayList(zzgkVar.zzd()));
        try {
            zzgkVar.zze();
            bArr = ((zzgl) zzgkVar.zzbc()).zzcc();
        } catch (RuntimeException e7) {
            this.f15066a.mo18421a().m18854r().m18836c("Unable to serialize reduced-size config. Storing full config instead. appId", C4313q2.m18846x(str), e7);
        }
        C4342u c4342uM18898F0 = this.f15465b.m18898F0();
        AbstractC3718s.m18077f(str);
        c4342uM18898F0.mo18427h();
        c4342uM18898F0.m18696j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c4342uM18898F0.m19051u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c4342uM18898F0.f15066a.mo18421a().m18851o().m18835b("Failed to update remote config (got 0). appId", C4313q2.m18846x(str));
            }
        } catch (SQLiteException e8) {
            c4342uM18898F0.f15066a.mo18421a().m18851o().m18836c("Error storing remote config. appId", C4313q2.m18846x(str), e8);
        }
        zzgkVar.zzf();
        this.f15356h.put(str, (zzgl) zzgkVar.zzbc());
        return true;
    }

    /* JADX INFO: renamed from: D */
    final boolean m18586D(String str, String str2) throws Throwable {
        Boolean bool;
        mo18427h();
        m18577q(str);
        if (m18590H(str) && C4389z6.m19357N(str2)) {
            return true;
        }
        if (m18591I(str) && C4389z6.m19366r0(str2)) {
            return true;
        }
        Map map = (Map) this.f15354f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: E */
    final boolean m18587E(String str, String str2) throws Throwable {
        Boolean bool;
        mo18427h();
        m18577q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f15355g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: F */
    final Set m18588F(String str) {
        mo18427h();
        m18577q(str);
        return (Set) this.f15353e.get(str);
    }

    /* JADX INFO: renamed from: G */
    final int m18589G(String str, String str2) throws Throwable {
        Integer num;
        mo18427h();
        m18577q(str);
        Map map = (Map) this.f15357i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: H */
    final boolean m18590H(String str) {
        return "1".equals(mo18603d(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: renamed from: I */
    final boolean m18591I(String str) {
        return "1".equals(mo18603d(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: renamed from: J */
    final boolean m18592J(String str) throws Throwable {
        mo18427h();
        m18577q(str);
        Map map = this.f15353e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    final boolean m18593K(String str) throws Throwable {
        mo18427h();
        m18577q(str);
        Map map = this.f15353e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    final boolean m18594L(String str) throws Throwable {
        mo18427h();
        m18577q(str);
        Map map = this.f15353e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    /* JADX INFO: renamed from: M */
    final boolean m18595M(String str) throws Throwable {
        mo18427h();
        m18577q(str);
        Map map = this.f15353e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    /* JADX INFO: renamed from: N */
    final boolean m18596N(String str) throws Throwable {
        mo18427h();
        m18577q(str);
        Map map = this.f15353e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: renamed from: O */
    final boolean m18597O(String str) throws Throwable {
        mo18427h();
        m18577q(str);
        Map map = this.f15353e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    /* JADX INFO: renamed from: P */
    final boolean m18598P(String str, EnumC6051v enumC6051v) throws Throwable {
        mo18427h();
        m18577q(str);
        zzgf zzgfVarM18600R = m18600R(str);
        if (zzgfVarM18600R == null) {
            return false;
        }
        for (zzfu zzfuVar : zzgfVarM18600R.zza()) {
            if (enumC6051v == m18582v(zzfuVar.zzb())) {
                if (zzfuVar.zzc() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    final EnumC6051v m18599Q(String str, EnumC6051v enumC6051v) {
        mo18427h();
        m18577q(str);
        zzgf zzgfVarM18600R = m18600R(str);
        if (zzgfVarM18600R == null) {
            return null;
        }
        for (zzfw zzfwVar : zzgfVarM18600R.zzb()) {
            if (enumC6051v == m18582v(zzfwVar.zzb())) {
                return m18582v(zzfwVar.zzc());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    final zzgf m18600R(String str) {
        mo18427h();
        m18577q(str);
        zzgl zzglVarM18608w = m18608w(str);
        if (zzglVarM18608w == null || !zzglVarM18608w.zzn()) {
            return null;
        }
        return zzglVarM18608w.zzo();
    }

    /* JADX INFO: renamed from: S */
    final boolean m18601S(String str) {
        mo18427h();
        m18577q(str);
        zzgf zzgfVarM18600R = m18600R(str);
        return zzgfVarM18600R == null || !zzgfVarM18600R.zzd() || zzgfVarM18600R.zze();
    }

    /* JADX INFO: renamed from: T */
    final SortedSet m18602T(String str) {
        mo18427h();
        m18577q(str);
        TreeSet treeSet = new TreeSet();
        zzgf zzgfVarM18600R = m18600R(str);
        if (zzgfVarM18600R != null) {
            Iterator it = zzgfVarM18600R.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((zzgc) it.next()).zza());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4270l
    /* JADX INFO: renamed from: d */
    public final String mo18603d(String str, String str2) throws Throwable {
        mo18427h();
        m18577q(str);
        Map map = (Map) this.f15352d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4197b6
    /* JADX INFO: renamed from: l */
    protected final boolean mo18457l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    final EnumC6050u m18604m(String str, EnumC6051v enumC6051v) {
        mo18427h();
        m18577q(str);
        zzgf zzgfVarM18600R = m18600R(str);
        if (zzgfVarM18600R == null) {
            return EnumC6050u.UNINITIALIZED;
        }
        for (zzfu zzfuVar : zzgfVarM18600R.zzf()) {
            if (m18582v(zzfuVar.zzb()) == enumC6051v) {
                int iZzc = zzfuVar.zzc() - 1;
                if (iZzc != 1) {
                    return iZzc != 2 ? EnumC6050u.UNINITIALIZED : EnumC6050u.DENIED;
                }
                return EnumC6050u.GRANTED;
            }
        }
        return EnumC6050u.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: n */
    final boolean m18605n(String str) throws Throwable {
        mo18427h();
        m18577q(str);
        zzgf zzgfVarM18600R = m18600R(str);
        if (zzgfVarM18600R == null) {
            return false;
        }
        for (zzfu zzfuVar : zzgfVarM18600R.zza()) {
            if (zzfuVar.zzb() == 3 && zzfuVar.zzd() == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    final /* synthetic */ zzc m18606o(String str) throws Throwable {
        m18696j();
        AbstractC3718s.m18077f(str);
        C4302p c4302pM19027N0 = this.f15465b.m18898F0().m19027N0(str);
        if (c4302pM19027N0 == null) {
            return null;
        }
        this.f15066a.mo18421a().m18859w().m18835b("Populate EES config from database on cache miss. appId", str);
        m18579s(str, m18580t(str, c4302pM19027N0.f15940a));
        return (zzc) this.f15358j.snapshot().get(str);
    }

    /* JADX INFO: renamed from: p */
    final /* synthetic */ Map m18607p() {
        return this.f15352d;
    }

    /* JADX INFO: renamed from: w */
    protected final zzgl m18608w(String str) {
        m18696j();
        mo18427h();
        AbstractC3718s.m18077f(str);
        m18577q(str);
        return (zzgl) this.f15356h.get(str);
    }

    /* JADX INFO: renamed from: x */
    final String m18609x(String str) {
        mo18427h();
        m18577q(str);
        return (String) this.f15360l.get(str);
    }

    /* JADX INFO: renamed from: y */
    protected final String m18610y(String str) {
        mo18427h();
        return (String) this.f15361m.get(str);
    }

    /* JADX INFO: renamed from: z */
    protected final String m18611z(String str) {
        mo18427h();
        return (String) this.f15362n.get(str);
    }
}
