package p192Z3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzahv;
import com.google.firebase.auth.AbstractC4815A;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.C4861j0;
import com.google.firebase.auth.C4882w;
import com.google.firebase.auth.InterfaceC4832P;
import com.google.firebase.auth.InterfaceC4881v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p164V3.C1762g;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Z3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2126h extends AbstractC4880u {
    public static final Parcelable.Creator<C2126h> CREATOR = new C2124g();

    /* JADX INFO: renamed from: a */
    private zzahv f6947a;

    /* JADX INFO: renamed from: b */
    private C2118d f6948b;

    /* JADX INFO: renamed from: c */
    private String f6949c;

    /* JADX INFO: renamed from: d */
    private String f6950d;

    /* JADX INFO: renamed from: e */
    private List f6951e;

    /* JADX INFO: renamed from: f */
    private List f6952f;

    /* JADX INFO: renamed from: r */
    private String f6953r;

    /* JADX INFO: renamed from: s */
    private Boolean f6954s;

    /* JADX INFO: renamed from: t */
    private C2130j f6955t;

    /* JADX INFO: renamed from: u */
    private boolean f6956u;

    /* JADX INFO: renamed from: v */
    private C4861j0 f6957v;

    /* JADX INFO: renamed from: w */
    private C2088B f6958w;

    /* JADX INFO: renamed from: x */
    private List f6959x;

    public C2126h(C1762g c1762g, List list) {
        AbstractC3718s.m18083l(c1762g);
        this.f6949c = c1762g.m7406o();
        this.f6950d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f6953r = "2";
        mo8714e0(list);
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: U */
    public final String mo8704U() {
        return this.f6948b.m8695T();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: V */
    public final String mo8705V() {
        return this.f6948b.m8696U();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: W */
    public final InterfaceC4881v mo8706W() {
        return this.f6955t;
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: X */
    public final /* synthetic */ AbstractC4815A mo8707X() {
        return new C2132k(this);
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: Y */
    public final Uri mo8708Y() {
        return this.f6948b.m8698W();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: Z */
    public final List mo8709Z() {
        return this.f6951e;
    }

    @Override // com.google.firebase.auth.InterfaceC4832P
    /* JADX INFO: renamed from: a */
    public final boolean mo8701a() {
        return this.f6948b.mo8701a();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: a0 */
    public final String mo8710a0() {
        Map map;
        zzahv zzahvVar = this.f6947a;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) AbstractC2087A.m8623a(this.f6947a.zzc()).m22058a().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: b0 */
    public final String mo8711b0() {
        return this.f6948b.m8699X();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: c0 */
    public final boolean mo8712c0() {
        C4882w c4882wM8623a;
        Boolean bool = this.f6954s;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.f6947a;
            String strM22059b = "";
            if (zzahvVar != null && (c4882wM8623a = AbstractC2087A.m8623a(zzahvVar.zzc())) != null) {
                strM22059b = c4882wM8623a.m22059b();
            }
            boolean z7 = true;
            if (mo8709Z().size() > 1 || (strM22059b != null && strM22059b.equals("custom"))) {
                z7 = false;
            }
            this.f6954s = Boolean.valueOf(z7);
        }
        return this.f6954s.booleanValue();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: d0 */
    public final C1762g mo8713d0() {
        return C1762g.m7395n(this.f6949c);
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: e0 */
    public final synchronized AbstractC4880u mo8714e0(List list) {
        try {
            AbstractC3718s.m18083l(list);
            this.f6951e = new ArrayList(list.size());
            this.f6952f = new ArrayList(list.size());
            for (int i7 = 0; i7 < list.size(); i7++) {
                InterfaceC4832P interfaceC4832P = (InterfaceC4832P) list.get(i7);
                if (interfaceC4832P.mo8702g().equals("firebase")) {
                    this.f6948b = (C2118d) interfaceC4832P;
                } else {
                    this.f6952f.add(interfaceC4832P.mo8702g());
                }
                this.f6951e.add((C2118d) interfaceC4832P);
            }
            if (this.f6948b == null) {
                this.f6948b = (C2118d) this.f6951e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: f0 */
    public final void mo8715f0(zzahv zzahvVar) {
        this.f6947a = (zzahv) AbstractC3718s.m18083l(zzahvVar);
    }

    @Override // com.google.firebase.auth.InterfaceC4832P
    /* JADX INFO: renamed from: g */
    public final String mo8702g() {
        return this.f6948b.mo8702g();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ AbstractC4880u mo8716g0() {
        this.f6954s = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: h0 */
    public final void mo8717h0(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f6959x = list;
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: i0 */
    public final zzahv mo8718i0() {
        return this.f6947a;
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: j0 */
    public final void mo8719j0(List list) {
        this.f6958w = C2088B.m8624T(list);
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    /* JADX INFO: renamed from: k0 */
    public final List mo8720k0() {
        return this.f6959x;
    }

    /* JADX INFO: renamed from: l0 */
    public final C2126h m8721l0(String str) {
        this.f6953r = str;
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8722m0(C2130j c2130j) {
        this.f6955t = c2130j;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8723n0(C4861j0 c4861j0) {
        this.f6957v = c4861j0;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8724o0(boolean z7) {
        this.f6956u = z7;
    }

    /* JADX INFO: renamed from: p0 */
    public final C4861j0 m8725p0() {
        return this.f6957v;
    }

    /* JADX INFO: renamed from: q0 */
    public final List m8726q0() {
        C2088B c2088b = this.f6958w;
        return c2088b != null ? c2088b.zza() : new ArrayList();
    }

    /* JADX INFO: renamed from: r0 */
    public final List m8727r0() {
        return this.f6951e;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m8728s0() {
        return this.f6956u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, mo8718i0(), i7, false);
        AbstractC1947c.m8042C(parcel, 2, this.f6948b, i7, false);
        AbstractC1947c.m8044E(parcel, 3, this.f6949c, false);
        AbstractC1947c.m8044E(parcel, 4, this.f6950d, false);
        AbstractC1947c.m8048I(parcel, 5, this.f6951e, false);
        AbstractC1947c.m8046G(parcel, 6, zzg(), false);
        AbstractC1947c.m8044E(parcel, 7, this.f6953r, false);
        AbstractC1947c.m8061i(parcel, 8, Boolean.valueOf(mo8712c0()), false);
        AbstractC1947c.m8042C(parcel, 9, mo8706W(), i7, false);
        AbstractC1947c.m8059g(parcel, 10, this.f6956u);
        AbstractC1947c.m8042C(parcel, 11, this.f6957v, i7, false);
        AbstractC1947c.m8042C(parcel, 12, this.f6958w, i7, false);
        AbstractC1947c.m8048I(parcel, 13, mo8720k0(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    public final String zzd() {
        return mo8718i0().zzc();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    public final String zze() {
        return this.f6947a.zzf();
    }

    @Override // com.google.firebase.auth.AbstractC4880u
    public final List zzg() {
        return this.f6952f;
    }

    C2126h(zzahv zzahvVar, C2118d c2118d, String str, String str2, List list, List list2, String str3, Boolean bool, C2130j c2130j, boolean z7, C4861j0 c4861j0, C2088B c2088b, List list3) {
        this.f6947a = zzahvVar;
        this.f6948b = c2118d;
        this.f6949c = str;
        this.f6950d = str2;
        this.f6951e = list;
        this.f6952f = list2;
        this.f6953r = str3;
        this.f6954s = bool;
        this.f6955t = c2130j;
        this.f6956u = z7;
        this.f6957v = c4861j0;
        this.f6958w = c2088b;
        this.f6959x = list3;
    }
}
