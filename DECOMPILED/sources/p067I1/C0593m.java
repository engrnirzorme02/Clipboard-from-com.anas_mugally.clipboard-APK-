package p067I1;

import java.util.Queue;
import p183Y1.AbstractC2023l;
import p183Y1.C2019h;

/* JADX INFO: renamed from: I1.m */
/* JADX INFO: loaded from: classes.dex */
public class C0593m {

    /* JADX INFO: renamed from: a */
    private final C2019h f2268a;

    /* JADX INFO: renamed from: I1.m$a */
    class a extends C2019h {
        a(long j7) {
            super(j7);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p183Y1.C2019h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo2046j(b bVar, Object obj) {
            bVar.m2614c();
        }
    }

    /* JADX INFO: renamed from: I1.m$b */
    static final class b {

        /* JADX INFO: renamed from: d */
        private static final Queue f2270d = AbstractC2023l.m8415f(0);

        /* JADX INFO: renamed from: a */
        private int f2271a;

        /* JADX INFO: renamed from: b */
        private int f2272b;

        /* JADX INFO: renamed from: c */
        private Object f2273c;

        private b() {
        }

        /* JADX INFO: renamed from: a */
        static b m2612a(Object obj, int i7, int i8) {
            b bVar;
            Queue queue = f2270d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m2613b(obj, i7, i8);
            return bVar;
        }

        /* JADX INFO: renamed from: b */
        private void m2613b(Object obj, int i7, int i8) {
            this.f2273c = obj;
            this.f2272b = i7;
            this.f2271a = i8;
        }

        /* JADX INFO: renamed from: c */
        public void m2614c() {
            Queue queue = f2270d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f2272b == bVar.f2272b && this.f2271a == bVar.f2271a && this.f2273c.equals(bVar.f2273c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f2271a * 31) + this.f2272b) * 31) + this.f2273c.hashCode();
        }
    }

    public C0593m(long j7) {
        this.f2268a = new a(j7);
    }

    /* JADX INFO: renamed from: a */
    public Object m2609a(Object obj, int i7, int i8) {
        b bVarM2612a = b.m2612a(obj, i7, i8);
        Object objM8396g = this.f2268a.m8396g(bVarM2612a);
        bVarM2612a.m2614c();
        return objM8396g;
    }

    /* JADX INFO: renamed from: b */
    public void m2610b(Object obj, int i7, int i8, Object obj2) {
        this.f2268a.m8398k(b.m2612a(obj, i7, i8), obj2);
    }
}
