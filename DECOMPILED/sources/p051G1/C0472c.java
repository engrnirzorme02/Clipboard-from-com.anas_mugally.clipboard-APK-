package p051G1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: G1.c */
/* JADX INFO: loaded from: classes.dex */
final class C0472c {

    /* JADX INFO: renamed from: a */
    private final Map f1765a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final b f1766b = new b();

    /* JADX INFO: renamed from: G1.c$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        final Lock f1767a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        int f1768b;

        a() {
        }
    }

    /* JADX INFO: renamed from: G1.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final Queue f1769a = new ArrayDeque();

        b() {
        }

        /* JADX INFO: renamed from: a */
        a m2036a() {
            a aVar;
            synchronized (this.f1769a) {
                aVar = (a) this.f1769a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* JADX INFO: renamed from: b */
        void m2037b(a aVar) {
            synchronized (this.f1769a) {
                try {
                    if (this.f1769a.size() < 10) {
                        this.f1769a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C0472c() {
    }

    /* JADX INFO: renamed from: a */
    void m2034a(String str) {
        a aVarM2036a;
        synchronized (this) {
            try {
                aVarM2036a = (a) this.f1765a.get(str);
                if (aVarM2036a == null) {
                    aVarM2036a = this.f1766b.m2036a();
                    this.f1765a.put(str, aVarM2036a);
                }
                aVarM2036a.f1768b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarM2036a.f1767a.lock();
    }

    /* JADX INFO: renamed from: b */
    void m2035b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) AbstractC2022k.m8408e((a) this.f1765a.get(str));
                int i7 = aVar.f1768b;
                if (i7 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f1768b);
                }
                int i8 = i7 - 1;
                aVar.f1768b = i8;
                if (i8 == 0) {
                    a aVar2 = (a) this.f1765a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f1766b.m2037b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f1767a.unlock();
    }
}
