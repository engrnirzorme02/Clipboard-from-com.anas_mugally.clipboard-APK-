package p278j6;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: j6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5901c extends AbstractC5899a {

    /* JADX INFO: renamed from: e */
    public static final a f23470e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final C5901c f23471f = new C5901c(1, 0);

    /* JADX INFO: renamed from: j6.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C5901c(char c7, char c8) {
        super(c7, c8, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5901c)) {
            return false;
        }
        if (isEmpty() && ((C5901c) obj).isEmpty()) {
            return true;
        }
        C5901c c5901c = (C5901c) obj;
        return m26640a() == c5901c.m26640a() && m26641b() == c5901c.m26641b();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m26640a() * 31) + m26641b();
    }

    public boolean isEmpty() {
        return AbstractC6118n.m27188f(m26640a(), m26641b()) > 0;
    }

    public String toString() {
        return m26640a() + ".." + m26641b();
    }
}
