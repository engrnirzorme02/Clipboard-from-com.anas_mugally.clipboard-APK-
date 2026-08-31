package p192Z3;

import com.google.android.gms.internal.p411firebaseauthapi.zzaao;
import com.google.firebase.auth.C4882w;
import java.util.HashMap;
import java.util.Map;
import p191Z2.C2086a;

/* JADX INFO: renamed from: Z3.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2087A {

    /* JADX INFO: renamed from: a */
    private static final C2086a f6878a = new C2086a("GetTokenResultFactory", new String[0]);

    /* JADX INFO: renamed from: a */
    public static C4882w m8623a(String str) {
        Map map;
        try {
            map = AbstractC2148z.m8751b(str);
        } catch (zzaao e7) {
            f6878a.m8614b("Error parsing token claims", e7, new Object[0]);
            map = new HashMap();
        }
        return new C4882w(str, map);
    }
}
