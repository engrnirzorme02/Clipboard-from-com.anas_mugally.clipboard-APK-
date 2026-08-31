package p278j6;

import kotlin.jvm.internal.AbstractC6112h;
import p152T5.AbstractC1637p;
import p194Z5.AbstractC2168c;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: j6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5899a implements Iterable, InterfaceC5442a {

    /* JADX INFO: renamed from: d */
    public static final a f23462d = new a(null);

    /* JADX INFO: renamed from: a */
    private final char f23463a;

    /* JADX INFO: renamed from: b */
    private final char f23464b;

    /* JADX INFO: renamed from: c */
    private final int f23465c;

    /* JADX INFO: renamed from: j6.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public AbstractC5899a(char c7, char c8, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f23463a = c7;
        this.f23464b = (char) AbstractC2168c.m8789b(c7, c8, i7);
        this.f23465c = i7;
    }

    /* JADX INFO: renamed from: a */
    public final char m26640a() {
        return this.f23463a;
    }

    /* JADX INFO: renamed from: b */
    public final char m26641b() {
        return this.f23464b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1637p iterator() {
        return new C5900b(this.f23463a, this.f23464b, this.f23465c);
    }
}
