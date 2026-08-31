package p360t6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t6.M */
/* JADX INFO: loaded from: classes.dex */
public class C7113M {

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28401b = AtomicIntegerFieldUpdater.newUpdater(C7113M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    private InterfaceC7114N[] f28402a;

    /* JADX INFO: renamed from: g */
    private final InterfaceC7114N[] m31413g() {
        InterfaceC7114N[] interfaceC7114NArr = this.f28402a;
        if (interfaceC7114NArr == null) {
            InterfaceC7114N[] interfaceC7114NArr2 = new InterfaceC7114N[4];
            this.f28402a = interfaceC7114NArr2;
            return interfaceC7114NArr2;
        }
        if (m31420c() < interfaceC7114NArr.length) {
            return interfaceC7114NArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC7114NArr, m31420c() * 2);
        AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
        InterfaceC7114N[] interfaceC7114NArr3 = (InterfaceC7114N[]) objArrCopyOf;
        this.f28402a = interfaceC7114NArr3;
        return interfaceC7114NArr3;
    }

    /* JADX INFO: renamed from: k */
    private final void m31414k(int i7) {
        f28401b.set(this, i7);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX INFO: renamed from: l */
    private final void m31415l(int i7) {
        while (true) {
            int i8 = i7 * 2;
            int i9 = i8 + 1;
            if (i9 >= m31420c()) {
                return;
            }
            InterfaceC7114N[] interfaceC7114NArr = this.f28402a;
            AbstractC6118n.m27184b(interfaceC7114NArr);
            int i10 = i8 + 2;
            if (i10 < m31420c()) {
                InterfaceC7114N interfaceC7114N = interfaceC7114NArr[i10];
                AbstractC6118n.m27184b(interfaceC7114N);
                InterfaceC7114N interfaceC7114N2 = interfaceC7114NArr[i9];
                AbstractC6118n.m27184b(interfaceC7114N2);
                if (((Comparable) interfaceC7114N).compareTo(interfaceC7114N2) >= 0) {
                    i10 = i9;
                }
            } else {
                i10 = i9;
            }
            InterfaceC7114N interfaceC7114N3 = interfaceC7114NArr[i7];
            AbstractC6118n.m27184b(interfaceC7114N3);
            InterfaceC7114N interfaceC7114N4 = interfaceC7114NArr[i10];
            AbstractC6118n.m27184b(interfaceC7114N4);
            if (((Comparable) interfaceC7114N3).compareTo(interfaceC7114N4) <= 0) {
                return;
            }
            m31417n(i7, i10);
            i7 = i10;
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m31416m(int i7) {
        while (i7 > 0) {
            InterfaceC7114N[] interfaceC7114NArr = this.f28402a;
            AbstractC6118n.m27184b(interfaceC7114NArr);
            int i8 = (i7 - 1) / 2;
            InterfaceC7114N interfaceC7114N = interfaceC7114NArr[i8];
            AbstractC6118n.m27184b(interfaceC7114N);
            InterfaceC7114N interfaceC7114N2 = interfaceC7114NArr[i7];
            AbstractC6118n.m27184b(interfaceC7114N2);
            if (((Comparable) interfaceC7114N).compareTo(interfaceC7114N2) <= 0) {
                return;
            }
            m31417n(i7, i8);
            i7 = i8;
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m31417n(int i7, int i8) {
        InterfaceC7114N[] interfaceC7114NArr = this.f28402a;
        AbstractC6118n.m27184b(interfaceC7114NArr);
        InterfaceC7114N interfaceC7114N = interfaceC7114NArr[i8];
        AbstractC6118n.m27184b(interfaceC7114N);
        InterfaceC7114N interfaceC7114N2 = interfaceC7114NArr[i7];
        AbstractC6118n.m27184b(interfaceC7114N2);
        interfaceC7114NArr[i7] = interfaceC7114N;
        interfaceC7114NArr[i8] = interfaceC7114N2;
        interfaceC7114N.mo28219j(i7);
        interfaceC7114N2.mo28219j(i8);
    }

    /* JADX INFO: renamed from: a */
    public final void m31418a(InterfaceC7114N interfaceC7114N) {
        interfaceC7114N.mo28220m(this);
        InterfaceC7114N[] interfaceC7114NArrM31413g = m31413g();
        int iM31420c = m31420c();
        m31414k(iM31420c + 1);
        interfaceC7114NArrM31413g[iM31420c] = interfaceC7114N;
        interfaceC7114N.mo28219j(iM31420c);
        m31416m(iM31420c);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC7114N m31419b() {
        InterfaceC7114N[] interfaceC7114NArr = this.f28402a;
        if (interfaceC7114NArr != null) {
            return interfaceC7114NArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m31420c() {
        return f28401b.get(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m31421e() {
        return m31420c() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC7114N m31422f() {
        InterfaceC7114N interfaceC7114NM31419b;
        synchronized (this) {
            interfaceC7114NM31419b = m31419b();
        }
        return interfaceC7114NM31419b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m31423h(InterfaceC7114N interfaceC7114N) {
        boolean z7;
        synchronized (this) {
            if (interfaceC7114N.mo28218h() == null) {
                z7 = false;
            } else {
                m31424i(interfaceC7114N.mo28217c());
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    /* JADX INFO: renamed from: i */
    public final InterfaceC7114N m31424i(int i7) {
        InterfaceC7114N[] interfaceC7114NArr = this.f28402a;
        AbstractC6118n.m27184b(interfaceC7114NArr);
        m31414k(m31420c() - 1);
        if (i7 < m31420c()) {
            m31417n(i7, m31420c());
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                InterfaceC7114N interfaceC7114N = interfaceC7114NArr[i7];
                AbstractC6118n.m27184b(interfaceC7114N);
                InterfaceC7114N interfaceC7114N2 = interfaceC7114NArr[i8];
                AbstractC6118n.m27184b(interfaceC7114N2);
                if (((Comparable) interfaceC7114N).compareTo(interfaceC7114N2) < 0) {
                    m31417n(i7, i8);
                    m31416m(i8);
                } else {
                    m31415l(i7);
                }
            } else {
                m31415l(i7);
            }
        }
        InterfaceC7114N interfaceC7114N3 = interfaceC7114NArr[m31420c()];
        AbstractC6118n.m27184b(interfaceC7114N3);
        interfaceC7114N3.mo28220m(null);
        interfaceC7114N3.mo28219j(-1);
        interfaceC7114NArr[m31420c()] = null;
        return interfaceC7114N3;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC7114N m31425j() {
        InterfaceC7114N interfaceC7114NM31424i;
        synchronized (this) {
            interfaceC7114NM31424i = m31420c() > 0 ? m31424i(0) : null;
        }
        return interfaceC7114NM31424i;
    }
}
