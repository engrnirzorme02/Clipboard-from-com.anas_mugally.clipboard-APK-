package p110N5;

import com.google.android.gms.common.api.C3553a;
import com.google.protobuf.AbstractC5106j;
import com.google.protobuf.C5065C;
import com.google.protobuf.C5120q;
import com.google.protobuf.InterfaceC5082U;
import com.google.protobuf.InterfaceC5097e0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p063H5.C0532a0;
import p063H5.C0554l0;
import p063H5.InterfaceC0522Q;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: N5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0980b {

    /* JADX INFO: renamed from: a */
    static volatile C5120q f3743a = C5120q.m23562b();

    /* JADX INFO: renamed from: N5.b$a */
    private static final class a implements C0532a0.c {

        /* JADX INFO: renamed from: d */
        private static final ThreadLocal f3744d = new ThreadLocal();

        /* JADX INFO: renamed from: a */
        private final InterfaceC5097e0 f3745a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC5082U f3746b;

        /* JADX INFO: renamed from: c */
        private final int f3747c;

        a(InterfaceC5082U interfaceC5082U, int i7) {
            this.f3746b = (InterfaceC5082U) AbstractC1209m.m5303o(interfaceC5082U, "defaultInstance cannot be null");
            this.f3745a = interfaceC5082U.mo22974i();
            this.f3747c = i7;
        }

        /* JADX INFO: renamed from: d */
        private InterfaceC5082U m4259d(AbstractC5106j abstractC5106j) throws C5065C {
            InterfaceC5082U interfaceC5082U = (InterfaceC5082U) this.f3745a.mo23077a(abstractC5106j, AbstractC0980b.f3743a);
            try {
                abstractC5106j.mo23203a(0);
                return interfaceC5082U;
            } catch (C5065C e7) {
                e7.m22903k(interfaceC5082U);
                throw e7;
            }
        }

        @Override // p063H5.C0532a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5082U mo2336a(InputStream inputStream) {
            AbstractC5106j abstractC5106jM23185g;
            byte[] bArr;
            if ((inputStream instanceof C0979a) && ((C0979a) inputStream).m4256n() == this.f3745a) {
                try {
                    return ((C0979a) inputStream).m4255m();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof InterfaceC0522Q) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f3746b;
                        }
                        abstractC5106jM23185g = null;
                    } else {
                        ThreadLocal threadLocal = f3744d;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i7 = iAvailable;
                        while (i7 > 0) {
                            int i8 = inputStream.read(bArr, iAvailable - i7, i7);
                            if (i8 == -1) {
                                break;
                            }
                            i7 -= i8;
                        }
                        if (i7 != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i7));
                        }
                        abstractC5106jM23185g = AbstractC5106j.m23190l(bArr, 0, iAvailable);
                    }
                } else {
                    abstractC5106jM23185g = null;
                }
                if (abstractC5106jM23185g == null) {
                    abstractC5106jM23185g = AbstractC5106j.m23185g(inputStream);
                }
                abstractC5106jM23185g.m23200I(C3553a.e.API_PRIORITY_OTHER);
                int i9 = this.f3747c;
                if (i9 >= 0) {
                    abstractC5106jM23185g.m23199H(i9);
                }
                try {
                    return m4259d(abstractC5106jM23185g);
                } catch (C5065C e7) {
                    throw C0554l0.f2112s.m2462q("Invalid protobuf byte sequence").m2461p(e7).m2455d();
                }
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // p063H5.C0532a0.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream mo2337b(InterfaceC5082U interfaceC5082U) {
            return new C0979a(interfaceC5082U, this.f3745a);
        }
    }

    /* JADX INFO: renamed from: a */
    static long m4257a(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC1209m.m5303o(inputStream, "inputStream cannot be null!");
        AbstractC1209m.m5303o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j7 = 0;
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return j7;
            }
            outputStream.write(bArr, 0, i7);
            j7 += (long) i7;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0532a0.c m4258b(InterfaceC5082U interfaceC5082U) {
        return new a(interfaceC5082U, -1);
    }
}
