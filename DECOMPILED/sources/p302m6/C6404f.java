package p302m6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: m6.f */
/* JADX INFO: loaded from: classes.dex */
final class C6404f implements Iterator, InterfaceC5442a {

    /* JADX INFO: renamed from: f */
    private static final a f24446f = new a(null);

    /* JADX INFO: renamed from: a */
    private final CharSequence f24447a;

    /* JADX INFO: renamed from: b */
    private int f24448b;

    /* JADX INFO: renamed from: c */
    private int f24449c;

    /* JADX INFO: renamed from: d */
    private int f24450d;

    /* JADX INFO: renamed from: e */
    private int f24451e;

    /* JADX INFO: renamed from: m6.f$a */
    private static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C6404f(CharSequence string) {
        AbstractC6118n.m27187e(string, "string");
        this.f24447a = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24448b = 0;
        int i7 = this.f24450d;
        int i8 = this.f24449c;
        this.f24449c = this.f24451e + i7;
        return this.f24447a.subSequence(i8, i7).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i7;
        int i8;
        int i9 = this.f24448b;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f24451e < 0) {
            this.f24448b = 2;
            return false;
        }
        int length = this.f24447a.length();
        int length2 = this.f24447a.length();
        for (int i10 = this.f24449c; i10 < length2; i10++) {
            char cCharAt = this.f24447a.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i7 = (cCharAt == '\r' && (i8 = i10 + 1) < this.f24447a.length() && this.f24447a.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f24448b = 1;
                this.f24451e = i7;
                this.f24450d = length;
                return true;
            }
        }
        i7 = -1;
        this.f24448b = 1;
        this.f24451e = i7;
        this.f24450d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
