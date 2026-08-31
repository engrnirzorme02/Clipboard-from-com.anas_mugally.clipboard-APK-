package p192Z3;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: renamed from: Z3.X */
/* JADX INFO: loaded from: classes.dex */
public final class C2109X {

    /* JADX INFO: renamed from: c */
    private static final C2109X f6918c = new C2109X();

    /* JADX INFO: renamed from: a */
    private final C2090D f6919a;

    /* JADX INFO: renamed from: b */
    private final C2145w f6920b;

    private C2109X() {
        this(C2090D.m8631g(), C2145w.m8748a());
    }

    /* JADX INFO: renamed from: c */
    public static C2109X m8671c() {
        return f6918c;
    }

    /* JADX INFO: renamed from: a */
    public final void m8672a(Context context) {
        this.f6919a.m8632a(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8673b(FirebaseAuth firebaseAuth) {
        this.f6919a.m8633f(firebaseAuth);
    }

    private C2109X(C2090D c2090d, C2145w c2145w) {
        this.f6919a = c2090d;
        this.f6920b = c2145w;
    }
}
