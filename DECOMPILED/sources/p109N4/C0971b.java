package p109N4;

import java.io.OutputStream;

/* JADX INFO: renamed from: N4.b */
/* JADX INFO: loaded from: classes.dex */
final class C0971b extends OutputStream {

    /* JADX INFO: renamed from: a */
    private long f3714a = 0;

    C0971b() {
    }

    /* JADX INFO: renamed from: d */
    long m4225d() {
        return this.f3714a;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        this.f3714a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f3714a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 >= 0 && i7 <= bArr.length && i8 >= 0 && (i9 = i7 + i8) <= bArr.length && i9 >= 0) {
            this.f3714a += (long) i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
