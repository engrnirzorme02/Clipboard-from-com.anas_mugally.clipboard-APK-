package p067I1;

import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0582b implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final b f2219a;

    /* JADX INFO: renamed from: I1.b$a */
    public static class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: I1.b$a$a, reason: collision with other inner class name */
        class C7631a implements b {
            C7631a() {
            }

            @Override // p067I1.C0582b.b
            /* JADX INFO: renamed from: a */
            public Class mo2560a() {
                return ByteBuffer.class;
            }

            @Override // p067I1.C0582b.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo2561b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0582b(new C7631a());
        }
    }

    /* JADX INFO: renamed from: I1.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Class mo2560a();

        /* JADX INFO: renamed from: b */
        Object mo2561b(byte[] bArr);
    }

    /* JADX INFO: renamed from: I1.b$c */
    private static class c implements InterfaceC3219d {

        /* JADX INFO: renamed from: a */
        private final byte[] f2221a;

        /* JADX INFO: renamed from: b */
        private final b f2222b;

        c(byte[] bArr, b bVar) {
            this.f2221a = bArr;
            this.f2222b = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return this.f2222b.mo2560a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: d */
        public EnumC0125a mo932d() {
            return EnumC0125a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: e */
        public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
            aVar.mo1314f(this.f2222b.mo2561b(this.f2221a));
        }
    }

    /* JADX INFO: renamed from: I1.b$d */
    public static class d implements InterfaceC0595o {

        /* JADX INFO: renamed from: I1.b$d$a */
        class a implements b {
            a() {
            }

            @Override // p067I1.C0582b.b
            /* JADX INFO: renamed from: a */
            public Class mo2560a() {
                return InputStream.class;
            }

            @Override // p067I1.C0582b.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo2561b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0582b(new a());
        }
    }

    public C0582b(b bVar) {
        this.f2219a = bVar;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(byte[] bArr, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(bArr), new c(bArr, this.f2219a));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(byte[] bArr) {
        return true;
    }
}
