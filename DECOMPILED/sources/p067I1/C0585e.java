package p067I1;

import android.util.Base64;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0585e implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final a f2225a;

    /* JADX INFO: renamed from: I1.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        Class mo2567a();

        /* JADX INFO: renamed from: b */
        void mo2568b(Object obj);

        /* JADX INFO: renamed from: c */
        Object mo2569c(String str);
    }

    /* JADX INFO: renamed from: I1.e$b */
    private static final class b implements InterfaceC3219d {

        /* JADX INFO: renamed from: a */
        private final String f2226a;

        /* JADX INFO: renamed from: b */
        private final a f2227b;

        /* JADX INFO: renamed from: c */
        private Object f2228c;

        b(String str, a aVar) {
            this.f2226a = str;
            this.f2227b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return this.f2227b.mo2567a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
            try {
                this.f2227b.mo2568b(this.f2228c);
            } catch (IOException unused) {
            }
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
            try {
                Object objMo2569c = this.f2227b.mo2569c(this.f2226a);
                this.f2228c = objMo2569c;
                aVar.mo1314f(objMo2569c);
            } catch (IllegalArgumentException e7) {
                aVar.mo1313c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: I1.e$c */
    public static final class c implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final a f2229a = new a();

        /* JADX INFO: renamed from: I1.e$c$a */
        class a implements a {
            a() {
            }

            @Override // p067I1.C0585e.a
            /* JADX INFO: renamed from: a */
            public Class mo2567a() {
                return InputStream.class;
            }

            @Override // p067I1.C0585e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo2568b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p067I1.C0585e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo2569c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0585e(this.f2229a);
        }
    }

    public C0585e(a aVar) {
        this.f2225a = aVar;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: a */
    public InterfaceC0594n.a mo2552a(Object obj, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(obj), new b(obj.toString(), this.f2225a));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: b */
    public boolean mo2553b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
