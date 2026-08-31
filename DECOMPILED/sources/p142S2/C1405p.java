package p142S2;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: renamed from: S2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1405p {

    /* JADX INFO: renamed from: d */
    private static C1405p f4910d;

    /* JADX INFO: renamed from: a */
    final C1392c f4911a;

    /* JADX INFO: renamed from: b */
    GoogleSignInAccount f4912b;

    /* JADX INFO: renamed from: c */
    GoogleSignInOptions f4913c;

    private C1405p(Context context) {
        C1392c c1392cM5970b = C1392c.m5970b(context);
        this.f4911a = c1392cM5970b;
        this.f4912b = c1392cM5970b.m5973c();
        this.f4913c = c1392cM5970b.m5974d();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C1405p m5993a(Context context) {
        return m5994d(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: d */
    private static synchronized C1405p m5994d(Context context) {
        C1405p c1405p = f4910d;
        if (c1405p != null) {
            return c1405p;
        }
        C1405p c1405p2 = new C1405p(context);
        f4910d = c1405p2;
        return c1405p2;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5995b() {
        this.f4911a.m5972a();
        this.f4912b = null;
        this.f4913c = null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5996c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f4911a.m5976f(googleSignInAccount, googleSignInOptions);
        this.f4912b = googleSignInAccount;
        this.f4913c = googleSignInOptions;
    }
}
