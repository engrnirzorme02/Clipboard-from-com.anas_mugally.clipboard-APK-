package p285k5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: k5.d */
/* JADX INFO: loaded from: classes.dex */
public class C6069d {

    /* JADX INFO: renamed from: b */
    private static volatile C6069d f23840b;

    /* JADX INFO: renamed from: a */
    private final Set f23841a = new HashSet();

    C6069d() {
    }

    /* JADX INFO: renamed from: a */
    public static C6069d m27107a() {
        C6069d c6069d;
        C6069d c6069d2 = f23840b;
        if (c6069d2 != null) {
            return c6069d2;
        }
        synchronized (C6069d.class) {
            try {
                c6069d = f23840b;
                if (c6069d == null) {
                    c6069d = new C6069d();
                    f23840b = c6069d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6069d;
    }

    /* JADX INFO: renamed from: b */
    Set m27108b() {
        Set setUnmodifiableSet;
        synchronized (this.f23841a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f23841a);
        }
        return setUnmodifiableSet;
    }
}
