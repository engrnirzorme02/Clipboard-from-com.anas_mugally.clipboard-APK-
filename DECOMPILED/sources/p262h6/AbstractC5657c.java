package p262h6;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6112h;
import p194Z5.AbstractC2167b;

/* JADX INFO: renamed from: h6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5657c {

    /* JADX INFO: renamed from: a */
    public static final a f21645a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final AbstractC5657c f21646b = AbstractC2167b.f7032a.mo8787b();

    /* JADX INFO: renamed from: h6.c$a */
    public static final class a extends AbstractC5657c implements Serializable {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        @Override // p262h6.AbstractC5657c
        /* JADX INFO: renamed from: b */
        public int mo25162b(int i7) {
            return AbstractC5657c.f21646b.mo25162b(i7);
        }

        @Override // p262h6.AbstractC5657c
        /* JADX INFO: renamed from: c */
        public boolean mo25163c() {
            return AbstractC5657c.f21646b.mo25163c();
        }

        @Override // p262h6.AbstractC5657c
        /* JADX INFO: renamed from: d */
        public int mo25164d() {
            return AbstractC5657c.f21646b.mo25164d();
        }

        @Override // p262h6.AbstractC5657c
        /* JADX INFO: renamed from: e */
        public int mo25165e(int i7) {
            return AbstractC5657c.f21646b.mo25165e(i7);
        }

        @Override // p262h6.AbstractC5657c
        /* JADX INFO: renamed from: f */
        public int mo25169f(int i7, int i8) {
            return AbstractC5657c.f21646b.mo25169f(i7, i8);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo25162b(int i7);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo25163c();

    /* JADX INFO: renamed from: d */
    public abstract int mo25164d();

    /* JADX INFO: renamed from: e */
    public abstract int mo25165e(int i7);

    /* JADX INFO: renamed from: f */
    public int mo25169f(int i7, int i8) {
        int iMo25164d;
        int i9;
        int iMo25162b;
        AbstractC5658d.m25171b(i7, i8);
        int i10 = i8 - i7;
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            if (((-i10) & i10) == i10) {
                iMo25162b = mo25162b(AbstractC5658d.m25172c(i10));
            } else {
                do {
                    iMo25164d = mo25164d() >>> 1;
                    i9 = iMo25164d % i10;
                } while ((iMo25164d - i9) + (i10 - 1) < 0);
                iMo25162b = i9;
            }
            return i7 + iMo25162b;
        }
        while (true) {
            int iMo25164d2 = mo25164d();
            if (i7 <= iMo25164d2 && iMo25164d2 < i8) {
                return iMo25164d2;
            }
        }
    }
}
