package p278j6;

import kotlin.jvm.internal.AbstractC6112h;

/* JADX INFO: renamed from: j6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5904f extends C5902d {

    /* JADX INFO: renamed from: e */
    public static final a f23480e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final C5904f f23481f = new C5904f(1, 0);

    /* JADX INFO: renamed from: j6.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5904f m26652a() {
            return C5904f.f23481f;
        }

        private a() {
        }
    }

    public C5904f(int i7, int i8) {
        super(i7, i8, 1);
    }

    @Override // p278j6.C5902d
    public boolean equals(Object obj) {
        if (!(obj instanceof C5904f)) {
            return false;
        }
        if (isEmpty() && ((C5904f) obj).isEmpty()) {
            return true;
        }
        C5904f c5904f = (C5904f) obj;
        return m26643a() == c5904f.m26643a() && m26644b() == c5904f.m26644b();
    }

    @Override // p278j6.C5902d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m26643a() * 31) + m26644b();
    }

    @Override // p278j6.C5902d
    public boolean isEmpty() {
        return m26643a() > m26644b();
    }

    /* JADX INFO: renamed from: m */
    public boolean m26649m(int i7) {
        return m26643a() <= i7 && i7 <= m26644b();
    }

    /* JADX INFO: renamed from: n */
    public Integer m26650n() {
        return Integer.valueOf(m26644b());
    }

    /* JADX INFO: renamed from: p */
    public Integer m26651p() {
        return Integer.valueOf(m26643a());
    }

    @Override // p278j6.C5902d
    public String toString() {
        return m26643a() + ".." + m26644b();
    }
}
