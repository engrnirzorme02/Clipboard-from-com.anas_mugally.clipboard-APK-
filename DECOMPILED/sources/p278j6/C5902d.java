package p278j6;

import kotlin.jvm.internal.AbstractC6112h;
import p152T5.AbstractC1608F;
import p194Z5.AbstractC2168c;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: j6.d */
/* JADX INFO: loaded from: classes.dex */
public class C5902d implements Iterable, InterfaceC5442a {

    /* JADX INFO: renamed from: d */
    public static final a f23472d = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f23473a;

    /* JADX INFO: renamed from: b */
    private final int f23474b;

    /* JADX INFO: renamed from: c */
    private final int f23475c;

    /* JADX INFO: renamed from: j6.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5902d m26647a(int i7, int i8, int i9) {
            return new C5902d(i7, i8, i9);
        }

        private a() {
        }
    }

    public C5902d(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f23473a = i7;
        this.f23474b = AbstractC2168c.m8789b(i7, i8, i9);
        this.f23475c = i9;
    }

    /* JADX INFO: renamed from: a */
    public final int m26643a() {
        return this.f23473a;
    }

    /* JADX INFO: renamed from: b */
    public final int m26644b() {
        return this.f23474b;
    }

    /* JADX INFO: renamed from: e */
    public final int m26645e() {
        return this.f23475c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5902d)) {
            return false;
        }
        if (isEmpty() && ((C5902d) obj).isEmpty()) {
            return true;
        }
        C5902d c5902d = (C5902d) obj;
        return this.f23473a == c5902d.f23473a && this.f23474b == c5902d.f23474b && this.f23475c == c5902d.f23475c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC1608F iterator() {
        return new C5903e(this.f23473a, this.f23474b, this.f23475c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f23473a * 31) + this.f23474b) * 31) + this.f23475c;
    }

    public boolean isEmpty() {
        if (this.f23475c > 0) {
            return this.f23473a > this.f23474b;
        }
        return this.f23473a < this.f23474b;
    }

    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f23475c > 0) {
            sb = new StringBuilder();
            sb.append(this.f23473a);
            sb.append("..");
            sb.append(this.f23474b);
            sb.append(" step ");
            i7 = this.f23475c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f23473a);
            sb.append(" downTo ");
            sb.append(this.f23474b);
            sb.append(" step ");
            i7 = -this.f23475c;
        }
        sb.append(i7);
        return sb.toString();
    }
}
