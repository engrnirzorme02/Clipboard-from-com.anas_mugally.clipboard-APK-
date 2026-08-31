package p067I1;

import android.util.Log;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p176X1.C1944d;
import p183Y1.AbstractC2012a;

/* JADX INFO: renamed from: I1.d */
/* JADX INFO: loaded from: classes.dex */
public class C0584d implements InterfaceC0594n {

    /* JADX INFO: renamed from: I1.d$a */
    private static final class a implements InterfaceC3219d {

        /* JADX INFO: renamed from: a */
        private final File f2224a;

        a(File file) {
            this.f2224a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return ByteBuffer.class;
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
            try {
                aVar.mo1314f(AbstractC2012a.m8373a(this.f2224a));
            } catch (IOException e7) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e7);
                }
                aVar.mo1313c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: I1.d$b */
    public static class b implements InterfaceC0595o {
        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0584d();
        }
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(File file, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(file), new a(file));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(File file) {
        return true;
    }
}
