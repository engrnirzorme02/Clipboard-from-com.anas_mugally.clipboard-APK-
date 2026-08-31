package p067I1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.g */
/* JADX INFO: loaded from: classes.dex */
public class C0587g implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final d f2241a;

    /* JADX INFO: renamed from: I1.g$a */
    public static class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final d f2242a;

        public a(d dVar) {
            this.f2242a = dVar;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public final InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0587g(this.f2242a);
        }
    }

    /* JADX INFO: renamed from: I1.g$b */
    public static class b extends a {

        /* JADX INFO: renamed from: I1.g$b$a */
        class a implements d {
            a() {
            }

            @Override // p067I1.C0587g.d
            /* JADX INFO: renamed from: a */
            public Class mo2588a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p067I1.C0587g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo2589b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p067I1.C0587g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo2590c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: I1.g$c */
    private static final class c implements InterfaceC3219d {

        /* JADX INFO: renamed from: a */
        private final File f2243a;

        /* JADX INFO: renamed from: b */
        private final d f2244b;

        /* JADX INFO: renamed from: c */
        private Object f2245c;

        c(File file, d dVar) {
            this.f2243a = file;
            this.f2244b = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return this.f2244b.mo2588a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
            Object obj = this.f2245c;
            if (obj != null) {
                try {
                    this.f2244b.mo2589b(obj);
                } catch (IOException unused) {
                }
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
                Object objMo2590c = this.f2244b.mo2590c(this.f2243a);
                this.f2245c = objMo2590c;
                aVar.mo1314f(objMo2590c);
            } catch (FileNotFoundException e7) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e7);
                }
                aVar.mo1313c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: I1.g$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        Class mo2588a();

        /* JADX INFO: renamed from: b */
        void mo2589b(Object obj);

        /* JADX INFO: renamed from: c */
        Object mo2590c(File file);
    }

    /* JADX INFO: renamed from: I1.g$e */
    public static class e extends a {

        /* JADX INFO: renamed from: I1.g$e$a */
        class a implements d {
            a() {
            }

            @Override // p067I1.C0587g.d
            /* JADX INFO: renamed from: a */
            public Class mo2588a() {
                return InputStream.class;
            }

            @Override // p067I1.C0587g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo2589b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p067I1.C0587g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo2590c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C0587g(d dVar) {
        this.f2241a = dVar;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(File file, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(file), new c(file, this.f2241a));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(File file) {
        return true;
    }
}
