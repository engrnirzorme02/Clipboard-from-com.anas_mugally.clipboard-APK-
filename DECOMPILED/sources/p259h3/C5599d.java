package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3714q;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.d */
/* JADX INFO: loaded from: classes.dex */
public class C5599d extends AbstractC1945a {
    public static final Parcelable.Creator<C5599d> CREATOR = new C5628r0();

    /* JADX INFO: renamed from: a */
    private final C5627r f21481a;

    /* JADX INFO: renamed from: b */
    private final C5568G0 f21482b;

    /* JADX INFO: renamed from: c */
    private final C5565F f21483c;

    /* JADX INFO: renamed from: d */
    private final C5580M0 f21484d;

    /* JADX INFO: renamed from: e */
    private final C5577L f21485e;

    /* JADX INFO: renamed from: f */
    private final C5581N f21486f;

    /* JADX INFO: renamed from: r */
    private final C5572I0 f21487r;

    /* JADX INFO: renamed from: s */
    private final C5584Q f21488s;

    /* JADX INFO: renamed from: t */
    private final C5629s f21489t;

    /* JADX INFO: renamed from: u */
    private final C5588V f21490u;

    /* JADX INFO: renamed from: v */
    private final C5606g0 f21491v;

    /* JADX INFO: renamed from: w */
    private final C5586T f21492w;

    /* JADX INFO: renamed from: h3.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C5627r f21493a;

        /* JADX INFO: renamed from: b */
        private C5565F f21494b;

        /* JADX INFO: renamed from: c */
        private C5568G0 f21495c;

        /* JADX INFO: renamed from: d */
        private C5580M0 f21496d;

        /* JADX INFO: renamed from: e */
        private C5577L f21497e;

        /* JADX INFO: renamed from: f */
        private C5581N f21498f;

        /* JADX INFO: renamed from: g */
        private C5572I0 f21499g;

        /* JADX INFO: renamed from: h */
        private C5584Q f21500h;

        /* JADX INFO: renamed from: i */
        private C5629s f21501i;

        /* JADX INFO: renamed from: j */
        private C5588V f21502j;

        /* JADX INFO: renamed from: k */
        private C5606g0 f21503k;

        /* JADX INFO: renamed from: l */
        private C5586T f21504l;

        /* JADX INFO: renamed from: a */
        public C5599d m25018a() {
            return new C5599d(this.f21493a, this.f21495c, this.f21494b, this.f21496d, this.f21497e, this.f21498f, this.f21499g, this.f21500h, this.f21501i, this.f21502j, this.f21503k, this.f21504l);
        }

        /* JADX INFO: renamed from: b */
        public a m25019b(C5627r c5627r) {
            this.f21493a = c5627r;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m25020c(C5629s c5629s) {
            this.f21501i = c5629s;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m25021d(C5565F c5565f) {
            this.f21494b = c5565f;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final a m25022e(C5568G0 c5568g0) {
            this.f21495c = c5568g0;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final a m25023f(C5572I0 c5572i0) {
            this.f21499g = c5572i0;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final a m25024g(C5580M0 c5580m0) {
            this.f21496d = c5580m0;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final a m25025h(C5577L c5577l) {
            this.f21497e = c5577l;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final a m25026i(C5581N c5581n) {
            this.f21498f = c5581n;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final a m25027j(C5584Q c5584q) {
            this.f21500h = c5584q;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final a m25028k(C5588V c5588v) {
            this.f21502j = c5588v;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public final a m25029l(C5606g0 c5606g0) {
            this.f21503k = c5606g0;
            return this;
        }
    }

    C5599d(C5627r c5627r, C5568G0 c5568g0, C5565F c5565f, C5580M0 c5580m0, C5577L c5577l, C5581N c5581n, C5572I0 c5572i0, C5584Q c5584q, C5629s c5629s, C5588V c5588v, C5606g0 c5606g0, C5586T c5586t) {
        this.f21481a = c5627r;
        this.f21483c = c5565f;
        this.f21482b = c5568g0;
        this.f21484d = c5580m0;
        this.f21485e = c5577l;
        this.f21486f = c5581n;
        this.f21487r = c5572i0;
        this.f21488s = c5584q;
        this.f21489t = c5629s;
        this.f21490u = c5588v;
        this.f21491v = c5606g0;
        this.f21492w = c5586t;
    }

    /* JADX INFO: renamed from: V */
    public static C5599d m25015V(JSONObject jSONObject) throws JSONException {
        a aVar = new a();
        if (jSONObject.has("fidoAppIdExtension")) {
            aVar.m25019b(new C5627r(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")));
        }
        if (jSONObject.has("appid")) {
            aVar.m25019b(new C5627r(jSONObject.getString("appid")));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            aVar.m25028k(C5588V.m25008T(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            aVar.m25028k(C5588V.m25008T(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                arrayList.add(new C5564E0(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            aVar.m25022e(new C5568G0(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            aVar.m25021d(new C5565F(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            aVar.m25024g(new C5580M0(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            aVar.m25025h(new C5577L(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            aVar.m25026i(new C5581N(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            aVar.m25023f(new C5572I0(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            aVar.m25027j(new C5584Q(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            aVar.m25020c(new C5629s(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            aVar.m25029l(new C5606g0(jSONObject.getString("txAuthSimple")));
        }
        return aVar.m25018a();
    }

    /* JADX INFO: renamed from: T */
    public C5627r m25016T() {
        return this.f21481a;
    }

    /* JADX INFO: renamed from: U */
    public C5565F m25017U() {
        return this.f21483c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5599d)) {
            return false;
        }
        C5599d c5599d = (C5599d) obj;
        return AbstractC3714q.m18053b(this.f21481a, c5599d.f21481a) && AbstractC3714q.m18053b(this.f21482b, c5599d.f21482b) && AbstractC3714q.m18053b(this.f21483c, c5599d.f21483c) && AbstractC3714q.m18053b(this.f21484d, c5599d.f21484d) && AbstractC3714q.m18053b(this.f21485e, c5599d.f21485e) && AbstractC3714q.m18053b(this.f21486f, c5599d.f21486f) && AbstractC3714q.m18053b(this.f21487r, c5599d.f21487r) && AbstractC3714q.m18053b(this.f21488s, c5599d.f21488s) && AbstractC3714q.m18053b(this.f21489t, c5599d.f21489t) && AbstractC3714q.m18053b(this.f21490u, c5599d.f21490u) && AbstractC3714q.m18053b(this.f21491v, c5599d.f21491v) && AbstractC3714q.m18053b(this.f21492w, c5599d.f21492w);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21481a, this.f21482b, this.f21483c, this.f21484d, this.f21485e, this.f21486f, this.f21487r, this.f21488s, this.f21489t, this.f21490u, this.f21491v, this.f21492w);
    }

    public final String toString() {
        C5606g0 c5606g0 = this.f21491v;
        C5588V c5588v = this.f21490u;
        C5629s c5629s = this.f21489t;
        C5584Q c5584q = this.f21488s;
        C5572I0 c5572i0 = this.f21487r;
        C5581N c5581n = this.f21486f;
        C5577L c5577l = this.f21485e;
        C5580M0 c5580m0 = this.f21484d;
        C5565F c5565f = this.f21483c;
        C5568G0 c5568g0 = this.f21482b;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.f21481a) + ", \n cableAuthenticationExtension=" + String.valueOf(c5568g0) + ", \n userVerificationMethodExtension=" + String.valueOf(c5565f) + ", \n googleMultiAssertionExtension=" + String.valueOf(c5580m0) + ", \n googleSessionIdExtension=" + String.valueOf(c5577l) + ", \n googleSilentVerificationExtension=" + String.valueOf(c5581n) + ", \n devicePublicKeyExtension=" + String.valueOf(c5572i0) + ", \n googleTunnelServerIdExtension=" + String.valueOf(c5584q) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(c5629s) + ", \n prfExtension=" + String.valueOf(c5588v) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(c5606g0) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, m25016T(), i7, false);
        AbstractC1947c.m8042C(parcel, 3, this.f21482b, i7, false);
        AbstractC1947c.m8042C(parcel, 4, m25017U(), i7, false);
        AbstractC1947c.m8042C(parcel, 5, this.f21484d, i7, false);
        AbstractC1947c.m8042C(parcel, 6, this.f21485e, i7, false);
        AbstractC1947c.m8042C(parcel, 7, this.f21486f, i7, false);
        AbstractC1947c.m8042C(parcel, 8, this.f21487r, i7, false);
        AbstractC1947c.m8042C(parcel, 9, this.f21488s, i7, false);
        AbstractC1947c.m8042C(parcel, 10, this.f21489t, i7, false);
        AbstractC1947c.m8042C(parcel, 11, this.f21490u, i7, false);
        AbstractC1947c.m8042C(parcel, 12, this.f21491v, i7, false);
        AbstractC1947c.m8042C(parcel, 13, this.f21492w, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
