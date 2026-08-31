package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzal;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.google.firebase.auth.e */
/* JADX INFO: loaded from: classes.dex */
public class C4850e {

    /* JADX INFO: renamed from: g */
    private static final zzal f18512g;

    /* JADX INFO: renamed from: a */
    private final String f18513a;

    /* JADX INFO: renamed from: b */
    private final String f18514b;

    /* JADX INFO: renamed from: c */
    private final String f18515c;

    /* JADX INFO: renamed from: d */
    private final String f18516d;

    /* JADX INFO: renamed from: e */
    private final String f18517e;

    /* JADX INFO: renamed from: f */
    private final String f18518f;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        f18512g = zzal.zza(map);
    }

    private C4850e(String str) {
        String strM22033d = m22033d(str, "apiKey");
        String strM22033d2 = m22033d(str, "oobCode");
        String strM22033d3 = m22033d(str, "mode");
        if (strM22033d == null || strM22033d2 == null || strM22033d3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f18513a = AbstractC3718s.m18077f(strM22033d);
        this.f18514b = AbstractC3718s.m18077f(strM22033d2);
        this.f18515c = AbstractC3718s.m18077f(strM22033d3);
        this.f18516d = m22033d(str, "continueUrl");
        this.f18517e = m22033d(str, "lang");
        this.f18518f = m22033d(str, "tenantId");
    }

    /* JADX INFO: renamed from: b */
    public static C4850e m22032b(String str) {
        AbstractC3718s.m18077f(str);
        try {
            return new C4850e(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m22033d(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(AbstractC3718s.m18077f(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m22034a() {
        return this.f18514b;
    }

    /* JADX INFO: renamed from: c */
    public final String m22035c() {
        return this.f18518f;
    }
}
