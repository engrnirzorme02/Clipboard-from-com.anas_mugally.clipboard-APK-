package p129Q3;

import java.util.NoSuchElementException;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1263b extends AbstractC1260B {

    /* JADX INFO: renamed from: a */
    private b f4505a = b.NOT_READY;

    /* JADX INFO: renamed from: b */
    private Object f4506b;

    /* JADX INFO: renamed from: Q3.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4507a;

        static {
            int[] iArr = new int[b.values().length];
            f4507a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4507a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: Q3.b$b */
    private enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC1263b() {
    }

    /* JADX INFO: renamed from: c */
    private boolean m5504c() {
        this.f4505a = b.FAILED;
        this.f4506b = mo5505a();
        if (this.f4505a == b.DONE) {
            return false;
        }
        this.f4505a = b.READY;
        return true;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo5505a();

    /* JADX INFO: renamed from: b */
    protected final Object m5506b() {
        this.f4505a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1209m.m5308t(this.f4505a != b.FAILED);
        int i7 = a.f4507a[this.f4505a.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return m5504c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4505a = b.NOT_READY;
        Object objM5597a = AbstractC1279r.m5597a(this.f4506b);
        this.f4506b = null;
        return objM5597a;
    }
}
