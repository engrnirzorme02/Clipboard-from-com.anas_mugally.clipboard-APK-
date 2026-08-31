package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p283k3.EnumC6051v;
import p356t2.C7073a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4380y5 extends AbstractC4197b6 {

    /* JADX INFO: renamed from: d */
    private final Map f16246d;

    /* JADX INFO: renamed from: e */
    public final C4002B2 f16247e;

    /* JADX INFO: renamed from: f */
    public final C4002B2 f16248f;

    /* JADX INFO: renamed from: g */
    public final C4002B2 f16249g;

    /* JADX INFO: renamed from: h */
    public final C4002B2 f16250h;

    /* JADX INFO: renamed from: i */
    public final C4002B2 f16251i;

    /* JADX INFO: renamed from: j */
    public final C4002B2 f16252j;

    C4380y5(C4317q6 c4317q6) {
        super(c4317q6);
        this.f16246d = new HashMap();
        C4026E2 c4026e2M18687x = this.f15066a.m18687x();
        Objects.requireNonNull(c4026e2M18687x);
        this.f16247e = new C4002B2(c4026e2M18687x, "last_delete_stale", 0L);
        C4026E2 c4026e2M18687x2 = this.f15066a.m18687x();
        Objects.requireNonNull(c4026e2M18687x2);
        this.f16248f = new C4002B2(c4026e2M18687x2, "last_delete_stale_batch", 0L);
        C4026E2 c4026e2M18687x3 = this.f15066a.m18687x();
        Objects.requireNonNull(c4026e2M18687x3);
        this.f16249g = new C4002B2(c4026e2M18687x3, "backoff", 0L);
        C4026E2 c4026e2M18687x4 = this.f15066a.m18687x();
        Objects.requireNonNull(c4026e2M18687x4);
        this.f16250h = new C4002B2(c4026e2M18687x4, "last_upload", 0L);
        C4026E2 c4026e2M18687x5 = this.f15066a.m18687x();
        Objects.requireNonNull(c4026e2M18687x5);
        this.f16251i = new C4002B2(c4026e2M18687x5, "last_upload_attempt", 0L);
        C4026E2 c4026e2M18687x6 = this.f15066a.m18687x();
        Objects.requireNonNull(c4026e2M18687x6);
        this.f16252j = new C4002B2(c4026e2M18687x6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4197b6
    /* JADX INFO: renamed from: l */
    protected final boolean mo18457l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    final Pair m19330m(String str, C4027E3 c4027e3) {
        return c4027e3.m18514o(EnumC6051v.AD_STORAGE) ? m19331n(str) : new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: n */
    final Pair m19331n(String str) {
        C4372x5 c4372x5;
        C7073a.a aVarM31181a;
        mo18427h();
        C4164X2 c4164x2 = this.f15066a;
        long jMo18161c = c4164x2.mo18425f().mo18161c();
        C4372x5 c4372x6 = (C4372x5) this.f16246d.get(str);
        if (c4372x6 != null && jMo18161c < c4372x6.f16227c) {
            return new Pair(c4372x6.f16225a, Boolean.valueOf(c4372x6.f16226b));
        }
        C7073a.m31183c(true);
        long jM18796D = c4164x2.m18686w().m18796D(str, AbstractC4209d2.f15651b) + jMo18161c;
        try {
            try {
                aVarM31181a = C7073a.m31181a(c4164x2.mo18424e());
            } catch (PackageManager.NameNotFoundException unused) {
                aVarM31181a = null;
                if (c4372x6 != null && jMo18161c < c4372x6.f16227c + this.f15066a.m18686w().m18796D(str, AbstractC4209d2.f15654c)) {
                    return new Pair(c4372x6.f16225a, Boolean.valueOf(c4372x6.f16226b));
                }
            }
            if (aVarM31181a == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String strM31190a = aVarM31181a.m31190a();
            c4372x5 = strM31190a != null ? new C4372x5(strM31190a, aVarM31181a.m31191b(), jM18796D) : new C4372x5("", aVarM31181a.m31191b(), jM18796D);
            this.f16246d.put(str, c4372x5);
            C7073a.m31183c(false);
            return new Pair(c4372x5.f16225a, Boolean.valueOf(c4372x5.f16226b));
        } catch (Exception e7) {
            this.f15066a.mo18421a().m18858v().m18835b("Unable to get advertising id", e7);
            c4372x5 = new C4372x5("", false, jM18796D);
        }
    }

    /* JADX INFO: renamed from: o */
    final String m19332o(String str, boolean z7) {
        mo18427h();
        String str2 = z7 ? (String) m19331n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM19353C = C4389z6.m19353C();
        if (messageDigestM19353C == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM19353C.digest(str2.getBytes())));
    }
}
