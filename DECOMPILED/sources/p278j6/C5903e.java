package p278j6;

import java.util.NoSuchElementException;
import p152T5.AbstractC1608F;

/* JADX INFO: renamed from: j6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5903e extends AbstractC1608F {

    /* JADX INFO: renamed from: a */
    private final int f23476a;

    /* JADX INFO: renamed from: b */
    private final int f23477b;

    /* JADX INFO: renamed from: c */
    private boolean f23478c;

    /* JADX INFO: renamed from: d */
    private int f23479d;

    public C5903e(int i7, int i8, int i9) {
        this.f23476a = i9;
        this.f23477b = i8;
        boolean z7 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z7 = true;
        }
        this.f23478c = z7;
        this.f23479d = z7 ? i7 : i8;
    }

    @Override // p152T5.AbstractC1608F
    /* JADX INFO: renamed from: a */
    public int mo6617a() {
        int i7 = this.f23479d;
        if (i7 != this.f23477b) {
            this.f23479d = this.f23476a + i7;
            return i7;
        }
        if (!this.f23478c) {
            throw new NoSuchElementException();
        }
        this.f23478c = false;
        return i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23478c;
    }
}
