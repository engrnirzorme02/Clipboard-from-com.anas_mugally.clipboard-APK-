package p036E2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: E2.o0 */
/* JADX INFO: loaded from: classes.dex */
final class C0360o0 extends LinkedHashMap {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0366r0 f1436a;

    C0360o0(C0366r0 c0366r0) {
        Objects.requireNonNull(c0366r0);
        this.f1436a = c0366r0;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        C0366r0 c0366r0 = this.f1436a;
        synchronized (c0366r0) {
            try {
                if (size() <= c0366r0.m1560g()) {
                    return false;
                }
                c0366r0.m1561h().add(new Pair((String) entry.getKey(), ((C0362p0) entry.getValue()).f1439b));
                return size() > c0366r0.m1560g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
