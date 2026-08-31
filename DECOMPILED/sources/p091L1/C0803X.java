package p091L1;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0404b;
import p043F1.InterfaceC0406d;
import p183Y1.C2015d;
import p183Y1.C2020i;

/* JADX INFO: renamed from: L1.X */
/* JADX INFO: loaded from: classes.dex */
public class C0803X implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final C0824q f3222a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0404b f3223b;

    /* JADX INFO: renamed from: L1.X$a */
    static class a implements C0824q.b {

        /* JADX INFO: renamed from: a */
        private final C0801V f3224a;

        /* JADX INFO: renamed from: b */
        private final C2015d f3225b;

        a(C0801V c0801v, C2015d c2015d) {
            this.f3224a = c0801v;
            this.f3225b = c2015d;
        }

        @Override // p091L1.C0824q.b
        /* JADX INFO: renamed from: a */
        public void mo3754a() {
            this.f3224a.m3748m();
        }

        @Override // p091L1.C0824q.b
        /* JADX INFO: renamed from: b */
        public void mo3755b(InterfaceC0406d interfaceC0406d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM8386d = this.f3225b.m8386d();
            if (iOExceptionM8386d != null) {
                if (bitmap == null) {
                    throw iOExceptionM8386d;
                }
                interfaceC0406d.mo1745c(bitmap);
                throw iOExceptionM8386d;
            }
        }
    }

    public C0803X(C0824q c0824q, InterfaceC0404b interfaceC0404b) {
        this.f3222a = c0824q;
        this.f3223b = interfaceC0404b;
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(InputStream inputStream, int i7, int i8, C0132h c0132h) {
        boolean z7;
        C0801V c0801v;
        if (inputStream instanceof C0801V) {
            c0801v = (C0801V) inputStream;
            z7 = false;
        } else {
            z7 = true;
            c0801v = new C0801V(inputStream, this.f3223b);
        }
        C2015d c2015dM8385m = C2015d.m8385m(c0801v);
        try {
            return this.f3222a.m3866f(new C2020i(c2015dM8385m), i7, i8, c0132h, new a(c0801v, c2015dM8385m));
        } finally {
            c2015dM8385m.m8387n();
            if (z7) {
                c0801v.m3749n();
            }
        }
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(InputStream inputStream, C0132h c0132h) {
        return this.f3222a.m3869p(inputStream);
    }
}
