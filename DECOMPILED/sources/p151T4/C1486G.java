package p151T4;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p186Y4.AbstractC2049q;
import p186Y4.C2037e;
import p186Y4.InterfaceC2043k;

/* JADX INFO: renamed from: T4.G */
/* JADX INFO: loaded from: classes.dex */
public class C1486G {

    /* JADX INFO: renamed from: c */
    private static final long f5059c;

    /* JADX INFO: renamed from: d */
    private static final long f5060d;

    /* JADX INFO: renamed from: a */
    private final InterfaceC1478C f5061a;

    /* JADX INFO: renamed from: b */
    private final b f5062b;

    /* JADX INFO: renamed from: T4.G$a */
    public class a implements InterfaceC1602z1 {

        /* JADX INFO: renamed from: a */
        private final C2037e f5063a;

        /* JADX INFO: renamed from: b */
        private final C1472A f5064b;

        /* JADX INFO: renamed from: c */
        private boolean f5065c = false;

        /* JADX INFO: renamed from: d */
        private C2037e.b f5066d;

        public a(C2037e c2037e, C1472A c1472a) {
            this.f5063a = c2037e;
            this.f5064b = c1472a;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m6231a(a aVar) {
            aVar.f5064b.m6157o(C1486G.this);
            aVar.f5065c = true;
            aVar.m6232b();
        }

        /* JADX INFO: renamed from: b */
        private void m6232b() {
            this.f5066d = this.f5063a.m8470h(C2037e.d.GARBAGE_COLLECTION, this.f5065c ? C1486G.f5060d : C1486G.f5059c, new Runnable() { // from class: T4.F
                @Override // java.lang.Runnable
                public final void run() {
                    C1486G.a.m6231a(this.f5055a);
                }
            });
        }

        @Override // p151T4.InterfaceC1602z1
        public void start() {
            if (C1486G.this.f5062b.f5068a != -1) {
                m6232b();
            }
        }
    }

    /* JADX INFO: renamed from: T4.G$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        long f5068a;

        /* JADX INFO: renamed from: b */
        int f5069b;

        /* JADX INFO: renamed from: c */
        final int f5070c;

        b(long j7, int i7, int i8) {
            this.f5068a = j7;
            this.f5069b = i7;
            this.f5070c = i8;
        }

        /* JADX INFO: renamed from: a */
        public static b m6233a(long j7) {
            return new b(j7, 10, zzbbn.zzq.zzf);
        }
    }

    /* JADX INFO: renamed from: T4.G$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private final boolean f5071a;

        /* JADX INFO: renamed from: b */
        private final int f5072b;

        /* JADX INFO: renamed from: c */
        private final int f5073c;

        /* JADX INFO: renamed from: d */
        private final int f5074d;

        c(boolean z7, int i7, int i8, int i9) {
            this.f5071a = z7;
            this.f5072b = i7;
            this.f5073c = i8;
            this.f5074d = i9;
        }

        /* JADX INFO: renamed from: a */
        static c m6234a() {
            return new c(false, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4.G$d */
    static class d {

        /* JADX INFO: renamed from: c */
        private static final Comparator f5075c = new Comparator() { // from class: T4.H
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Long) obj2).compareTo((Long) obj);
            }
        };

        /* JADX INFO: renamed from: a */
        private final PriorityQueue f5076a;

        /* JADX INFO: renamed from: b */
        private final int f5077b;

        d(int i7) {
            this.f5077b = i7;
            this.f5076a = new PriorityQueue(i7, f5075c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: b */
        public void m6236b(Long l7) {
            if (this.f5076a.size() < this.f5077b) {
                this.f5076a.add(l7);
                return;
            }
            if (l7.longValue() < ((Long) this.f5076a.peek()).longValue()) {
                this.f5076a.poll();
                this.f5076a.add(l7);
            }
        }

        /* JADX INFO: renamed from: c */
        long m6237c() {
            return ((Long) this.f5076a.peek()).longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f5059c = timeUnit.toMillis(1L);
        f5060d = timeUnit.toMillis(5L);
    }

    C1486G(InterfaceC1478C interfaceC1478C, b bVar) {
        this.f5061a = interfaceC1478C;
        this.f5062b = bVar;
    }

    /* JADX INFO: renamed from: l */
    private c m6223l(SparseArray sparseArray) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM6224e = m6224e(this.f5062b.f5069b);
        if (iM6224e > this.f5062b.f5070c) {
            AbstractC2049q.m8502a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f5062b.f5070c + " from " + iM6224e, new Object[0]);
            iM6224e = this.f5062b.f5070c;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jM6227h = m6227h(iM6224e);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iM6230k = m6230k(jM6227h, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iM6229j = m6229j(jM6227h);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (AbstractC2049q.m8504c()) {
            String str = "LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(iM6224e), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2)));
            AbstractC2049q.m8502a("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(iM6230k), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3))) + String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(iM6229j), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis4))) + String.format(locale, "Total Duration: %dms", Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis)), new Object[0]);
        }
        return new c(true, iM6224e, iM6230k, iM6229j);
    }

    /* JADX INFO: renamed from: e */
    int m6224e(int i7) {
        return (int) ((i7 / 100.0f) * this.f5061a.mo6203n());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: f */
    public c m6225f(SparseArray sparseArray) {
        if (this.f5062b.f5068a == -1) {
            AbstractC2049q.m8502a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return c.m6234a();
        }
        long jM6226g = m6226g();
        if (jM6226g >= this.f5062b.f5068a) {
            return m6223l(sparseArray);
        }
        AbstractC2049q.m8502a("LruGarbageCollector", "Garbage collection skipped; Cache size " + jM6226g + " is lower than threshold " + this.f5062b.f5068a, new Object[0]);
        return c.m6234a();
    }

    /* JADX INFO: renamed from: g */
    long m6226g() {
        return this.f5061a.mo6190a();
    }

    /* JADX INFO: renamed from: h */
    long m6227h(int i7) {
        if (i7 == 0) {
            return -1L;
        }
        final d dVar = new d(i7);
        this.f5061a.mo6199j(new InterfaceC2043k() { // from class: T4.D
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                dVar.m6236b(Long.valueOf(((C1477B1) obj).m6211e()));
            }
        });
        this.f5061a.mo6205p(new InterfaceC2043k() { // from class: T4.E
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                dVar.m6236b((Long) obj);
            }
        });
        return dVar.m6237c();
    }

    /* JADX INFO: renamed from: i */
    public a m6228i(C2037e c2037e, C1472A c1472a) {
        return new a(c2037e, c1472a);
    }

    /* JADX INFO: renamed from: j */
    int m6229j(long j7) {
        return this.f5061a.mo6204o(j7);
    }

    /* JADX INFO: renamed from: k */
    int m6230k(long j7, SparseArray sparseArray) {
        return this.f5061a.mo6192c(j7, sparseArray);
    }
}
